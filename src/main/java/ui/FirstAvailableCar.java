/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.UberCar;

/**
 *
 * @author Trisha
 */
public class FirstAvailableCar extends javax.swing.JFrame {

transient ArrayList<UberCar> uberCars;
transient ArrayList<UberCar> carsInLocation;
//ImageIcon carPicture = new ImageIcon("carowner1.png");
    transient String fileName;
    DefaultTableModel model;

    public void populateArrayList() {
        try {
            FileInputStream file = new FileInputStream("UberCar.dat");
            ObjectInputStream ipfile = new ObjectInputStream(file);

            boolean eof = false;
            while (!eof) {
                try {
                    uberCars.add((UberCar) ipfile.readObject());
                } catch (EOFException eoe) {
                    eof = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
            ipfile.close();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, ioe.getMessage());
        }
    }
    /**
     * Creates new form FirstAvailableCar
     */
    public FirstAvailableCar() {
        initComponents();
model = (DefaultTableModel) FirstAvailableTable.getModel();
uberCars = new ArrayList<UberCar>();
populateArrayList();
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
        location = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        FirstAvailableTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("Enter Location: ");

        location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston             ", "Worcester          ", "Springfield        ", "Cambridge          ", "Lowell             ", "Brockton           ", "New                ", "Quincy             ", "Lynn               ", "Fall               ", "Newton             ", "Somerville         ", "Lawrence           ", "Framingham         ", "Haverhill          ", "Waltham            ", "Malden             ", "Brookline          ", "Weymouth           ", "Taunton            ", "Medford            ", "Chicopee           ", "Peabody            ", "Revere             ", "Methuen            ", "Everett            ", "Attleboro          ", "Arlington          ", "Barnstable         ", "Salem              ", "Beverly            ", "Leominster         ", "Pittsfield         ", "Westfield          ", "Fitchburg          ", "Woburn             ", "Holyoke            ", "Marlborough        ", "Chelsea            ", "Braintree          ", "Franklin           ", "Watertown          ", "Randolph           ", "Lexington          ", "Needham            ", "Gloucester         ", "Norwood            ", "Wellesley          ", "Agawam             ", "Saugus             ", "Bridgewater        ", "West               ", "Northampton        ", "Melrose            ", "Burlington         ", "Danvers            ", "Milton             ", "Wakefield          ", "Belmont            ", "Milford            ", "Dedham             ", "Reading            ", "Wilmington         ", "Stoneham           ", "Winchester         ", "Gardner            ", "Marblehead         ", "Amherst            ", "Newburyport        ", "Winthrop           ", "Somerset           ", "Amesbury           ", "Greenfield         ", "Southbridge        ", "Abington           ", "Longmeadow         ", "Easthampton        ", "Hudson             ", "Swampscott         ", "Lynnfield          ", "North              ", "Palmer             ", "Webster            ", "South              ", "Holbrook           ", "Maynard            ", "Hull               ", "Andover            " }));

        FirstAvailableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Engine Number", "License Plate", "Manufacturer", "Number of seats", "Model Number", "Uber Serial Number", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(FirstAvailableTable);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Go Back");
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
                .addGap(187, 187, 187)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(location, 0, 164, Short.MAX_VALUE)
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addGap(445, 445, 445))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(229, 229, 229))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton2)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
model.setRowCount(0);
for(UberCar car:uberCars){
if(!(car.getLocation().isEmpty()) && !(location.getSelectedItem().toString().isEmpty()))
if(car.getLocation().trim().equalsIgnoreCase(location.getSelectedItem().toString().trim())){
//carsInLocation.add(car);
model.insertRow(model.getRowCount(), new Object[]{car.getEngineNo(),car.getLicenseplate(),car.getManufacturer(),car.getNumberOfSeat(),car.getModelNumber(),car.getUberSerialNumber(),car.getLocation()});
break;
}
//carsInLocation
}
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FirstAvailableCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstAvailableCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstAvailableCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstAvailableCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstAvailableCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FirstAvailableTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> location;
    // End of variables declaration//GEN-END:variables
}
