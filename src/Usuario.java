public class Usuario {
    protected int id;
    protected String nombre;
    protected String email;
    protected String password;
    protected Rol rol;

    public Usuario(int id, String nombre, String email, String password, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

    public void iniciarSesion() {
        System.out.println(nombre + " ha iniciado sesión.");
    }

    public void cerrarSesion() {
        System.out.println(nombre + " ha cerrado sesión.");
    }

    public void cambiarPassword(String nueva) {
        this.password = nueva;
    }

    public boolean validarEmail() {
        return email.contains("@");
    }

    public Rol getRol() {
        return rol;
    }

    public String getNombre() {
        return nombre;
    }
    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
