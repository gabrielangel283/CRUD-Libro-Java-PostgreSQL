/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package capa_Presentacion;

import Capa_Datos.BD_Libro;
import Capa_Logica.Libro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author USER
 */
public class FrmLibro extends javax.swing.JFrame {

    /**
     * Creates new form FrmLibro
     */
    
    private boolean nuevo = true;
    
    public FrmLibro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ingreso de libros a una BD");
        habilitar(false);
    }
    
    public void habilitar(boolean v) {
        txtPais.setEnabled(v);
        txtTitulo.setEnabled(v);
        txtAutor.setEnabled(v);
        txtNPaginas.setEnabled(v);
        txtEditorial.setEnabled(v);
        
        btnNuevo.setEnabled(!v);
        btnGrabar.setEnabled(v);
        btnCancelar.setEnabled(v);
        btnModificar.setEnabled(!v);
        btnEliminar.setEnabled(!v);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblLibro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNPaginas = new javax.swing.JTextField();
        checkListar = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Autor", "Editorial", "Pais", "N° Paginas"
            }
        ));
        jScrollPane2.setViewportView(tblLibro);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("País: ");

        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Titulo: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Autor: ");

        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("N° Paginas: ");

        checkListar.setText("Listar todo");
        checkListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkListarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Buscar por titulo o autor: ");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Editorial: ");

        txtEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtPais))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtEditorial))
                            .addComponent(checkListar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtAutor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtTitulo)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkListar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkListarActionPerformed
        // Para listar los datos
        try {
            ArrayList<Libro> listaLibros = BD_Libro.listarDatos();
            if(!listaLibros.isEmpty()) {
                Util.llenarJTable(listaLibros, tblLibro);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_checkListarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // Boton habilitar
        habilitar(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Boton modificar
        try {
            // obtener la id de la selda seleccionada
            int id = Integer.parseInt(Util.obtenerValorCelda(tblLibro, 0));
            
            if(id != -1) { // Selecciono una celda para modificar
                Libro obj = BD_Libro.obtenerLibroPorID(id);
                if(obj != null) {
                    txtTitulo.setText(obj.getTitulo());
                    txtAutor.setText(obj.getAutor());
                    txtPais.setText(obj.getPais());
                    txtNPaginas.setText(String.valueOf(obj.getnPaginas()));
                    txtEditorial.setText(obj.getEditorial());
                    habilitar(true);
                }
                
                this.nuevo = false;
            }else { // No selecciono una celda para modificar
                JOptionPane.showMessageDialog(this, "Debe seleccionar un dato para modificar");
                if(BD_Libro.listarDatos() == null) {
                    tblLibro.removeAll();
                }else {
                    Util.llenarJTable(BD_Libro.listarDatos(), tblLibro);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error al modificar1");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Boton eliminar
        try {
            String id = Util.obtenerValorCelda(tblLibro, 0);
            
            if(!id.equals("-1")) { // Selecciono una celda para eliminar
                int rpta = JOptionPane.showConfirmDialog(this, "¿Esta seguro de eliminar el dato seleccionado?",
                                                        "Sistema", JOptionPane.YES_NO_OPTION);
                if(rpta == 0) { // Si
                    BD_Libro.eliminarDato(Integer.parseInt(id));
                    JOptionPane.showMessageDialog(this, "Dato eliminado correctamente", "Sistema",
                                                    JOptionPane.INFORMATION_MESSAGE);
                }
            }else { // No selecciono una selda para eliminar
                JOptionPane.showMessageDialog(this, "Debe seleccionar un dato para eliminar",
                                                "Sistema", JOptionPane.INFORMATION_MESSAGE);
                if(BD_Libro.listarDatos() == null) {
                    tblLibro.removeAll();
                }else {
                Util.llenarJTable(BD_Libro.listarDatos(), tblLibro);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error al eliminar los datos", "Sistema", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Boton cancelar
        habilitar(false);
        txtTitulo.setText("");
        txtAutor.setText("");
        txtPais.setText("");
        txtNPaginas.setText("");
        txtEditorial.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // Boton grabar
        boolean v_Titulo = UtilValidacion.esValidoTextoComb(txtTitulo.getText());
        boolean v_Autor = UtilValidacion.esValidoSoloLetras(txtAutor.getText());
        boolean v_Pais = UtilValidacion.esValidoTextoComb(txtPais.getText());
        boolean v_nPag = UtilValidacion.esEntero(txtNPaginas.getText());
        boolean v_Editorial = UtilValidacion.esValidoTextoComb(txtEditorial.getText());
        
        if(!v_Titulo) {
            JOptionPane.showMessageDialog(this, "El titulo ingresado no es valido", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!v_Autor) {
            JOptionPane.showMessageDialog(this, "El nombre del autor ingresado no es valido", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!v_Pais) {
            JOptionPane.showMessageDialog(this, "El nombre del pais ingresado no es valido", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!v_nPag) {
            JOptionPane.showMessageDialog(this, "El N° de paginas ingresado no es valido, debe ser un entero positivo", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!v_Editorial) {
            JOptionPane.showMessageDialog(this, "La editorial ingresado no es valido", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Libro l = new Libro();
        
        try {
            l.setTitulo(txtTitulo.getText());
            l.setAutor(txtAutor.getText());
            l.setEditorial(txtEditorial.getText());
            l.setPais(txtPais.getText());
            l.setnPaginas(Integer.parseInt(txtNPaginas.getText()));
        
            if(this.nuevo) { // Si solo se va a grabar datos
                BD_Libro.agregarDato(l);
                JOptionPane.showMessageDialog(this, "Datos ingresados correctamente", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
            }else { // Si se va a modificar datos
                int id = Integer.parseInt(Util.obtenerValorCelda(tblLibro, 0));
                if(id != -1) { // Si existe la id del objeto a modificar
                    BD_Libro.modificarDato(id, l);
                    JOptionPane.showMessageDialog(this, "Datos actualizados correctamente", "Actualizacion", JOptionPane.INFORMATION_MESSAGE);
                }
                this.nuevo = true;
            }
        
            Util.llenarJTable(BD_Libro.listarDatos(), tblLibro);
            habilitar(false);
        
            txtTitulo.setText("");
            txtAutor.setText("");
            txtPais.setText("");
            txtNPaginas.setText("");
            txtEditorial.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error al grabar los datos");
        } finally{
            l = null;
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // Boton buscar - por titulo o autor
        if(!txtBuscar.getText().trim().equals("")) {
            ArrayList<Libro> listaFiltro = BD_Libro.filtrarPorTituloOAutor(txtBuscar.getText());
        
            if(!listaFiltro.isEmpty()){
            Util.llenarJTable(listaFiltro, tblLibro);
            }else {
            JOptionPane.showMessageDialog(this, "No existe un titulo o autor '" + txtBuscar.getText() + "'",
                    "Busqueda de dato", JOptionPane.INFORMATION_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(this, "Debe escribir algo en la barra de busqueda", "Busqueda de dato",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditorialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox checkListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblLibro;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtNPaginas;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
