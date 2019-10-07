/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancems_with_prepared22;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
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
import java.io.PrintWriter;
import java.sql.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iqbal-Asi
 */
public class ReportInternalFrame extends javax.swing.JInternalFrame {
ConnectClass c;
    /**
     * Creates new form ReportInternalFrame
     */
    public ReportInternalFrame() {
        initComponents();
        c = new ConnectClass();
        
        
        //title
        setTitle("Reporting Panel");        
        
        teacherCombo();
        
        //Calling Method
        getDataInTable();
        
        //All Batch Attendance Table Data
        BatchAttendance();
        
        // Applying white color while selection mode        
        jTableBS.setSelectionForeground(Color.WHITE);
        jTableDate.setSelectionForeground(Color.WHITE);
        jTableForAllBatch.setSelectionForeground(Color.WHITE);
        jTableBatchwithCustomized.setSelectionForeground(Color.WHITE);
        
        //Getting DateWise Batch Attendance
        dateWiseBatch();
        
    }
    
    
    
    /**
     * Filling batch code combo for DAte Wise PAnel
    */
    public void dateWiseBatch(){
        try{
             ResultSet rs = c.xc.createStatement().executeQuery("select batch_code from tbl_batch");
             while (rs.next()){
                 jComboBoxBatch.addItem(rs.getString(1));
             }
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
    } 

    /**
     * Teacher Combo in Student and Batch Wise Panel
     */
    public void teacherCombo(){
        try {
             ResultSet rs = c.st.executeQuery("select teacher_name from tbl_teacher");
             while(rs.next()){
                 jTeacherCombo.addItem(rs.getString(1));
             }
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
       
    }
    
    /**
     * Getting Data in table All Batches Attendance with Customized Date
     */
    public void getDataInTable(){
        /**
         * Clearing Rows from Table
         */
        
        DefaultTableModel dm = (DefaultTableModel) jTableDate.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
           dm.removeRow(i);
        }
        
        
         /**
          * Filling table
          */
         try {
             DefaultTableModel dt = (DefaultTableModel)jTableDate.getModel();
             
             ResultSet rs = c.st.executeQuery("select attend_date as 'Attendance Date', std_id as 'Student ID', std_name as 'Student Name' , std_batch_code as 'Batch Code', std_book as 'Book', std_book_session as 'Book Session', std_status as 'Status' from std_attend");
            while(rs.next()){
                dt.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }
            jTableDate.setModel(dt);
         }
         catch(Exception ex){
             System.out.println(ex.toString());
         }
    }
    
    //BSPanel Absent Present
    public void BSPresentAbsent(){
        try {
            ResultSet pre = c.st.executeQuery("select count(std_status) from std_attend where std_status = 'Present' and std_batch_code = '"+jBatchCodeCombo.getSelectedItem()+"'");
                while(pre.next()){
                    jLabelBGPresent.setText(pre.getString(1));
                }
            ResultSet abs = c.st.executeQuery("select count(std_status) from std_attend where std_status = 'Absent' and std_batch_code = '"+jBatchCodeCombo.getSelectedItem()+"'");
                while(abs.next()){
                    jLabelBSAbsent.setText(abs.getString(1));
                }
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
    /**
     * Fetching table for BatchAttendance Panel
     */
    public void BatchAttendance(){
        try {
            DefaultTableModel dt = (DefaultTableModel)jTableForAllBatch.getModel();
            
            ResultSet rs = c.st.executeQuery("select * from std_attend");
            while (rs.next()){
                dt.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }
            jTableForAllBatch.setModel(dt);
        }
        catch(Exception ex) {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableForAllBatch = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jButtonAllBatchExcel = new javax.swing.JButton();
        jButtonAllBatchPDf = new javax.swing.JButton();
        jButtonAllBatchPrint = new javax.swing.JButton();
        jLabelAllBatchAttendanceBG = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBatchCodeCombo = new javax.swing.JComboBox<>();
        jTeacherCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBS = new javax.swing.JTable();
        jComboStudentName = new javax.swing.JComboBox<>();
        jButtonBSExcel = new javax.swing.JButton();
        jButtonBSPDF = new javax.swing.JButton();
        jButtonBSPrint = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelBGPresent = new javax.swing.JLabel();
        jLabelBSAbsent = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelBatchStudentPanel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jDateChooserFrom = new com.toedter.calendar.JDateChooser();
        jDateChooserTo = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDate = new javax.swing.JTable();
        jButtonCustomizedBatchGet = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelCountPresent = new javax.swing.JLabel();
        jLabelCountAbsent = new javax.swing.JLabel();
        jButtonDateExcel = new javax.swing.JButton();
        jButtonDatePdf = new javax.swing.JButton();
        jButtonDatePrint = new javax.swing.JButton();
        jLabelDateBG = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jDateChooserBACDFrom = new com.toedter.calendar.JDateChooser();
        jDateChooserBACDTo = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonGetBACD = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableBatchwithCustomized = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabelBACDPresent = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabelBACDAbsent = new javax.swing.JLabel();
        jButtonExcelBACD = new javax.swing.JButton();
        jButtonPDFBACD = new javax.swing.JButton();
        jButtonPrintBACD = new javax.swing.JButton();
        jComboBoxBatch = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabelBACD = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(990, 550));
        setMinimumSize(new java.awt.Dimension(990, 550));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(990, 550));
        getContentPane().setLayout(null);

        jPanel3.setLayout(null);

        jScrollPane3.setBorder(null);

        jTableForAllBatch.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jTableForAllBatch.setForeground(new java.awt.Color(240, 240, 240));
        jTableForAllBatch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Attendance Date", "Student Id", "Student Name", "Batch Code", "Book", "Book Session", "Attendance Status"
            }
        ));
        jTableForAllBatch.setOpaque(false);
        ((DefaultTableCellRenderer)jTableForAllBatch.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane3.setOpaque(false);
        jScrollPane3.getViewport().setOpaque(false);

        jTableForAllBatch.setShowGrid(false);
        jScrollPane3.setViewportView(jTableForAllBatch);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(40, 122, 860, 350);

        jLabel10.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("All Batch Attendance");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(380, 20, 210, 30);

        jButtonAllBatchExcel.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonAllBatchExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/excel.png"))); // NOI18N
        jButtonAllBatchExcel.setBorderPainted(false);
        jButtonAllBatchExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAllBatchExcel.setOpaque(false);
        jButtonAllBatchExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllBatchExcelActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAllBatchExcel);
        jButtonAllBatchExcel.setBounds(190, 70, 110, 30);

