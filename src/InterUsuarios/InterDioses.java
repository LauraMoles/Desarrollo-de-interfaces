/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterUsuarios;

import Herramientas.ConfBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author laura Martínez Moles
 */
public class InterDioses extends javax.swing.JFrame {

    ConfBD conexion = new ConfBD ("localhost","3306","zoo","root","");
    Connection bd = conexion.makeConnect();
    /**
     * Creates new form InterCuidadores
     */
    private int mouseX,mouseY;
    private String nombreDios;
    public InterDioses() {
        initComponents();
        titulo.setText("Dios: "+nombreDios);
        volver.setVisible(false);
        crearUser.setVisible(false);
        crearCuidados.setVisible(false);
        crearAnimales.setVisible(false);
        crearTareas.setVisible(false);
        crearEspecialidad.setVisible(false);
        editarAnimales.setVisible(false);
        editarCuidado.setVisible(false);
        editarEspecialidades.setVisible(false);
        editarTareas.setVisible(false);
        editarUsuarios.setVisible(false);
        editarDioses.setVisible(false);
        editarHeroes.setVisible(false);
         
        
    }
    public InterDioses(String name) {
        
            this.nombreDios = name;
            String consulta;
            Statement stmt;
            ResultSet rs;
            DefaultTableModel model;
            
            
            initComponents();
            titulo.setText("Dios: "+nombreDios);
            
            //Ocultar interfaces secundarias
            volver.setVisible(false);
            crearUser.setVisible(false);
            crearCuidados.setVisible(false);
            crearAnimales.setVisible(false);
            crearTareas.setVisible(false);
            crearEspecialidad.setVisible(false);
            editarAnimales.setVisible(false);
            editarCuidado.setVisible(false);
            editarEspecialidades.setVisible(false);
            editarTareas.setVisible(false);
            editarUsuarios.setVisible(false);
            editarDioses.setVisible(false);
            editarHeroes.setVisible(false);
            
            
            //rellenar los JCombo box
            
        try {
            consulta = "SELECT * FROM cuidado";
            stmt = (Statement) bd.createStatement();
            rs=stmt.executeQuery(consulta);
            
            while(rs.next()){
                cuidadoTareas.addItem(rs.getNString(2));
            }
            
            consulta = "SELECT * FROM animales";
            stmt = (Statement) bd.createStatement();
            rs=stmt.executeQuery(consulta);
            
            while(rs.next()){
                AnimalTareas.addItem(rs.getNString(2));
            }
            
            consulta = "SELECT usuarios.nombre, usuarios.apellido FROM usuarios, heroes WHERE usuarios.id=heroes.id";
            stmt = (Statement) bd.createStatement();
            rs=stmt.executeQuery(consulta);
            
            while(rs.next()){
                heroeTareas.addItem(rs.getString(1) + " " + rs.getNString(2));
                heroeEspecialidad.addItem(rs.getString(1) + " " + rs.getNString(2));
            }
            
            
            
            
            //tablaAnimales
             consulta = "SELECT * FROM animales";
             stmt = (Statement) bd.createStatement();
             rs=stmt.executeQuery(consulta);
            
             model = (DefaultTableModel)tablaAnimales.getModel();

            while(rs.next()){
                Object [] row ={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)}; // Rellenar la fila con los datos correspondientes
                model.addRow(row); // Añadir la fila a la tabla
            }
            
            //tablaCuidados
             consulta = "SELECT * FROM especialidades";
             stmt = (Statement) bd.createStatement();
             rs=stmt.executeQuery(consulta);
            
             model = (DefaultTableModel)tablaCuidados.getModel();

            while(rs.next()){
                Object [] row ={rs.getString(1),rs.getString(2)}; // Rellenar la fila con los datos correspondientes
                model.addRow(row); // Añadir la fila a la tabla
            }
            
            //tablaEspecialidades
            consulta = "SELECT especialidades.id, especialidades.nombre, usuarios.nombre FROM especialidades, heroes, usuarios where especialidades.id_heroe= heroes.id and usuarios.id = heroes.id";
            stmt = (Statement) bd.createStatement();
            rs=stmt.executeQuery(consulta);
            
            model = (DefaultTableModel)tablaEspecialidades.getModel();

            while(rs.next()){
                Object [] row ={rs.getString(1),rs.getString(2),rs.getString(3)}; // Rellenar la fila con los datos correspondientes
                model.addRow(row); // Añadir la fila a la tabla
            }

        } catch (SQLException ex) {
            Logger.getLogger(InterDioses.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraSuperior = new javax.swing.JPanel();
        cerrar = new javax.swing.JLabel();
        cerrar1 = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        botones = new javax.swing.JPanel();
        agregar = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        agregarUsers = new javax.swing.JButton();
        editar = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        cambiarPass = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        editarCuidado = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCuidados = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        tituloCrearUser9 = new javax.swing.JLabel();
        insertNombreAnimal3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        tituloCrearUser10 = new javax.swing.JLabel();
        editNombreCuidado = new javax.swing.JTextField();
        tituloCrearUser12 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        editCuidadoDescripcion = new javax.swing.JTextArea();
        editarEspecialidades = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaEspecialidades = new javax.swing.JTable();
        jButton21 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        tituloCrearUser11 = new javax.swing.JLabel();
        insertNombreAnimal4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        tituloCrearUser13 = new javax.swing.JLabel();
        editNombreEspecialidades = new javax.swing.JTextField();
        tituloCrearUser14 = new javax.swing.JLabel();
        editHeroeEspecialidades = new javax.swing.JComboBox<>();
        tituloCrearUser15 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        editDescripcionEspecialidades = new javax.swing.JTextArea();
        editarTareas = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaTareas = new javax.swing.JTable();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        tituloCrearUser16 = new javax.swing.JLabel();
        insertNombreAnimal5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        tituloCrearUser17 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        tituloCrearUser18 = new javax.swing.JLabel();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        tituloCrearUser19 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        tituloCrearUser20 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        tituloCrearUser21 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton28 = new javax.swing.JButton();
        tituloCrearUser22 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        editarUsuarios = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        tituloCrearUser23 = new javax.swing.JLabel();
        insertNombreAnimal6 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        tituloCrearUser24 = new javax.swing.JLabel();
        editNombreUsuario = new javax.swing.JTextField();
        tituloCrearUser25 = new javax.swing.JLabel();
        editapellidosUsuario = new javax.swing.JTextField();
        tituloCrearUser26 = new javax.swing.JLabel();
        editnombreNick = new javax.swing.JTextField();
        tituloCrearUser27 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton31 = new javax.swing.JButton();
        editarHeroes = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablaHeroes = new javax.swing.JTable();
        jButton35 = new javax.swing.JButton();
        tituloCrearUser33 = new javax.swing.JLabel();
        insertNombreAnimal8 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        tituloCrearUser34 = new javax.swing.JLabel();
        tituloCrearUser35 = new javax.swing.JLabel();
        editPassActualDioses1 = new javax.swing.JTextField();
        tituloCrearUser36 = new javax.swing.JLabel();
        editPassNuevaDioses1 = new javax.swing.JTextField();
        tituloCrearUser37 = new javax.swing.JLabel();
        quitarPrivilegiosDioses1 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        editarDioses = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaDioses = new javax.swing.JTable();
        jButton32 = new javax.swing.JButton();
        tituloCrearUser28 = new javax.swing.JLabel();
        insertNombreAnimal7 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        tituloCrearUser29 = new javax.swing.JLabel();
        tituloCrearUser32 = new javax.swing.JLabel();
        editPassActualDioses = new javax.swing.JTextField();
        tituloCrearUser30 = new javax.swing.JLabel();
        editPassNuevaDioses = new javax.swing.JTextField();
        tituloCrearUser31 = new javax.swing.JLabel();
        quitarPrivilegiosDioses = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        editarAnimales = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAnimales = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tituloCrearUser6 = new javax.swing.JLabel();
        insertNombreAnimal2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        tituloCrearUser5 = new javax.swing.JLabel();
        editNombreAnimal = new javax.swing.JTextField();
        tituloCrearUser7 = new javax.swing.JLabel();
        editrazaAnimales = new javax.swing.JTextField();
        tituloCrearUser8 = new javax.swing.JLabel();
        editProcedenciaAnimales = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        crearCuidados = new javax.swing.JPanel();
        tituloCrearUser2 = new javax.swing.JLabel();
        datosUser2 = new javax.swing.JPanel();
        nombre2 = new javax.swing.JLabel();
        insertNombreAnimal1 = new javax.swing.JTextField();
        apellidos2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcionCuidado = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        crearAnimales = new javax.swing.JPanel();
        tituloCrearUser1 = new javax.swing.JLabel();
        datosUser1 = new javax.swing.JPanel();
        nombre1 = new javax.swing.JLabel();
        insertNombreAnimal = new javax.swing.JTextField();
        apellidos1 = new javax.swing.JLabel();
        razaAnimal = new javax.swing.JTextField();
        telefono1 = new javax.swing.JLabel();
        procedenciaAnimal = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        crearEspecialidad = new javax.swing.JPanel();
        tituloCrearUser3 = new javax.swing.JLabel();
        datosUser3 = new javax.swing.JPanel();
        nombre3 = new javax.swing.JLabel();
        insertNombreEspecialidad = new javax.swing.JTextField();
        apellidos3 = new javax.swing.JLabel();
        heroeEspecialidad = new javax.swing.JComboBox<>();
        telefono2 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        descripcionEspecialidad = new javax.swing.JTextArea();
        crearTareas = new javax.swing.JPanel();
        tituloCrearUser4 = new javax.swing.JLabel();
        datosUser4 = new javax.swing.JPanel();
        nombre4 = new javax.swing.JLabel();
        fechaInicioTareas = new org.jdesktop.swingx.JXDatePicker();
        apellidos4 = new javax.swing.JLabel();
        fechaFinalTareas = new org.jdesktop.swingx.JXDatePicker();
        telefono3 = new javax.swing.JLabel();
        cuidadoTareas = new javax.swing.JComboBox<>();
        nikname2 = new javax.swing.JLabel();
        AnimalTareas = new javax.swing.JComboBox<>();
        nikname3 = new javax.swing.JLabel();
        heroeTareas = new javax.swing.JComboBox<>();
        jButton13 = new javax.swing.JButton();
        crearUser = new javax.swing.JPanel();
        tituloCrearUser = new javax.swing.JLabel();
        datosUser = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        insertNombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JLabel();
        insertApellidos = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        numTel = new javax.swing.JTextField();
        nikname = new javax.swing.JLabel();
        insertnik = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        dios = new javax.swing.JCheckBox();
        heroe = new javax.swing.JCheckBox();
        visitante = new javax.swing.JCheckBox();
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

        titulo.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 660, 40));

