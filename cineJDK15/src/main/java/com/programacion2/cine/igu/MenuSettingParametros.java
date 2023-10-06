
package com.programacion2.cine.igu;


/**
 *
 * @author DavidRoco
 */
public class MenuSettingParametros extends javax.swing.JFrame {
     private static MenuSettingParametros instance = null;
    /**
     * Creates new form MenuInicial
     */
    public MenuSettingParametros() {
        initComponents();
    }
    
    public static MenuSettingParametros getInstance() {
        if (instance == null) {
            instance = new MenuSettingParametros();
        }
        return instance;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        tituloVentana = new javax.swing.JLabel();
        tituloSistema = new javax.swing.JLabel();
        btnAdminstrarSalas = new javax.swing.JButton();
        btnAdminstrarDescuentos = new javax.swing.JButton();
        btnAdminstrarEstadosFuncion = new javax.swing.JButton();
        btnAdminstrarPeliculas = new javax.swing.JButton();
        btnAdminstrarFunciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSalir.setText("Volver al Menú Inicial");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tituloVentana.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        tituloVentana.setText("Setting Parámetros");

        tituloSistema.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        tituloSistema.setText("Sistema Cine Programación 2");

        btnAdminstrarSalas.setText("Administrar Salas");
        btnAdminstrarSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminstrarSalasActionPerformed(evt);
            }
        });

        btnAdminstrarDescuentos.setText("Administrar Descuentos");
        btnAdminstrarDescuentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminstrarDescuentosActionPerformed(evt);
            }
        });

        btnAdminstrarEstadosFuncion.setText("Administrar Estados Función");
        btnAdminstrarEstadosFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminstrarEstadosFuncionActionPerformed(evt);
            }
        });

        btnAdminstrarPeliculas.setText("Administrar Películas");
        btnAdminstrarPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminstrarPeliculasActionPerformed(evt);
            }
        });

        btnAdminstrarFunciones.setText("Administrar Funciones");
        btnAdminstrarFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminstrarFuncionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(tituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdminstrarSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdminstrarPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdminstrarDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdminstrarFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdminstrarEstadosFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tituloSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(tituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminstrarSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdminstrarPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdminstrarDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdminstrarFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdminstrarEstadosFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        MenuInicial pantallaInicial = MenuInicial.getInstance();
        pantallaInicial.setVisible(true);
        pantallaInicial.setLocationRelativeTo(null); 
        this.dispose();       
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAdminstrarSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminstrarSalasActionPerformed
        AdministrarSalas adminSalas = AdministrarSalas.getInstance();
        adminSalas.setVisible(true);
        adminSalas.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAdminstrarSalasActionPerformed

    private void btnAdminstrarDescuentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminstrarDescuentosActionPerformed
        AdministrarDescuentos adminDescuentos = AdministrarDescuentos.getInstance();
        adminDescuentos.setVisible(true);
        adminDescuentos.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAdminstrarDescuentosActionPerformed

    private void btnAdminstrarEstadosFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminstrarEstadosFuncionActionPerformed
        AdministrarEstadoFuncion adminEstados = AdministrarEstadoFuncion.getInstance();
        adminEstados.setVisible(true);
        adminEstados.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAdminstrarEstadosFuncionActionPerformed

    private void btnAdminstrarPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminstrarPeliculasActionPerformed
        AdministrarPeliculas adminPelicula = AdministrarPeliculas.getInstance();
        adminPelicula.setVisible(true);
        adminPelicula.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAdminstrarPeliculasActionPerformed

    private void btnAdminstrarFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminstrarFuncionesActionPerformed
        AdministrarFunciones adminFunciones = AdministrarFunciones.getInstance();
        adminFunciones.setVisible(true);
        adminFunciones.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAdminstrarFuncionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminstrarDescuentos;
    private javax.swing.JButton btnAdminstrarEstadosFuncion;
    private javax.swing.JButton btnAdminstrarFunciones;
    private javax.swing.JButton btnAdminstrarPeliculas;
    private javax.swing.JButton btnAdminstrarSalas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tituloSistema;
    private javax.swing.JLabel tituloVentana;
    // End of variables declaration//GEN-END:variables
}
