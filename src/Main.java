import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear permisos para el rol
        List<String> permisosAdmin = new ArrayList<>();
        permisosAdmin.add("GESTIONAR_USUARIOS");
        permisosAdmin.add("VER_REPORTES");

        // Crear un rol
        Rol rolAdmin = new Rol("Administrador", permisosAdmin);

        // Crear un usuario
        Usuario usuario1 = new Usuario(
                1,
                "Juan Pérez",
                "juan.perez@ejemplo.com",
                "1234",
                rolAdmin
        );

        // Mostrar información básica
        System.out.println("Nombre: " + usuario1.getNombre());
        System.out.println("Rol: " + usuario1.getRol().getNombre());
        System.out.println("¿Tiene permiso de VER_REPORTES? " + usuario1.getRol().tienePermiso("VER_REPORTES"));

        // Cambiar la contraseña
        usuario1.cambiarContraseña("nuevaPassword123");
        System.out.println("Contraseña actualizada");

        // Validar email
        boolean esEmailCorrecto = usuario1.validarEmail("juan.perez@ejemplo.com");
        System.out.println("¿Email válido? " + esEmailCorrecto);

        // Agregar nuevo permiso
        usuario1.getRol().agregarPermiso("EDITAR_PERFIL");

        // Comprobar nuevo permiso
        System.out.println("¿Tiene permiso EDITAR_PERFIL? " + usuario1.getRol().tienePermiso("EDITAR_PERFIL"));

        System.out.println(usuario1.getRol().getPermisos());
    }
}