import java.time.LocalDate;
import java.time.LocalDateTime;

public class Instancia {
//Descripción: Reunión, llamada o coordinación relacionada al estudiante.

        // Atributos
        private int id;
        private String titulo;
        private String tipo; // reunión, llamada, entre otros
        private LocalDateTime fechaHora;
        private String comentarios;
        private boolean confidencial;
        private String origen; // Estudiante / Dirección


        public Instancia() {
        }

        // Constructor
        public Instancia(int id, String titulo, String tipo, LocalDateTime fechaHora, String comentarios, boolean confidencial, String origen) {
            this.id = id;
            this.titulo = titulo;
            this.tipo = tipo;
            this.fechaHora = fechaHora;
            this.comentarios = comentarios;
            this.confidencial = confidencial;
            this.origen = origen;
        }

        // Getters and setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public LocalDateTime getFechaHora() {
            return fechaHora;
        }

        public void setFechaHora(LocalDateTime fechaHora) {
            this.fechaHora = fechaHora;
        }

        public String getComentarios() {
            return comentarios;
        }

        public void setComentarios(String comentarios) {
            this.comentarios = comentarios;
        }

        public boolean isConfidencial() {
            return confidencial;
        }

        public void setConfidencial(boolean confidencial) {
            this.confidencial = confidencial;
        }

        public String getOrigen() {
            return origen;
        }

        public void setOrigen(String origen) {
            this.origen = origen;
        }

        // Métodos

        //Para registrar una nueva instancia
        public void registrar() {
            System.out.println("Instancia registrada: " + titulo + " el " + fechaHora);
        }

        //Para modificar los datos de la instancia ya creada
        public void modificar(String newTitulo, String newTipo, LocalDateTime newFechaHora, String newComentarios, boolean newConfidencial, String newOrigen) {
            this.titulo = newTitulo;
            this.tipo = newTipo;
            this.fechaHora = newFechaHora;
            this.comentarios = newComentarios;
            this.confidencial = newConfidencial;
            this.origen = newOrigen;
        }

        //Metodo para clonar una instancia
        public Instancia clonar() {
            return new Instancia(id, titulo, tipo, fechaHora, comentarios, confidencial, origen);
        }

        //Se crea una nueva instancia basada en un recordatorio (los otros campos quedan vacíos ya que no podemos garantizar que los datos del recordatorio coincidan con la acción real realizada)
        public static Instancia crearDesdeRecordatorio(Recordatorio recordatorio) {
            Instancia nuevaInstancia = new Instancia();
            nuevaInstancia.setComentarios("Instancia creada a partir del recordatorio: " + recordatorio.getTitulo());
            nuevaInstancia.setConfidencial(true); // Se establece en true por defecto para cuidar la privacidad
            nuevaInstancia.setOrigen("Dirección");
            return nuevaInstancia;
        }
    }

