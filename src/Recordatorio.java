import java.time.LocalDateTime;

public class Recordatorio {
//Descripción: Aviso asociado a una instancia, con fecha y medio de notificación.

    // Atributos
    private int id;
    private String titulo;
    private LocalDateTime fechaHora;
    private String tipo;
    private String frecuencia; // único, diario, semanal, mensual
    private String medio; // WhatsApp, email
    private String estado; // vencido, activo, cumplido

    public Recordatorio() {
    }

    public Recordatorio(int id, String titulo, LocalDateTime fechaHora, String tipo, String frecuencia, String medio, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.fechaHora = fechaHora;
        this.tipo = tipo;
        this.frecuencia = frecuencia;
        this.medio = medio; //Medio por el cual se enviará el recordatorio
        this.estado = estado;
    }
    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Métodos

    // Envía una notificación mostrando el título del recordatorio
    public void enviarNotificacion() {
        System.out.println("Recordatorio: " + titulo);
    }

    // Actualiza el estado del recordatorio (vencido, activo, cumplido)
    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Crea una nueva instancia de seguimiento basada en este recordatorio (los campos restantes quedan vacíos ya que deben completarse con los datos reales de la acción realizada)
    public Instancia crearInstanciaRelacionada() {
        Instancia nuevaInstancia = new Instancia();
        nuevaInstancia.setComentarios("Instancia creada a partir del recordatorio: " + this.titulo);
        nuevaInstancia.setConfidencial(true); // Se puede cambiar, se setea true por default por motivos de privacidad
        nuevaInstancia.setOrigen("Dirección");
        return nuevaInstancia;
    }

    // Metodo toString sobrescrito para mostrar los datos principales del recordatorio
    @Override
    public String toString() {
        return "Recordatorio{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", fechaHora=" + fechaHora +
                ", tipo='" + tipo + '\'' +
                ", frecuencia='" + frecuencia + '\'' +
                ", medio='" + medio + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

}
