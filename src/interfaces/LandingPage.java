package interfaces;

import Utils.Utils;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LandingPage extends javax.swing.JFrame {

    public LandingPage() {

        initComponents();
        setLocation(280, 50);
        this.setLocationRelativeTo(this);
        Utils.Setimage(jLabel2, "src/images/logo.png");
        this.repaint();
        SistemaGestionDocumentario.setFont(Servicio.FuenteServicio.fuentes.fuente(Servicio.FuenteServicio.fuentes.PoppinsBold, 1, 18));
        SistemaGestionDocumentario1.setFont(Servicio.FuenteServicio.fuentes.fuente(Servicio.FuenteServicio.fuentes.PoppinsRegular, 0, 18));
        IniciarSesion.setFont(Servicio.FuenteServicio.fuentes.fuente(Servicio.FuenteServicio.fuentes.PoppinsRegular, 0, 14));
        IniciarSesionAdministrador.setFont(Servicio.FuenteServicio.fuentes.fuente(Servicio.FuenteServicio.fuentes.PoppinsRegular, 0, 12));
        Verificacion.setFont(Servicio.FuenteServicio.fuentes.fuente(Servicio.FuenteServicio.fuentes.PoppinsRegular, 0, 12));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SistemaGestionDocumentario = new javax.swing.JLabel();
        IniciarSesion = new javax.swing.JButton();
        Verificacion = new javax.swing.JLabel();
        IniciarSesionAdministrador = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        SistemaGestionDocumentario1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        SistemaGestionDocumentario.setBackground(new java.awt.Color(0, 0, 0));
        SistemaGestionDocumentario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SistemaGestionDocumentario.setForeground(new java.awt.Color(255, 102, 0));
        SistemaGestionDocumentario.setText("Universidad de Lima");

        IniciarSesion.setBackground(new java.awt.Color(255, 102, 0));
        IniciarSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSesion.setText("Iniciar sesión");
        IniciarSesion.setBorder(null);
        IniciarSesion.setBorderPainted(false);
        IniciarSesion.setDefaultCapable(false);
        IniciarSesion.setFocusPainted(false);
        IniciarSesion.setFocusable(false);
        IniciarSesion.setRequestFocusEnabled(false);
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });

        Verificacion.setText("¿Eres administrador?");

        IniciarSesionAdministrador.setBackground(new java.awt.Color(0, 102, 255));
        IniciarSesionAdministrador.setForeground(new java.awt.Color(0, 51, 255));
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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 200));
        jLabel2.setMinimumSize(new java.awt.Dimension(200, 200));
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 200));

        SistemaGestionDocumentario1.setBackground(new java.awt.Color(0, 0, 0));
        SistemaGestionDocumentario1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SistemaGestionDocumentario1.setText("Sistema de Tramite Documentario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Verificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IniciarSesionAdministrador))
                            .addComponent(SistemaGestionDocumentario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SistemaGestionDocumentario)
                .addGap(248, 248, 248))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SistemaGestionDocumentario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SistemaGestionDocumentario)
                .addGap(42, 42, 42)
                .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Verificacion)
                    .addComponent(IniciarSesionAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarSesionAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionAdministradorActionPerformed
        dispose();
        PersonalLogin administradorPage = new PersonalLogin();
        administradorPage.setVisible(true);
    }//GEN-LAST:event_IniciarSesionAdministradorActionPerformed

    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
        dispose();
        UserLogin userPage = new UserLogin();
        userPage.setVisible(true);
    }//GEN-LAST:event_IniciarSesionActionPerformed

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
    private javax.swing.JLabel SistemaGestionDocumentario1;
    private javax.swing.JLabel Verificacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
