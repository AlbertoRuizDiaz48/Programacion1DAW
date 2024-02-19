package POO1.Ejercicios.Arrays;

public class Disco {
    private String autor;
    private String titulo;
    private String codigo = "LIBRE";
    private String genero;
    private int duracion;

    public Disco (){}
    public Disco(String codigo,String autor, String titulo, String genero, int duracion) {
        this.autor = autor;
        this.titulo = titulo;
        this.codigo = codigo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public void BorrarDatos (){
        setDuracion(null);
        setAutor(null);
        setGenero(null);
        setCodigo("LIBRE");
        setTitulo(null);
    }

    @Override
    public String toString() {
        return
                "autor='" + autor +
                ", titulo='" + titulo +
                ", codigo='" + codigo +
                ", genero='" + genero +
                ", duracion=" + duracion
                ;
    }



    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }


}
