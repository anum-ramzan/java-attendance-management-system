/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancems_with_prepared22;


import java.awt.Color;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Student
 */
public class NewBatchInternalFrame extends javax.swing.JInternalFrame {
ConnectClass c;
Validation v;
    /**
     * Creates new form NewBatchInternalFrame
     */
    public NewBatchInternalFrame() {
        initComponents();
        c = new ConnectClass();
        v = new Validation();
        
        jTable1Batch.setSelectionForeground(Color.WHITE);
        
        setTitle("New Batch");
        
        //Teacher Combo Calling Method
        FillTeacherName ();
                
        //Data
        getData();
        
        //Timing Combo
        TimingCombo();
        
        //Days Combo
        DaysCombo();
        
        //Semester Name
        stdSemesterCombo();
        
        //Status Combo
        statusCombo();
    }
    
    String holdingId;

    /**
     * Timing Combo
     */
    public void TimingCombo(){
        try {jComboBoxTiming.addItem("Please Select....");
            jComboBoxTiming.addItem("9-11");
            jComboBoxTiming.addItem("11-1");
            jComboBoxTiming.addItem("1-3");
            jComboBoxTiming.addItem("3-5");
            jComboBoxTiming.addItem("5-7");
            jComboBoxTiming.addItem("7-9");
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
    /**
     * Days 
     */
    public void DaysCombo(){
    try {
        jComboBoxDay.addItem("Please Select....");
        jComboBoxDay.addItem("MWF");
        jComboBoxDay.addItem("TTS");
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
    /**
     * Combo Box Method - Teacher Name
     */
    public void FillTeacherName(){
        try {
            Teacher_name_Combo.addItem("Please Select....");
            ResultSet rs =c.st.executeQuery("select teacher_name from tbl_teacher where teacher_status = 'true'");
            while (rs.next()) {
                Teacher_name_Combo.addItem(rs.getString(1));
            }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }                
    }    
        
    /**
     * Data from Table
     */
    public void getData() {
        try {
            DefaultTableModel dt = (DefaultTableModel)jTable1Batch.getModel();
            
            ResultSet rs = c.st.executeQuery("select batch_code as 'Batch Code', batch_days as 'Batch Days', batch_time as 'Batch Time', semester_name as 'Semester Name' , batch_book as 'Book', teacher_id as 'Teacher Id', teacher_name as 'Teacher Name', added_on as 'Added On', batch_status as 'Batch Status' from tbl_batch where batch_status = 'true'");
            while(rs.next()) {
                dt.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
            }
            jTable1Batch.setModel(dt);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
    * Filling Student Semester Name ComboBox
    */
    public void stdSemesterCombo() {
        try {
            SemesterNameCombo.addItem("Please Select....");
            ResultSet rs = c.xc.createStatement().executeQuery("select semester_name from tbl_book group by semester_name ");
            while (rs.next()) {
                SemesterNameCombo.addItem(rs.getString(1));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }    
    
    /**
     * Clearing Rows from jTable1
     */
    public void clearingTabel(){
        try {
            /**
             * Clearing Rows from jTable1
             */
            DefaultTableModel dm = (DefaultTableModel) jTable1Batch.getModel();
            int rowCount = dm.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                dm.removeRow(i);
            }   
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    /**
    * Clearing the Text fields
    */
    public void clearing(){
        jTextField1.setText("");
        jComboBoxDay.setSelectedIndex(0);
        jComboBoxTiming.setSelectedIndex(0);
        SemesterNameCombo.setSelectedIndex(0);
        Book_Combo.setSelectedIndex(0);
        Teacher_name_Combo.setSelectedIndex(0);
        jDateChooser1.setDate(null);
        jComboBoxbatchStatus.setSelectedIndex(0);
        
    }
    
    /**
     * Status ComboBox
     */
    public void statusCombo(){
        jComboBoxbatchStatus.addItem("true");
        jComboBoxbatchStatus.addItem("false");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Teacher_name_Combo = new javax.swing.JComboBox();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Batch = new javax.swing.JTable();
        Book_Combo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxTiming = new javax.swing.JComboBox<>();
        jComboBoxDay = new javax.swing.JComboBox<>();
        SemesterNameCombo = new javax.swing.JComboBox<>();
        jButtonDelete = new javax.swing.JButton();
        jComboBoxbatchStatus = new javax.swing.JComboBox<>();
        jButtonShowAll = new javax.swing.JButton();
        BackgroundLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 550));
        setMinimumSize(new java.awt.Dimension(800, 550));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Batch Code");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 50, 100, 30);

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Batch Days");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 50, 100, 30);

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Batch Time");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 100, 100, 30);

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Semester Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(510, 100, 100, 30);

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Batch Book");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 150, 100, 30);

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Batch Status");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(510, 200, 100, 30);

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teacher Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 200, 100, 30);

        jTextField1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 50, 170, 30);

        jLabel8.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(510, 150, 100, 30);

        Teacher_name_Combo.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        getContentPane().add(Teacher_name_Combo);
        Teacher_name_Combo.setBounds(200, 200, 220, 30);

        jButtonInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/add.png"))); // NOI18N
        jButtonInsert.setBorder(null);
        jButtonInsert.setBorderPainted(false);
        jButtonInsert.setOpaque(false);
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInsert);
        jButtonInsert.setBounds(110, 270, 110, 30);

        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/update.png"))); // NOI18N
        jButtonUpdate.setBorder(null);
        jButtonUpdate.setBorderPainted(false);
        jButtonUpdate.setOpaque(false);
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate);
        jButtonUpdate.setBounds(390, 270, 110, 30);

        jButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/clear.png"))); // NOI18N
        jButtonClear.setBorder(null);
        jButtonClear.setBorderPainted(false);
        jButtonClear.setOpaque(false);
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClear);
        jButtonClear.setBounds(530, 270, 110, 30);

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(650, 150, 170, 30);

        jScrollPane1.setAutoscrolls(true);

        jTable1Batch.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jTable1Batch.setForeground(new java.awt.Color(255, 255, 255));
        jTable1Batch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Batch Code", "Batch Days", "Batch Time", "Semester Name", "Book", "Teacher Id", "Teacher Name", "Added On", "Batch Status"
            }
        ));
        jTable1Batch.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1Batch.setAutoscrolls(false);
        jTable1Batch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1BatchMouseClicked(evt);
            }
        });
        jTable1Batch.setOpaque(false);
        ((DefaultTableCellRenderer)jTable1Batch.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        jTable1Batch.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1Batch);
        if (jTable1Batch.getColumnModel().getColumnCount() > 0) {
            jTable1Batch.getColumnModel().getColumn(0).setMinWidth(150);
            jTable1Batch.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable1Batch.getColumnModel().getColumn(0).setMaxWidth(150);
            jTable1Batch.getColumnModel().getColumn(4).setMinWidth(200);
            jTable1Batch.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTable1Batch.getColumnModel().getColumn(4).setMaxWidth(200);
            jTable1Batch.getColumnModel().getColumn(6).setMinWidth(100);
            jTable1Batch.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTable1Batch.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 340, 790, 160);

        Book_Combo.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        getContentPane().add(Book_Combo);
        Book_Combo.setBounds(200, 150, 220, 30);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(390, 50, 50, 30);

        jComboBoxTiming.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        getContentPane().add(jComboBoxTiming);
        jComboBoxTiming.setBounds(200, 100, 220, 30);

        jComboBoxDay.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        getContentPane().add(jComboBoxDay);
        jComboBoxDay.setBounds(650, 50, 170, 30);

        SemesterNameCombo.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        SemesterNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemesterNameComboActionPerformed(evt);
            }
        });
        getContentPane().add(SemesterNameCombo);
        SemesterNameCombo.setBounds(650, 100, 170, 30);

        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/remove.png"))); // NOI18N
        jButtonDelete.setBorder(null);
        jButtonDelete.setBorderPainted(false);
        jButtonDelete.setOpaque(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete);
        jButtonDelete.setBounds(250, 270, 110, 30);

        jComboBoxbatchStatus.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(jComboBoxbatchStatus);
        jComboBoxbatchStatus.setBounds(650, 200, 170, 30);

        jButtonShowAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/viewAll.png"))); // NOI18N
        jButtonShowAll.setBorder(null);
        jButtonShowAll.setBorderPainted(false);
        jButtonShowAll.setOpaque(false);
        jButtonShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowAllActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonShowAll);
        jButtonShowAll.setBounds(670, 270, 110, 30);

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/FrameBG.png"))); // NOI18N
        getContentPane().add(BackgroundLabel);
        BackgroundLabel.setBounds(0, 0, 990, 520);

        setBounds(0, 0, 990, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        // TODO add your handling code here:
        try {
            /**
             * Entering Teacher ID by holding it in variable and the passing it in insert query
             */
            String teacherId = (String) Teacher_name_Combo.getSelectedItem();
            PreparedStatement tid = c.xc.prepareStatement("select teacher_id from tbl_teacher where teacher_name = ?");
            tid.setString(1, teacherId);
            
            ResultSet rs = tid.executeQuery();
            if(rs.next()) {
                holdingId =rs.getString(1);
            }
            
            PreparedStatement pst = c.xc.prepareStatement("insert into tbl_batch values (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, jTextField1.getText().trim() );
            pst.setString(2, jComboBoxDay.getSelectedItem().toString().trim() );
            pst.setString(3, jComboBoxTiming.getSelectedItem().toString().trim()  );
            pst.setString(4, SemesterNameCombo.getSelectedItem().toString() .trim() );
            String bookname= (String) Book_Combo.getSelectedItem();
            pst.setString(5, bookname.trim()  );
            pst.setString(6, holdingId.trim() );
            String teacher = (String) Teacher_name_Combo.getSelectedItem();
            pst.setString(7, teacher.trim() );
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String d = sdf.format(jDateChooser1.getDate());
            pst.setString(8, d.trim() );
            pst.setString(9,jComboBoxbatchStatus.getSelectedItem().toString().trim() );
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null , "Batch Added Successfully");
            clearing();
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        clearingTabel();
        clearing();
        getData();
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        
        clearing();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        try {
            /**
             * Entering Teacher ID by holding it in variable and the passing it in update query
             */
            String teacherId = (String) Teacher_name_Combo.getSelectedItem();
            PreparedStatement id = c.xc.prepareStatement("select teacher_id from tbl_teacher where teacher_name = ?");
            id.setString(1, teacherId);
            
            ResultSet rs = id.executeQuery();
            if(rs.next()) {
                holdingId =rs.getString(1);
                
            }
            
            PreparedStatement pst = c.xc.prepareStatement("update tbl_batch set batch_days = ? , batch_time = ?, semester_name = ? , batch_book = ?, teacher_id = ? , teacher_name = ? , added_on = ?, batch_status= ? where batch_code = ?");
            
            pst.setString(1, jComboBoxDay.getSelectedItem().toString().trim() );
            pst.setString(2, jComboBoxTiming.getSelectedItem().toString().trim() );
            pst.setString(3, SemesterNameCombo.getSelectedItem().toString().trim() );
            String bookname= (String) Book_Combo.getSelectedItem();
            pst.setString(4, bookname.trim() );
            pst.setString(5, holdingId.trim() );
            String teacher = (String) Teacher_name_Combo.getSelectedItem();
            pst.setString(6, teacher.trim() );
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String d = sdf.format(jDateChooser1.getDate());
            pst.setString(7, d.trim() );
            pst.setString(8, jComboBoxbatchStatus.getSelectedItem().toString().trim()); 
            pst.setString(9, jTextField1.getText().trim()); 
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null , "Updated Successfully");
            
            
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        clearingTabel();
        clearing();
        getData();
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTable1BatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1BatchMouseClicked
        // TODO add your handling code here:
        int i = jTable1Batch.getSelectedRow();
        jTextField1.setText(jTable1Batch.getModel().getValueAt(i, 0).toString().trim());
        jComboBoxDay.setSelectedItem(jTable1Batch.getModel().getValueAt(i, 1).toString().trim());
        jComboBoxTiming.setSelectedItem(jTable1Batch.getModel().getValueAt(i, 2).toString().trim());
        SemesterNameCombo.setSelectedItem(jTable1Batch.getModel().getValueAt(i, 3).toString().trim());
        Book_Combo.setSelectedItem(jTable1Batch.getModel().getValueAt(i, 4).toString().trim());
        Teacher_name_Combo.setSelectedItem(jTable1Batch.getModel().getValueAt(i, 6).toString().trim());
        jComboBoxbatchStatus.setSelectedItem(jTable1Batch.getModel().getValueAt(i, 8).toString().trim());
        
    }//GEN-LAST:event_jTable1BatchMouseClicked

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        // TODO add your handling code here:
        
        jLabel10.setText(v.validateData("[A-Z-0-9]{5,20}", jTextField1.getText()));
        if (jLabel10.getText().equals("Valid")) {
            jLabel10.setForeground(Color.green);
        }
        else {
            jLabel10.setForeground(Color.red);
        }
    }//GEN-LAST:event_jTextField1CaretUpdate

    private void SemesterNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemesterNameComboActionPerformed
        // TODO add your handling code here:
        try {
            Book_Combo.removeAllItems();
            Book_Combo.addItem("Please Select....");
            ResultSet rs = c.xc.createStatement().executeQuery("select semester_book from tbl_book where semester_name = '" + SemesterNameCombo.getSelectedItem() + "'group by semester_book");
            while (rs.next()) {
                Book_Combo.addItem(rs.getString(1));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_SemesterNameComboActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        try {
            int a = c.st.executeUpdate("update tbl_batch set batch_status = 'false' where batch_code = '"+jTextField1.getText()+"'");
            
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        clearingTabel();
        clearing();
        getData();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowAllActionPerformed
        // TODO add your handling code here:
        
        try {
            clearingTabel();
            DefaultTableModel dt = (DefaultTableModel)jTable1Batch.getModel();
            
            ResultSet rs = c.st.executeQuery("select batch_code as 'Batch Code', batch_days as 'Batch Days', batch_time as 'Batch Time', semester_name as 'Semester Name' , batch_book as 'Book', teacher_id as 'Teacher Id', teacher_name as 'Teacher Name', added_on as 'Added On', batch_status as 'Batch Status' from tbl_batch");
            while(rs.next()) {
                dt.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
            }
            jTable1Batch.setModel(dt);
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButtonShowAllActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
        
         
        /**
         * Restricting Using from Marking Attendance on future date
         */
        try{
            //JDateChooser Format
            SimpleDateFormat comparedate = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String finaldate = comparedate.format(jDateChooser1.getDate());
            
            //Current Date Formats
            DateFormat dateFormatcurrrent = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = new java.util.Date();
            String matchdate = dateFormatcurrrent.format(date);
            
            if(finaldate.compareTo(matchdate) > 0){
                JOptionPane.showMessageDialog(null, "Your can't Add future date", "Future Date", JOptionPane.WARNING_MESSAGE);
                jButtonInsert.setEnabled(false);
            }
            else {
                jButtonInsert.setEnabled(true);
            }
        } catch(Exception ex){
            System.out.println(ex.toString());
        }
        
    }//GEN-LAST:event_jDateChooser1PropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JComboBox<String> Book_Combo;
    private javax.swing.JComboBox<String> SemesterNameCombo;
    private javax.swing.JComboBox Teacher_name_Combo;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonShowAll;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxDay;
    private javax.swing.JComboBox<String> jComboBoxTiming;
    private javax.swing.JComboBox<String> jComboBoxbatchStatus;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1Batch;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
