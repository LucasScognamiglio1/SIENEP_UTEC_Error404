import java.time.LocalDateTime;

public class Auditoria {
//Descripción: Registro de cambios realizados en el sistema.

    // Atributos
    private int id;
    private String accion; // crear, editar, eliminar
    private LocalDateTime fecha;
    private Usuario usuario;
    private String entidadModificada;
    private int idEntidad;

    public Auditoria() {
    }

    public Auditoria(int id, String accion, LocalDateTime fecha, Usuario usuario, String entidadModificada, int idEntidad) {
        this.id = id;
        this.accion = accion;
        this.fecha = fecha;
        this.usuario = usuario;
        this.entidadModificada = entidadModificada;
        this.idEntidad = idEntidad;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEntidadModificada() {
        return entidadModificada;
    }

    public void setEntidadModificada(String entidadModificada) {
        this.entidadModificada = entidadModificada;
    }

    public int getIdEntidad() {
        return idEntidad;
    }

    public void setIdEntidad(int idEntidad) {
        this.idEntidad = idEntidad;
    }

    // Métodos

    // Registra un cambio en el sistema, debe ser llamado después de realizar una acción importante como crear, editar o eliminar
    public void registrarCambio(String accion, Usuario usuario, String entidadModificada, int idEntidad) {
        this.accion = accion;
        this.fecha = LocalDateTime.now(); // la fecha del cambio es ahora
        this.usuario = usuario;
        this.entidadModificada = entidadModificada;
        this.idEntidad = idEntidad;
        System.out.println("Cambio registrado: " + accion + " sobre " + entidadModificada + " ID: " + idEntidad + " por el usuario " + usuario.getNombre());
    }

    // Verifica si el cambio registrado corresponde a la entidad indicada y muestra un mensaje con el resultado.
    public void consultarPorEntidad(String entidad) {
        if (this.entidadModificada.equals(entidad)) {
            System.out.println("Cambio encontrado: " + accion + " sobre " + entidadModificada + " ID: " + idEntidad);
        } else {
            System.out.println("No se encontraron cambios para la entidad: " + entidad);
        }
    }

    // Metodo toString sobrescrito para mostrar los datos principales del registro de auditoria
    @Override
    public String toString() {
        return "Auditoria{" +
                "id=" + id +
                ", accion='" + accion + '\'' +
                ", fecha=" + fecha +
                ", usuario=" + (usuario != null ? usuario.getNombre() : "Desconocido") +
                ", entidadModificada='" + entidadModificada + '\'' +
                ", idEntidad=" + idEntidad +
                '}';
    }
}
