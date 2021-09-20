package pantallas;

import BDD.SentenciasSql;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Principal ventPrincipal = new Principal();

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void ingresar(String usuario, String pass) {
        SentenciasSql sentenciasSql = new SentenciasSql();
        Connection con = sentenciasSql.conectar();
        String capturar = "";
        int resultado = 0;
        String sql = "SELECT * FROM usuarios WHERE usuario = '" + usuario + "' && pass = '" + pass + "'";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                capturar = rs.getString("tipoUsuario");
                resultado = 1;
            }
            if (resultado == 1) {
                if (capturar.equals("administrador")) {
                    // Se cierra el login
                    this.setVisible(false);
                    // Le damos un msj de bienvenida
                    JOptionPane.showMessageDialog(null, "Bienvenido al Sistema", "Bienvenido!", JOptionPane.INFORMATION_MESSAGE);
                    // Y muestro la ventana principal
                    ventPrincipal.setVisible(true);
                    // Traer todos los componentes de la ventana principal
                    ventPrincipal.pack();
                    // Pongo en la pantalla principal el nombre del usuario
                    ventPrincipal.nombreUsuario.setText(usuario);
                    // Pongo en la pantalla principal el tipo de usuario
                    ventPrincipal.tipoDeUsuario.setText(capturar);
                } else if (capturar.equals("basico")) {
                    // Cerramos el login
                    this.setVisible(false);
                    //Le damos la bienvenida al Sistema
                    JOptionPane.showMessageDialog(null, "Bienvenido al Sistema", "Bienvenido!", JOptionPane.INFORMATION_MESSAGE);
                    //Mostramos la ventana principal
                    ventPrincipal.setVisible(true);
                    //Bloqueamos opciones
                    ventPrincipal.usuarioBasico();
                    //Traemos todos los componentes de la ventana principal
                    ventPrincipal.pack();
                    //Pongemos en la pantalla principal el nombre de usuario y el tipo
                    ventPrincipal.nombreUsuario.setText(usuario);
                    ventPrincipal.tipoDeUsuario.setText(capturar);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error de Acceso", "Error", JOptionPane.ERROR_MESSAGE);
                txUsuario.setText("");
                txContraseña.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnEntrar = new java.awt.Button();
        btnEntrar1 = new java.awt.Button();
        txContraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso al Sistema");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(410, 400));
        setMinimumSize(new java.awt.Dimension(410, 400));
        setPreferredSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 400));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingrese a su cuenta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 152, 40));

        txUsuario.setBackground(new java.awt.Color(204, 204, 255));
        txUsuario.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 152, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 152, 40));

        btnEntrar.setBackground(new java.awt.Color(255, 255, 102));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrar.setLabel("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 100, -1));

        btnEntrar1.setBackground(new java.awt.Color(255, 255, 102));
        btnEntrar1.setLabel("Salir");
        btnEntrar1.setMinimumSize(new java.awt.Dimension(49, 24));
        btnEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 100, -1));

        txContraseña.setBackground(new java.awt.Color(204, 204, 255));
        txContraseña.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 152, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login1.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        String usuario = txUsuario.getText();
        String contraseña = new String(txContraseña.getPassword());
        ingresar(usuario, contraseña);
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnEntrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnEntrar;
    private java.awt.Button btnEntrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txContraseña;
    public javax.swing.JTextField txUsuario;
    // End of variables declaration//GEN-END:variables
}
