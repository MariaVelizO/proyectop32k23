/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguridad.Vista;

/**
 *
 * @author Javier
 */
public class frmPerfilUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmPerfilUsuario
     */
    public frmPerfilUsuario() {
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

        btnEditar = new javax.swing.JButton();
        jLabelAsignar = new javax.swing.JLabel();
        jLabelQuitar = new javax.swing.JLabel();
        btnAsignarTodo = new javax.swing.JButton();
        btnAsignar = new javax.swing.JButton();
        jLabelUsuarioSeleccionado = new javax.swing.JLabel();
        btnQuitarTodo = new javax.swing.JButton();
        jLabelPerfilAsignado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblperfilesdisponibles = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblperfilesasignados = new javax.swing.JTextArea();
        jLabelPerfilesDisp = new javax.swing.JLabel();
        btnQuitar = new javax.swing.JButton();

        setTitle("Mantenimiento Perfil Usuario");

        btnEditar.setText("Editar");

        jLabelAsignar.setText("Asignar");

        jLabelQuitar.setText("Quitar");

        btnAsignarTodo.setText(">>");

        btnAsignar.setText(">");

        jLabelUsuarioSeleccionado.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabelUsuarioSeleccionado.setText("Usuario Seleccionado ");

        btnQuitarTodo.setText("<<");

        jLabelPerfilAsignado.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabelPerfilAsignado.setText("Perfiles Asignados");

        tblperfilesdisponibles.setColumns(20);
        tblperfilesdisponibles.setRows(5);
        jScrollPane2.setViewportView(tblperfilesdisponibles);

        tblperfilesasignados.setColumns(20);
        tblperfilesasignados.setRows(5);
        jScrollPane1.setViewportView(tblperfilesasignados);

        jLabelPerfilesDisp.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabelPerfilesDisp.setText("Perfiles Disponibles");

        btnQuitar.setText("<");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabelPerfilesDisp)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelAsignar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPerfilAsignado)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAsignarTodo)
                            .addComponent(btnQuitarTodo)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabelQuitar))
                            .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabelUsuarioSeleccionado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsuarioSeleccionado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPerfilAsignado)
                            .addComponent(jLabelPerfilesDisp))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelAsignar)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAsignarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelQuitar)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuitarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnAsignarTodo;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnQuitarTodo;
    private javax.swing.JLabel jLabelAsignar;
    private javax.swing.JLabel jLabelPerfilAsignado;
    private javax.swing.JLabel jLabelPerfilesDisp;
    private javax.swing.JLabel jLabelQuitar;
    private javax.swing.JLabel jLabelUsuarioSeleccionado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea tblperfilesasignados;
    private javax.swing.JTextArea tblperfilesdisponibles;
    // End of variables declaration//GEN-END:variables
}
