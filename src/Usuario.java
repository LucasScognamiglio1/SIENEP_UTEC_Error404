public class Usuario {
//Descripción: Representa a toda persona que accede al sistema (administrador, psicopedagogo, analista, estudiante, funcionario).

    private int id;
    private String nombre;
    private String email;
    private String password;
    private Rol rol;

// Constructor
    public Usuario(int id, String nombre, String email, String password, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

//Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

//Métodos
    public void iniciarSesion() {

    }

    public void cerrarSesion() {

    }

    public void cambiarContraseña(String nuevaPassword) {
        this.password = nuevaPassword;
    }

    public boolean validarEmail(String email) {
        return this.email.equals(email);
    }

}

