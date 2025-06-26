import java.time.LocalDate;

public class Estudiante extends Usuario {
    private String cedula;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private String foto;
    private String grupo;
    private String carrera;
    private String sistemaSalud;
    private String motivoDerivacion;
    private String infoMedica;
    private String tratamientos;
    private String estadoSeguimiento;
    private String observaciones;
    private String archivoAdjunto;
    private String observacionesConfidenciales;

    public Estudiante(int id, String nombre, String email, String password, Rol rol,
                      String cedula, String nombreCompleto, LocalDate fechaNacimiento,
                      String direccion, String telefono, String foto, String grupo,
                      String carrera, String sistemaSalud, String motivoDerivacion,
                      String infoMedica, String tratamientos, String estadoSeguimiento,
                      String observaciones, String archivoAdjunto, String observacionesConfidenciales) {

        super(id, nombre, email, password, rol);
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.foto = foto;
        this.grupo = grupo;
        this.carrera = carrera;
        this.sistemaSalud = sistemaSalud;
        this.motivoDerivacion = motivoDerivacion;
        this.infoMedica = infoMedica;
        this.tratamientos = tratamientos;
        this.estadoSeguimiento = estadoSeguimiento;
        this.observaciones = observaciones;
        this.archivoAdjunto = archivoAdjunto;
        this.observacionesConfidenciales = observacionesConfidenciales;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void verDatos() {
        System.out.println("Estudiante: " + nombreCompleto + " (" + cedula + ")");
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estadoSeguimiento = nuevoEstado;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "rol=" + rol +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                ", observacionesConfidenciales='" + observacionesConfidenciales + '\'' +
                ", archivoAdjunto='" + archivoAdjunto + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", estadoSeguimiento='" + estadoSeguimiento + '\'' +
                ", tratamientos='" + tratamientos + '\'' +
                ", infoMedica='" + infoMedica + '\'' +
                ", motivoDerivacion='" + motivoDerivacion + '\'' +
                ", sistemaSalud='" + sistemaSalud + '\'' +
                ", carrera='" + carrera + '\'' +
                ", grupo='" + grupo + '\'' +
                ", foto='" + foto + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }
}