        jButtonAllBatchPDf.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonAllBatchPDf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/pdf.png"))); // NOI18N
        jButtonAllBatchPDf.setBorderPainted(false);
        jButtonAllBatchPDf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAllBatchPDf.setOpaque(false);
        jButtonAllBatchPDf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllBatchPDfActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAllBatchPDf);
        jButtonAllBatchPDf.setBounds(330, 70, 110, 30);

        jButtonAllBatchPrint.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonAllBatchPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/Printer.png"))); // NOI18N
        jButtonAllBatchPrint.setBorderPainted(false);
        jButtonAllBatchPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAllBatchPrint.setOpaque(false);
        jButtonAllBatchPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllBatchPrintActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAllBatchPrint);
        jButtonAllBatchPrint.setBounds(470, 70, 110, 30);

        jLabelAllBatchAttendanceBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/FrameBG.png"))); // NOI18N
        jPanel3.add(jLabelAllBatchAttendanceBG);
        jLabelAllBatchAttendanceBG.setBounds(0, 0, 960, 550);

        jTabbedPane1.addTab("All Batches Attendance", jPanel3);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Select Batch");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 80, 120, 30);

        jBatchCodeCombo.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jBatchCodeCombo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jBatchCodeComboPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jBatchCodeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatchCodeComboActionPerformed(evt);
            }
        });
        jPanel1.add(jBatchCodeCombo);
        jBatchCodeCombo.setBounds(370, 80, 250, 30);

        jTeacherCombo.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jTeacherCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTeacherComboActionPerformed(evt);
            }
        });
        jPanel1.add(jTeacherCombo);
        jTeacherCombo.setBounds(370, 30, 250, 30);

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Teacher Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 30, 120, 30);

        jTableBS.setForeground(new java.awt.Color(240, 240, 240));
        jTableBS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Attendance Date", " Student ID", " Student Name", " Batch Code", " Book ", "Book Session ", "Status"
            }
        ));
        jTableBS.setOpaque(false);
        ((DefaultTableCellRenderer)jTableBS.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        jTableBS.setShowGrid(false);
        jScrollPane1.setViewportView(jTableBS);
        if (jTableBS.getColumnModel().getColumnCount() > 0) {
            jTableBS.getColumnModel().getColumn(0).setMinWidth(100);
            jTableBS.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableBS.getColumnModel().getColumn(0).setMaxWidth(100);
            jTableBS.getColumnModel().getColumn(2).setMinWidth(100);
            jTableBS.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableBS.getColumnModel().getColumn(2).setMaxWidth(100);
            jTableBS.getColumnModel().getColumn(3).setMinWidth(100);
            jTableBS.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTableBS.getColumnModel().getColumn(3).setMaxWidth(100);
            jTableBS.getColumnModel().getColumn(4).setMinWidth(150);
            jTableBS.getColumnModel().getColumn(4).setPreferredWidth(150);
            jTableBS.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 220, 790, 210);

        jComboStudentName.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jComboStudentName.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboStudentNamePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(jComboStudentName);
        jComboStudentName.setBounds(370, 130, 250, 30);

        jButtonBSExcel.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonBSExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/excel.png"))); // NOI18N
        jButtonBSExcel.setBorderPainted(false);
        jButtonBSExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBSExcel.setOpaque(false);
        jButtonBSExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBSExcelActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBSExcel);
        jButtonBSExcel.setBounds(290, 440, 110, 30);

        jButtonBSPDF.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonBSPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/pdf.png"))); // NOI18N
        jButtonBSPDF.setBorderPainted(false);
        jButtonBSPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBSPDF.setOpaque(false);
        jButtonBSPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBSPDFActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBSPDF);
        jButtonBSPDF.setBounds(430, 440, 110, 30);

        jButtonBSPrint.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonBSPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/Printer.png"))); // NOI18N
        jButtonBSPrint.setBorderPainted(false);
        jButtonBSPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBSPrint.setOpaque(false);
        jButtonBSPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBSPrintActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBSPrint);
        jButtonBSPrint.setBounds(580, 440, 110, 30);

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Student Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 130, 120, 30);

        jLabel11.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Total Present");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(230, 180, 100, 30);

        jLabelBGPresent.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabelBGPresent.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabelBGPresent);
        jLabelBGPresent.setBounds(340, 180, 100, 30);

        jLabelBSAbsent.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabelBSAbsent.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabelBSAbsent);
        jLabelBSAbsent.setBounds(620, 180, 100, 30);

        jLabel14.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total Absent");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(500, 180, 100, 30);

        jLabelBatchStudentPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/FrameBG.png"))); // NOI18N
        jPanel1.add(jLabelBatchStudentPanel);
        jLabelBatchStudentPanel.setBounds(0, 0, 990, 550);

        jTabbedPane1.addTab("Batch and Student Attendance", jPanel1);

        jPanel2.setLayout(null);

        jDateChooserFrom.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jPanel2.add(jDateChooserFrom);
        jDateChooserFrom.setBounds(170, 70, 230, 30);

        jDateChooserTo.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jPanel2.add(jDateChooserTo);
        jDateChooserTo.setBounds(570, 70, 220, 30);

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("From");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(90, 70, 80, 30);

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("To");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(500, 70, 60, 30);

        jTableDate.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jTableDate.setForeground(new java.awt.Color(255, 255, 255));
        jTableDate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Attendance Date", "Student ID", "Student Name", "Batch Code", "Book", "Book Session", "Attendance Status"
            }
        ));
        jTableDate.setOpaque(false);
        ((DefaultTableCellRenderer)jTableDate.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);

        jTableBS.setShowGrid(false);
        jScrollPane2.setViewportView(jTableDate);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(70, 190, 820, 220);

        jButtonCustomizedBatchGet.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonCustomizedBatchGet.setText("Get ");
        jButtonCustomizedBatchGet.setOpaque(false);
        jButtonCustomizedBatchGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCustomizedBatchGetActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCustomizedBatchGet);
        jButtonCustomizedBatchGet.setBounds(800, 70, 60, 30);

        jLabel8.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Total Present");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(130, 150, 100, 30);

        jLabel9.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Total Absent");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(510, 150, 120, 30);

        jLabelCountPresent.setForeground(new java.awt.Color(240, 240, 240));
        jPanel2.add(jLabelCountPresent);
        jLabelCountPresent.setBounds(240, 150, 110, 30);

        jLabelCountAbsent.setForeground(new java.awt.Color(240, 240, 240));
        jPanel2.add(jLabelCountAbsent);
        jLabelCountAbsent.setBounds(620, 150, 110, 30);

        jButtonDateExcel.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonDateExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/excel.png"))); // NOI18N
        jButtonDateExcel.setToolTipText("");
        jButtonDateExcel.setBorderPainted(false);
        jButtonDateExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDateExcel.setOpaque(false);
        jButtonDateExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDateExcelActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDateExcel);
        jButtonDateExcel.setBounds(230, 420, 110, 30);

        jButtonDatePdf.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonDatePdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/pdf.png"))); // NOI18N
        jButtonDatePdf.setToolTipText("");
        jButtonDatePdf.setBorderPainted(false);
        jButtonDatePdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDatePdf.setOpaque(false);
        jButtonDatePdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDatePdfActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDatePdf);
        jButtonDatePdf.setBounds(390, 420, 110, 30);

        jButtonDatePrint.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonDatePrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/excel.png"))); // NOI18N
        jButtonDatePrint.setToolTipText("");
        jButtonDatePrint.setBorderPainted(false);
        jButtonDatePrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDatePrint.setOpaque(false);
        jButtonDatePrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDatePrintActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDatePrint);
        jButtonDatePrint.setBounds(550, 420, 110, 30);

        jLabelDateBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/FrameBG.png"))); // NOI18N
        jPanel2.add(jLabelDateBG);
        jLabelDateBG.setBounds(0, 0, 970, 490);

        jTabbedPane1.addTab("All Batches Attendance with Customized Date", jPanel2);

        jPanel4.setLayout(null);

        jDateChooserBACDFrom.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jPanel4.add(jDateChooserBACDFrom);
        jDateChooserBACDFrom.setBounds(200, 80, 200, 30);

        jDateChooserBACDTo.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jPanel4.add(jDateChooserBACDTo);
        jDateChooserBACDTo.setBounds(570, 80, 200, 30);

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("From");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(100, 80, 90, 30);

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("To");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(520, 80, 50, 30);

        jButtonGetBACD.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonGetBACD.setText("Get");
        jButtonGetBACD.setOpaque(false);
        jButtonGetBACD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGetBACDActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonGetBACD);
        jButtonGetBACD.setBounds(780, 80, 60, 30);

        jTableBatchwithCustomized.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jTableBatchwithCustomized.setForeground(new java.awt.Color(255, 255, 255));
        jTableBatchwithCustomized.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Attendance Date", "Student ID", "Student Name", "Batch Code", "Book", "Book Session", "Attendance Status"
            }
        ));
        jTableBatchwithCustomized.setOpaque(false);
        ((DefaultTableCellRenderer)jTableBatchwithCustomized.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane4.setOpaque(false);
        jScrollPane4.getViewport().setOpaque(false);

        jTableBatchwithCustomized.setShowGrid(false);
        jScrollPane4.setViewportView(jTableBatchwithCustomized);
        if (jTableBatchwithCustomized.getColumnModel().getColumnCount() > 0) {
            jTableBatchwithCustomized.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jPanel4.add(jScrollPane4);
        jScrollPane4.setBounds(40, 210, 890, 200);

        jLabel12.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total Present");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(270, 150, 100, 30);

        jLabelBACDPresent.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabelBACDPresent.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabelBACDPresent);
        jLabelBACDPresent.setBounds(390, 150, 100, 30);

        jLabel15.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total Absent");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(500, 150, 100, 30);

        jLabelBACDAbsent.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabelBACDAbsent.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jLabelBACDAbsent);
        jLabelBACDAbsent.setBounds(600, 150, 100, 30);

        jButtonExcelBACD.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonExcelBACD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/excel.png"))); // NOI18N
        jButtonExcelBACD.setBorderPainted(false);
        jButtonExcelBACD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExcelBACD.setOpaque(false);
        jButtonExcelBACD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcelBACDActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonExcelBACD);
        jButtonExcelBACD.setBounds(260, 430, 110, 30);

        jButtonPDFBACD.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonPDFBACD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/pdf.png"))); // NOI18N
        jButtonPDFBACD.setBorderPainted(false);
        jButtonPDFBACD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPDFBACD.setOpaque(false);
        jButtonPDFBACD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPDFBACDActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonPDFBACD);
        jButtonPDFBACD.setBounds(380, 430, 110, 30);

        jButtonPrintBACD.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButtonPrintBACD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/Printer.png"))); // NOI18N
        jButtonPrintBACD.setBorderPainted(false);
        jButtonPrintBACD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPrintBACD.setOpaque(false);
        jButtonPrintBACD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintBACDActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonPrintBACD);
        jButtonPrintBACD.setBounds(520, 430, 110, 30);

        jComboBoxBatch.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jComboBoxBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBatchActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBoxBatch);
        jComboBoxBatch.setBounds(380, 20, 230, 30);

        jLabel13.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Batch Code");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(220, 20, 150, 30);

        jLabelBACD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/FrameBG.png"))); // NOI18N
        jPanel4.add(jLabelBACD);
        jLabelBACD.setBounds(0, 0, 970, 490);

        jTabbedPane1.addTab("Batch Attendance with Customized Date ", jPanel4);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 970, 520);

        setBounds(0, 0, 990, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBatchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBatchActionPerformed

    private void jButtonPrintBACDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintBACDActionPerformed
        // TODO add your handling code here:

        /**
        * Printing Report
        */
        try {
            MessageFormat h = new MessageFormat("Attendance Record \n Attendance Report with Customized Date");
            MessageFormat f = new MessageFormat("Attendance Management System");

            jTableBatchwithCustomized.print(JTable.PrintMode.FIT_WIDTH, h, f);
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_jButtonPrintBACDActionPerformed

    private void jButtonPDFBACDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPDFBACDActionPerformed
        // TODO add your handling code here:

        /**
        * PDF Report
        */
        try {
            Rectangle pageSize = new Rectangle(PageSize.A4.rotate());
            pageSize.setBackgroundColor(new BaseColor(135 ,206 ,250));
            pageSize.setBorder(Rectangle.BOX);
            pageSize.setBorderWidth(10f);
            Document doc = new Document(pageSize);
            PdfWriter.getInstance(doc, new FileOutputStream("CustomizedDateBatchAttendanceReport.pdf"));
            doc.open();

            doc.add(new Paragraph("Attendance Report", FontFactory.getFont("Candara", 35, Font.BOLD, BaseColor.BLACK)));
            doc.add(new Paragraph(20f, Chunk.NEWLINE));

            doc.add(new Paragraph("Report with Customized Date and Batch", FontFactory.getFont("Candara", 20, Font.BOLD, BaseColor.BLACK)));
            doc.add(new Paragraph(20f, Chunk.NEWLINE));

            //Creating Table
            PdfPTable datetable = new PdfPTable(4);
            /**
            * Initializing, Instantiating  and Declaring PdfPCell
            */
            //Date from
            PdfPCell from = new PdfPCell(new Paragraph("From", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            from.setPadding(10f);

            //Bring value from jLabel to cell
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String d = sdf.format(jDateChooserBACDFrom.getDate());

            PdfPCell jdateBACDfrom = new PdfPCell(new Paragraph(d, FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            jdateBACDfrom.setPadding(10f);

            //Date from
            PdfPCell toBACD = new PdfPCell(new Paragraph("To", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            toBACD.setPadding(10f);

            //Bring value from jLabel to cell
            String toBACDdate= sdf.format(jDateChooserBACDTo.getDate());
            PdfPCell jdateBACDto = new PdfPCell(new Paragraph(toBACDdate, FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            jdateBACDto.setPadding(10f);

            //Student Id Cell
            PdfPCell totalBACDPresent = new PdfPCell(new Paragraph("Total Present", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            totalBACDPresent.setPadding(10f);

            //Bring value from jLabel to cell
            PdfPCell PresentBACDNo = new PdfPCell(new Paragraph(jLabelBACDPresent.getText(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            PresentBACDNo.setPadding(10f);

            //Student Id Cell
            PdfPCell totalBACDAbsent = new PdfPCell(new Paragraph("Total Absent", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            totalBACDAbsent.setPadding(10f);

            //Bring value from jLabel to cell
            PdfPCell AbsentBACDNo = new PdfPCell(new Paragraph(jLabelBACDAbsent.getText(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            AbsentBACDNo.setPadding(10f);

            //Adding Rows
            datetable.addCell(from);
            datetable.addCell(jdateBACDfrom);
            datetable.addCell(toBACD);
            datetable.addCell(jdateBACDto);
            datetable.addCell(totalBACDPresent);
            datetable.addCell(PresentBACDNo);
            datetable.addCell(totalBACDAbsent);
            datetable.addCell(AbsentBACDNo);

            //Adding Space
            doc.add(new Paragraph(20f, Chunk.NEWLINE));

            //Getting Table
            jTableBatchwithCustomized.setForeground(Color.WHITE);
            PdfPTable pdfTable = new PdfPTable(jTableBatchwithCustomized.getColumnCount());
            //adding table headers
            for (int i = 0; i < jTableBatchwithCustomized.getColumnCount(); i++) {
                pdfTable.addCell(jTableBatchwithCustomized.getColumnName(i));
            }
            //extracting data from the jTableForAllBatch and inserting it to PdfPTable
            for (int rows = 0; rows < jTableBatchwithCustomized.getRowCount(); rows++) {
                for (int cols = 0; cols < jTableBatchwithCustomized.getColumnCount(); cols++) {
                    pdfTable.addCell(jTableBatchwithCustomized.getModel().getValueAt(rows, cols).toString());

                }
            }

            doc.add(datetable);
            //Adding Space
            doc.add(new Paragraph(20f, Chunk.NEWLINE));
            doc.add(pdfTable);
            doc.close();
            JOptionPane.showMessageDialog(null, "Attendance Report Saved");

        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_jButtonPDFBACDActionPerformed

    private void jButtonExcelBACDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcelBACDActionPerformed
        // TODO add your handling code here:

        /**
        * Excel Report
        */

        JFileChooser j = new JFileChooser();
        int i = j.showSaveDialog(this);
        System.out.println(i);
        if (i==0){
            try {
                PrintWriter p = new PrintWriter(j.getSelectedFile()+".csv");

                p.println(jTableBatchwithCustomized.getColumnName(0)+","+jTableBatchwithCustomized.getColumnName(1)+","+jTableBatchwithCustomized.getColumnName(2)+","+jTableBatchwithCustomized.getColumnName(3)+","+jTableBatchwithCustomized.getColumnName(4)+","+jTableBatchwithCustomized.getColumnName(5)+","+jTableBatchwithCustomized.getColumnName(6));

                for (int x = 0; x< jTableBatchwithCustomized.getRowCount();x++){
                    p.println(jTableBatchwithCustomized.getValueAt(x, 0)+","+jTableBatchwithCustomized.getValueAt(x, 1)+","+jTableBatchwithCustomized.getValueAt(x, 2)+","+jTableBatchwithCustomized.getValueAt(x, 3)+","+jTableBatchwithCustomized.getValueAt(x, 4)+","+jTableBatchwithCustomized.getValueAt(x, 5)+","+jTableBatchwithCustomized.getValueAt(x, 6));
                }p.flush();
            }
            catch(Exception ex) {
                System.out.println(ex.toString());
            }
        }

    }//GEN-LAST:event_jButtonExcelBACDActionPerformed

    private void jButtonGetBACDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGetBACDActionPerformed
        // TODO add your handling code here
        /**
        * Custom Date Data
        */
        try {
            /**
            * Clearing Rows from jTable1
            */
            DefaultTableModel dm = (DefaultTableModel) jTableBatchwithCustomized.getModel();
            int rowCount = dm.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                dm.removeRow(i);
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

            String dateChooserFrom = sdf.format(jDateChooserBACDFrom.getDate());
            String dateChooserTo = sdf.format(jDateChooserBACDTo.getDate());

            DefaultTableModel dt = (DefaultTableModel)jTableBatchwithCustomized.getModel();

            ResultSet rs = c.st.executeQuery("select attend_date as 'Attendance Date', std_id as 'Student ID', std_name as 'Student Name' , std_batch_code as 'Batch Code', std_book as 'Book', std_book_session as 'Book Session', std_status as 'Status' from std_attend where std_batch_code = '"+jComboBoxBatch.getSelectedItem()+"' and attend_date between '"+dateChooserFrom+"' and '"+dateChooserTo+"'");
            while(rs.next()){
                dt.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }
            jTableBatchwithCustomized.setModel(dt);

            ResultSet pre = c.st.executeQuery("select count(std_status) from std_attend where std_batch_code = '"+jComboBoxBatch.getSelectedItem()+"' and std_status = 'Present' and attend_date between '"+dateChooserFrom+"' and '"+dateChooserTo+"' ");
            while(pre.next()){
                jLabelBACDPresent.setText(pre.getString(1));
            }

            ResultSet abs = c.st.executeQuery("select count(std_status) from std_attend where std_batch_code = '"+jComboBoxBatch.getSelectedItem()+"' and std_status = 'Absent' and attend_date between '"+dateChooserFrom+"' and '"+dateChooserTo+"' ");
            while(abs.next()){
                jLabelBACDAbsent.setText(abs.getString(1));
            }

        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButtonGetBACDActionPerformed

    private void jButtonDatePrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDatePrintActionPerformed
        // TODO add your handling code here:

        /**
        * Print Report
        */
        try {
            MessageFormat h = new MessageFormat("Attendance Record Report");
            MessageFormat f = new MessageFormat("Attendance Management System");

            jTableDate.print(JTable.PrintMode.FIT_WIDTH, h, f);
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButtonDatePrintActionPerformed

    private void jButtonDatePdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDatePdfActionPerformed
        // TODO add your handling code here:

        /**
        * PDF Report
        */
        try {
            //BaseColor(7, 20, 42)
            Rectangle pageSize = new Rectangle(PageSize.A4.rotate());
            pageSize.setBackgroundColor(new BaseColor(135 ,206 ,250));
            pageSize.setBorder(Rectangle.BOX);
            pageSize.setBorderWidth(10f);
            Document doc = new Document(pageSize);
            PdfWriter.getInstance(doc, new FileOutputStream("DateWiseAttendanceReport.pdf"));
            doc.open();

            doc.add(new Paragraph("Attendance Reporting - Date Wise", FontFactory.getFont("Candara", 35, Font.BOLD, BaseColor.BLACK)));
            doc.add(new Paragraph(20f, Chunk.NEWLINE));

            //Creating Table
            PdfPTable datetable = new PdfPTable(4);
            /**
            * Initializing, Instantiating  and Declaring PdfPCell
            */
            //Date from
            PdfPCell from = new PdfPCell(new Paragraph("From", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            from.setPadding(10f);

            //Bring value from jLabel to cell
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String d = sdf.format(jDateChooserFrom.getDate());

            PdfPCell jdatefrom = new PdfPCell(new Paragraph(d, FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            jdatefrom.setPadding(10f);

            //Date from
            PdfPCell to = new PdfPCell(new Paragraph("To", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            to.setPadding(10f);

            //Bring value from jLabel to cell
            String todate= sdf.format(jDateChooserTo.getDate());
            PdfPCell jdateto = new PdfPCell(new Paragraph(todate, FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            jdateto.setPadding(10f);

            //Student Id Cell
            PdfPCell totalPresent = new PdfPCell(new Paragraph("Total Present", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            totalPresent.setPadding(10f);

            //Bring value from jLabel to cell
            PdfPCell PresentNo = new PdfPCell(new Paragraph(jLabelCountPresent.getText(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            PresentNo.setPadding(10f);

            //Student Id Cell
            PdfPCell totalAbsent = new PdfPCell(new Paragraph("Total Absent", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            totalAbsent.setPadding(10f);

            //Bring value from jLabel to cell
            PdfPCell AbsentNo = new PdfPCell(new Paragraph(jLabelCountAbsent.getText(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            AbsentNo.setPadding(10f);

            //Adding Rows
            datetable.addCell(from);
            datetable.addCell(jdatefrom);
            datetable.addCell(to);
            datetable.addCell(jdateto);
            datetable.addCell(totalPresent);
            datetable.addCell(PresentNo);
            datetable.addCell(totalAbsent);
            datetable.addCell(AbsentNo);

            //Adding Space
            doc.add(new Paragraph(20f, Chunk.NEWLINE));

            //Getting Table
            jTableDate.setForeground(Color.WHITE);
            PdfPTable pdfTable = new PdfPTable(jTableDate.getColumnCount());
            //adding table headers
            for (int i = 0; i < jTableDate.getColumnCount(); i++) {
                pdfTable.addCell(jTableDate.getColumnName(i));
            }
            //extracting data from the jTableForAllBatch and inserting it to PdfPTable
            for (int rows = 0; rows < jTableDate.getRowCount(); rows++) {
                for (int cols = 0; cols < jTableDate.getColumnCount(); cols++) {
                    pdfTable.addCell(jTableDate.getModel().getValueAt(rows, cols).toString());

                }
            }

            doc.add(datetable);
            //Adding Space
            doc.add(new Paragraph(20f, Chunk.NEWLINE));
            doc.add(pdfTable);
            doc.close();
            JOptionPane.showMessageDialog(null, "Attendance Report Saved");

        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_jButtonDatePdfActionPerformed

    private void jButtonDateExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDateExcelActionPerformed
        // TODO add your handling code here:

        /**
        * Excel Report
        */

        JFileChooser j = new JFileChooser();
        int i = j.showSaveDialog(this);
        System.out.println(i);
        if (i==0){
            try {
                PrintWriter p = new PrintWriter(j.getSelectedFile()+".csv");

                p.println(jTableDate.getColumnName(0)+","+jTableDate.getColumnName(1)+","+jTableDate.getColumnName(2)+","+jTableDate.getColumnName(3)+","+jTableDate.getColumnName(4)+","+jTableDate.getColumnName(5)+","+jTableDate.getColumnName(6));

                for (int x = 0; x< jTableDate.getRowCount();x++){
                    p.println(jTableDate.getValueAt(x, 0)+","+jTableDate.getValueAt(x, 1)+","+jTableDate.getValueAt(x, 2)+","+jTableDate.getValueAt(x, 3)+","+jTableDate.getValueAt(x, 4)+","+jTableDate.getValueAt(x, 5)+","+jTableDate.getValueAt(x, 6));
                }p.flush();
            }
            catch(Exception ex) {
                System.out.println(ex.toString());
            }
        }

    }//GEN-LAST:event_jButtonDateExcelActionPerformed

    private void jButtonCustomizedBatchGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustomizedBatchGetActionPerformed
        // TODO add your handling code here:
        /**
        * Custom Date Report
        */
        try {
            /**
            * Clearing Rows from jTable1
            */
            DefaultTableModel dm = (DefaultTableModel) jTableDate.getModel();
            int rowCount = dm.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                dm.removeRow(i);
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

            String dateChooserFrom = sdf.format(jDateChooserFrom.getDate());
            String dateChooserTo = sdf.format(jDateChooserTo.getDate());

            DefaultTableModel dt = (DefaultTableModel)jTableDate.getModel();

            ResultSet rs = c.st.executeQuery("select attend_date as 'Attendance Date', std_id as 'Student ID', std_name as 'Student Name' , std_batch_code as 'Batch Code', std_book as 'Book', std_book_session as 'Book Session', std_status as 'Status' from std_attend where attend_date between '"+dateChooserFrom+"' and '"+dateChooserTo+"'");
            while(rs.next()){
                dt.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }
            jTableDate.setModel(dt);

            ResultSet pre = c.st.executeQuery("select count(std_status) from std_attend where std_status = 'Present' and attend_date between '"+dateChooserFrom+"' and '"+dateChooserTo+"' ");
            while(pre.next()){
                jLabelCountPresent.setText(pre.getString(1));
            }

            ResultSet abs = c.st.executeQuery("select count(std_status) from std_attend where std_status = 'Absent' and attend_date between '"+dateChooserFrom+"' and '"+dateChooserTo+"' ");
            while(abs.next()){
                jLabelCountAbsent.setText(abs.getString(1));
            }

        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButtonCustomizedBatchGetActionPerformed

    private void jButtonBSPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBSPrintActionPerformed
        // TODO add your handling code here:
        try {
            MessageFormat h = new MessageFormat("Attendance Record");
            MessageFormat f = new MessageFormat("Attendance Management System");

            jTableBS.print(JTable.PrintMode.FIT_WIDTH, h, f);
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButtonBSPrintActionPerformed

    private void jButtonBSPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBSPDFActionPerformed
        // TODO add your handling code here:
        /**
        * Reporting in PDF File
        */
        try {
            //BaseColor(7, 20, 42)
            Rectangle pageSize = new Rectangle(PageSize.A4.rotate());
            pageSize.setBackgroundColor(new BaseColor(135 ,206 ,250));
            pageSize.setBorder(Rectangle.BOX);
            pageSize.setBorderWidth(10f);
            Document doc = new Document(pageSize);
            PdfWriter.getInstance(doc, new FileOutputStream("AdminAttendanceReport.pdf"));
            doc.open();

            doc.add(new Paragraph("Attendance Reporting", FontFactory.getFont("Candara", 35, Font.BOLD, BaseColor.BLACK)));
            doc.add(new Paragraph(20f, Chunk.NEWLINE));

            //Creating Table
            PdfPTable bstable = new PdfPTable(4);
            /**
            * Initializing, Instantiating  and Declaring PdfPCell
            */

            //title
            PdfPCell title = new PdfPCell(new Paragraph("Report For ", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            title.setPadding(10f);

            //title
            PdfPCell name = new PdfPCell(new Paragraph("Admin ", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            name.setPadding(10f);

            //Teacher
            PdfPCell teacherName = new PdfPCell(new Paragraph("Teacher Name", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            teacherName.setPadding(10f);

            //teacher Label
            PdfPCell teacherLabel = new PdfPCell(new Paragraph(jTeacherCombo.getSelectedItem().toString(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            teacherLabel.setPadding(10f);

            //Batch code
            PdfPCell batchCode = new PdfPCell(new Paragraph("Batch Code", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            batchCode.setPadding(10f);

            //batch Label
            PdfPCell batchCodeLabel = new PdfPCell(new Paragraph(jBatchCodeCombo.getSelectedItem().toString(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            batchCodeLabel.setPadding(10f);

            //Student
            PdfPCell student = new PdfPCell(new Paragraph("Student Name", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            student.setPadding(10f);

            //studentName Label
            PdfPCell studentlabel = new PdfPCell(new Paragraph(jComboStudentName.getSelectedItem().toString(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            studentlabel.setPadding(10f);

            //Present
            PdfPCell totalPresent = new PdfPCell(new Paragraph("Total Present", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            totalPresent.setPadding(10f);

            //Present Label
            PdfPCell PresentNo = new PdfPCell(new Paragraph(jLabelBGPresent.getText(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            PresentNo.setPadding(10f);

            //Absent
            PdfPCell totalAbsent = new PdfPCell(new Paragraph("Total Absent", FontFactory.getFont("Candara", 14, Font.BOLD, BaseColor.BLACK)));
            totalAbsent.setPadding(10f);

            //Absent Label
            PdfPCell AbsentNo = new PdfPCell(new Paragraph(jLabelBSAbsent.getText(), FontFactory.getFont("Candara", 14, BaseColor.BLACK)));
            AbsentNo.setPadding(10f);

            //Adding Rows
            bstable.addCell(title);
            bstable.addCell(name);
            bstable.addCell(teacherName);
            bstable.addCell(teacherLabel);
            bstable.addCell(batchCode);
            bstable.addCell(batchCodeLabel);
            bstable.addCell(student);
            bstable.addCell(studentlabel);
            bstable.addCell(totalPresent);
            bstable.addCell(PresentNo);
            bstable.addCell(totalAbsent);
            bstable.addCell(AbsentNo);

            jTableBS.setForeground(Color.WHITE);
            PdfPTable pdfTable = new PdfPTable(jTableBS.getColumnCount());
            //adding table headers
            for (int i = 0; i < jTableBS.getColumnCount(); i++) {
                pdfTable.addCell(jTableBS.getColumnName(i));
            }
            //extracting data from the JTable and inserting it to PdfPTable
            for (int rows = 0; rows < jTableBS.getRowCount(); rows++) {
                for (int cols = 0; cols < jTableBS.getColumnCount(); cols++) {
                    pdfTable.addCell(jTableBS.getModel().getValueAt(rows, cols).toString());

                }
            }
            doc.add(bstable);
            //Adding Space
            doc.add(new Paragraph(20f, Chunk.NEWLINE));

            doc.add(pdfTable);
            doc.close();
            JOptionPane.showMessageDialog(null, "Attendance Report Saved");

        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButtonBSPDFActionPerformed

    private void jButtonBSExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBSExcelActionPerformed
        // TODO add your handling code here:
        /**
        * Excel Report
        */

        JFileChooser j = new JFileChooser();
        int i = j.showSaveDialog(this);
        System.out.println(i);
        if (i==0){
            try {
                PrintWriter p = new PrintWriter(j.getSelectedFile()+".csv");

                p.println(jTableBS.getColumnName(0)+","+jTableBS.getColumnName(1)+","+jTableBS.getColumnName(2)+","+jTableBS.getColumnName(3)+","+jTableBS.getColumnName(4)+","+jTableBS.getColumnName(5)+","+jTableBS.getColumnName(6));

                for (int x = 0; x< jTableBS.getRowCount();x++){
                    p.println(jTableBS.getValueAt(x, 0)+","+jTableBS.getValueAt(x, 1)+","+jTableBS.getValueAt(x, 2)+","+jTableBS.getValueAt(x, 3)+","+jTableBS.getValueAt(x, 4)+","+jTableBS.getValueAt(x, 5)+","+jTableBS.getValueAt(x, 6));
                }p.flush();
            }
            catch(Exception ex) {
                System.out.println(ex.toString());
            }
        }

    }//GEN-LAST:event_jButtonBSExcelActionPerformed

    private void jComboStudentNamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboStudentNamePopupMenuWillBecomeInvisible
        // TODO add your handling code here:

        /**
        * Counting Absent Present
        */
        try {
            ResultSet pre = c.st.executeQuery("select count(std_status) from std_attend where std_status = 'Present' and std_batch_code = '"+jBatchCodeCombo.getSelectedItem()+"' and std_name = '"+jComboStudentName.getSelectedItem()+"'");
            while(pre.next()){
                jLabelBGPresent.setText(pre.getString(1));
            }
            ResultSet abs = c.st.executeQuery("select count(std_status) from std_attend where std_status = 'Absent' and std_batch_code = '"+jBatchCodeCombo.getSelectedItem()+"' and std_name = '"+jComboStudentName.getSelectedItem()+"'");
            while(abs.next()){
                jLabelBSAbsent.setText(abs.getString(1));
            }
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }

        /**
        * Clearing Rows from jTable1
        */

        DefaultTableModel dm = (DefaultTableModel) jTableBS.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }

        /**
        * Filling table
        */
        try {
            DefaultTableModel dt = (DefaultTableModel)jTableBS.getModel();

            ResultSet rs = c.st.executeQuery("select attend_date as 'Attendance Date', std_id as 'Student ID', std_name as 'Student Name' , std_batch_code as 'Batch Code', std_book as 'Book', std_book_session as 'Book Session', std_status as 'Status' from std_attend where std_name = '"+jComboStudentName.getSelectedItem()+"'");
            while(rs.next()){
                dt.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }
            jTableBS.setModel(dt);
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jComboStudentNamePopupMenuWillBecomeInvisible

    private void jTeacherComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTeacherComboActionPerformed
        // TODO add your handling code here:
        try{
            jBatchCodeCombo.removeAllItems();
            ResultSet rs = c.xc.createStatement().executeQuery("select batch_code from tbl_batch join tbl_teacher on tbl_batch.teacher_id = tbl_teacher.teacher_id where  tbl_teacher.teacher_name = '"+jTeacherCombo.getSelectedItem()+"'");
            while (rs.next()){
                jBatchCodeCombo.addItem(rs.getString(1));
            }
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_jTeacherComboActionPerformed

    private void jBatchCodeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatchCodeComboActionPerformed
        // TODO add your handling code here:
        try{
            jComboStudentName.removeAllItems();
            jComboStudentName.addItem("Please Select...");
            ResultSet rs = c.xc.createStatement().executeQuery("select std_name from tbl_batch join tbl_std on tbl_batch.teacher_id = tbl_std.teacher_id where std_batch_code = '"+jBatchCodeCombo.getSelectedItem()+"' group by tbl_std.std_name");
            while (rs.next()){
                jComboStudentName.addItem(rs.getString(1));
            }
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_jBatchCodeComboActionPerformed

    private void jBatchCodeComboPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jBatchCodeComboPopupMenuWillBecomeInvisible
        // TODO add your handling code here:

        /**
        * Clearing Rows from jTable1
        */

        DefaultTableModel dm = (DefaultTableModel) jTableBS.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }

        /**
        * Filling table
        */
        try {
            DefaultTableModel dt = (DefaultTableModel)jTableBS.getModel();

            ResultSet rs = c.st.executeQuery("select attend_date as 'Attendance Date', std_id as 'Student ID', std_name as 'Student Name' , std_batch_code as 'Batch Code', std_book as 'Book', std_book_session as 'Book Session', std_status as 'Status' from std_attend where std_batch_code = '"+jBatchCodeCombo.getSelectedItem()+"'");
            while(rs.next()){
                dt.addRow(new Object[] {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)});
            }
            jTableBS.setModel(dt);
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }

        BSPresentAbsent();
    }//GEN-LAST:event_jBatchCodeComboPopupMenuWillBecomeInvisible

    private void jButtonAllBatchPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllBatchPrintActionPerformed
        // TODO add your handling code here:

        /**
        * Printing Report
        */
        try {
            MessageFormat h = new MessageFormat("Attendance Record \n All Batches Report");
            MessageFormat f = new MessageFormat("Attendance Management System");

            jTableForAllBatch.print(JTable.PrintMode.FIT_WIDTH, h, f);
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_jButtonAllBatchPrintActionPerformed

    private void jButtonAllBatchPDfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllBatchPDfActionPerformed
        // TODO add your handling code here:

        /**
        * Reporting in PDF File
        */
        try {
            //BaseColor(7, 20, 42)
            Rectangle pageSize = new Rectangle(PageSize.A4.rotate());
            pageSize.setBackgroundColor(new BaseColor(135 ,206 ,250));
            pageSize.setBorder(Rectangle.BOX);
            pageSize.setBorderWidth(10f);
            Document doc = new Document(pageSize);
            PdfWriter.getInstance(doc, new FileOutputStream("AllBatchAttendanceReport.pdf"));
            doc.open();

            doc.add(new Paragraph("All Batches Attendance", FontFactory.getFont("Candara", 35, Font.BOLD, BaseColor.BLACK)));
            doc.add(new Paragraph(20f, Chunk.NEWLINE));

            jTableForAllBatch.setForeground(Color.WHITE);
            PdfPTable pdfTable = new PdfPTable(jTableForAllBatch.getColumnCount());
            //adding table headers
            for (int i = 0; i < jTableForAllBatch.getColumnCount(); i++) {
                pdfTable.addCell(jTableForAllBatch.getColumnName(i));
            }
            //extracting data from the jTableForAllBatch and inserting it to PdfPTable
            for (int rows = 0; rows < jTableForAllBatch.getRowCount(); rows++) {
                for (int cols = 0; cols < jTableForAllBatch.getColumnCount(); cols++) {
                    pdfTable.addCell(jTableForAllBatch.getModel().getValueAt(rows, cols).toString());

                }
            }
            doc.add(pdfTable);
            doc.close();
            JOptionPane.showMessageDialog(null, "Attendance Report Saved");

        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButtonAllBatchPDfActionPerformed

    private void jButtonAllBatchExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllBatchExcelActionPerformed
        // TODO add your handling code here:

        /**
        * Excel Report
        */

        JFileChooser j = new JFileChooser();
        int i = j.showSaveDialog(this);
        System.out.println(i);
        if (i==0){
            try {
                PrintWriter p = new PrintWriter(j.getSelectedFile()+".csv");

                p.println(jTableForAllBatch.getColumnName(0)+","+jTableForAllBatch.getColumnName(1)+","+jTableForAllBatch.getColumnName(2)+","+jTableForAllBatch.getColumnName(3)+","+jTableForAllBatch.getColumnName(4)+","+jTableForAllBatch.getColumnName(5)+","+jTableForAllBatch.getColumnName(6));

                for (int x = 0; x< jTableForAllBatch.getRowCount();x++){
                    p.println(jTableForAllBatch.getValueAt(x, 0)+","+jTableForAllBatch.getValueAt(x, 1)+","+jTableForAllBatch.getValueAt(x, 2)+","+jTableForAllBatch.getValueAt(x, 3)+","+jTableForAllBatch.getValueAt(x, 4)+","+jTableForAllBatch.getValueAt(x, 5)+","+jTableForAllBatch.getValueAt(x, 6));
                }p.flush();
            }
            catch(Exception ex) {
                System.out.println(ex.toString());
            }
        }

    }//GEN-LAST:event_jButtonAllBatchExcelActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jBatchCodeCombo;
    private javax.swing.JButton jButtonAllBatchExcel;
    private javax.swing.JButton jButtonAllBatchPDf;
    private javax.swing.JButton jButtonAllBatchPrint;
    private javax.swing.JButton jButtonBSExcel;
    private javax.swing.JButton jButtonBSPDF;
    private javax.swing.JButton jButtonBSPrint;
    private javax.swing.JButton jButtonCustomizedBatchGet;
    private javax.swing.JButton jButtonDateExcel;
    private javax.swing.JButton jButtonDatePdf;
    private javax.swing.JButton jButtonDatePrint;
    private javax.swing.JButton jButtonExcelBACD;
    private javax.swing.JButton jButtonGetBACD;
    private javax.swing.JButton jButtonPDFBACD;
    private javax.swing.JButton jButtonPrintBACD;
    private javax.swing.JComboBox<String> jComboBoxBatch;
    private javax.swing.JComboBox<String> jComboStudentName;
    private com.toedter.calendar.JDateChooser jDateChooserBACDFrom;
    private com.toedter.calendar.JDateChooser jDateChooserBACDTo;
    private com.toedter.calendar.JDateChooser jDateChooserFrom;
    private com.toedter.calendar.JDateChooser jDateChooserTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAllBatchAttendanceBG;
    private javax.swing.JLabel jLabelBACD;
    private javax.swing.JLabel jLabelBACDAbsent;
    private javax.swing.JLabel jLabelBACDPresent;
    private javax.swing.JLabel jLabelBGPresent;
    private javax.swing.JLabel jLabelBSAbsent;
    private javax.swing.JLabel jLabelBatchStudentPanel;
    private javax.swing.JLabel jLabelCountAbsent;
    private javax.swing.JLabel jLabelCountPresent;
    private javax.swing.JLabel jLabelDateBG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableBS;
    private javax.swing.JTable jTableBatchwithCustomized;
    private javax.swing.JTable jTableDate;
    private javax.swing.JTable jTableForAllBatch;
    private javax.swing.JComboBox<String> jTeacherCombo;
    // End of variables declaration//GEN-END:variables
}