        volver.setBackground(new java.awt.Color(91, 65, 43));
        volver.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        volver.setForeground(new java.awt.Color(255, 255, 255));
        volver.setText("Volver");
        volver.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        volver.setBorderPainted(false);
        volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volver.setFocusPainted(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        fondo.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 620, 21));

        botones.setOpaque(false);
        botones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregar.setBackground(new java.awt.Color(255, 255, 255));
        agregar.setLayout(new java.awt.GridLayout(0, 1, 0, 3));

        jButton2.setBackground(new java.awt.Color(216, 178, 142));
        jButton2.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton2.setText("agregar Animales");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        agregar.add(jButton2);

        jButton14.setBackground(new java.awt.Color(216, 178, 142));
        jButton14.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton14.setText("agregar cuidados");
        jButton14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton14.setBorderPainted(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setFocusPainted(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        agregar.add(jButton14);

        jButton15.setBackground(new java.awt.Color(216, 178, 142));
        jButton15.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton15.setText("agregar especialidades");
        jButton15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton15.setBorderPainted(false);
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.setFocusPainted(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        agregar.add(jButton15);

        jButton16.setBackground(new java.awt.Color(216, 178, 142));
        jButton16.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton16.setText("agregar tAREAS");
        jButton16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton16.setBorderPainted(false);
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton16.setFocusPainted(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        agregar.add(jButton16);

        agregarUsers.setBackground(new java.awt.Color(216, 178, 142));
        agregarUsers.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        agregarUsers.setText("agregar USUARIOS");
        agregarUsers.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        agregarUsers.setBorderPainted(false);
        agregarUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarUsers.setFocusPainted(false);
        agregarUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarUsersActionPerformed(evt);
            }
        });
        agregar.add(agregarUsers);

        botones.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 290, 230));

        editar.setBackground(new java.awt.Color(255, 255, 255));
        editar.setLayout(new java.awt.GridLayout(0, 1, 0, 3));

        jButton1.setBackground(new java.awt.Color(216, 178, 142));
        jButton1.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton1.setText("Editar Animales");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        editar.add(jButton1);

        jButton8.setBackground(new java.awt.Color(216, 178, 142));
        jButton8.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton8.setText("Editar cuidados");
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton8.setBorderPainted(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setFocusPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        editar.add(jButton8);

        jButton9.setBackground(new java.awt.Color(216, 178, 142));
        jButton9.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton9.setText("Editar especialidades");
        jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton9.setBorderPainted(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setFocusPainted(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        editar.add(jButton9);

        jButton10.setBackground(new java.awt.Color(216, 178, 142));
        jButton10.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton10.setText("editar tAREAS");
        jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton10.setBorderPainted(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setFocusPainted(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        editar.add(jButton10);

        jButton11.setBackground(new java.awt.Color(216, 178, 142));
        jButton11.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton11.setText("Editar USUARIOS");
        jButton11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton11.setBorderPainted(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setFocusPainted(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        editar.add(jButton11);

        botones.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 300, 230));

        cambiarPass.setBackground(new java.awt.Color(255, 255, 255));
        cambiarPass.setLayout(new java.awt.GridLayout(0, 1, 0, 3));

        jButton22.setBackground(new java.awt.Color(216, 178, 142));
        jButton22.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton22.setText("Editar dioses");
        jButton22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton22.setBorderPainted(false);
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton22.setFocusPainted(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        cambiarPass.add(jButton22);

        jButton24.setBackground(new java.awt.Color(216, 178, 142));
        jButton24.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton24.setText("editar heroes");
        jButton24.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jButton24.setBorderPainted(false);
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton24.setFocusPainted(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        cambiarPass.add(jButton24);

        botones.add(cambiarPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 610, 60));

        fondo.add(botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 660, 350));

        editarCuidado.setOpaque(false);
        editarCuidado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCuidados.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        tablaCuidados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCuidados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCuidadosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablaCuidados);

        editarCuidado.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 300, 281));

        jButton18.setBackground(new java.awt.Color(219, 197, 170));
        jButton18.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton18.setText("editar");
        jButton18.setBorderPainted(false);
        editarCuidado.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        jButton19.setBackground(new java.awt.Color(219, 197, 170));
        jButton19.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton19.setText("borrar");
        jButton19.setBorderPainted(false);
        editarCuidado.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        tituloCrearUser9.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        tituloCrearUser9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser9.setText("Editar cuidados");
        editarCuidado.add(tituloCrearUser9, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 640, -1));

        insertNombreAnimal3.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        insertNombreAnimal3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        insertNombreAnimal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNombreAnimal3ActionPerformed(evt);
            }
        });
        editarCuidado.add(insertNombreAnimal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        tituloCrearUser10.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser10.setText("nombre");
        jPanel2.add(tituloCrearUser10);

        editNombreCuidado.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        editNombreCuidado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        editNombreCuidado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNombreCuidadoActionPerformed(evt);
            }
        });
        jPanel2.add(editNombreCuidado);

        tituloCrearUser12.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser12.setText("Descripcion");
        jPanel2.add(tituloCrearUser12);

        editarCuidado.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 270, 110));

        jButton20.setBackground(new java.awt.Color(148, 107, 58));
        jButton20.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Cancelar");
        jButton20.setBorderPainted(false);
        editarCuidado.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 300, 110, -1));

        editCuidadoDescripcion.setColumns(16);
        editCuidadoDescripcion.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        editCuidadoDescripcion.setRows(5);
        editCuidadoDescripcion.setWrapStyleWord(true);
        jScrollPane5.setViewportView(editCuidadoDescripcion);

        editarCuidado.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 270, -1));

        fondo.add(editarCuidado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 660, 390));

        editarEspecialidades.setOpaque(false);
        editarEspecialidades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaEspecialidades.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        tablaEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Heroe asignado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEspecialidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEspecialidadesMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tablaEspecialidades);

        editarEspecialidades.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 300, 281));

        jButton21.setBackground(new java.awt.Color(219, 197, 170));
        jButton21.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton21.setText("editar");
        jButton21.setBorderPainted(false);
        editarEspecialidades.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        jButton23.setBackground(new java.awt.Color(219, 197, 170));
        jButton23.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton23.setText("borrar");
        jButton23.setBorderPainted(false);
        editarEspecialidades.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        tituloCrearUser11.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        tituloCrearUser11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser11.setText("Editar especialidades");
        editarEspecialidades.add(tituloCrearUser11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 640, -1));

        insertNombreAnimal4.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        insertNombreAnimal4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        insertNombreAnimal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNombreAnimal4ActionPerformed(evt);
            }
        });
        editarEspecialidades.add(insertNombreAnimal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        tituloCrearUser13.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser13.setText("nombre");
        jPanel3.add(tituloCrearUser13);

        editNombreEspecialidades.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        editNombreEspecialidades.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        editNombreEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNombreEspecialidadesActionPerformed(evt);
            }
        });
        jPanel3.add(editNombreEspecialidades);

        tituloCrearUser14.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser14.setText("heroe");
        jPanel3.add(tituloCrearUser14);

        editHeroeEspecialidades.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        jPanel3.add(editHeroeEspecialidades);

        tituloCrearUser15.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser15.setText("descrpcion");
        jPanel3.add(tituloCrearUser15);

        editarEspecialidades.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 270, 150));

        jButton25.setBackground(new java.awt.Color(148, 107, 58));
        jButton25.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Cancelar");
        jButton25.setBorderPainted(false);
        editarEspecialidades.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 300, 110, -1));

        editDescripcionEspecialidades.setColumns(16);
        editDescripcionEspecialidades.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        editDescripcionEspecialidades.setRows(5);
        editDescripcionEspecialidades.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jScrollPane7.setViewportView(editDescripcionEspecialidades);

        editarEspecialidades.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 270, 60));

        fondo.add(editarEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 660, 390));

        editarTareas.setOpaque(false);
        editarTareas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaTareas.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        tablaTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Inicio", "Finalizacion", "Cuidado", "Animal", "Heroe", "Finalizacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tablaTareas);

        editarTareas.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 630, 90));

        jButton26.setBackground(new java.awt.Color(219, 197, 170));
        jButton26.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton26.setText("editar");
        jButton26.setBorderPainted(false);
        editarTareas.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        jButton27.setBackground(new java.awt.Color(219, 197, 170));
        jButton27.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton27.setText("borrar");
        jButton27.setBorderPainted(false);
        editarTareas.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        tituloCrearUser16.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        tituloCrearUser16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser16.setText("Editar tareas");
        editarTareas.add(tituloCrearUser16, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 640, -1));

        insertNombreAnimal5.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        insertNombreAnimal5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        insertNombreAnimal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNombreAnimal5ActionPerformed(evt);
            }
        });
        editarTareas.add(insertNombreAnimal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(0, 4, 10, 5));

        tituloCrearUser17.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser17.setText("fecha Inicio");
        jPanel4.add(tituloCrearUser17);
        jPanel4.add(jXDatePicker1);

        tituloCrearUser18.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser18.setText("fecha finalizacion");
        jPanel4.add(tituloCrearUser18);
        jPanel4.add(jXDatePicker2);

        tituloCrearUser19.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser19.setText("cuidado");
        jPanel4.add(tituloCrearUser19);

        jComboBox1.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox1);

        tituloCrearUser20.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser20.setText("animal");
        jPanel4.add(tituloCrearUser20);

        jComboBox3.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox3);

        tituloCrearUser21.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser21.setText("heroe");
        jPanel4.add(tituloCrearUser21);

        jComboBox4.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox4);

        editarTareas.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 630, 120));

        jButton28.setBackground(new java.awt.Color(148, 107, 58));
        jButton28.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Cancelar");
        jButton28.setBorderPainted(false);
        editarTareas.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 300, 110, -1));

        tituloCrearUser22.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser22.setText("finalizado");
        editarTareas.add(tituloCrearUser22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 157, 30));

        jCheckBox1.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        jCheckBox1.setText("Si");
        editarTareas.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 50, 40));

        jCheckBox2.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        jCheckBox2.setText("No");
        editarTareas.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 60, 40));

        fondo.add(editarTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 660, 390));

        editarUsuarios.setOpaque(false);
        editarUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaUsuarios.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellidos", "Telefono", "Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tablaUsuarios);

        editarUsuarios.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 300, 281));

        jButton29.setBackground(new java.awt.Color(219, 197, 170));
        jButton29.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton29.setText("editar");
        jButton29.setBorderPainted(false);
        editarUsuarios.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        jButton30.setBackground(new java.awt.Color(219, 197, 170));
        jButton30.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton30.setText("borrar");
        jButton30.setBorderPainted(false);
        editarUsuarios.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        tituloCrearUser23.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        tituloCrearUser23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser23.setText("Editar usuarios");
        editarUsuarios.add(tituloCrearUser23, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 640, -1));

        insertNombreAnimal6.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        insertNombreAnimal6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        insertNombreAnimal6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNombreAnimal6ActionPerformed(evt);
            }
        });
        editarUsuarios.add(insertNombreAnimal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(0, 1));

        tituloCrearUser24.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser24.setText("nombre");
        jPanel5.add(tituloCrearUser24);

        editNombreUsuario.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        editNombreUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        editNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNombreUsuarioActionPerformed(evt);
            }
        });
        jPanel5.add(editNombreUsuario);

        tituloCrearUser25.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser25.setText("apellidos");
        jPanel5.add(tituloCrearUser25);

        editapellidosUsuario.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        editapellidosUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        editapellidosUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editapellidosUsuarioActionPerformed(evt);
            }
        });
        jPanel5.add(editapellidosUsuario);

        tituloCrearUser26.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser26.setText("nombre usuario");
        jPanel5.add(tituloCrearUser26);

        editnombreNick.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        editnombreNick.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        editnombreNick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editnombreNickActionPerformed(evt);
            }
        });
        jPanel5.add(editnombreNick);

        tituloCrearUser27.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser27.setText("numero de telefono");
        jPanel5.add(tituloCrearUser27);

        jSpinner1.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 999999999, 1));
        jSpinner1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(jSpinner1);

        editarUsuarios.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 270, 220));

        jButton31.setBackground(new java.awt.Color(148, 107, 58));
        jButton31.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("Cancelar");
        jButton31.setBorderPainted(false);
        editarUsuarios.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 300, 110, -1));

        fondo.add(editarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 660, 390));

        editarHeroes.setOpaque(false);
        editarHeroes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaHeroes.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        tablaHeroes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(tablaHeroes);

        editarHeroes.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 300, 281));

        jButton35.setBackground(new java.awt.Color(219, 197, 170));
        jButton35.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton35.setText("Actializar password");
        jButton35.setBorderPainted(false);
        editarHeroes.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        tituloCrearUser33.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        tituloCrearUser33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser33.setText("Editar heroes");
        editarHeroes.add(tituloCrearUser33, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 640, -1));

        insertNombreAnimal8.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        insertNombreAnimal8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        insertNombreAnimal8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNombreAnimal8ActionPerformed(evt);
            }
        });
        editarHeroes.add(insertNombreAnimal8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridLayout(0, 1));

        tituloCrearUser34.setFont(new java.awt.Font("SPACE EXPLORER", 1, 12)); // NOI18N
        tituloCrearUser34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser34.setText("Cambiar password");
        jPanel7.add(tituloCrearUser34);

        tituloCrearUser35.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        tituloCrearUser35.setText("pass actual");
        jPanel7.add(tituloCrearUser35);

        editPassActualDioses1.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        editPassActualDioses1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        editPassActualDioses1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPassActualDioses1ActionPerformed(evt);
            }
        });
        jPanel7.add(editPassActualDioses1);

        tituloCrearUser36.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        tituloCrearUser36.setText("pass nueva");
        jPanel7.add(tituloCrearUser36);

        editPassNuevaDioses1.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        editPassNuevaDioses1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        editPassNuevaDioses1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPassNuevaDioses1ActionPerformed(evt);
            }
        });
        jPanel7.add(editPassNuevaDioses1);

        tituloCrearUser37.setFont(new java.awt.Font("SPACE EXPLORER", 1, 12)); // NOI18N
        tituloCrearUser37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser37.setText("Quitar privilegios");
        jPanel7.add(tituloCrearUser37);

        quitarPrivilegiosDioses1.setBackground(new java.awt.Color(186, 101, 86));
        quitarPrivilegiosDioses1.setFont(new java.awt.Font("SPACE EXPLORER", 1, 11)); // NOI18N
        quitarPrivilegiosDioses1.setForeground(new java.awt.Color(255, 255, 255));
        quitarPrivilegiosDioses1.setText("quitar");
        quitarPrivilegiosDioses1.setBorderPainted(false);
        jPanel7.add(quitarPrivilegiosDioses1);

        editarHeroes.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 270, 220));

        jButton36.setBackground(new java.awt.Color(148, 107, 58));
        jButton36.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton36.setForeground(new java.awt.Color(255, 255, 255));
        jButton36.setText("Cancelar");
        jButton36.setBorderPainted(false);
        editarHeroes.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 300, 110, -1));

        fondo.add(editarHeroes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 660, 390));

        editarDioses.setOpaque(false);
        editarDioses.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDioses.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        tablaDioses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Usuario"
            }
        ));
        jScrollPane10.setViewportView(tablaDioses);

        editarDioses.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 300, 281));

        jButton32.setBackground(new java.awt.Color(219, 197, 170));
        jButton32.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton32.setText("Actializar password");
        jButton32.setBorderPainted(false);
        editarDioses.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        tituloCrearUser28.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        tituloCrearUser28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser28.setText("Editar Dioses");
        editarDioses.add(tituloCrearUser28, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 640, -1));

        insertNombreAnimal7.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        insertNombreAnimal7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        insertNombreAnimal7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNombreAnimal7ActionPerformed(evt);
            }
        });
        editarDioses.add(insertNombreAnimal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(0, 1));

        tituloCrearUser29.setFont(new java.awt.Font("SPACE EXPLORER", 1, 12)); // NOI18N
        tituloCrearUser29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser29.setText("Cambiar password");
        jPanel6.add(tituloCrearUser29);

        tituloCrearUser32.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        tituloCrearUser32.setText("pass actual");
        jPanel6.add(tituloCrearUser32);

        editPassActualDioses.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        editPassActualDioses.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        editPassActualDioses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPassActualDiosesActionPerformed(evt);
            }
        });
        jPanel6.add(editPassActualDioses);

        tituloCrearUser30.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        tituloCrearUser30.setText("pass nueva");
        jPanel6.add(tituloCrearUser30);

        editPassNuevaDioses.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        editPassNuevaDioses.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        editPassNuevaDioses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPassNuevaDiosesActionPerformed(evt);
            }
        });
        jPanel6.add(editPassNuevaDioses);

        tituloCrearUser31.setFont(new java.awt.Font("SPACE EXPLORER", 1, 12)); // NOI18N
        tituloCrearUser31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser31.setText("Quitar privilegios");
        jPanel6.add(tituloCrearUser31);

        quitarPrivilegiosDioses.setBackground(new java.awt.Color(186, 101, 86));
        quitarPrivilegiosDioses.setFont(new java.awt.Font("SPACE EXPLORER", 1, 11)); // NOI18N
        quitarPrivilegiosDioses.setForeground(new java.awt.Color(255, 255, 255));
        quitarPrivilegiosDioses.setText("quitar");
        quitarPrivilegiosDioses.setBorderPainted(false);
        jPanel6.add(quitarPrivilegiosDioses);

        editarDioses.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 270, 220));

        jButton34.setBackground(new java.awt.Color(148, 107, 58));
        jButton34.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("Cancelar");
        jButton34.setBorderPainted(false);
        editarDioses.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 300, 110, -1));

        fondo.add(editarDioses, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 660, 390));

        editarAnimales.setOpaque(false);
        editarAnimales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaAnimales.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        tablaAnimales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Raza", "Procedencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAnimales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAnimalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAnimales);

        editarAnimales.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 300, 281));

        jButton3.setBackground(new java.awt.Color(219, 197, 170));
        jButton3.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton3.setText("editar");
        jButton3.setBorderPainted(false);
        editarAnimales.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, -1, -1));

        jButton4.setBackground(new java.awt.Color(219, 197, 170));
        jButton4.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton4.setText("borrar");
        jButton4.setBorderPainted(false);
        editarAnimales.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        tituloCrearUser6.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        tituloCrearUser6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser6.setText("Editar animales");
        editarAnimales.add(tituloCrearUser6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 640, -1));

        insertNombreAnimal2.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        insertNombreAnimal2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        insertNombreAnimal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNombreAnimal2ActionPerformed(evt);
            }
        });
        editarAnimales.add(insertNombreAnimal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        tituloCrearUser5.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser5.setText("nombre");
        jPanel1.add(tituloCrearUser5);

        editNombreAnimal.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        editNombreAnimal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        editNombreAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNombreAnimalActionPerformed(evt);
            }
        });
        jPanel1.add(editNombreAnimal);

        tituloCrearUser7.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser7.setText("raza");
        jPanel1.add(tituloCrearUser7);

        editrazaAnimales.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        editrazaAnimales.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        editrazaAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editrazaAnimalesActionPerformed(evt);
            }
        });
        jPanel1.add(editrazaAnimales);

        tituloCrearUser8.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        tituloCrearUser8.setText("procedencia");
        jPanel1.add(tituloCrearUser8);

        editProcedenciaAnimales.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        editProcedenciaAnimales.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        editProcedenciaAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProcedenciaAnimalesActionPerformed(evt);
            }
        });
        jPanel1.add(editProcedenciaAnimales);

        editarAnimales.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 270, 220));

        jButton17.setBackground(new java.awt.Color(148, 107, 58));
        jButton17.setFont(new java.awt.Font("SPACE EXPLORER", 0, 10)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Cancelar");
        jButton17.setBorderPainted(false);
        editarAnimales.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 300, 110, -1));

        fondo.add(editarAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 660, 390));

        crearCuidados.setOpaque(false);
        crearCuidados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCrearUser2.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        tituloCrearUser2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser2.setText("agregar cuidado");
        crearCuidados.add(tituloCrearUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 640, -1));

        datosUser2.setOpaque(false);

        nombre2.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        nombre2.setText("Nombre");

        insertNombreAnimal1.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        insertNombreAnimal1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        insertNombreAnimal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNombreAnimal1ActionPerformed(evt);
            }
        });

        apellidos2.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        apellidos2.setText("Descripcion");

        descripcionCuidado.setColumns(20);
        descripcionCuidado.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        descripcionCuidado.setRows(5);
        descripcionCuidado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        descripcionCuidado.setMinimumSize(new java.awt.Dimension(10, 22));
        jScrollPane2.setViewportView(descripcionCuidado);

        javax.swing.GroupLayout datosUser2Layout = new javax.swing.GroupLayout(datosUser2);
        datosUser2.setLayout(datosUser2Layout);
        datosUser2Layout.setHorizontalGroup(
            datosUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(insertNombreAnimal1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(apellidos2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        datosUser2Layout.setVerticalGroup(
            datosUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosUser2Layout.createSequentialGroup()
                .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(insertNombreAnimal1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(apellidos2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        crearCuidados.add(datosUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 590, 230));

        jButton7.setBackground(new java.awt.Color(223, 208, 181));
        jButton7.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton7.setText("Crear");
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);
        crearCuidados.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 260, -1));

        fondo.add(crearCuidados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 660, 390));

        crearAnimales.setOpaque(false);
        crearAnimales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCrearUser1.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        tituloCrearUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser1.setText("Agregar animal");
        crearAnimales.add(tituloCrearUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 640, -1));

        datosUser1.setOpaque(false);
        datosUser1.setLayout(new java.awt.GridLayout(0, 1));

        nombre1.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        nombre1.setText("Nombre");
        datosUser1.add(nombre1);

        insertNombreAnimal.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        insertNombreAnimal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        datosUser1.add(insertNombreAnimal);

        apellidos1.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        apellidos1.setText("Raza");
        datosUser1.add(apellidos1);

        razaAnimal.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        razaAnimal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        datosUser1.add(razaAnimal);

        telefono1.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        telefono1.setText("Procedencia");
        datosUser1.add(telefono1);

        procedenciaAnimal.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        procedenciaAnimal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        datosUser1.add(procedenciaAnimal);

        crearAnimales.add(datosUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 590, 230));

        jButton6.setBackground(new java.awt.Color(223, 208, 181));
        jButton6.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton6.setText("Crear");
        jButton6.setBorderPainted(false);
        jButton6.setFocusPainted(false);
        crearAnimales.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 260, -1));

        fondo.add(crearAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 660, 390));

        crearEspecialidad.setOpaque(false);
        crearEspecialidad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCrearUser3.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        tituloCrearUser3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser3.setText("Agregar especialidad");
        crearEspecialidad.add(tituloCrearUser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 640, -1));

        datosUser3.setOpaque(false);
        datosUser3.setLayout(new java.awt.GridLayout(0, 1));

        nombre3.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        nombre3.setText("Nombre especialidad");
        datosUser3.add(nombre3);

        insertNombreEspecialidad.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        insertNombreEspecialidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        datosUser3.add(insertNombreEspecialidad);

        apellidos3.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        apellidos3.setText("Heroe");
        datosUser3.add(apellidos3);

        heroeEspecialidad.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        datosUser3.add(heroeEspecialidad);

        telefono2.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        telefono2.setText("descripcion");
        datosUser3.add(telefono2);

        crearEspecialidad.add(datosUser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 590, 130));

        jButton12.setBackground(new java.awt.Color(223, 208, 181));
        jButton12.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton12.setText("Crear");
        jButton12.setBorderPainted(false);
        jButton12.setFocusPainted(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        crearEspecialidad.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 260, -1));

        descripcionEspecialidad.setColumns(20);
        descripcionEspecialidad.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        descripcionEspecialidad.setRows(5);
        jScrollPane3.setViewportView(descripcionEspecialidad);

        crearEspecialidad.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 590, 120));

        fondo.add(crearEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 660, 390));

        crearTareas.setOpaque(false);
        crearTareas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCrearUser4.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        tituloCrearUser4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser4.setText("Agregar Tarea");
        crearTareas.add(tituloCrearUser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 640, -1));

        datosUser4.setOpaque(false);
        datosUser4.setLayout(new java.awt.GridLayout(0, 1));

        nombre4.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        nombre4.setText("Fecha de inicio");
        datosUser4.add(nombre4);

        fechaInicioTareas.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        datosUser4.add(fechaInicioTareas);

        apellidos4.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        apellidos4.setText("Fecha final");
        datosUser4.add(apellidos4);

        fechaFinalTareas.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        datosUser4.add(fechaFinalTareas);

        telefono3.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        telefono3.setText("Cuidado a dar");
        datosUser4.add(telefono3);

        cuidadoTareas.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        datosUser4.add(cuidadoTareas);

        nikname2.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        nikname2.setText("Animal ");
        datosUser4.add(nikname2);

        AnimalTareas.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        datosUser4.add(AnimalTareas);

        nikname3.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        nikname3.setText("Heroe ");
        datosUser4.add(nikname3);

        heroeTareas.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        datosUser4.add(heroeTareas);

        crearTareas.add(datosUser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 590, 260));

        jButton13.setBackground(new java.awt.Color(223, 208, 181));
        jButton13.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton13.setText("Crear");
        jButton13.setBorderPainted(false);
        jButton13.setFocusPainted(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        crearTareas.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 260, -1));

        fondo.add(crearTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 660, 390));

        crearUser.setOpaque(false);
        crearUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCrearUser.setFont(new java.awt.Font("SPACE EXPLORER", 0, 14)); // NOI18N
        tituloCrearUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCrearUser.setText("Agregar usuario");
        crearUser.add(tituloCrearUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 640, -1));

        datosUser.setOpaque(false);
        datosUser.setLayout(new java.awt.GridLayout(0, 1));

        nombre.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        nombre.setText("Nombre");
        datosUser.add(nombre);

        insertNombre.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        insertNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        datosUser.add(insertNombre);

        apellidos.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        apellidos.setText("Apelllido/os");
        datosUser.add(apellidos);

        insertApellidos.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        insertApellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        datosUser.add(insertApellidos);

        telefono.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        telefono.setText("Telefono");
        datosUser.add(telefono);

        numTel.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        numTel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        datosUser.add(numTel);

        nikname.setFont(new java.awt.Font("SPACE EXPLORER", 0, 12)); // NOI18N
        nikname.setText("nombre de usuario");
        datosUser.add(nikname);

        insertnik.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        insertnik.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        datosUser.add(insertnik);

        crearUser.add(datosUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 590, 220));

        jButton5.setBackground(new java.awt.Color(223, 208, 181));
        jButton5.setFont(new java.awt.Font("SPACE EXPLORER", 0, 13)); // NOI18N
        jButton5.setText("Crear");
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        crearUser.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 260, -1));

        dios.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        dios.setText("Dios");
        crearUser.add(dios, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 100, 19));

        heroe.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        heroe.setText("Heroe");
        crearUser.add(heroe, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 100, 21));

        visitante.setFont(new java.awt.Font("SPACE EXPLORER", 0, 11)); // NOI18N
        visitante.setText("Visitante");
        crearUser.add(visitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        fondo.add(crearUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 660, 390));

        fondoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoDioses.jpg"))); // NOI18N
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

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        volver.setVisible(true);
        botones.setVisible(false);
        editarCuidado.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        volver.setVisible(true);
        botones.setVisible(false);
        editarEspecialidades.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        volver.setVisible(true);
        botones.setVisible(false);
        crearCuidados.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        volver.setVisible(true);
        botones.setVisible(false);
        crearEspecialidad.setVisible(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void agregarUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarUsersActionPerformed
        volver.setVisible(true);
        botones.setVisible(false);
        crearUser.setVisible(true);
    }//GEN-LAST:event_agregarUsersActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        if(crearUser.isVisible()){
            crearUser.setVisible(false);
            botones.setVisible(true);
        }else if(editarAnimales.isVisible()){
            editarAnimales.setVisible(false);
            botones.setVisible(true);
        }else if (crearAnimales.isVisible()){
            crearAnimales.setVisible(false);
            botones.setVisible(true);
        }else if (crearCuidados.isVisible()){
            crearCuidados.setVisible(false);
            botones.setVisible(true);
        }else if (crearEspecialidad.isVisible()){
            crearEspecialidad.setVisible(false);
            botones.setVisible(true);
        }else if (crearTareas.isVisible()){
            crearTareas.setVisible(false);
            botones.setVisible(true);
        }else if (editarAnimales.isVisible()){
            editarAnimales.setVisible(false);
            botones.setVisible(true);
        }else if (editarCuidado.isVisible()){
            editarCuidado.setVisible(false);
            botones.setVisible(true);
        }else if (editarEspecialidades.isVisible()){
            editarEspecialidades.setVisible(false);
            botones.setVisible(true);
        }else if (editarTareas.isVisible()){
            editarTareas.setVisible(false);
            botones.setVisible(true);
        }else if (editarUsuarios.isVisible()){
            editarUsuarios.setVisible(false);
            botones.setVisible(true);
        }else if (editarDioses.isVisible()){
            editarDioses.setVisible(false);
            botones.setVisible(true);
        }else if (editarHeroes.isVisible()){
            editarHeroes.setVisible(false);
            botones.setVisible(true);
        }
        this.volver.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void insertNombreAnimal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNombreAnimal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertNombreAnimal1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        volver.setVisible(true);
        botones.setVisible(false);
        crearAnimales.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        volver.setVisible(true);
        botones.setVisible(false);
        crearTareas.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void insertNombreAnimal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNombreAnimal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertNombreAnimal2ActionPerformed

    private void editNombreAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNombreAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editNombreAnimalActionPerformed

    private void editProcedenciaAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProcedenciaAnimalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editProcedenciaAnimalesActionPerformed

    private void editrazaAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editrazaAnimalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editrazaAnimalesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       volver.setVisible(true);
        botones.setVisible(false);
        editarAnimales.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void insertNombreAnimal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNombreAnimal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertNombreAnimal3ActionPerformed

    private void editNombreCuidadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNombreCuidadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editNombreCuidadoActionPerformed

    private void insertNombreAnimal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNombreAnimal4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertNombreAnimal4ActionPerformed

    private void editNombreEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNombreEspecialidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editNombreEspecialidadesActionPerformed

    private void insertNombreAnimal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNombreAnimal5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertNombreAnimal5ActionPerformed

    private void insertNombreAnimal6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNombreAnimal6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertNombreAnimal6ActionPerformed

    private void editNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editNombreUsuarioActionPerformed

    private void editapellidosUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editapellidosUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editapellidosUsuarioActionPerformed

    private void editnombreNickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editnombreNickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editnombreNickActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        volver.setVisible(true);
        botones.setVisible(false);
        editarTareas.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        volver.setVisible(true);
        botones.setVisible(false);
        editarUsuarios.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void insertNombreAnimal7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNombreAnimal7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertNombreAnimal7ActionPerformed

    private void editPassActualDiosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPassActualDiosesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPassActualDiosesActionPerformed

    private void editPassNuevaDiosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPassNuevaDiosesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPassNuevaDiosesActionPerformed

    private void insertNombreAnimal8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNombreAnimal8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertNombreAnimal8ActionPerformed

    private void editPassActualDioses1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPassActualDioses1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPassActualDioses1ActionPerformed

    private void editPassNuevaDioses1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPassNuevaDioses1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editPassNuevaDioses1ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        volver.setVisible(true);
        botones.setVisible(false);
        editarDioses.setVisible(true);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        volver.setVisible(true);
        botones.setVisible(false);
        editarHeroes.setVisible(true);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void tablaAnimalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAnimalesMouseClicked
        
        DefaultTableModel model = (DefaultTableModel)tablaAnimales.getModel();
        int pos = tablaAnimales.getSelectedRow();

        editNombreAnimal.setText(model.getValueAt(pos, 1).toString());
        editrazaAnimales.setText(model.getValueAt(pos, 2).toString());
        editProcedenciaAnimales.setText(model.getValueAt(pos, 3).toString());

    }//GEN-LAST:event_tablaAnimalesMouseClicked

    private void tablaCuidadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCuidadosMouseClicked
        DefaultTableModel model = (DefaultTableModel)tablaAnimales.getModel();
        int pos = tablaCuidados.getSelectedRow();

        try {
            String consulta = "SELECT * FROM cuidado WHERE id="+model.getValueAt(pos, 0).toString();
            Statement stmt;
            stmt = (Statement) bd.createStatement();
            ResultSet rs=stmt.executeQuery(consulta);
            rs.next();
            editNombreCuidado.setText(rs.getString(2));
            editCuidadoDescripcion.setText(rs.getString(3));
        } catch (SQLException ex) {
            Logger.getLogger(InterDioses.class.getName()).log(Level.SEVERE, null, ex);
        }
         

        
        
    }//GEN-LAST:event_tablaCuidadosMouseClicked

    private void tablaEspecialidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEspecialidadesMouseClicked
        DefaultTableModel model = (DefaultTableModel)tablaEspecialidades.getModel();
        int pos = tablaCuidados.getSelectedRow();

        try {
            String consulta = "SELECT usuarios.nombre, usuarios.apellido, FROM usuarios, heroes WHERE usuarios.id=heroes.id";
            Statement stmt = (Statement) bd.createStatement();
            ResultSet rs=stmt.executeQuery(consulta);
            
            while(rs.next()){
                editHeroeEspecialidades.addItem(rs.getString(1) + " " + rs.getNString(2));
            }
  
        } catch (SQLException ex) {
            Logger.getLogger(InterDioses.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_tablaEspecialidadesMouseClicked

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
            java.util.logging.Logger.getLogger(InterDioses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterDioses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterDioses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterDioses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterDioses().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AnimalTareas;
    private javax.swing.JPanel agregar;
    private javax.swing.JButton agregarUsers;
    private javax.swing.JLabel apellidos;
    private javax.swing.JLabel apellidos1;
    private javax.swing.JLabel apellidos2;
    private javax.swing.JLabel apellidos3;
    private javax.swing.JLabel apellidos4;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JPanel botones;
    private javax.swing.JPanel cambiarPass;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel cerrar1;
    private javax.swing.JPanel crearAnimales;
    private javax.swing.JPanel crearCuidados;
    private javax.swing.JPanel crearEspecialidad;
    private javax.swing.JPanel crearTareas;
    private javax.swing.JPanel crearUser;
    private javax.swing.JComboBox<String> cuidadoTareas;
    private javax.swing.JPanel datosUser;
    private javax.swing.JPanel datosUser1;
    private javax.swing.JPanel datosUser2;
    private javax.swing.JPanel datosUser3;
    private javax.swing.JPanel datosUser4;
    private javax.swing.JTextArea descripcionCuidado;
    private javax.swing.JTextArea descripcionEspecialidad;
    private javax.swing.JCheckBox dios;
    private javax.swing.JTextArea editCuidadoDescripcion;
    private javax.swing.JTextArea editDescripcionEspecialidades;
    private javax.swing.JComboBox<String> editHeroeEspecialidades;
    private javax.swing.JTextField editNombreAnimal;
    private javax.swing.JTextField editNombreCuidado;
    private javax.swing.JTextField editNombreEspecialidades;
    private javax.swing.JTextField editNombreUsuario;
    private javax.swing.JTextField editPassActualDioses;
    private javax.swing.JTextField editPassActualDioses1;
    private javax.swing.JTextField editPassNuevaDioses;
    private javax.swing.JTextField editPassNuevaDioses1;
    private javax.swing.JTextField editProcedenciaAnimales;
    private javax.swing.JTextField editapellidosUsuario;
    private javax.swing.JPanel editar;
    private javax.swing.JPanel editarAnimales;
    private javax.swing.JPanel editarCuidado;
    private javax.swing.JPanel editarDioses;
    private javax.swing.JPanel editarEspecialidades;
    private javax.swing.JPanel editarHeroes;
    private javax.swing.JPanel editarTareas;
    private javax.swing.JPanel editarUsuarios;
    private javax.swing.JTextField editnombreNick;
    private javax.swing.JTextField editrazaAnimales;
    private org.jdesktop.swingx.JXDatePicker fechaFinalTareas;
    private org.jdesktop.swingx.JXDatePicker fechaInicioTareas;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel fondoImagen;
    private javax.swing.JCheckBox heroe;
    private javax.swing.JComboBox<String> heroeEspecialidad;
    private javax.swing.JComboBox<String> heroeTareas;
    private javax.swing.JTextField insertApellidos;
    private javax.swing.JTextField insertNombre;
    private javax.swing.JTextField insertNombreAnimal;
    private javax.swing.JTextField insertNombreAnimal1;
    private javax.swing.JTextField insertNombreAnimal2;
    private javax.swing.JTextField insertNombreAnimal3;
    private javax.swing.JTextField insertNombreAnimal4;
    private javax.swing.JTextField insertNombreAnimal5;
    private javax.swing.JTextField insertNombreAnimal6;
    private javax.swing.JTextField insertNombreAnimal7;
    private javax.swing.JTextField insertNombreAnimal8;
    private javax.swing.JTextField insertNombreEspecialidad;
    private javax.swing.JTextField insertnik;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinner1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private javax.swing.JLabel nikname;
    private javax.swing.JLabel nikname2;
    private javax.swing.JLabel nikname3;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel nombre4;
    private javax.swing.JTextField numTel;
    private javax.swing.JTextField procedenciaAnimal;
    private javax.swing.JButton quitarPrivilegiosDioses;
    private javax.swing.JButton quitarPrivilegiosDioses1;
    private javax.swing.JTextField razaAnimal;
    private javax.swing.JTable tablaAnimales;
    private javax.swing.JTable tablaCuidados;
    private javax.swing.JTable tablaDioses;
    private javax.swing.JTable tablaEspecialidades;
    private javax.swing.JTable tablaHeroes;
    private javax.swing.JTable tablaTareas;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel telefono1;
    private javax.swing.JLabel telefono2;
    private javax.swing.JLabel telefono3;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloCrearUser;
    private javax.swing.JLabel tituloCrearUser1;
    private javax.swing.JLabel tituloCrearUser10;
    private javax.swing.JLabel tituloCrearUser11;
    private javax.swing.JLabel tituloCrearUser12;
    private javax.swing.JLabel tituloCrearUser13;
    private javax.swing.JLabel tituloCrearUser14;
    private javax.swing.JLabel tituloCrearUser15;
    private javax.swing.JLabel tituloCrearUser16;
    private javax.swing.JLabel tituloCrearUser17;
    private javax.swing.JLabel tituloCrearUser18;
    private javax.swing.JLabel tituloCrearUser19;
    private javax.swing.JLabel tituloCrearUser2;
    private javax.swing.JLabel tituloCrearUser20;
    private javax.swing.JLabel tituloCrearUser21;
    private javax.swing.JLabel tituloCrearUser22;
    private javax.swing.JLabel tituloCrearUser23;
    private javax.swing.JLabel tituloCrearUser24;
    private javax.swing.JLabel tituloCrearUser25;
    private javax.swing.JLabel tituloCrearUser26;
    private javax.swing.JLabel tituloCrearUser27;
    private javax.swing.JLabel tituloCrearUser28;
    private javax.swing.JLabel tituloCrearUser29;
    private javax.swing.JLabel tituloCrearUser3;
    private javax.swing.JLabel tituloCrearUser30;
    private javax.swing.JLabel tituloCrearUser31;
    private javax.swing.JLabel tituloCrearUser32;
    private javax.swing.JLabel tituloCrearUser33;
    private javax.swing.JLabel tituloCrearUser34;
    private javax.swing.JLabel tituloCrearUser35;
    private javax.swing.JLabel tituloCrearUser36;
    private javax.swing.JLabel tituloCrearUser37;
    private javax.swing.JLabel tituloCrearUser4;
    private javax.swing.JLabel tituloCrearUser5;
    private javax.swing.JLabel tituloCrearUser6;
    private javax.swing.JLabel tituloCrearUser7;
    private javax.swing.JLabel tituloCrearUser8;
    private javax.swing.JLabel tituloCrearUser9;
    private javax.swing.JCheckBox visitante;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
