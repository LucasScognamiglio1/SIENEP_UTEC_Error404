public class Psicopedagogo extends Usuario {
    private String especialidad;

    public Psicopedagogo(int id, String nombre, String email, String password, Rol rol, String especialidad) {
        super(id, nombre, email, password, rol);
        this.especialidad = especialidad;
    }

    public void registrarInstancia(Estudiante estudiante) {
        System.out.println("Instancia registrada para el estudiante: " + estudiante.getNombre());
    }

    public void generarReporte(Estudiante estudiante) {
        System.out.println("Generando reporte completo para: " + estudiante.getNombre());
    }

    public String verDatosConfidenciales(Estudiante estudiante) {
        return estudiante.getObservacionesConfidenciales();
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
