import java.time.LocalDate;
public class Incidencia {

        private int id;
        private String descripcion;
        private LocalDate fecha;
        private String lugar;
        private String personasInvolucradas;
        private Usuario registradoPor;
        private Estudiante estudiante;

        public Incidencia(int id, String descripcion, LocalDate fecha, String lugar,
                          String personasInvolucradas, Usuario registradoPor, Estudiante estudiante) {
            this.id = id;
            this.descripcion = descripcion;
            this.fecha = fecha;
            this.lugar = lugar;
            this.personasInvolucradas = personasInvolucradas;
            this.registradoPor = registradoPor;
            this.estudiante = estudiante;
        }

        public void registrar() {
            System.out.println("Incidencia registrada para estudiante: " + estudiante.getNombreCompleto());
        }

        public void consultarPorEstudiante() {
            System.out.println("Incidencia de " + estudiante.getNombreCompleto() + ": " + descripcion);
        }
    }

