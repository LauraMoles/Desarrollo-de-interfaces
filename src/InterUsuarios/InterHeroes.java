/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterUsuarios;

import Herramientas.ConfBD;
import Login.TipoUser;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laura Martínez Moles
 */
public class InterHeroes extends javax.swing.JFrame {
    ConfBD conexion = new ConfBD ("localhost","3306","zoo","root","");
    Connection bd = conexion.makeConnect();
    /**
     * Creates new form InterCuidadores
     */
    private int mouseX,mouseY;
    private String nombreHeroe, nameUser;
    private int pos;
    
   
    
    public InterHeroes() {
        
        initComponents();
        titulo.setText(nombreHeroe);
    }
    public InterHeroes(String name, String user) {
        
        
        this.nombreHeroe = name;
        this.nameUser = user;
        initComponents();
        titulo.setText(nombreHeroe);
        atras.setVisible(false);
        
        
    }
    
    public void cargarTareas(){
         try {
            String consulta = "SELECT * FROM usuarios where usuario='"+ nameUser+"'";
            Statement stmt = (Statement) bd.createStatement();
            ResultSet rs=stmt.executeQuery(consulta);
            rs.next();

            consulta = "SELECT usuarios.id, usuarios.usuario, tareas.id, tareas.fecha_creacion, tareas.fecha_realizacion, cuidado.nombre, animales.nombre FROM usuarios, tareas, cuidado,animales where usuarios.id="+Integer.parseInt(rs.getString(1))+" AND tareas.id_heroe="+Integer.parseInt(rs.getString(1))+" AND tareas.id_cuidado = cuidado.id AND tareas.id_animal = animales.id AND tareas.finalicazo=0";
            Statement stmt2 = (Statement) bd.createStatement();
            ResultSet rs2=stmt2.executeQuery(consulta);
            
             DefaultTableModel model = (DefaultTableModel)tabla.getModel();

            while(rs2.next()){
                Object [] row ={rs2.getString(3),rs2.getString(4),rs2.getString(5),rs2.getString(6),rs2.getString(7)}; // Rellenar la fila con los datos correspondientes
                model.addRow(row); // Añadir la fila a la tabla
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(InterHeroes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraSuperior = new javax.swing.JPanel();
        cerrar = new javax.swing.JLabel();
        cerrar1 = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();
        cargar = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        panelInformacio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        nombreAnimal = new javax.swing.JLabel();
        nombreCuidado = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        descripcionAnimal = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        finFecha = new javax.swing.JLabel();
        termiando = new javax.swing.JCheckBox();
        fondoImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraSuperior.setBackground(new java.awt.Color(240, 255, 255));
        barraSuperior.setOpaque(false);
        barraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraSuperiorMouseDragged(evt);
            }
        });
        barraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraSuperiorMousePressed(evt);
            }
        });

        cerrar.setBackground(new java.awt.Color(0, 0, 0));
        cerrar.setFont(new java.awt.Font("SPACE EXPLORER", 1, 36)); // NOI18N
        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setText("X");
        cerrar.setToolTipText("");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });

        cerrar1.setBackground(new java.awt.Color(0, 0, 0));
        cerrar1.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        cerrar1.setText("Cerrar sesion");
        cerrar1.setToolTipText("");
        cerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 333, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addGroup(barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cerrar)
                    .addComponent(cerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 710, 40));

        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cargar.setText("Cargar Tareas");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        fondo.add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        fondo.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N

        panelTabla.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Inicio", "Final", "Cuidado", "Animal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        panelInformacio.setBackground(new java.awt.Color(255, 255, 255));
        panelInformacio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SPACE EXPLORER", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Detalles de la tarea");
        panelInformacio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 650, -1));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/animales/dragones/Tianlong.jpg"))); // NOI18N
        panelInformacio.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        nombreAnimal.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        nombreAnimal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelInformacio.add(nombreAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 30));

        nombreCuidado.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        nombreCuidado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelInformacio.add(nombreCuidado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 230, 30));

        descripcionAnimal.setEditable(false);
        descripcionAnimal.setColumns(15);
        descripcionAnimal.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        descripcionAnimal.setRows(5);
        descripcionAnimal.setFocusable(false);
        jScrollPane4.setViewportView(descripcionAnimal);

        panelInformacio.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 195, 260, 130));

        jLabel2.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jLabel2.setText("Fecha final ");
        panelInformacio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        finFecha.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        panelInformacio.add(finFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 220, 30));

        termiando.setText("Terminado");
        panelInformacio.add(termiando, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 265, 100, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelInformacio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 47, Short.MAX_VALUE)
                    .addComponent(panelInformacio, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 670, 390));

        fondoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondozoobdClientes.jpg"))); // NOI18N
        fondo.add(fondoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 520));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void barraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMouseDragged
        // TODO add your handling code here:
        this.setLocation(evt.getXOnScreen()-mouseX, evt.getYOnScreen()-mouseY);
    }//GEN-LAST:event_barraSuperiorMouseDragged

    private void barraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_barraSuperiorMousePressed

    private void cerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionMouseClicked
        this.setVisible(false);
        Login.InterLogin seleccion = new Login.InterLogin();
        seleccion.setVisible(true);
    }//GEN-LAST:event_cerrarSesionMouseClicked

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
       this.cargarTareas();
       this.cargar.setVisible(false);
    }//GEN-LAST:event_cargarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        pos = -5;
        DefaultTableModel model = (DefaultTableModel)tabla.getModel();
        pos = tabla.getSelectedRow();
        this.panelTabla.setVisible(false);

        this.panelInformacio.setVisible(true);
        this.atras.setVisible(true);
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/animales/dragones/" + model.getValueAt(pos, 4)+".jpg")));
        nombreAnimal.setText(model.getValueAt(pos, 4).toString());
        try {
            String consulta = "SELECT animales.nombre, cuidado.nombre, cuidado.descripcion, tareas.fecha_realizacion, tareas.finalicazo FROM animales, cuidado, tareas where tareas.id="+model.getValueAt(pos, 0)+" AND cuidado.id = tareas.id_cuidado AND animales.id = tareas.id_animal";
            //System.out.println(consulta);
            Statement stmt = (Statement) bd.createStatement();
            ResultSet rs=stmt.executeQuery(consulta);
            rs.next();
            
            descripcionAnimal.setText(rs.getString(3));
            nombreCuidado.setText(rs.getString(2));
            finFecha.setText(rs.getString(4));
            if (Integer.parseInt(rs.getString(5)) == 0){
                termiando.setSelected(false); 
            }else{
                termiando.setSelected(true); 
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(InterHeroes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tablaMouseClicked

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        DefaultTableModel model = (DefaultTableModel)tabla.getModel();
        this.panelInformacio.setVisible(false);
        this.atras.setVisible(false);
        
        if (termiando.isSelected()){
            try {
                String consulta = "UPDATE `tareas` SET `finalicazo` = 1 WHERE tareas.id ="+model.getValueAt(pos, 0);
                Statement stmt = (Statement) bd.createStatement();
                stmt.execute(consulta);
                this.cargar.setVisible(false);

            } catch (SQLException ex) {
                Logger.getLogger(InterHeroes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
             System.out.println("num filas " + model.getRowCount());
             int aux = model.getRowCount();
             
             for (int i = 0; i < aux; i++) {
                 model.removeRow(0);
                }
        this.cargarTareas();

        this.panelTabla.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(InterHeroes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterHeroes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterHeroes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterHeroes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InterHeroes interfaz = new InterHeroes();
                interfaz.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JButton cargar;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel cerrar1;
    private javax.swing.JTextArea descripcionAnimal;
    private javax.swing.JLabel finFecha;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel fondoImagen;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel nombreAnimal;
    private javax.swing.JLabel nombreCuidado;
    private javax.swing.JPanel panelInformacio;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JPanel panelTabla1;
    private javax.swing.JPanel panelTabla2;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla1;
    private javax.swing.JTable tabla2;
    private javax.swing.JCheckBox termiando;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
