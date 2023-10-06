package com.programacion2.cine.igu;

import com.programacion2.cine.logica.ControladoraLogica;
import com.programacion2.cine.logica.DTOEntrada;
import com.programacion2.cine.logica.DTOFuncion;
import com.programacion2.cine.logica.DTOPelicula;
import com.programacion2.cine.logica.ExpertoABMFuncion;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DavidRoco
 */

public class VerEntradasFuncion extends javax.swing.JFrame {
    ControladoraLogica controla = new ControladoraLogica();
    DTOFuncion dtoFuncion = new DTOFuncion();
    DTOEntrada dtoEntrada = new DTOEntrada();
    ExpertoABMFuncion experto = new ExpertoABMFuncion();
    
    /**
     * Creates new form MenuInicial
     */
    public VerEntradasFuncion(int idFuncion) {
        initComponents();
        
        cargarDTOFuncion(idFuncion);
        cargarTablaFuncion();
        cargarTablaEntradas();
        
    }
    
   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabelAdministrarPeliculas = new javax.swing.JLabel();
        jLabelSistemaCineProgramacion2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFuncion = new javax.swing.JTable();
        jLabelDescuentos = new javax.swing.JLabel();
        jLabelDescuentos1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEntradas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnSalir.setText("Volver");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabelAdministrarPeliculas.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabelAdministrarPeliculas.setText("Ver Entradas de la función");

        jLabelSistemaCineProgramacion2.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabelSistemaCineProgramacion2.setText("Sistema Cine Programación 2");

        tablaFuncion.setBorder(new javax.swing.border.MatteBorder(null));
        tablaFuncion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaFuncion);

        jLabelDescuentos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDescuentos.setText("Función");

        jLabelDescuentos1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDescuentos1.setText("Entradas");

        tablaEntradas.setBorder(new javax.swing.border.MatteBorder(null));
        tablaEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaEntradas);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDescuentos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescuentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1091, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSistemaCineProgramacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabelAdministrarPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabelSistemaCineProgramacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAdministrarPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDescuentos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescuentos1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        AdministrarFunciones adminFunciones = AdministrarFunciones.getInstance();
        adminFunciones.setVisible(true);
        adminFunciones.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabelAdministrarPeliculas;
    private javax.swing.JLabel jLabelDescuentos;
    private javax.swing.JLabel jLabelDescuentos1;
    private javax.swing.JLabel jLabelSistemaCineProgramacion2;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaEntradas;
    private javax.swing.JTable tablaFuncion;
    // End of variables declaration//GEN-END:variables

      
    
    public void mostrarMensajes(String mensaje, String tipo,String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if (tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);  
    }

    private void cargarDTOFuncion(int idFuncion) {
        this.dtoFuncion = experto.buscarDTOFuncion(idFuncion);
    }

    private void cargarTablaFuncion() {
       DefaultTableModel tabla = new DefaultTableModel(){
            
            //filas y columnas no editables
            @Override
            public boolean isCellEditable (int row, int column){
                return false;
            }
        };
        //establecer nombre y columnas
        
        String titulos[] = {"ID-Función", "Fecha", "Horario", "Sala", "Película", "Estado", "Precio Entrada"};
        tabla.setColumnIdentifiers(titulos);
        
        Object[] objeto = {this.dtoFuncion.getIdFuncion(), new SimpleDateFormat("dd-MM-yyyy").format(this.dtoFuncion.getFecha()),this.dtoFuncion.getHorario(),this.dtoFuncion.getNombreSala(),this.dtoFuncion.getNombrePelicula(), this.dtoFuncion.getNombreEstado(), this.dtoFuncion.getPrecioEntradas()}; 
        tabla.addRow(objeto);
         
        tablaFuncion.setModel(tabla);
 
    }

    private void cargarTablaEntradas() {
       
        DefaultTableModel tabla1 = new DefaultTableModel(){
            
            //filas y columnas no editables
            @Override
            public boolean isCellEditable (int row, int column){
                return false;
            }
        };
        //establecer nombre y columnas
        
        String titulos[] = {"Nro-Entrada", "Pago Recibido", "Fila", "Nro-Asiento", "Vendida", "Descuento"};
        tabla1.setColumnIdentifiers(titulos);
        
        
        //carga de los datos desde la base de datos
        List <DTOEntrada> listaEntradas = experto.traerDTOEntradas(this.dtoFuncion.getIdFuncion());
        
        
        //recorrer la lista y mostrar cada uno de llos elementos en la tabla
        
        if (listaEntradas != null){
            for (DTOEntrada dtoEntrada1: listaEntradas){
                Object[] objeto = {dtoEntrada1.getNroEntrada(),dtoEntrada1.getPrecioEntradaConDescuento(),dtoEntrada1.getFila(),dtoEntrada1.getNroAsiento(),String.valueOf(dtoEntrada1.isVendida()),dtoEntrada1.getNombreDescuento()}; 
                   tabla1.addRow(objeto);
               
            }
        }
        tablaEntradas.setModel(tabla1);

    }
}
