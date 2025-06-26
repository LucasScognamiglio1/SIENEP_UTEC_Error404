import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear rol
        Rol rolEstudiante = new Rol("Estudiante", Arrays.asList(
                "ver_instancias",
                "ver_recordatorios"
        ));

        // Crear estudiante (como usuario con rol)
        Estudiante estudiante = new Estudiante(
                1, "Lucía", "lucia@utec.edu.uy", "1234", rolEstudiante,
                "56781234", "Lucía Rodríguez", LocalDate.of(2002, 5, 12),
                "Av. Rivera 1234", "099123456", "foto.jpg", "Grupo A", "Tecnologías",
                "ASSE", "Dificultades de atención", "Sin alergias", "Asistencia psicológica",
                "En seguimiento", "Ninguna observación", "adjunto.pdf", "Antecedentes familiares"
        );

        estudiante.iniciarSesion();
        estudiante.verDatos();

        // Crear instancia de seguimiento
        Instancia instancia = new Instancia(
                101, "Primera reunión", "Reunión",
                LocalDateTime.now(), "Presentación inicial", false, "Dirección",
                estudiante, estudiante
        );

        instancia.registrar();

        // Crear recordatorio vinculado
        Recordatorio recordatorio = new Recordatorio(
                201, "Seguimiento semanal", LocalDateTime.now().plusDays(7),
                "Reunión", "semanal", "email", "activo", instancia
        );

        instancia.agregarRecordatorio(recordatorio);
        recordatorio.enviarNotificacion();

        // Crear una nueva instancia desde el recordatorio
        Instancia instanciaDerivada = recordatorio.crearInstanciaRelacionada();
        instanciaDerivada.registrar();


        System.out.println(estudiante.toString());
    }
}