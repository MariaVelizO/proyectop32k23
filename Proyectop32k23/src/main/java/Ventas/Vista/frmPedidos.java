/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventas.Vista;



import Seguridad.Controlador.clsBitacora;
import Ventas.Controlador.clsCotizacion;
import Seguridad.Controlador.clsUsuarioConectado;
import Ventas.Controlador.clsPedidos;
import Ventas.Controlador.clsTienda;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
//Carlos hernandez
/**
 *
 * @author visitante
 */
public class frmPedidos extends javax.swing.JInternalFrame {

    public void llenadoDeCombos() {
        /*EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        List<Empleado> empleados = empleadoDAO.select();
        cbox_empleado.addItem("Seleccione una opción");
        for (int i = 0; i < empleados.size(); i++) {
            cbox_empleado.addItem(empleados.get(i).getNombreEmpleado());
        } */
    }


    private DefaultTableModel modeloTabla;
    
    public frmPedidos() {
        initComponents();
        modeloTabla = (DefaultTableModel) tblPedActual.getModel();
        llenadoDeTablasProductos();
        llenadoDeCombos();
    }

    int codigoAplicacion = 3006;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2Pedido = new javax.swing.JLabel();
        lbusuPedido = new javax.swing.JLabel();
        jScrollPanePed2 = new javax.swing.JScrollPane();
        jTable1Ped = new javax.swing.JTable();
        lbCodProdPed = new javax.swing.JLabel();
        lbPedActual = new javax.swing.JLabel();
        lbCantProdPed = new javax.swing.JLabel();
        lbTotalPed = new javax.swing.JLabel();
        txtTotalPed = new javax.swing.JTextField();
        btnAgregarPed = new javax.swing.JButton();
        txtCodProdPed = new javax.swing.JTextField();
        btnModificarPed = new javax.swing.JButton();
        txtCantProdPed = new javax.swing.JTextField();
        btnEliminarPed = new javax.swing.JButton();
        jScrollPanePedActual = new javax.swing.JScrollPane();
        tblPedActual = new javax.swing.JTable();
        jScrollPaneProdDispPed = new javax.swing.JScrollPane();
        tblProdDispPed = new javax.swing.JTable();
        lbCantProdPed1 = new javax.swing.JLabel();
        txtIdClientePed = new javax.swing.JTextField();
        btnRegistrarPed = new javax.swing.JButton();
        lbInstPed = new javax.swing.JLabel();
        lbIdClientePed = new javax.swing.JLabel();
        btnAyudaPed = new javax.swing.JButton();

        lb2Pedido.setForeground(new java.awt.Color(204, 204, 204));
        lb2Pedido.setText(".");

        jTable1Ped.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPanePed2.setViewportView(jTable1Ped);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pedidos");
        setVisible(true);

        lbCodProdPed.setText("Codigo del Producto:");

        lbPedActual.setText("Pedido Actual:");

        lbCantProdPed.setText("Cantidad del Producto:");

        lbTotalPed.setText("TOTAL DEL PEDIDO:");

        txtTotalPed.setEditable(false);

        btnAgregarPed.setText("Agregar");
        btnAgregarPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedActionPerformed(evt);
            }
        });

        btnModificarPed.setText("Modificar");
        btnModificarPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPedActionPerformed(evt);
            }
        });

        btnEliminarPed.setText("Eliminar");
        btnEliminarPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPedActionPerformed(evt);
            }
        });

        tblPedActual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Producto", "Cantidad", "SubTotal"
            }
        ));
        jScrollPanePedActual.setViewportView(tblPedActual);

        tblProdDispPed.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPaneProdDispPed.setViewportView(tblProdDispPed);

        lbCantProdPed1.setText("Productos Disponibles:");

        btnRegistrarPed.setText("Realizar Pedido");
        btnRegistrarPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPedActionPerformed(evt);
            }
        });

        lbInstPed.setText("Para registrar este pedido debes ingresar los siguientes datos:");

        lbIdClientePed.setText("ID del Cliente:");

        btnAyudaPed.setText("Ayuda");
        btnAyudaPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaPedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCodProdPed)
                    .addComponent(lbIdClientePed))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdClientePed, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodProdPed, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(lbCantProdPed)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantProdPed, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jScrollPaneProdDispPed, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbCantProdPed1)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRegistrarPed)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTotalPed)
                                .addComponent(txtTotalPed, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(123, 123, 123))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(btnAgregarPed)
                        .addGap(65, 65, 65)
                        .addComponent(btnModificarPed)
                        .addGap(82, 82, 82)
                        .addComponent(btnEliminarPed))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPanePedActual, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(btnAyudaPed))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(376, 376, 376)
                                .addComponent(lbPedActual))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(lbInstPed)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbInstPed)
                .addGap(4, 4, 4)
                .addComponent(lbCantProdPed1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdClientePed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIdClientePed))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCodProdPed)
                            .addComponent(txtCodProdPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCantProdPed)
                            .addComponent(txtCantProdPed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPaneProdDispPed, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarPed)
                    .addComponent(btnModificarPed)
                    .addComponent(btnEliminarPed))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lbTotalPed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalPed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnRegistrarPed)
                        .addGap(35, 35, 35)
                        .addComponent(btnAyudaPed)
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbPedActual)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPanePedActual, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPedActionPerformed
        // TODO add your handling code here:
