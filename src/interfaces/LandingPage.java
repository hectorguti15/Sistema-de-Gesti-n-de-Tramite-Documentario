
package interfaces;



public class LandingPage extends javax.swing.JFrame {

    public LandingPage() {

        initComponents();

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SistemaGestionDocumentario = new javax.swing.JLabel();
        IniciarSesion = new javax.swing.JButton();
        Verificacion = new javax.swing.JLabel();
        IniciarSesionAdministrador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        SistemaGestionDocumentario.setBackground(new java.awt.Color(0, 0, 0));
        SistemaGestionDocumentario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SistemaGestionDocumentario.setForeground(new java.awt.Color(102, 102, 102));
        SistemaGestionDocumentario.setText("Sistema de Tramite Documentario ");

        IniciarSesion.setBackground(new java.awt.Color(51, 51, 51));
        IniciarSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSesion.setText("Iniciar sesión");
        IniciarSesion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        IniciarSesion.setBorderPainted(false);
        IniciarSesion.setFocusPainted(false);
        IniciarSesion.setFocusable(false);
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });

        Verificacion.setText("¿Eres administrador?");

        IniciarSesionAdministrador.setBackground(new java.awt.Color(0, 204, 255));
        IniciarSesionAdministrador.setForeground(new java.awt.Color(0, 204, 255));
        IniciarSesionAdministrador.setText("Iniciar como personal");
        IniciarSesionAdministrador.setBorder(null);
        IniciarSesionAdministrador.setContentAreaFilled(false);
        IniciarSesionAdministrador.setFocusPainted(false);
        IniciarSesionAdministrador.setFocusable(false);
        IniciarSesionAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionAdministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SistemaGestionDocumentario)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Verificacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IniciarSesionAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(SistemaGestionDocumentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Verificacion)
                    .addComponent(IniciarSesionAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
        dispose();
        UserLogin userPage = new UserLogin();
        userPage.setVisible(true);
    }//GEN-LAST:event_IniciarSesionActionPerformed

    private void IniciarSesionAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionAdministradorActionPerformed
        dispose();
        PersonalLogin administradorPage = new PersonalLogin();
        administradorPage.setVisible(true);
    }//GEN-LAST:event_IniciarSesionAdministradorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandingPage().setVisible(true);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IniciarSesion;
    private javax.swing.JButton IniciarSesionAdministrador;
    private javax.swing.JLabel SistemaGestionDocumentario;
    private javax.swing.JLabel Verificacion;
    // End of variables declaration//GEN-END:variables
}
