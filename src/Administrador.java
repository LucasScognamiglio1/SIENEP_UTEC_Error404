import java.util.List;

public class Administrador extends Usuario {

    public Administrador(int id, String nombre, String email, String password, Rol rol) {
        super(id, nombre, email, password, rol);
    }

    // Método para crear un nuevo usuario
    public void crearUsuario(Usuario nuevoUsuario) {
        System.out.println("Usuario creado: " + nuevoUsuario.getNombre() + ", con rol " + nuevoUsuario.getRol().getNombre());
    }

    // Método para asignar un rol a otro usuario
    public void asignarRol(Usuario usuario, Rol nuevoRol) {
        usuario.setRol(nuevoRol);
        System.out.println("Nuevo rol asignado a " + usuario.getNombre() + ": " + nuevoRol.getNombre());
    }

    // Método simulado para ver auditorías
    public List<Auditoria> verAuditorias(List<Auditoria> registros) {
        System.out.println("Listando auditorías del sistema...");
        return registros;
    }
}