int codigoProducto = Integer.parseInt(txtCodProdPed.getText());

// Lógica para buscar y eliminar la fila en la JTable
DefaultTableModel model = (DefaultTableModel) tblPedActual.getModel();
int rowCount = model.getRowCount();
double suma = 0.0; // Variable para almacenar la suma de los subtotales
boolean codigoEncontrado = false; // Variable para indicar si se encuentra el código en la tabla

for (int i = 0; i < rowCount; i++) {
    int codigo = (int) model.getValueAt(i, 0); // Obtener el valor de la columna "Codigo Producto"

    if (codigo == codigoProducto) {
        model.removeRow(i); // Eliminar la fila si se encuentra una coincidencia
        rowCount--; // Reducir el número de filas después de eliminar una fila
        i--; // Decrementar el índice para evitar saltar la siguiente fila en la iteración
        codigoEncontrado = true; // Marcar el código como encontrado
    } else {
        double subtotal = (double) model.getValueAt(i, 2); // Obtener el valor del subtotal
        suma += subtotal; // Sumar el subtotal a la suma
    }

}
if (!codigoEncontrado) {
    JOptionPane.showMessageDialog(null, "No existe este código en tu pedido actual", "Error", JOptionPane.ERROR_MESSAGE);
}
txtTotalPed.setText(String.valueOf(suma));
limpiarTextos(); 

    }//GEN-LAST:event_btnEliminarPedActionPerformed

     public void llenadoDeTablasProductos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("proCodigo");
        modelo.addColumn("proNombre");
        modelo.addColumn("proPrecios");
        modelo.addColumn("proExistencias");
        clsPedidos producto = new clsPedidos();
        //VendedorDAO vendedorDAO = new VendedorDAO();
        List<clsPedidos> listaProductos = producto.getListadoProductos();
        tblProdDispPed.setModel(modelo);
        String[] dato = new String[4];
        for (int i = 0; i < listaProductos.size(); i++) {
            dato[0] = Integer.toString(listaProductos.get(i).getIdProducto());
            dato[1] = listaProductos.get(i).getNombreProducto();
            dato[2] = Double.toString(listaProductos.get(i).getPrecioProducto());
            dato[3] = Double.toString(listaProductos.get(i).getExistenciaProducto());
            modelo.addRow(dato);
        }              


    }                

    private void btnModificarPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPedActionPerformed
        // TODO add your handling code here:
        
        // Obtener los datos ingresados
        int codigoProducto = Integer.parseInt(txtCodProdPed.getText());
        int nuevaCantidad = Integer.parseInt(txtCantProdPed.getText());
        clsPedidos pedido = new clsPedidos();
        
        
