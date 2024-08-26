package capa_Presentacion;

import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class Util {

    public static <T> void llenarJTable(ArrayList<T> listaObjetos, JTable tabla) {

        String[] nomCols;
        DefaultTableModel modeloTabla;

        if (listaObjetos.isEmpty() == false) {
            // Obtener los nombres de las columnas (atributos) de la clase
            Class<?> claseObjeto = listaObjetos.get(0).getClass();
            Field[] campos = claseObjeto.getDeclaredFields();

            // Crear un vector con los nombres de las columnas
            ArrayList<String> nombresColumnas = new ArrayList<>();
            for (Field campo : campos) {
                nombresColumnas.add(campo.getName().toUpperCase());
            }
            nomCols = nombresColumnas.toArray(new String[0]);

            // Crear el modelo de tabla (NO EDITABLE)
            modeloTabla = new DefaultTableModel(nomCols, 0) {
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    return false; // Todas las celdas no son editables
                }
            };

            // Recorrer la lista de objetos y agregar sus datos a la tabla
            for (T objeto : listaObjetos) {
                ArrayList<Object> datosFila = new ArrayList<>();
                for (Field campo : campos) {
                    try {
                        campo.setAccessible(true);
                        Object valorCampo = campo.get(objeto);
                        datosFila.add(valorCampo);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();

                    }
                }
                modeloTabla.addRow(datosFila.toArray());
            }

        } else {

            TableColumnModel columnModel = tabla.getColumnModel();
            int columnCount = columnModel.getColumnCount();

            nomCols = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                TableColumn column = columnModel.getColumn(i);
                nomCols[i] = ((String) column.getHeaderValue()).toUpperCase();
            }

            // Crear el modelo de tabla (NO EDITABLE)
            modeloTabla = new DefaultTableModel(nomCols, 0) {
                @Override
                public boolean isCellEditable(int fila, int columna) {
                    return false; // Todas las celdas no son editables
                }
            };

        }

        tabla.getTableHeader().setReorderingAllowed(false); //No permitir que se mueva la ubicacion de las columnas
        tabla.setModel(modeloTabla);

    }

    public static String obtenerValorCelda(JTable tabla, int columna) {
        if (tabla.getSelectedRowCount() == 0) { // No selecciono una celda: -1
            return "-1";
        } else { // Selecciono una selda
            // Obtener el índice de la fila seleccionada
            int filaSeleccionada = tabla.getSelectedRow();
            if (tabla.getValueAt(filaSeleccionada, columna) == null) {
                return "-1";
            } else {
                return tabla.getValueAt(filaSeleccionada, columna).toString();
            }
        }
    }
    
    public static String darFormatoDeNombre(String nombre) {
        // obtener un arreglo con cada parte del nombre en minusculas
        String palabras[] = nombre.toLowerCase().split("\\s+"); // separar por espacios
        StringBuilder nombreFormateado = new StringBuilder();
        
        for (String palabra : palabras) {
            nombreFormateado.append(Character.toUpperCase(palabra.charAt(0)))
                    .append(palabra.substring(1))
                    .append(" ");
        }
        return nombreFormateado.toString().trim();
    }
    
    public static String darFormatoDeTexto(String texto) {
        String primLetra = String.valueOf(texto.charAt(0)).toUpperCase();
        if(primLetra.matches("^[0-9].*")) {
            return texto;
        }else {
            return primLetra + texto.substring(1, texto.length());
        }
    }
}