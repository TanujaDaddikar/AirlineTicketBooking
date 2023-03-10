/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airlineticketbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ADMIN
 */
public class Flight extends javax.swing.JFrame {

    /**
     * Creates new form Flight
     */
    public Flight() {
        initComponents();
        DisplayFlight();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        FCodeTb = new javax.swing.JTextField();
        FSourceCb = new javax.swing.JComboBox<>();
        FDesCb = new javax.swing.JComboBox<>();
        TakeOfD = new com.toedter.calendar.JDateChooser();
        SeatTb = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        fSaveBtn = new javax.swing.JButton();
        FEditBtn = new javax.swing.JButton();
        FDeleteBtn = new javax.swing.JButton();
        FBackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Manage Fligths");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Welcome To Airline");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Fligth Code");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Destination");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("No of Seats");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Take of Date");

        FCodeTb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        FCodeTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCodeTbActionPerformed(evt);
            }
        });

        FSourceCb.setForeground(new java.awt.Color(255, 0, 0));
        FSourceCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangalore", "Mumbai", "Goa", "Hyderabad", "Chennai", " ", " " }));

        FDesCb.setForeground(new java.awt.Color(255, 0, 0));
        FDesCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bangalore", "Mumbai", "Goa", "Hyderabad", "Chennai", " ", " " }));
        FDesCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FDesCbActionPerformed(evt);
            }
        });

        TakeOfD.setForeground(new java.awt.Color(255, 0, 0));
        TakeOfD.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        SeatTb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Fligth List");

        fSaveBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fSaveBtn.setForeground(new java.awt.Color(255, 0, 0));
        fSaveBtn.setText("Save");
        fSaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fSaveBtnMouseClicked(evt);
            }
        });
        fSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSaveBtnActionPerformed(evt);
            }
        });

        FEditBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FEditBtn.setForeground(new java.awt.Color(255, 0, 0));
        FEditBtn.setText("Edit");
        FEditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FEditBtnMouseClicked(evt);
            }
        });
        FEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEditBtnActionPerformed(evt);
            }
        });

        FDeleteBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FDeleteBtn.setForeground(new java.awt.Color(255, 0, 0));
        FDeleteBtn.setText("Delete");
        FDeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FDeleteBtnMouseClicked(evt);
            }
        });
        FDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FDeleteBtnActionPerformed(evt);
            }
        });

        FBackBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FBackBtn.setForeground(new java.awt.Color(255, 0, 0));
        FBackBtn.setText("Back");
        FBackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FBackBtnMouseClicked(evt);
            }
        });
        FBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FBackBtnActionPerformed(evt);
            }
        });

        FlightTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        FlightTable.setModel(new javax.swing.table.DefaultTableModel(
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
        FlightTable.setRowHeight(25);
        FlightTable.setSelectionBackground(new java.awt.Color(255, 0, 0));
        FlightTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlightTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FlightTable);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Source");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(FCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FSourceCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fSaveBtn)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(FDesCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TakeOfD, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(SeatTb, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FEditBtn)
                        .addGap(43, 43, 43)
                        .addComponent(FDeleteBtn)
                        .addGap(43, 43, 43)
                        .addComponent(FBackBtn)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(312, 312, 312))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(262, 262, 262))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(300, 300, 300))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TakeOfD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addComponent(FSourceCb)
                                .addComponent(FDesCb))
                            .addComponent(SeatTb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FEditBtn)
                    .addComponent(FDeleteBtn)
                    .addComponent(FBackBtn)
                    .addComponent(fSaveBtn))
                .addGap(45, 45, 45)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FCodeTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCodeTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FCodeTbActionPerformed

    private void FDesCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FDesCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FDesCbActionPerformed

    private void fSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fSaveBtnActionPerformed

    private void FEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FEditBtnActionPerformed

    private void FDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FDeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FDeleteBtnActionPerformed

    private void FBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FBackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FBackBtnActionPerformed

    private void FBackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FBackBtnMouseClicked
        new MainPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FBackBtnMouseClicked
    Connection Con=null;
    PreparedStatement Pst =null;
    ResultSet Rs=null,Rs1=null;
    Statement St=null,St1=null;
    private void DisplayFlight()
    {
        try{
            Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Msql@3306");
            St=Con.createStatement();
            Rs=St.executeQuery("select * from flighttbl");
            FlightTable.setModel(DbUtils.resultSetToTableModel(Rs));
            //PassengersTable.setModel(DbUtils.resultsetToTableModel(Rs));
        }catch(Exception e){
            
        }
    }
     private void Clear(){
        FCodeTb.setText("");
        SeatTb.setText("");
    }
   
    private void fSaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fSaveBtnMouseClicked
        if(FCodeTb.getText().isEmpty() || SeatTb.getText().isEmpty() || FSourceCb.getSelectedIndex()==-1|| FDesCb.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this,"Missing Information");
        }else{
            try{
               
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Msql@3306");
                PreparedStatement Add=Con.prepareStatement("insert into flighttbl values(?,?,?,?,?)");
                Add.setString(1,FCodeTb.getText());
                Add.setString(2,FSourceCb.getSelectedItem().toString());
                Add.setString(3, FDesCb.getSelectedItem().toString());
                Add.setString(4, TakeOfD.getDate().toString());
                Add.setInt(5,Integer.valueOf(SeatTb.getText()));
                int row=Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Flight Added");
                Con.close();
                DisplayFlight();
                Clear();
            }catch(Exception e){

                JOptionPane.showMessageDialog(this, e);
            }
        }

    }//GEN-LAST:event_fSaveBtnMouseClicked

    private void FDeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FDeleteBtnMouseClicked
        if(key==""){
            JOptionPane.showMessageDialog(this, "Select Flight");
        }else{
            try{
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Msql@3306");
                String Query = "delete from flighttbl where FlCode='"+key+"'";
                Statement Del=Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Flight Deleted");
                DisplayFlight();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }
    }//GEN-LAST:event_FDeleteBtnMouseClicked
