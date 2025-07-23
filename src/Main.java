import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear roles
        Rol rolAdmin = new Rol("Administrador", Arrays.asList("gestionar_usuarios", "ver_confidencial"));
        Rol rolPsico = new Rol("Psicopedagogo", Arrays.asList("registrar_instancia", "ver_confidencial"));
        Rol rolEstudiante = new Rol("Estudiante", Arrays.asList("ver_instancias"));

        // Crear administrador
        Administrador admin = new Administrador(1, "Ana Admin", "ana@utec.edu.uy", "admin123", rolAdmin);

        // Crear psicopedagogo
        Psicopedagogo psico = new Psicopedagogo(2, "Pedro Psico", "pedro@utec.edu.uy", "psico123", rolPsico, "Orientación Educativa");

        // Crear estudiante
        Estudiante estudiante = new Estudiante(
                3, "Lucía", "lucia@utec.edu.uy", "lucia123", rolEstudiante,
                "56781234", "Lucía Rodríguez", LocalDate.of(2002, 5, 12),
                "Av. Rivera 1234", "099123456", "foto.jpg", "Grupo A", "Tecnologías",
                "ASSE", "Dificultades de atención", "Sin alergias", "Asistencia psicológica",
                "En seguimiento", "Ninguna observación", "adjunto.pdf", "Este dato es confidencial"
        );

        // -------------------- ADMINISTRADOR --------------------
        System.out.println("----- ADMINISTRADOR -----");
        admin.crearUsuario(estudiante);
        admin.asignarRol(estudiante, rolEstudiante);

        // Auditorías ficticias
        //int id, String accion, LocalDateTime fecha, Usuario usuario, String entidadModificada, int idEntidad
        Auditoria a1 = new Auditoria(1, "Modificación de estudiante", LocalDateTime.now(), admin, "Estudiante", 3);
        Auditoria a2 = new Auditoria(2, "Cambio de rol", LocalDateTime.now(), admin, "rol", 4);
        List<Auditoria> auditorias = Arrays.asList(a1, a2);
        admin.verAuditorias(auditorias).forEach(a -> System.out.println(a.getAccion()));

        // -------------------- PSICOPEDAGOGO --------------------
        System.out.println("\n----- PSICOPEDAGOGO -----");
        psico.registrarInstancia(estudiante);
        psico.generarReporte(estudiante);
        String confidencial = psico.verDatosConfidenciales(estudiante);
        System.out.println("Datos confidenciales del estudiante: " + confidencial);
    }
}