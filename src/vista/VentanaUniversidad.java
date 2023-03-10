package vista;

import controlador.ControladorUniversidad;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Universidad;

public class VentanaUniversidad extends javax.swing.JInternalFrame {

    DefaultTableModel mod = new DefaultTableModel();
    private ControladorUniversidad cntrlUni = new ControladorUniversidad();

    public VentanaUniversidad() {
        initComponents();
        this.setIconifiable(true);
        this.setIgnoreRepaint(true);
        this.setClosable(true);
        this.setResizable(true);
        this.setSize(880, 620);
        llenarCiudad();
        iniciarTabla();

        btnGrupo.add(rbPrivada);
        btnGrupo.add(rbPublica);
        

    }

    public void limpiar() {
        txtNombre.setText("");
        txtDir.setText("");
        txtTlf.setText("");
        rbPrivada.setSelected(false);
        rbPublica.setSelected(false);
        cmbCiudad.setSelectedIndex(0);
    }

    public void llenarCiudad() {
        String[] ciudades = {"Cuenca", "Guayaquil", "Quito", "Ambato"};
        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(ciudades));
    }

    public void iniciarTabla() {

        String[] titulos = {"Nombre", "Ciudad", "Telefono", "Direccion", "Tipo"};
        mod.setColumnIdentifiers(titulos);
        tblLista.setModel(mod);
    }

    public void actualizarTabla(ArrayList<Universidad> lstu) {
        mod = new DefaultTableModel();
        String[] titulos = {"Nombre", "Ciudad", "Telefono", "Direccion", "Tipo"};
        mod.setColumnIdentifiers(titulos);
        for (Universidad u : lstu) {
            mod.addRow(new Object[]{u.getNomb(), u.getCuidad(), u.getTlf(), u.getDir(), u.getTipo()});
        }
        tblLista.setModel(mod);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cmbCiudad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        rbPublica = new javax.swing.JRadioButton();
        rbPrivada = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTlf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDir = new javax.swing.JTextArea();
        btnCrear = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 110, -1));

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
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
        tblLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLista);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 540, -1));

        rbPublica.setText("Publica");
        jPanel1.add(rbPublica, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        rbPrivada.setText("Privada");
        jPanel1.add(rbPrivada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel1.setText("Ciudad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel2.setText("Tipo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 190, -1));

        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        txtTlf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTlfActionPerformed(evt);
            }
        });
        jPanel1.add(txtTlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 200, -1));

        jLabel5.setText("Direccion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        txtDir.setColumns(20);
        txtDir.setRows(5);
        jScrollPane2.setViewportView(txtDir);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, 90));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, -1, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaMouseClicked
        txtNombre.setText(tblLista.getValueAt(tblLista.getSelectedRow(), 0) + "");
        txtTlf.setText(tblLista.getValueAt(tblLista.getSelectedRow(), 2) + "");
        txtDir.setText(tblLista.getValueAt(tblLista.getSelectedRow(), 3) + "");
        if ((tblLista.getValueAt(tblLista.getSelectedRow(), 4) + "").equals("Privada")) {
            rbPrivada.setSelected(true);
            rbPublica.setSelected(false);
        } else {
            rbPrivada.setSelected(false);
            rbPublica.setSelected(true);
        }

        for (int i = 0; i < cmbCiudad.getItemCount(); i++) {
            String c = cmbCiudad.getItemAt(i) + "";
            if (c.equals(tblLista.getValueAt(tblLista.getSelectedRow(), 1) + "")) {
                cmbCiudad.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_tblListaMouseClicked

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        String n = "", c = "", t = "", dir = "", tlf="";
        n = txtNombre.getText();
        c = (String) cmbCiudad.getSelectedItem();
        if (rbPrivada.isSelected()) {
            t = "Privada";
        } else if (rbPublica.isSelected()) {
            t = "Publica";
        }
        tlf = txtTlf.getText();
        dir = txtDir.getText();
        try {
            if (cntrlUni.anadirUniversidad(n, c, tlf, dir, t)) {
                actualizarTabla(cntrlUni.getLista());
                JOptionPane.showMessageDialog(null, "Se a??adio con exito", "A??adido", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear la Universidad.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e1) {
            throw new NumberFormatException("Error al convertir el formato"+e1.toString());
        }

    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int i = tblLista.getSelectedRow();
        if (i != -1) {
            cntrlUni.borrarUniversidad(i);
            actualizarTabla(cntrlUni.getLista());
            JOptionPane.showMessageDialog(null, "Se elimino con exito", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int i = tblLista.getSelectedRow();
        String n = "", c = "", t = "", dir = "", tlf="";

        n = txtNombre.getText();
        c = (String) cmbCiudad.getSelectedItem();
        t = "";
        if (rbPrivada.isSelected()) {
            t = "Privada";
        } else if (rbPublica.isSelected()) {
            t = "Publica";
        }
        tlf = txtTlf.getText();
        dir = txtDir.getText();
        if (i != -1) {
            cntrlUni.modificarUniversidad(i, n, c, tlf, dir, t);
            actualizarTabla(cntrlUni.getLista());
            JOptionPane.showMessageDialog(null, "Se modifico con exito", "Modificado", JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento para modificar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtTlfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTlfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTlfActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        cntrlUni.getUniServiceImpl().almacenarArchivo(cntrlUni.getLista(), "universidad.dat");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        cntrlUni.getUniServiceImpl().setLstUniversidad(cntrlUni.getUniServiceImpl().recuperarArchivo("universidad.dat"));
        actualizarTabla(cntrlUni.getLista());
    }//GEN-LAST:event_btnCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbPrivada;
    private javax.swing.JRadioButton rbPublica;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextArea txtDir;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTlf;
    // End of variables declaration//GEN-END:variables
}