String key = "";
    private void FlightTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightTableMouseClicked
         DefaultTableModel model=(DefaultTableModel)FlightTable.getModel();
        int MyIndex =FlightTable.getSelectedRow();
        key=model.getValueAt(MyIndex, 0).toString();
        //PNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        FSourceCb.setSelectedItem(model.getValueAt(MyIndex, 1).toString());
        FDesCb.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        SeatTb.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_FlightTableMouseClicked

    private void FEditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FEditBtnMouseClicked
       if(key=="")
        {
            JOptionPane.showMessageDialog(this,"Select a Passenger");
        }else{
            try{
               // CountPassengers();
                Con =DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Msql@3306");
                String Query = "update flighttbl set FlSource=?,FlDest=?,FlDate=?,FlSeats=? where FlCode=?";
                PreparedStatement Add=Con.prepareStatement(Query);
                Add.setString(5,key);
                Add.setString(1,FSourceCb.getSelectedItem().toString());
                Add.setString(2, FDesCb.getSelectedItem().toString());
                Add.setString(3, TakeOfD.getDate().toString());
                Add.setString(4,SeatTb.getText());
                int row=Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Flight Updated");
                Con.close();
                DisplayFlight();
                Clear();
            }catch(Exception e){

                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_FEditBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FBackBtn;
    private javax.swing.JTextField FCodeTb;
    private javax.swing.JButton FDeleteBtn;
    private javax.swing.JComboBox<String> FDesCb;
    private javax.swing.JButton FEditBtn;
    private javax.swing.JComboBox<String> FSourceCb;
    private javax.swing.JTable FlightTable;
    private javax.swing.JTextField SeatTb;
    private com.toedter.calendar.JDateChooser TakeOfD;
    private javax.swing.JButton fSaveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
