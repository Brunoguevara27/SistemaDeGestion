package pantallas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    ConsultaProductos consultaProductos = new ConsultaProductos();
    ModificarProductos modificarProductos = new ModificarProductos();
    RealizarCompra realizarCompra = new RealizarCompra();
    ConsultaVentas consultaVentas = new ConsultaVentas();
    public Principal() {
        initComponents();
    }

    public void usuarioBasico() {
        jMenuAdministracion.setEnabled(false);
    }

    public void mostrarBarraNav() {
        jMenu1.setEnabled(true);
        jMenu2.setEnabled(true);
        jMenu3.setEnabled(true);
        jMenu4.setEnabled(true);
        jMenu5.setEnabled(true);
        jMenuAdministracion.setEnabled(true);
        jMenu6.setEnabled(true);
    }

    public void ocultarBarraNav() {
        jMenu1.setEnabled(false);
        jMenu2.setEnabled(false);
        jMenu3.setEnabled(false);
        jMenu4.setEnabled(false);
        jMenu5.setEnabled(false);
        jMenuAdministracion.setEnabled(false);
        jMenu6.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem10 = new javax.swing.JMenuItem();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/fondoEscritorio.png"));
        Image image = icon.getImage();
        jdpEscritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rSLabelFecha2 = new rojeru_san.RSLabelFecha();
        rSLabelHora2 = new rojeru_san.RSLabelHora();
        jBarraNav = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemRealizarCompra = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemProductos = new javax.swing.JMenuItem();
        itemModificarProd = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemFacturas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemConsultasProd = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuAdministracion = new javax.swing.JMenu();
        itemUsuarios = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        itemCerrarSesion = new javax.swing.JMenuItem();

        jMenuItem10.setText("jMenuItem10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Usuario: ");

        nombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Tipo de usuario:");

        tipoDeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombreUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(tipoDeUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        rSLabelFecha2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rSLabelFecha2.setForeground(new java.awt.Color(204, 204, 204));
        rSLabelFecha2.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N

        rSLabelHora2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rSLabelHora2.setForeground(new java.awt.Color(204, 204, 204));
        rSLabelHora2.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N

        jdpEscritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(rSLabelFecha2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(rSLabelHora2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSLabelHora2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(rSLabelFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpEscritorioLayout.createSequentialGroup()
                .addGap(0, 217, Short.MAX_VALUE)
                .addComponent(rSLabelHora2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSLabelFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jBarraNav.setBackground(new java.awt.Color(255, 255, 255));
        jBarraNav.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jBarraNav.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/compra.png"))); // NOI18N
        jMenu1.setText("Compra");

        itemRealizarCompra.setBackground(new java.awt.Color(255, 255, 255));
        itemRealizarCompra.setForeground(new java.awt.Color(0, 0, 0));
        itemRealizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/realizarCompra.png"))); // NOI18N
        itemRealizarCompra.setText("Realizar Compra");
        itemRealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRealizarCompraActionPerformed(evt);
            }
        });
        jMenu1.add(itemRealizarCompra);

        jBarraNav.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mantenimiento.png"))); // NOI18N
        jMenu2.setText("Mantenimiento");

        itemProductos.setBackground(new java.awt.Color(255, 255, 255));
        itemProductos.setForeground(new java.awt.Color(0, 0, 0));
        itemProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.png"))); // NOI18N
        itemProductos.setText("Ingreso de Productos");
        itemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProductosActionPerformed(evt);
            }
        });
        jMenu2.add(itemProductos);

        itemModificarProd.setBackground(new java.awt.Color(255, 255, 255));
        itemModificarProd.setForeground(new java.awt.Color(0, 0, 0));
        itemModificarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificarProd.png"))); // NOI18N
        itemModificarProd.setText("Modificar / Eliminar Productos");
        itemModificarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemModificarProdActionPerformed(evt);
            }
        });
        jMenu2.add(itemModificarProd);

        jBarraNav.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/movimiento.png"))); // NOI18N
        jMenu3.setText("Movimiento");

        itemFacturas.setBackground(new java.awt.Color(255, 255, 255));
        itemFacturas.setForeground(new java.awt.Color(0, 0, 0));
        itemFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/facturas.png"))); // NOI18N
        itemFacturas.setText("Facturas");
        jMenu3.add(itemFacturas);

        jBarraNav.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setForeground(new java.awt.Color(0, 0, 0));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultas.jpg"))); // NOI18N
        jMenu4.setText("Consultas");

        itemConsultasProd.setBackground(new java.awt.Color(255, 255, 255));
        itemConsultasProd.setForeground(new java.awt.Color(0, 0, 0));
        itemConsultasProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultaProd.png"))); // NOI18N
        itemConsultasProd.setText("C. Productos");
        itemConsultasProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultasProdActionPerformed(evt);
            }
        });
        jMenu4.add(itemConsultasProd);

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c.ventas.png"))); // NOI18N
        jMenuItem1.setText("C. Ventas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jBarraNav.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(255, 255, 255));
        jMenu5.setForeground(new java.awt.Color(0, 0, 0));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reportes.png"))); // NOI18N
        jMenu5.setText("Reportes");

        jMenuItem8.setText("R. Productos");
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("R. Clientes");
        jMenu5.add(jMenuItem9);

        jMenuItem11.setText("R. Facturas");
        jMenu5.add(jMenuItem11);

        jBarraNav.add(jMenu5);

        jMenuAdministracion.setBackground(new java.awt.Color(255, 255, 255));
        jMenuAdministracion.setForeground(new java.awt.Color(0, 0, 0));
        jMenuAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administracion.png"))); // NOI18N
        jMenuAdministracion.setText("Administración");

        itemUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        itemUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        itemUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios.png"))); // NOI18N
        itemUsuarios.setText("Usuarios");
        itemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUsuariosActionPerformed(evt);
            }
        });
        jMenuAdministracion.add(itemUsuarios);

        jBarraNav.add(jMenuAdministracion);

        jMenu6.setBackground(new java.awt.Color(255, 255, 255));
        jMenu6.setForeground(new java.awt.Color(0, 0, 0));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuenta.png"))); // NOI18N
        jMenu6.setText("Cuenta");

        itemCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        itemCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        itemCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar sesion.png"))); // NOI18N
        itemCerrarSesion.setText("Cerrar Sesión");
        itemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarSesionActionPerformed(evt);
            }
        });
        jMenu6.add(itemCerrarSesion);

        jBarraNav.add(jMenu6);

        setJMenuBar(jBarraNav);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );

        setSize(new java.awt.Dimension(787, 425));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProductosActionPerformed
        IngresoProductos ingresoProd = new IngresoProductos();
        if (ingresoProd.isShowing()) {
            System.out.println("Ya esta en pantalla");
        } else {
            jdpEscritorio.add(ingresoProd);
            Dimension jdpSize = jdpEscritorio.getSize();
            Dimension FrameSize = ingresoProd.getSize();
            ingresoProd.setLocation((jdpSize.width - FrameSize.width) / 2, (jdpSize.height - FrameSize.height) / 2);
            ingresoProd.show();
        }
    }//GEN-LAST:event_itemProductosActionPerformed

    private void itemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSesionActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "¿Seguro que desea cerrar sesión?", null, JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (i == 0) {
            this.dispose();
            Login login = new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_itemCerrarSesionActionPerformed

    private void itemConsultasProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultasProdActionPerformed
        if (consultaProductos.isShowing()) {
            System.out.println("Ya esta en pantalla");
        } else {
            jdpEscritorio.add(consultaProductos);
            Dimension jdpSize = jdpEscritorio.getSize();
            Dimension FrameSize = consultaProductos.getSize();
            consultaProductos.setLocation((jdpSize.width - FrameSize.width) / 2, (jdpSize.height - FrameSize.height) / 2);
            consultaProductos.show();
        }
    }//GEN-LAST:event_itemConsultasProdActionPerformed
    AdminUsuarios admUsuarios = new AdminUsuarios();
    private void itemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUsuariosActionPerformed
        if (admUsuarios.isShowing()) {
            System.out.println("Ya esta en pantalla");
        } else {
            jdpEscritorio.add(admUsuarios);
            Dimension jdpSize = jdpEscritorio.getSize();
            Dimension FrameSize = admUsuarios.getSize();
            admUsuarios.setLocation((jdpSize.width - FrameSize.width) / 2, (jdpSize.height - FrameSize.height) / 2);
            admUsuarios.show();
        }
    }//GEN-LAST:event_itemUsuariosActionPerformed

    private void itemModificarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemModificarProdActionPerformed
        if (modificarProductos.isShowing()) {
            System.out.println("Ya esta en pantalla");
        } else {
            jdpEscritorio.add(modificarProductos);
            Dimension jdpSize = jdpEscritorio.getSize();
            Dimension FrameSize = modificarProductos.getSize();
            modificarProductos.setLocation((jdpSize.width - FrameSize.width) / 2, (jdpSize.height - FrameSize.height) / 2);
            modificarProductos.show();
        }
    }//GEN-LAST:event_itemModificarProdActionPerformed

    private void itemRealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRealizarCompraActionPerformed
        if(realizarCompra.isShowing()){
            System.out.println("Ya esta en pantalla");
        } else{
            jdpEscritorio.add(realizarCompra);
            Dimension jdpSize = jdpEscritorio.getSize();
            Dimension FrameSize = realizarCompra.getSize();
            realizarCompra.setLocation((jdpSize.width - FrameSize.width) / 2, (jdpSize.height - FrameSize.height) / 2);
            realizarCompra.show();
        }
    }//GEN-LAST:event_itemRealizarCompraActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(consultaVentas.isShowing()){
            System.out.println("Ya esta en pantalla");
        } else{
            jdpEscritorio.add(consultaVentas);
            Dimension jdpSize = jdpEscritorio.getSize();
            Dimension FrameSize = consultaVentas.getSize();
            consultaVentas.setLocation((jdpSize.width - FrameSize.width) / 2, (jdpSize.height - FrameSize.height) / 2);
            consultaVentas.show();
        }       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCerrarSesion;
    private javax.swing.JMenuItem itemConsultasProd;
    private javax.swing.JMenuItem itemFacturas;
    private javax.swing.JMenuItem itemModificarProd;
    public static javax.swing.JMenuItem itemProductos;
    private javax.swing.JMenuItem itemRealizarCompra;
    private javax.swing.JMenuItem itemUsuarios;
    public static javax.swing.JMenuBar jBarraNav;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenuAdministracion;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane jdpEscritorio;
    public static final javax.swing.JLabel nombreUsuario = new javax.swing.JLabel();
    private rojeru_san.RSLabelFecha rSLabelFecha2;
    private rojeru_san.RSLabelHora rSLabelHora2;
    public static final javax.swing.JLabel tipoDeUsuario = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
