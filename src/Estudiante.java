import java.time.LocalDate;

public class Estudiante {
//Descripción: Representa a un estudiante registrado para seguimiento.

// Atributos
    private String cedula; // id
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private String foto; // url
    private String grupo;
    private String carrera;
    private String sistemaSalud;
    private String motivoDerivacion;
    private String infoMedica;
    private String estadoSeguimiento;
    private String observaciones;
    private String observacionesConfidenciales;
    private String archivoAdjunto;


    public Estudiante() {
    }

    // Constructor
    public Estudiante(String cedula, String nombreCompleto, LocalDate fechaNacimiento, String direccion,
                      String telefono, String foto, String grupo, String carrera, String sistemaSalud,
                      String motivoDerivacion, String infoMedica, String estadoSeguimiento,
                      String observaciones, String observacionesConfidenciales, String archivoAdjunto) {
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
        this.estadoSeguimiento = estadoSeguimiento;
        this.observaciones = observaciones;
        this.observacionesConfidenciales = observacionesConfidenciales;
        this.archivoAdjunto = archivoAdjunto;
    }

    // Getters and setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(String sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getMotivoDerivacion() {
        return motivoDerivacion;
    }

    public void setMotivoDerivacion(String motivoDerivacion) {
        this.motivoDerivacion = motivoDerivacion;
    }

    public String getInfoMedica() {
        return infoMedica;
    }

    public void setInfoMedica(String infoMedica) {
        this.infoMedica = infoMedica;
    }

    public String getEstadoSeguimiento() {
        return estadoSeguimiento;
    }

    public void setEstadoSeguimiento(String estadoSeguimiento) {
        this.estadoSeguimiento = estadoSeguimiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getObservacionesConfidenciales() {
        return observacionesConfidenciales;
    }

    public void setObservacionesConfidenciales(String observacionesConfidenciales) {
        this.observacionesConfidenciales = observacionesConfidenciales;
    }

    public String getArchivoAdjunto() {
        return archivoAdjunto;
    }

    public void setArchivoAdjunto(String archivoAdjunto) {
        this.archivoAdjunto = archivoAdjunto;
    }

    // Métodos
    public void verDatos() {
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Cédula: " + cedula);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Foto: " + foto);
        System.out.println("Grupo: " + grupo);
        System.out.println("Carrera: " + carrera);
        System.out.println("Sistema de salud: " + sistemaSalud);
        System.out.println("Motivo de derivación: " + motivoDerivacion);
        System.out.println("Información médica: " + infoMedica);
        System.out.println("Estado de seguimiento: " + estadoSeguimiento);
        System.out.println("Observaciones: " + observaciones);
        System.out.println("Observaciones confidenciales: " + observacionesConfidenciales);
        System.out.println("Archivo adjunto: " + archivoAdjunto);
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estadoSeguimiento = nuevoEstado;
    }
}
