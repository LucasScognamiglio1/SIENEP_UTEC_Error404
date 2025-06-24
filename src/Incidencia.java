import java.time.LocalDate;
public class Incidencia {

        private int id;
        private String descripcion;
        private LocalDate fecha;
        private String lugar;
        private String personasInvolucradas;
        private Usuario registradoPor;
        private Estudiante estudiante;

        public Incidencia() {

        }

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

        // Metodo toString sobrescrito para mostrar los datos principales de la insidencia
        @Override
        public String toString() {
            return "Insidencia{" +
                    "id=" + id +
                    ", descripcion='" + descripcion + '\'' +
                    ", fecha=" + fecha +
                    ", lugar='" + lugar + '\'' +
                    ", personasInvolucradas='" + personasInvolucradas + '\'' +
                    ", registradoPor=" + (registradoPor != null ? registradoPor.getNombre() : "Sin usuario asignado") +
                    ", estudiante=" + (estudiante != null ? estudiante.getNombreCompleto() : "Sin estudiante asignado") +
                    '}';
        }
    }

