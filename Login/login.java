/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desingn;

import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class login extends javax.swing.JFrame {

    int timer;
    public login() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        juser = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        bentrar = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        jLabel3.setText("INICIAR SESION");

        juser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserActionPerformed(evt);
            }
        });

        bentrar.setText("Entrar");
        bentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bentrarMouseClicked(evt);
            }
        });
        bentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bentrarActionPerformed(evt);
            }
        });

        bsalir.setText("Salir");
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(juser, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bsalir)
                        .addGap(34, 34, 34)
                        .addComponent(bentrar)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(juser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bentrar)
                    .addComponent(bsalir))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bentrarActionPerformed
        if (juser.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un usuario");
        }
        else if (jpassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese una contraseña");
        }
        else if (juser.getText().contains("admin") && jpassword.getText().contains("admin")){
            JOptionPane.showMessageDialog(null, "Acceso autorizado");
            panelverde abrir = new panelverde();
            abrir.setVisible(true);
        }
        else if (juser.getText().contains("usuario") && jpassword.getText().contains("usuario")){
            JOptionPane.showMessageDialog(null, "Acceso autorizado");
            panelazul abrir = new panelazul();
            abrir.setVisible(true);
        }
        else if (timer == 3) {
            JOptionPane.showMessageDialog(null, "Ha excedido el nú mero de intentos");
        }
        else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas", "Message",JOptionPane.ERROR_MESSAGE);
            timer = timer + 1;
        }
    }//GEN-LAST:event_bentrarActionPerformed

    private void juserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juserActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bsalirActionPerformed

    private void bentrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bentrarMouseClicked
       
    }//GEN-LAST:event_bentrarMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bentrar;
    private javax.swing.JButton bsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField juser;
    // End of variables declaration//GEN-END:variables
}