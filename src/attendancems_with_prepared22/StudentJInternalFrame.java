package attendancems_with_prepared22;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.table.DefaultTableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Iqbal-Asi
 */
public class StudentJInternalFrame extends javax.swing.JInternalFrame {

    ConnectClass c;

    /**
     * Creates new form StudentJInternalFrame
     */
    public StudentJInternalFrame() {
        initComponents();
        c = new ConnectClass();

        setTitle("Student Attendance");
        //Student Batch Drived from TeacherFrame
        selectFromCombo();

        //Student Names in ComboBox
        stdNameCombo();


        // Student Informationn
        stdInfo();
        
        //book Combo
        fillbook ();
        
        
        jTableIndividualStd.setSelectionForeground(Color.WHITE);
    }

    /**
     * Batch Code from TeacherFrame
     */
    public void selectFromCombo() {
        try {

            String getValue = (String) TeacherInternalFrame.getComboBox().getSelectedItem();

            PreparedStatement pst = c.xc.prepareStatement("select batch_code from tbl_batch join tbl_teacher on tbl_batch.teacher_id = tbl_teacher.teacher_id where tbl_teacher.teacher_name = ? and batch_status = 'true'");
            pst.setString(1, TeacherInternalFrame.teacherNameLabel.getText());
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                jLabel9Std_batch.setText(getValue);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * Filling Student Name ComboBox
     */
    public void stdNameCombo() {
        try {
            jComboBox1Name.removeAllItems();
            jComboBox1Name.addItem("Please Select Name....");
            PreparedStatement pst = c.xc.prepareStatement("select std_name from tbl_std join tbl_batch on tbl_batch.teacher_id = tbl_std.teacher_id where tbl_std.std_batch_code = ? and tbl_std.std_status = 'true' group by tbl_std.std_name");
            pst.setString(1, jLabel9Std_batch.getText());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                jComboBox1Name.addItem(rs.getString(1));

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Student Details Teacher, Days, Timing Information
     */
    public void stdInfo() {
        try {
            ResultSet rs = c.xc.createStatement().executeQuery("select * from tbl_batch join tbl_std on tbl_batch.teacher_id = tbl_std.teacher_id where tbl_batch.batch_code = '" + jLabel9Std_batch.getText() + "' and tbl_std.std_status = 'true'");
            while (rs.next()) {
                jLabel9stdays.setText(rs.getString(2));                
                jLabelstd_semester.setText(rs.getString(4));
                jLabel9stdteacher.setText(rs.getString(7));
                jLabel9stdtime.setText(rs.getString(16));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Radio Button String
     */
    String Attendance;
    
    /**
         * Method for getting data
         */
    public void getdata() {
        /**
         * Clearing Rows from jTable1
         */
        
        DefaultTableModel dm = (DefaultTableModel) jTableIndividualStd.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
           dm.removeRow(i);
        }
        try {
            DefaultTableModel dt = (DefaultTableModel)jTableIndividualStd.getModel();

            ResultSet rs = c.st.executeQuery("select * from std_attend join tbl_std on std_attend.std_id = tbl_std.std_id  where tbl_std.std_batch_code = '" + jLabel9Std_batch.getText() + "' and tbl_std.std_name like '%" + jComboBox1Name.getSelectedItem() + "%' ");

            while (rs.next()) {
                dt.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)});
            }
            jTableIndividualStd.setModel(dt);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Filling Book COmbo
     */
    public void fillbook (){
        try{
            jComboBox2Book.addItem("Please Select Book......");
            ResultSet rs = c.st.executeQuery("select semester_book from tbl_book where semester_name = '"+jLabelstd_semester.getText()+"' group by semester_book");
            while(rs.next()){
                jComboBox2Book.addItem(rs.getString(1));
            }
        }
        catch(Exception ex ){
            System.out.println(ex.toString());
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

        buttonGroup1Attendance = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableIndividualStd = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1Name = new javax.swing.JComboBox<>();
        jComboBox2Book = new javax.swing.JComboBox<>();
        jComboBox3Session = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9Std_batch = new javax.swing.JLabel();
        jLabel9stdays = new javax.swing.JLabel();
        jLabel9stdteacher = new javax.swing.JLabel();
        jLabel9stdtime = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AttendanceButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11Std_id = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        CalculationButton = new javax.swing.JButton();
        ReportButton = new javax.swing.JButton();
        jLabelstd_semester = new javax.swing.JLabel();
        StudentAttendanceBG = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 550));
        setMinimumSize(new java.awt.Dimension(800, 550));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jTableIndividualStd.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jTableIndividualStd.setForeground(new java.awt.Color(255, 255, 255));
        jTableIndividualStd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Attendance Date", "Student ID", "Student Name", "Batch Code", "Book", "Book Session", "Attendance Status"
            }
        ));
        jTableIndividualStd.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableIndividualStd.setOpaque(false);
        ((DefaultTableCellRenderer)jTableIndividualStd.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        jTableIndividualStd.setShowGrid(false);
        jTableIndividualStd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableIndividualStdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableIndividualStd);
        if (jTableIndividualStd.getColumnModel().getColumnCount() > 0) {
            jTableIndividualStd.getColumnModel().getColumn(0).setResizable(false);
            jTableIndividualStd.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableIndividualStd.getColumnModel().getColumn(1).setResizable(false);
            jTableIndividualStd.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTableIndividualStd.getColumnModel().getColumn(2).setResizable(false);
            jTableIndividualStd.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTableIndividualStd.getColumnModel().getColumn(3).setResizable(false);
            jTableIndividualStd.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTableIndividualStd.getColumnModel().getColumn(4).setResizable(false);
            jTableIndividualStd.getColumnModel().getColumn(4).setPreferredWidth(250);
            jTableIndividualStd.getColumnModel().getColumn(5).setPreferredWidth(150);
            jTableIndividualStd.getColumnModel().getColumn(6).setPreferredWidth(130);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 350, 750, 140);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 30, 110, 30);

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Batch");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(520, 30, 100, 30);

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Timing");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(460, 130, 120, 30);

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student Days");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(460, 80, 120, 30);

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teacher Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 90, 120, 30);

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Book Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 180, 120, 30);

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Book Seesion");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 220, 120, 30);

        jComboBox1Name.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jComboBox1Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1NameActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1Name);
        jComboBox1Name.setBounds(130, 30, 160, 30);

        jComboBox2Book.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jComboBox2Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2BookActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2Book);
        jComboBox2Book.setBounds(150, 180, 270, 30);

        jComboBox3Session.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jPanel1.add(jComboBox3Session);
        jComboBox3Session.setBounds(150, 220, 270, 30);

        jLabel8.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(460, 170, 120, 30);

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(570, 170, 200, 30);

        jLabel9Std_batch.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel9Std_batch.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel9Std_batch);
        jLabel9Std_batch.setBounds(620, 30, 100, 30);

        jLabel9stdays.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel9stdays.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel9stdays);
        jLabel9stdays.setBounds(570, 80, 200, 30);

        jLabel9stdteacher.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel9stdteacher.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel9stdteacher);
        jLabel9stdteacher.setBounds(150, 90, 200, 30);

        jLabel9stdtime.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel9stdtime.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel9stdtime);
        jLabel9stdtime.setBounds(570, 130, 200, 30);

        jLabel9.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Semester Name");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 140, 120, 30);

        AttendanceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/marked.png"))); // NOI18N
        AttendanceButton.setBorderPainted(false);
        AttendanceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AttendanceButton.setOpaque(false);
        AttendanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendanceButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AttendanceButton);
        AttendanceButton.setBounds(440, 290, 110, 30);

        jLabel10.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Student ID");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(300, 30, 70, 30);

        jLabel11Std_id.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel11Std_id.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel11Std_id);
        jLabel11Std_id.setBounds(380, 30, 140, 30);

        buttonGroup1Attendance.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Absent");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(65, 285, 120, 40);

        buttonGroup1Attendance.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Present");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(185, 285, 120, 40);

        CalculationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/calculate.png"))); // NOI18N
        CalculationButton.setBorderPainted(false);
        CalculationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CalculationButton.setOpaque(false);
        CalculationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CalculationButton);
        CalculationButton.setBounds(570, 290, 110, 30);

        ReportButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/pdf.png"))); // NOI18N
        ReportButton.setBorderPainted(false);
        ReportButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReportButton.setOpaque(false);
        ReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ReportButton);
        ReportButton.setBounds(320, 290, 100, 30);

        jLabelstd_semester.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabelstd_semester.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabelstd_semester);
        jLabelstd_semester.setBounds(150, 140, 270, 30);

        StudentAttendanceBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/FrameBG.png"))); // NOI18N
        jPanel1.add(StudentAttendanceBG);
        StudentAttendanceBG.setBounds(0, 0, 790, 550);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 520);

        setBounds(0, 0, 800, 550);
    }// </editor-fold>//GEN-END:initComponents


    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        Attendance = "Absent";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        Attendance = "Present";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jComboBox2BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2BookActionPerformed
        // TODO add your handling code here:
        try {
            jComboBox3Session.removeAllItems();
            jComboBox3Session.addItem("Please Select Session....");
            ResultSet rs = c.xc.createStatement().executeQuery("select std_book_session from tbl_book where semester_book = '" + jComboBox2Book.getSelectedItem() + "'");
            while (rs.next()) {
                jComboBox3Session.addItem(rs.getString(1));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_jComboBox2BookActionPerformed

    private void jComboBox1NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1NameActionPerformed
        // TODO add your handling code here:

        try {
            String stdID = (String) jComboBox1Name.getSelectedItem();
            PreparedStatement pst = c.xc.prepareStatement("select std_id from tbl_std where std_name = ? and std_status='true'");
            pst.setString(1, stdID);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                jLabel11Std_id.setText(rs.getString(1));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        getdata() ;

    }//GEN-LAST:event_jComboBox1NameActionPerformed

    private void CalculationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculationButtonActionPerformed
        // TODO add your handling code here:
        
        /**
         * Method for calculating attendance
         */
         
        try {

            if (jComboBox1Name.getSelectedItem().equals("Please Select Name....")){
                JOptionPane.showMessageDialog(this, "Please Select Name", "Error", JOptionPane.ERROR_MESSAGE);
                
            }
            else {
            ResultSet rs = c.st.executeQuery("select COUNT(std_status) from std_attend where std_status = 'Present' and std_batch_code = '" + jLabel9Std_batch.getText() + "' and std_name ='" + jComboBox1Name.getSelectedItem()+ "'");
            while (rs.next()) {
                int result = rs.getInt(1);
                int required;
                int semesterHours;
                float percent;
                int absents;
                        
                switch (jLabelstd_semester.getText()) {
                    case "ADSE-II":
                        required = 77;
                        semesterHours = 144;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        

                        if (result <= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "ADSE-I":
                        required = 66;
                        semesterHours = 132;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        

                        if (result <= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "HDSE-II":
                        required = 86;
                        semesterHours = 172;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        

                        if (result <= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "HDSE-I":
                        required = 60;
                        semesterHours = 120;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        
                        if (result <= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "DISM":
                        required = 74;
                        semesterHours = 148;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        
                        if (result <= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";
                            
                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                    case "CPISM":
                        required = 90;
                        semesterHours = 180;
                        
                        percent = (result * 100 / semesterHours);
                        absents = semesterHours - result;
                        

                        if (result <= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n Need " + absents + " in order to get eligible for exams.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        if (result >= required) {
                            String excellent = jComboBox1Name.getSelectedItem() + " attendance is " + percent + "% \n Present: " + result + " \n You have a better record of punctuality and good attendance.";

                            JOptionPane.showMessageDialog(this, excellent);
                            System.out.println(excellent);
                        }
                        break;

                }
            }
            }
            

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_CalculationButtonActionPerformed

    private void ReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportButtonActionPerformed
        // TODO add your handling code here:
        try {
            //Creating Document 
            Rectangle pageSize = new Rectangle(PageSize.A4.rotate());
            pageSize.setBackgroundColor(new BaseColor(135 ,206 ,250));
            pageSize.setBorder(Rectangle.BOX);
            pageSize.setBorderWidth(10f);
            Document doc = new Document(pageSize);
            PdfWriter.getInstance(doc, new FileOutputStream("Student Report.pdf"));
            // Opening
            doc.open();
            
            // Main Heading Paragraph
            Paragraph heading = new Paragraph("Student Attendance Report", FontFactory.getFont("Candara", 35, Font.BOLD, BaseColor.BLUE));
            heading.setAlignment(Element.ALIGN_CENTER);
            
            //Sub Heading
            Paragraph subheading = new Paragraph("Student Information", FontFactory.getFont("Candara", 15, Font.BOLD, BaseColor.BLACK));
            subheading.setAlignment(Element.ALIGN_CENTER);            
            
            //Creating Table           
            PdfPTable table = new PdfPTable(4);
            
             /**
             * Initializing, Instantiating  and Declaring PdfPCell 
             */
            //Student Id Cell
            PdfPCell IDCell = new PdfPCell(new Paragraph("Student ID", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            IDCell.setPadding(10f);
            
            //Bring value from jLabel to cell
            PdfPCell IDLabel = new PdfPCell(new Paragraph(jLabel11Std_id.getText(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            IDLabel.setPadding(10f);
            
            //Student Name Cell
            PdfPCell NameCell = new PdfPCell(new Paragraph("Student Name", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            NameCell.setPadding(10f);
            
            //Bring value from jLabel to cell
            PdfPCell NameLabel = new PdfPCell(new Paragraph(jComboBox1Name.getSelectedItem().toString(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            NameLabel.setPadding(10f);
            
            //Teacher Cell
            PdfPCell TeacherCell = new PdfPCell(new Paragraph("Teacher Name", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            TeacherCell.setPadding(10f);
            
            //Bring value from jLabel to cell
            PdfPCell TeacherLabel = new PdfPCell(new Paragraph(jLabel9stdteacher.getText(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            TeacherLabel.setPadding(10f);
            
            //Batch Code Cell
            PdfPCell BatchCell = new PdfPCell(new Paragraph("Batch Code", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            BatchCell.setPadding(10f);
            
            //Bring value from jLabel to cell
            PdfPCell BatchLabel = new PdfPCell(new Paragraph(jLabel9Std_batch.getText().toString(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            BatchLabel.setPadding(10f);
            
            //Days Cell
            PdfPCell DaysCell = new PdfPCell(new Paragraph("Days", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            DaysCell.setPadding(10f);
            
            //Bring value from jLabel to cell
            PdfPCell DaysLabel = new PdfPCell(new Paragraph(jLabel9stdays.getText(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            DaysLabel.setPadding(10f);
            
            //Timing Cell
            PdfPCell TimingsCell = new PdfPCell(new Paragraph("Timings", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            TimingsCell.setPadding(10f);
            
            //Bring value from jLabel to cell
            PdfPCell TimingsLabel = new PdfPCell(new Paragraph(jLabel9stdtime.getText().toString(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            TimingsLabel.setPadding(10f);            
            
            //Adding Cell in Table
            table.addCell(IDCell);
            table.addCell(IDLabel);
            table.addCell(NameCell);
            table.addCell(NameLabel);            
            table.addCell(TeacherCell);
            table.addCell(TeacherLabel);
            table.addCell(BatchCell);
            table.addCell(BatchLabel);
            table.addCell(DaysCell);
            table.addCell(DaysLabel);
            table.addCell(TimingsCell);
            table.addCell(TimingsLabel);
            
            
            table.setSpacingAfter(10f);
            table.setSpacingBefore(10f);
            /**
             * Displaying Attendance Data in itext Table
            */
            Paragraph subheading2 = new Paragraph("Attendance Record", FontFactory.getFont("Candara", 15, Font.BOLD, BaseColor.BLACK));
            subheading2.setAlignment(Element.ALIGN_CENTER);            
            
            PdfPTable pdfTable = new PdfPTable(jTableIndividualStd.getColumnCount());
            //adding table headers
            for (int i = 0; i < jTableIndividualStd.getColumnCount(); i++) {
                pdfTable.addCell(jTableIndividualStd.getColumnName(i));
            }
            //extracting data from the JTable and inserting it to PdfPTable
            for (int rows = 0; rows < jTableIndividualStd.getRowCount(); rows++) {
                for (int cols = 0; cols < jTableIndividualStd.getColumnCount(); cols++) {
                     pdfTable.addCell(jTableIndividualStd.getModel().getValueAt(rows, cols).toString());

                }
            }
            
            
            // Calling Element and Displaying in document
            doc.add(heading);     
            // Blank Line
            doc.add(new Paragraph(20f, Chunk.NEWLINE));
            doc.add(subheading);
            // Blank Line
            doc.add(new Paragraph(10f, Chunk.NEWLINE));
            doc.add(table);
            // Blank Line
            doc.add(new Paragraph(10f, Chunk.NEWLINE));
            doc.add(subheading2);
            // Blank Line
            doc.add(new Paragraph(10f, Chunk.NEWLINE));
            doc.add(pdfTable);
            
            
            //Closing Document
            doc.close();
            JOptionPane.showMessageDialog(this, "Report is Saved");
        }
        catch(Exception ex) {
            
        }        
    }//GEN-LAST:event_ReportButtonActionPerformed

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
            Date date = new Date();
            String matchdate = dateFormatcurrrent.format(date);
            
            
            
            if(finaldate.compareTo(matchdate) > 0){
                JOptionPane.showMessageDialog(null, "Your can't mark attendance on Future Date", "Future Date", JOptionPane.WARNING_MESSAGE);
                AttendanceButton.setEnabled(false);
            }
            else {
                AttendanceButton.setEnabled(true);
            }
        } catch(Exception ex){
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange

    private void jTableIndividualStdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableIndividualStdMouseClicked
        // TODO add your handling code here:
        int i = jTableIndividualStd.getSelectedRow();
        
        //jDateChooser1.setDate((Date)jTableIndividualStd.getModel().getValueAt(i, 0));
        //jDateChooser1.setCalendar(jTableIndividualStd.getModel().getValueAt(i, 0).toString());
        jLabel11Std_id.setText(jTableIndividualStd.getModel().getValueAt(i, 1).toString().trim());
        jComboBox1Name.setSelectedItem(jTableIndividualStd.getModel().getValueAt(i, 2).toString().trim());
        jLabel9Std_batch.setText(jTableIndividualStd.getModel().getValueAt(i, 3).toString().trim());
        jComboBox2Book.setSelectedItem(jTableIndividualStd.getModel().getValueAt(i, 4).toString().trim());
        jComboBox3Session.setSelectedItem(jTableIndividualStd.getModel().getValueAt(i, 5).toString().trim());
        
        
    }//GEN-LAST:event_jTableIndividualStdMouseClicked

    private void AttendanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendanceButtonActionPerformed
        // TODO add your handling code here:

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String d = sdf.format(jDateChooser1.getDate());

            PreparedStatement pst = c.xc.prepareStatement("update std_attend set std_book = ? , std_book_session = ? , std_status = ? where std_id = ? and std_name = ? and std_batch_code = ? and attend_date = ?");
            pst.setString(1, jComboBox2Book.getSelectedItem().toString());
            pst.setString(2, jComboBox3Session.getSelectedItem().toString());
            pst.setString(3, String.valueOf(Attendance));
            pst.setString(4, jLabel11Std_id.getText());
            pst.setString(5, jComboBox1Name.getSelectedItem().toString());
            pst.setString(6, jLabel9Std_batch.getText());
            pst.setString(7, d);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Attendance Marked");

        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        getdata() ;
    }//GEN-LAST:event_AttendanceButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AttendanceButton;
    private javax.swing.JButton CalculationButton;
    private javax.swing.JButton ReportButton;
    private javax.swing.JLabel StudentAttendanceBG;
    private javax.swing.ButtonGroup buttonGroup1Attendance;
    private javax.swing.JComboBox<String> jComboBox1Name;
    private javax.swing.JComboBox<String> jComboBox2Book;
    private javax.swing.JComboBox<String> jComboBox3Session;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11Std_id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel9Std_batch;
    private javax.swing.JLabel jLabel9stdays;
    private javax.swing.JLabel jLabel9stdteacher;
    private javax.swing.JLabel jLabel9stdtime;
    private javax.swing.JLabel jLabelstd_semester;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableIndividualStd;
    // End of variables declaration//GEN-END:variables
}
