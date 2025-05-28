import java.util.List;

public class Rol {
//Descripción: Define el conjunto de permisos que tiene cada usuario en el sistema.

    //Atributos
    private String nombre;
    private List<String> permisos;

    //Constructor
    public Rol(String nombre, List<String> permisos) {
        this.permisos = permisos;
        this.nombre = nombre;
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getPermisos() {
        return permisos;
    }

    public void agregarPermiso(String permiso) {
        this.permisos.add(permiso);
        System.out.println("Permiso agregado (" + permiso + ")");
    }

    public boolean tienePermiso(String permiso) {
        return this.permisos.contains(permiso);
    }
}