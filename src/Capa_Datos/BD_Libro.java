package Capa_Datos;

import Capa_Logica.Libro;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BD_Libro {
    static CConexion conectar = new CConexion();
    static Connection con;
    static PreparedStatement ps;
    static ResultSet rs;
    
    public static ArrayList<Libro> listarDatos() {
        String sql = "Select * from tb_libro order by id";
        ArrayList<Libro> datos = new ArrayList<>();
        
        try {
            con = conectar.getConeccion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Libro l = new Libro();
                l.setID(rs.getInt(1));
                l.setTitulo(rs.getString(2));
                l.setAutor(rs.getString(3));
                l.setEditorial(rs.getString(4));
                l.setPais(rs.getString(5));
                l.setnPaginas(rs.getInt(6));
                datos.add(l);
            }
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en listar datos de BD: " + e.getMessage());
        }
        
        if(datos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay datos para listar");
            return null;
        }else {
            return datos;
        }
    }
    
    public static void agregarDato(Libro obj) {
        String sql = "insert into tb_libro (titulo, autor, editorial, pais, npaginas) values (?,?,?,?,?)";
        
        try {
            con = conectar.getConeccion();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, obj.getTitulo());
            ps.setString(2, obj.getAutor());
            ps.setString(3, obj.getEditorial());
            ps.setString(4, obj.getPais());
            ps.setInt(5, obj.getnPaginas());
            ps.execute();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en agregar el dato a BD: " + e.getMessage());
        }
    }
    
    public static void eliminarDato(int id) {
        String sql = "Delete from tb_libro where id = " + id;
        
        try {
            con = conectar.getConeccion();
            ps = con.prepareStatement(sql);
            
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error para eliminar datos de BD: " + e.getMessage());
        }
    }
    
    public static void modificarDato(int id, Libro nuevoObj) {
        String sql = "Update tb_libro set titulo = ?, autor = ?, editorial = ?, pais = ?, npaginas = ? where id = " + id;
        
        try {
            con = conectar.getConeccion();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, nuevoObj.getTitulo());
            ps.setString(2, nuevoObj.getAutor());
            ps.setString(3, nuevoObj.getEditorial());
            ps.setString(4, nuevoObj.getPais());
            ps.setInt(5, nuevoObj.getnPaginas());
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error para modificar un dato de BD: " + e.getMessage());
        }
    }
    
    public static Libro obtenerLibroPorID(int id) {
        ArrayList<Libro> listaFiltrada = listarDatos();
        
        for (Libro libro :listaFiltrada) {
            if(libro.getID() == id) {
                return libro;
            }
        }
        return null;
    }
    
    @SuppressWarnings("rawtypes")
    public static ArrayList filtrarPorTituloOAutor(String texto) {
        ArrayList<Libro> listaFiltrada = new ArrayList<>();
        String minusTexto = texto.toLowerCase();
        for (Libro libro : listarDatos()) {
            if(libro.getAutor().toLowerCase().contains(minusTexto) || libro.getTitulo().toLowerCase().contains(minusTexto)) {
                listaFiltrada.add(libro);
            }
        }
        return listaFiltrada;
    }
}
