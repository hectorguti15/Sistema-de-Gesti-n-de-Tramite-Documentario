/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import Enums.TipoDependencia;
import Enums.TipoEstado;
import Enums.TipoExpediente;
import Enums.TipoIdentificacion;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import modelos.Expediente;

/**
 *
 * @author hecto
 */
public class AsignarAreaExpediente extends javax.swing.JFrame {

    /**
     * Creates new form AsignarAreaExpediente
     */
    private Expediente expediente;
    private Runnable callback;

    public AsignarAreaExpediente(Expediente expediente, Runnable callback) {
        initComponents();
        this.expediente = expediente;
        this.callback = callback;
        agregarAreas();
        llenarTablaInformacion();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        jList1.setModel(listModel);
        if (!expediente.getAreas().estaVacia()) {
            llenarAreas(listModel);
        }

        usuario.setText("Usuario: " + this.expediente.getUser().getNombre());
        documentoReferencia.setText(this.expediente.getDocumentoReferencia() == null ? "No documento ingresado" : this.expediente.getDocumentoReferencia().getName());

        // Add a window listener to call the callback when the window is closed
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent evt) {
                callback.run();
            }
        });
    }

    private void agregarAreas() {
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        for (TipoDependencia tipo : TipoDependencia.values()) {
            comboBoxModel.addElement(TipoDependencia.fromEnumToString(tipo));
        }

        jComboBox1.setModel(comboBoxModel);
    }

    private void llenarTablaInformacion() {

        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{},
                new String[]{"N° expediente", "Solicitud", "Área actual", "Prioridad", "Estado", "Tiempo inicio"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tableAsignar.setModel(model);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        LocalDateTime fechaInicial = expediente.getTiempoExpediente().getFechaInicial();
        Date fechaInicialDate = Date.from(fechaInicial.atZone(ZoneId.systemDefault()).toInstant());

        model.addRow(new Object[]{
            expediente.getNumeroExpediente(),
            TipoExpediente.fromEnumToString(expediente.getTipoExpediente()),
            TipoDependencia.fromEnumToString(expediente.getTipoDependencia()),
            expediente.getPrioridad(),
            TipoEstado.fromEnumToString(expediente.getEstado()),
            dateFormat.format(fechaInicialDate)
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableAsignar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        documentoReferencia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableAsignar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableAsignar);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Información sobre el expediente");

        usuario.setText("Usuario: ");

        documentoReferencia.setText("Documento de referencia:");

        jLabel2.setText("Agregar área");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jButton1.setBorder(null);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cerrar");
        jButton2.setBorder(null);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(usuario)
                            .addComponent(documentoReferencia)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 148, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(documentoReferencia)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String selectedArea = (String) jComboBox1.getSelectedItem();
        System.out.println("Selected area: " + selectedArea);

        // Asegúrate de que el modelo sea de tipo DefaultListModel
        DefaultListModel<String> listModel = (DefaultListModel<String>) jList1.getModel();

        if (!listModel.contains(selectedArea)) {
            listModel.addElement(selectedArea);
            if (this.expediente.getAreas().estaLlena()) {
                this.expediente.getAreas().expandirCapacidad();
            }
            this.expediente.getAreas().encolar(TipoDependencia.fromStringToEnum(selectedArea));
            this.expediente.setTipoDependencia((TipoDependencia) this.expediente.getAreas().obtenerPrimero());
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "El área ya está en la lista.", "Información", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("Callbackrun");
        callback.run();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void llenarAreas(DefaultListModel<String> listModel) {

        Object[] obtenerAreas = this.expediente.getAreas().obtenerLista();
        TipoDependencia[] areas = new TipoDependencia[obtenerAreas.length];
        for (int i = 0; i < obtenerAreas.length; i++) {
            areas[i] = (TipoDependencia) obtenerAreas[i];
        }

        for (TipoDependencia area : areas) {
            if (area != null) {
                String agregarAreaString = TipoDependencia.fromEnumToString(area);
                listModel.addElement(agregarAreaString);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(AsignarAreaExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarAreaExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarAreaExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarAreaExpediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarAreaExpediente(new Expediente(), () -> {
                }
                ).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel documentoReferencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableAsignar;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
