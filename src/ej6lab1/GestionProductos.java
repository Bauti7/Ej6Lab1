/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6lab1;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Bau
 */
public class GestionProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionProducto
     */
    public GestionProductos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdEscritorio = new javax.swing.JDesktopPane();
        jcRubro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jtStock = new javax.swing.JTextField();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtDisponible = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jbLupa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);

        jcRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumería", " " }));

        jLabel6.setText("Stock");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");

        jbSalir.setText("Salir");

        jtDisponible.setText(".");

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setText("Gestión de Productos");

        jLabel2.setText("Código");

        jtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtCodigoKeyReleased(evt);
            }
        });

        jbLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ej6lab1/lupa (1).png"))); // NOI18N
        jbLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLupaActionPerformed(evt);
            }
        });

        jLabel3.setText("Descripción");

        jLabel4.setText("Precio");

        jtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioActionPerformed(evt);
            }
        });

        jLabel5.setText("Rubro");

        jdEscritorio.setLayer(jcRubro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jtStock, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jbNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jbGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jbEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jtDisponible, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jbLupa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jtDescripcion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jtPrecio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdEscritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdEscritorioLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jbNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdEscritorioLayout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addGap(31, 31, 31)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addGroup(jdEscritorioLayout.createSequentialGroup()
                        .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdEscritorioLayout.createSequentialGroup()
                                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(23, 23, 23)
                                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtDescripcion)
                                    .addComponent(jtStock)
                                    .addComponent(jcRubro, 0, 212, Short.MAX_VALUE)
                                    .addComponent(jtPrecio)))
                            .addGroup(jdEscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(47, 47, 47)
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtDisponible)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jdEscritorioLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdEscritorioLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdEscritorioLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jbLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbNuevo)
                            .addComponent(jbGuardar)
                            .addComponent(jbEliminar)
                            .addComponent(jbSalir))
                        .addContainerGap())
                    .addGroup(jdEscritorioLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(jtDisponible))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed

        jtCodigo.setText("");
        jtDescripcion.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
        jcRubro.setSelectedIndex(0);

    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        if(jtCodigo.getText().isEmpty() || jtDescripcion.getText().isEmpty() || jtPrecio.getText().isEmpty() || jtStock.getText().isEmpty()){

            JOptionPane.showMessageDialog(this, "Campo vacío.");

            return;

        } else {

            try{

                int codigo = Integer.parseInt(jtCodigo.getText());

                String descripcion = jtDescripcion.getText();

                Double precio = Double.parseDouble(jtPrecio.getText());

                int stock = Integer.parseInt(jtStock.getText());

                Categoria rubro = null;

                if(jcRubro.getSelectedIndex() == 0){

                    rubro = Categoria.COMESTIBLE;

                }else if(jcRubro.getSelectedIndex() == 1){

                    rubro = Categoria.LIMPIEZA;

                }else{

                    rubro = Categoria.PERFUMERIA;

                }

                Producto prod = new Producto(codigo, descripcion, precio, stock, rubro);

                for(Producto produ : Supermercado.listaProductos){

                    if(codigo == produ.getCodigo()){

                        JOptionPane.showMessageDialog(this, "El código ingresado ya se registró anteriormente..");
                        jbNuevoActionPerformed(evt);
                        return;
                    }

                }

                Supermercado.listaProductos.add(prod);

                JOptionPane.showMessageDialog(this, "Producto registrado exitosamente..");

                jbNuevoActionPerformed(evt);

            } catch(NumberFormatException e){

                JOptionPane.showMessageDialog(this, "Error en campo de texto, compruebe haber escrito bien: ");

            }

        }

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLupaActionPerformed

        BuscadorLupa ventana = new BuscadorLupa();
        
        ventana.setVisible(true);
        
        jdEscritorio.add(ventana);
        jdEscritorio.moveToFront(ventana);
        
        

    }//GEN-LAST:event_jbLupaActionPerformed

    private void jtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioActionPerformed

    private void jtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoKeyReleased
        
        try{

            for(Producto prod : Supermercado.listaProductos){

                if(prod.getCodigo() == Integer.parseInt(jtCodigo.getText())){

                    jtDisponible.setText("No disponible...");

                    jtDisponible.setForeground(Color.RED);

                    return;

                } else{

                    jtDisponible.setText("Disponible !");

                    jtDisponible.setForeground(Color.GREEN);

                }

            }

        }catch(NumberFormatException e){

            jtDisponible.setText("");
        }
        
    }//GEN-LAST:event_jtCodigoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLupa;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcRubro;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JLabel jtDisponible;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables
}