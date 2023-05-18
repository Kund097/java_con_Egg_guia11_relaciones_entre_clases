package Entidades;

/**
 * de las películas nos interesa saber el título, duración, edad mínima y
 * director.
 *
 * @author facun
 */
public class Pelicula {

    private String titulo;
    private String director;
    private int duracion;
    private int edadMinima;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", edadMinima=" + edadMinima + '}';
    }
    
}
