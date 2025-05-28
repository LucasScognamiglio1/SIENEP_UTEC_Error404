import java.time.LocalDate;
public class Reporte {

        private int id;
        private LocalDate fechaGeneracion;
        private String tipo;
        private String formato;
        private Estudiante estudiante;

        public Reporte(int id, LocalDate fechaGeneracion, String tipo, String formato, Estudiante estudiante) {
            this.id = id;
            this.fechaGeneracion = fechaGeneracion;
            this.tipo = tipo;
            this.formato = formato;
            this.estudiante = estudiante;
        }

        public void generarPorEstudiante() {
            System.out.println("Generando reporte tipo " + tipo + " en formato " + formato +
                    " para estudiante: " + estudiante.getNombreCompleto());
        }

        public void filtrarPorFechas(LocalDate inicio, LocalDate fin) {
            if (fechaGeneracion.isAfter(inicio) && fechaGeneracion.isBefore(fin)) {
                System.out.println("Reporte generado dentro del rango de fechas.");
            } else {
                System.out.println("No hay reportes en el rango de fechas especificado.");
            }
        }
    }