// Verificar si el código de producto existe en la tabla de cotización
        boolean productoEncontrado = false;
        int filaModificar = -1;
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            int codigo = (int) modeloTabla.getValueAt(i, 0);
            if (codigo == codigoProducto) {
                productoEncontrado = true;
                filaModificar = i;
                break;
            }
        }
        if (productoEncontrado) {
                // Actualizar el subtotal y el total
            if (pedido.verificarExistencias(codigoProducto) >= nuevaCantidad) {
                double precio = pedido.obtenerPrecioProducto(codigoProducto);
                double sumaSubTotal = precio * nuevaCantidad;
                
                // Actualizar la cantidad en la fila correspondiente
                modeloTabla.setValueAt(nuevaCantidad, filaModificar, 1);
                
                // Actualizar el subtotal en la fila correspondiente
                modeloTabla.setValueAt(sumaSubTotal, filaModificar, 2);
                
               // Actualizar el total
                double suma = 0.0;
                int columnaSubTotal = 2;
                int filas = tblPedActual.getRowCount();
                
                for (int i = 0; i < filas; i++) {
                    double valor = (double) tblPedActual.getValueAt(i, columnaSubTotal);
                    suma += valor;
                }
                
                txtTotalPed.setText(String.valueOf(suma));
            }else {
                JOptionPane.showMessageDialog(null, "El producto no tiene existencias.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null, "El código de producto no existe en la cotización actual.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        limpiarTextos(); 
        
    }//GEN-LAST:event_btnModificarPedActionPerformed
   public void limpiarTextos()
    {
        txtCantProdPed.setText("");
        txtCodProdPed.setText("");
    }
   
      public void limpiarTextosCliente()
    {
        txtIdClientePed.setText("");
    }

//María José Véliz Ochoa 
//9959-21-5909

    private void btnAgregarPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedActionPerformed
int codigoProducto = Integer.parseInt(txtCodProdPed.getText());
    int cantidad = Integer.parseInt(txtCantProdPed.getText());
    clsPedidos pedido = new clsPedidos();
    
    // Verificar si el producto ya está registrado en la tabla
    boolean productoExistente = false;
    int filas = tblPedActual.getRowCount();
    for (int i = 0; i < filas; i++) {
        int codigo = (int) tblPedActual.getValueAt(i, 0);
        if (codigo == codigoProducto) {
            productoExistente = true;
            break;
        }
    }
    
    if (productoExistente) {
        JOptionPane.showMessageDialog(this, "Este Producto ya está registrado, puedes intentar MODIFICAR.");
    } else if (pedido.verificarExistencias(codigoProducto) >= cantidad) {
        double precio = pedido.obtenerPrecioProducto(codigoProducto);
        double sumaSubTotal = precio * cantidad;
        
        // Agregar los datos a la tabla
        Object[] fila = {codigoProducto, cantidad, sumaSubTotal};
        modeloTabla.addRow(fila);

        double suma = 0.0;
        int columnaSubTotal = 2; 

        filas = tblPedActual.getRowCount();
        for (int i = 0; i < filas; i++) {
            double valor = (double) tblPedActual.getValueAt(i, columnaSubTotal);
            suma += valor;
        }
        
        txtTotalPed.setText(String.valueOf(suma));
    } else {
        JOptionPane.showMessageDialog(this, "El producto no existe o no tiene existencias.");
    }
    limpiarTextos();


    }//GEN-LAST:event_btnAgregarPedActionPerformed

    private void btnRegistrarPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPedActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tblPedActual.getModel();
                    if (txtIdClientePed.getText().isEmpty() || modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No se ha ingresado la información necesaria", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
        clsPedidos pedido = new clsPedidos();
        int idCliente = Integer.parseInt(txtIdClientePed.getText());
                double totalPedido = Double.parseDouble(txtTotalPed.getText());
                LocalDate fechaActual = LocalDate.now();

                
                // Registrar en la tabla tbl_cotizacion
                pedido.registrarPedido(idCliente, fechaActual, totalPedido);
                
                // Obtener el último valor agregado en la columna cotid de tbl_cotizacion
                int pedidoId = pedido.obtenerUltimoIdPedido();
                
                // Obtener los datos de la JTable tblCotActual y registrar en tbl_cotdetalle
                pedido.registrarPedidoDetalle(pedidoId, modelo);
                
                limpiarTextos();
                limpiarTextosCliente();
                int rowCount = modelo.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                modelo.removeRow(i); // Eliminar la fila si se encuentra una coincidencia
                rowCount--; // Reducir el número de filas después de eliminar una fila
                i--; // Decrementar el índice para evitar saltar la siguiente fila en la iteración
                }
                    DefaultTableModel modeloTabla = (DefaultTableModel) tblProdDispPed.getModel();
    modeloTabla.setRowCount(0);
    tblProdDispPed.repaint();
    llenadoDeTablasProductos();
                txtTotalPed.setText("");
                int resultadoBitacora=0;
                    clsBitacora bitacoraRegistro = new clsBitacora();
                    resultadoBitacora = bitacoraRegistro.setIngresarBitacora(clsUsuarioConectado.getIdUsuario(),codigoAplicacion,"INS"); 
                JOptionPane.showMessageDialog(null, "Pedido #" + pedidoId + " ha sido registrado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
                
    }//GEN-LAST:event_btnRegistrarPedActionPerformed

    private void btnAyudaPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaPedActionPerformed
        // TODO add your handling code here:
                try {
            if ((new File("src\\main\\java\\ventas\\ayuda\\ayudaped.chm")).exists()) {
                Process p = Runtime
                .getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\ventas\\ayuda\\ayudaped.chm");
                p.waitFor();
            } else {
                System.out.println("La ayuda no fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAyudaPedActionPerformed
         
    


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPed;
    private javax.swing.JButton btnAyudaPed;
    private javax.swing.JButton btnEliminarPed;
    private javax.swing.JButton btnModificarPed;
    private javax.swing.JButton btnRegistrarPed;
    private javax.swing.JScrollPane jScrollPanePed2;
    private javax.swing.JScrollPane jScrollPanePedActual;
    private javax.swing.JScrollPane jScrollPaneProdDispPed;
    private javax.swing.JTable jTable1Ped;
    private javax.swing.JLabel lb2Pedido;
    private javax.swing.JLabel lbCantProdPed;
    private javax.swing.JLabel lbCantProdPed1;
    private javax.swing.JLabel lbCodProdPed;
    private javax.swing.JLabel lbIdClientePed;
    private javax.swing.JLabel lbInstPed;
    private javax.swing.JLabel lbPedActual;
    private javax.swing.JLabel lbTotalPed;
    private javax.swing.JLabel lbusuPedido;
    private javax.swing.JTable tblPedActual;
    private javax.swing.JTable tblProdDispPed;
    private javax.swing.JTextField txtCantProdPed;
    private javax.swing.JTextField txtCodProdPed;
    private javax.swing.JTextField txtIdClientePed;
    private javax.swing.JTextField txtTotalPed;
    // End of variables declaration//GEN-END:variables


}