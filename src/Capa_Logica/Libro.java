
package Capa_Logica;

import capa_Presentacion.Util;


public class Libro {
    private int ID;
    private String titulo;
    private String autor;
    private String editorial;
    private String pais;
    private int nPaginas;
    
    public Libro(){
    }

    public Libro(int ID, String titulo, String autor, String editorial, String pais, int nPaginas) {
        setID(ID);
        setTitulo(titulo);
        setAutor(autor);
        setEditorial(editorial);
        setPais(pais);
        setnPaginas(nPaginas);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTitulo(String titulo) {
        this.titulo = Util.darFormatoDeTexto(titulo);
    }

    public void setAutor(String autor) {
        this.autor = Util.darFormatoDeNombre(autor);
    }

    public void setEditorial(String editorial) {
        this.editorial = Util.darFormatoDeTexto(editorial);
    }

    public void setPais(String pais) {
        this.pais = Util.darFormatoDeTexto(pais);
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public int getID() {
        return ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getPais() {
        return pais;
    }

    public int getnPaginas() {
        return nPaginas;
    }
    
}
