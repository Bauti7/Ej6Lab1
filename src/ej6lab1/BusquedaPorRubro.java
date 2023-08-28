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
public class BusquedaPorRubro extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    
    public BusquedaPorRubro() {
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
        jcCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Listado de Productos por Rubro");

        jLabel2.setText("Elija el rubro:");

        jcCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comestible", "Limpieza", "Perfumeria" }));
        jcCategoria.setSelectedIndex(-1);
        jcCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoriaActionPerformed(evt);
            }
        });
        jcCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcCategoriaKeyReleased(evt);
            }
        });

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 87, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel2)
                        .addGap(88, 88, 88)
                        .addComponent(jcCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoriaActionPerformed
        
        Categoria rubro;
        
        BorrarLista();
        
        if(jcCategoria.getSelectedIndex() == 0){
        
            rubro = Categoria.COMESTIBLE;
            
        }else if (jcCategoria.getSelectedIndex() == 1){
        
            rubro = Categoria.LIMPIEZA;
        
        }else{
        
            rubro = Categoria.PERFUMERIA;
        
        }
        
        for(Producto p : Supermercado.listaProductos){
        
            if(p.getRubro().equals(rubro)){
            
                modelo.addRow(new Object[]{p.getCodigo(),p.getDescripcion(),p.getPrecio(),p.getStock()});
                
            }
        
        }
        
    }//GEN-LAST:event_jcCategoriaActionPerformed

    private void jcCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcCategoriaKeyReleased
        
         
        
    }//GEN-LAST:event_jcCategoriaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCategoria;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
    
    private void armarCabecera(){
    
        modelo.addColumn("Código");
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        
        jtTabla.setModel(modelo);
    
    }
    
    private void cargarTabla(){
    
        for(Producto producto : Supermercado.listaProductos){
        
            modelo.addRow(new Object[]{producto.getCodigo(),producto.getDescripcion(),producto.getPrecio(),producto.getStock()});
        
        }
    
    }
    
    private void BorrarLista(){
    
        int f = jtTabla.getRowCount() -1;
        
        for(;f >= 0; f--){
        
            modelo.removeRow(f);
            
        }
    
    }

}
