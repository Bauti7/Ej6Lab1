/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6lab1;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bau
 */
public class BusquedaPorPrecio extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    
    public BusquedaPorPrecio() {
        initComponents();
        armarCabecera();
        cargarTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtPrecio1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtPrecio2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Listado por Precio");

        jLabel2.setText("Entre $:");

        jtPrecio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecio1KeyReleased(evt);
            }
        });

        jLabel3.setText("Y");

        jtPrecio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecio2ActionPerformed(evt);
            }
        });
        jtPrecio2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPrecio2KeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(jtPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtPrecio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecio2ActionPerformed

    private void jtPrecio1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecio1KeyReleased
        
        borrarLista();
        
        
        for(Producto p: Supermercado.listaProductos){
            
            
            try{
                
                double precio1 = Double.parseDouble(jtPrecio1.getText());
                double precio2 = Double.parseDouble(jtPrecio2.getText());
            
                if(p.getPrecio() >= precio1 && p.getPrecio() <= precio2){
            
                modelo.addRow(new Object[]{p.getCodigo(),p.getDescripcion(),p.getPrecio(),p.getStock()});
            
            }
            
            }catch(NumberFormatException e){
            
            
            }
            
        
        }
        
    }//GEN-LAST:event_jtPrecio1KeyReleased

    private void jtPrecio2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecio2KeyReleased
        
        borrarLista();
        
        
        for(Producto p: Supermercado.listaProductos){
            
            
            try{
                
                double precio1 = Double.parseDouble(jtPrecio1.getText());
                double precio2 = Double.parseDouble(jtPrecio2.getText());
            
                if(p.getPrecio() >= precio1 && p.getPrecio() <= precio2){
            
                modelo.addRow(new Object[]{p.getCodigo(),p.getDescripcion(),p.getPrecio(),p.getStock()});
            
            }
            
            }catch(NumberFormatException e){
            
            
            }
            
        
        }
        
    }//GEN-LAST:event_jtPrecio2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtPrecio1;
    private javax.swing.JTextField jtPrecio2;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){
    
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jTable1.setModel(modelo);
    
    }
    
    private void cargarTabla(){
    
        for(Producto p : Supermercado.listaProductos){
        
            modelo.addRow(new Object[]{p.getCodigo(), p.getDescripcion(), p.getPrecio(), p.getStock()});
        
        }
    
    }
    
    private void borrarLista(){
    
        int f = jTable1.getRowCount() -1;
        
        for(;f >= 0; f--){
        
            modelo.removeRow(f);
            
        }
    
    }

}
