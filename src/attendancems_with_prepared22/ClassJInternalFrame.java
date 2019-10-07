/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancems_with_prepared22;

import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Iqbal-Asi
 */
public class ClassJInternalFrame extends javax.swing.JInternalFrame {

    ConnectClass c;

    /**
     * Creates new form ClassJInternalFrame
     */
    public ClassJInternalFrame() {
        initComponents();
        c = new ConnectClass();

        //JOption Font
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Candara", Font.PLAIN, 17)));

        ImageIcon icon = new ImageIcon("/attendancems_with_prepared22/Project_Images/Logo.png");
        this.setFrameIcon(icon);
        setResizable(false);
        setTitle("Class Attendance");

        selectFromCombo();

        semester();

        AbsentSemester();

        ClassAttendanceTable.setSelectionForeground(Color.WHITE);
        jTableAbsent.setSelectionForeground(Color.WHITE);

        jPanelForAbsent.setVisible(false);

        bookName();
    }

    /**
     * clearing table
     */
    public void clearingTable() {
        /**
         * Clearing Rows from jTable1
         */
        DefaultTableModel dm = (DefaultTableModel) ClassAttendanceTable.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }

    /**
     * Absentees dAta
     */
    public void clearingAbsent() {
        /**
         * Clearing Rows from jTable1
         */
        DefaultTableModel dt = (DefaultTableModel) jTableAbsent.getModel();
        int rowCount = dt.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dt.removeRow(i);
        }
    }

    /**
     * semester NAme Label
     */
    public void semester() {
        try {
            ResultSet rs = c.st.executeQuery("select semester_name from tbl_batch where batch_code ='" + jLabelbatchCode.getText() + "'");
            while (rs.next()) {
                jLabelSemester.setText(rs.getString(1));
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * Semester Books
     */
    public void bookName() {
        try {
            jComboBoxBook.addItem("Please Select Book...");
            ResultSet rs = c.st.executeQuery("select semester_book from tbl_book where semester_name = '" + jLabelSemester.getText() + "' group by semester_book");
            while (rs.next()) {
                jComboBoxBook.addItem(rs.getString(1));
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    /**
     * Batch Code from TeacherFrame
     */
    public void selectFromCombo() {
        try {

            String getValue = (String) TeacherInternalFrame.getComboBox().getSelectedItem();

            PreparedStatement pst = c.xc.prepareStatement("select batch_code from tbl_batch join tbl_teacher on tbl_batch.teacher_id = tbl_teacher.teacher_id where tbl_teacher.teacher_name = ?");
            pst.setString(1, TeacherInternalFrame.teacherNameLabel.getText());
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                jLabelbatchCode.setText(getValue);
                jLabelBatchCodeAbsent.setText(getValue);

            }
        } catch (Exception ex) {
            System.out.println(ex.toString());

        }
    }

    /**
     * Clearing fields
     */
    public void clearing() {
        jComboBoxBook.setSelectedIndex(0);
        jComboBoxSession.setSelectedIndex(0);
        jDateChooser1.setCalendar(null);
        jLabelAbsentsession.setText("");
        jLabelAbsentbook.setText("");
        jDateChooser2.setCalendar(null);
    }

    /**
     * Absentees Semester Name
     */
    public void AbsentSemester() {
        try {
            ResultSet rs = c.st.executeQuery("select semester_name from tbl_batch where batch_code = '" + jLabelBatchCodeAbsent.getText() + "'");
            while (rs.next()) {
                jLabelAbsentsemester.setText(rs.getString(1));
            }
        } catch (Exception ex) {
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

        jPanelForPresent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClassAttendanceTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ClassAttendanceButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelbatchCode = new javax.swing.JLabel();
        TableButton = new javax.swing.JButton();
        AbsenteesButton = new javax.swing.JButton();
        jComboBoxBook = new javax.swing.JComboBox<>();
        jComboBoxSession = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabelSemester = new javax.swing.JLabel();
        ClassAttendanceBG = new javax.swing.JLabel();
        jPanelForAbsent = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabelBatchCodeAbsent = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButtonabsentTable = new javax.swing.JButton();
        jButtonMarkAbsentPresent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAbsent = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelAbsentsemester = new javax.swing.JLabel();
        jLabelAbsentbook = new javax.swing.JLabel();
        jLabelAbsentsession = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jLabelAbsentPAnelBG = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(800, 550));
        setMinimumSize(new java.awt.Dimension(800, 550));
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(null);

        jPanelForPresent.setLayout(null);

        ClassAttendanceTable.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        ClassAttendanceTable.setForeground(new java.awt.Color(255, 255, 255));
        ClassAttendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Student Name", "Student Batch", "Attendance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ClassAttendanceTable.setOpaque(false);
        ClassAttendanceTable.setOpaque(false);
        ((DefaultTableCellRenderer)ClassAttendanceTable.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        ((JComponent) ClassAttendanceTable.getDefaultRenderer(Boolean.class)).setOpaque(false);

        ClassAttendanceTable.setShowGrid(false);
        jScrollPane1.setViewportView(ClassAttendanceTable);

        jPanelForPresent.add(jScrollPane1);
        jScrollPane1.setBounds(20, 300, 750, 200);

        jLabel1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Batch Code");
        jPanelForPresent.add(jLabel1);
        jLabel1.setBounds(150, 30, 100, 30);

        jLabel2.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Semester Name");
        jPanelForPresent.add(jLabel2);
        jLabel2.setBounds(150, 70, 100, 30);

        jLabel3.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book");
        jPanelForPresent.add(jLabel3);
        jLabel3.setBounds(150, 110, 100, 30);

        ClassAttendanceButton.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        ClassAttendanceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/marked.png"))); // NOI18N
        ClassAttendanceButton.setAutoscrolls(true);
        ClassAttendanceButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClassAttendanceButton.setOpaque(false);
        ClassAttendanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassAttendanceButtonActionPerformed(evt);
            }
        });
        jPanelForPresent.add(ClassAttendanceButton);
        ClassAttendanceButton.setBounds(320, 250, 110, 30);

        jLabel4.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Session");
        jPanelForPresent.add(jLabel4);
        jLabel4.setBounds(150, 150, 100, 30);

        jLabelbatchCode.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabelbatchCode.setForeground(new java.awt.Color(255, 255, 255));
        jPanelForPresent.add(jLabelbatchCode);
        jLabelbatchCode.setBounds(290, 30, 240, 30);

        TableButton.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        TableButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/table.png"))); // NOI18N
        TableButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TableButton.setOpaque(false);
        TableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableButtonActionPerformed(evt);
            }
        });
        jPanelForPresent.add(TableButton);
        TableButton.setBounds(180, 250, 110, 30);

        AbsenteesButton.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        AbsenteesButton.setText("Mark Absent Student Attendance");
        AbsenteesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AbsenteesButton.setOpaque(false);
        AbsenteesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbsenteesButtonActionPerformed(evt);
            }
        });
        jPanelForPresent.add(AbsenteesButton);
        AbsenteesButton.setBounds(570, 250, 210, 40);

        jComboBoxBook.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jComboBoxBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBookActionPerformed(evt);
            }
        });
        jPanelForPresent.add(jComboBoxBook);
        jComboBoxBook.setBounds(290, 110, 300, 30);

        jComboBoxSession.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jComboBoxSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSessionActionPerformed(evt);
            }
        });
        jPanelForPresent.add(jComboBoxSession);
        jComboBoxSession.setBounds(290, 150, 240, 30);

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanelForPresent.add(jDateChooser1);
        jDateChooser1.setBounds(290, 190, 240, 30);

        jLabel6.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date");
        jPanelForPresent.add(jLabel6);
        jLabel6.setBounds(150, 194, 70, 30);

        jLabelSemester.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabelSemester.setForeground(new java.awt.Color(240, 240, 240));
        jPanelForPresent.add(jLabelSemester);
        jLabelSemester.setBounds(290, 70, 240, 30);

        ClassAttendanceBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/FrameBG.png"))); // NOI18N
        jPanelForPresent.add(ClassAttendanceBG);
        ClassAttendanceBG.setBounds(0, 0, 785, 520);

        getContentPane().add(jPanelForPresent);
        jPanelForPresent.setBounds(0, 0, 785, 520);

        jPanelForAbsent.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Batch Code");
        jPanelForAbsent.add(jLabel5);
        jLabel5.setBounds(150, 30, 120, 30);

        jLabelBatchCodeAbsent.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabelBatchCodeAbsent.setForeground(new java.awt.Color(240, 240, 240));
        jPanelForAbsent.add(jLabelBatchCodeAbsent);
        jLabelBatchCodeAbsent.setBounds(290, 30, 240, 30);

        jDateChooser2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser2PropertyChange(evt);
            }
        });
        jPanelForAbsent.add(jDateChooser2);
        jDateChooser2.setBounds(290, 70, 240, 30);

        jButtonabsentTable.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jButtonabsentTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/table.png"))); // NOI18N
        jButtonabsentTable.setBorderPainted(false);
        jButtonabsentTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonabsentTable.setOpaque(false);
        jButtonabsentTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonabsentTableActionPerformed(evt);
            }
        });
        jPanelForAbsent.add(jButtonabsentTable);
        jButtonabsentTable.setBounds(210, 250, 110, 30);

        jButtonMarkAbsentPresent.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jButtonMarkAbsentPresent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/marked.png"))); // NOI18N
        jButtonMarkAbsentPresent.setBorderPainted(false);
        jButtonMarkAbsentPresent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMarkAbsentPresent.setOpaque(false);
        jButtonMarkAbsentPresent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarkAbsentPresentActionPerformed(evt);
            }
        });
        jPanelForAbsent.add(jButtonMarkAbsentPresent);
        jButtonMarkAbsentPresent.setBounds(390, 250, 110, 30);

        jTableAbsent.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jTableAbsent.setForeground(new java.awt.Color(255, 255, 255));
        jTableAbsent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Student Name", "Student Batch", "Attendance Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableAbsent.setOpaque(false);
        ((DefaultTableCellRenderer)jTableAbsent.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);

        ((JComponent) jTableAbsent.getDefaultRenderer(Boolean.class)).setOpaque(false);

        jTableAbsent.setShowGrid(false);
        jScrollPane2.setViewportView(jTableAbsent);

        jPanelForAbsent.add(jScrollPane2);
        jScrollPane2.setBounds(20, 300, 750, 200);

        jLabel10.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Date");
        jPanelForAbsent.add(jLabel10);
        jLabel10.setBounds(150, 70, 120, 30);

        jLabel7.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Semester");
        jPanelForAbsent.add(jLabel7);
        jLabel7.setBounds(150, 110, 120, 30);

        jLabel8.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Book");
        jPanelForAbsent.add(jLabel8);
        jLabel8.setBounds(150, 150, 120, 30);

        jLabel9.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Session");
        jPanelForAbsent.add(jLabel9);
        jLabel9.setBounds(150, 190, 120, 30);

        jLabelAbsentsemester.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabelAbsentsemester.setForeground(new java.awt.Color(255, 255, 255));
        jPanelForAbsent.add(jLabelAbsentsemester);
        jLabelAbsentsemester.setBounds(290, 110, 380, 30);

        jLabelAbsentbook.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabelAbsentbook.setForeground(new java.awt.Color(255, 255, 255));
        jPanelForAbsent.add(jLabelAbsentbook);
        jLabelAbsentbook.setBounds(290, 150, 430, 30);

        jLabelAbsentsession.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabelAbsentsession.setForeground(new java.awt.Color(255, 255, 255));
        jPanelForAbsent.add(jLabelAbsentsession);
        jLabelAbsentsession.setBounds(290, 190, 380, 30);

        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/back.png"))); // NOI18N
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanelForAbsent.add(jButtonBack);
        jButtonBack.setBounds(10, 30, 50, 20);

        jLabelAbsentPAnelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/FrameBG.png"))); // NOI18N
        jPanelForAbsent.add(jLabelAbsentPAnelBG);
        jLabelAbsentPAnelBG.setBounds(0, 0, 785, 520);

        getContentPane().add(jPanelForAbsent);
        jPanelForAbsent.setBounds(0, 0, 785, 520);

        setBounds(0, 0, 800, 550);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * These Events are for Marking new Student Attendance
     *
     * @param evt
     */

    private void TableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableButtonActionPerformed
        // TODO add your handling code here:
        /**
         * Retrieving data from database
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String d = sdf.format(jDateChooser1.getDate());

        try {
            CallableStatement call = c.xc.prepareCall("{ call myproc( ? , ?) }");
            call.setString(1, d);
            call.setString(2, jLabelbatchCode.getText());
            ResultSet rs = call.executeQuery();

            DefaultTableModel dt = (DefaultTableModel) ClassAttendanceTable.getModel();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getString("std_id"), rs.getString("std_name"), rs.getString("std_batch_code"), false});
            }
            ClassAttendanceTable.setModel(dt);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Attendance is already Marked", "Choosen Marked Date", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_TableButtonActionPerformed

    private void AbsenteesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbsenteesButtonActionPerformed
        // TODO add your handling code here:
        /**
         * This Button is for retrieving absent student data
         */

        jPanelForAbsent.setVisible(true);
        jPanelForPresent.setVisible(false);

    }//GEN-LAST:event_AbsenteesButtonActionPerformed

    private void jComboBoxBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBookActionPerformed
        // TODO add your handling code here:
        try {
            jComboBoxSession.removeAllItems();
            jComboBoxSession.addItem("Please Select....");
            ResultSet rs = c.xc.createStatement().executeQuery("select std_book_session from tbl_book where semester_book = '" + jComboBoxBook.getSelectedItem() + "' group by std_book_session");
            while (rs.next()) {
                jComboBoxSession.addItem(rs.getString(1));
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jComboBoxBookActionPerformed

    private void ClassAttendanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassAttendanceButtonActionPerformed
        // TODO add your handling code here:

        /**
         * Casting the jDateChooser with the help of SimpleDateFormat Variable d
         * is pass to get the date and save it in database
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String d = sdf.format(jDateChooser1.getDate());

        try {
            for (int i = 0; i < ClassAttendanceTable.getRowCount(); i++) {
                String id = ClassAttendanceTable.getModel().getValueAt(i, 0).toString();
                String name = ClassAttendanceTable.getModel().getValueAt(i, 1).toString();
                String result;

                boolean attendance = Boolean.parseBoolean(ClassAttendanceTable.getModel().getValueAt(i, 3).toString());

                if (attendance) {
                    result = "Present";
                } else {
                    result = "Absent";
                }
                c.st.executeUpdate("insert into std_attend values ('" + d + "','" + id + "','" + name + "','" + jLabelbatchCode.getText() + "','" + jComboBoxBook.getSelectedItem() + "','" + jComboBoxSession.getSelectedItem() + "','" + result + "')");

            }
            JOptionPane.showMessageDialog(this, "Attendance Marked", "Notify", JOptionPane.PLAIN_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(jPanelForPresent, "Something went wrong", "Error", JOptionPane.ERROR_MESSAGE);
        }
        clearingTable();
        clearing();
    }//GEN-LAST:event_ClassAttendanceButtonActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:

        /**
         * Restricting Using from Marking Attendance on future date
         */
        try {
            //JDateChooser Format
            SimpleDateFormat comparedate = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String finaldate = comparedate.format(jDateChooser1.getDate());

            //Current Date Formats
            DateFormat dateFormatcurrrent = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String matchdate = dateFormatcurrrent.format(date);

            if (finaldate.compareTo(matchdate) > 0) {
                JOptionPane.showMessageDialog(null, "Your can't mark attendance on Future Date", "Future Date", JOptionPane.WARNING_MESSAGE);
                ClassAttendanceButton.setEnabled(false);
            } else {
                ClassAttendanceButton.setEnabled(true);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_jDateChooser1PropertyChange

    /**
     * These Events are for Absent Students
     *
     * @param evt
     */

    private void jButtonabsentTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonabsentTableActionPerformed
        // TODO add your handling code here:

        /**
         * Retrieving data from database
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String d = sdf.format(jDateChooser2.getDate());

        clearingAbsent();
        try {
            DefaultTableModel dt = (DefaultTableModel) jTableAbsent.getModel();

            ResultSet rs = c.st.executeQuery("select * from std_attend where attend_date = '" + d + "' and std_batch_code = '" + jLabelBatchCodeAbsent.getText() + "' and std_status = 'Absent'");

            while (rs.next()) {
                dt.addRow(new Object[]{rs.getString("std_id"), rs.getString("std_name"), rs.getString("std_batch_code"), false});
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }//GEN-LAST:event_jButtonabsentTableActionPerformed

    private void jButtonMarkAbsentPresentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarkAbsentPresentActionPerformed
        // TODO add your handling code here:
        /**
         * Casting the jDateChooser with the help of SimpleDateFormat Variable d
         * is pass to get the date and save it in database
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String d = sdf.format(jDateChooser2.getDate());
        try {

            for (int i = 0; i < jTableAbsent.getRowCount(); i++) {
                String id = jTableAbsent.getModel().getValueAt(i, 0).toString();
                String result;

                boolean attendance = Boolean.parseBoolean(jTableAbsent.getModel().getValueAt(i, 3).toString());

                if (attendance) {
                    result = "Present";
                } else {
                    result = "Absent";
                }
                c.st.executeUpdate("Update std_attend set std_status = '" + result + "' where std_id = '" + id + "' and attend_date = '" + d + "'");

            }

            JOptionPane.showMessageDialog(this, "Present is marked on " + d, "Absentees Attendnace", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        clearingAbsent();
        clearing();

    }//GEN-LAST:event_jButtonMarkAbsentPresentActionPerformed

    private void jDateChooser2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser2PropertyChange
        // TODO add your handling code here:
        /**
         * Restricting Using from Marking Attendance on future date
         */
        try {
            //JDateChooser Format
            SimpleDateFormat comparedate = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String finaldate = comparedate.format(jDateChooser2.getDate());

            //Current Date Formats
            DateFormat dateFormatcurrrent = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String matchdate = dateFormatcurrrent.format(date);

            if (finaldate.compareTo(matchdate) > 0) {
                JOptionPane.showMessageDialog(null, "Your can't mark attendance on Future Date", "Future Date", JOptionPane.ERROR_MESSAGE);
                jButtonMarkAbsentPresent.setEnabled(false);
            } else {
                jButtonMarkAbsentPresent.setEnabled(true);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

        /**
         * Book Name and Session
         */
        try {
            //JDateChooser Format
            SimpleDateFormat comparedate = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String d = comparedate.format(jDateChooser2.getDate());

            ResultSet rs = c.st.executeQuery("select std_book, std_book_session from std_attend where attend_date = '" + d + "' and std_batch_code = '" + jLabelBatchCodeAbsent.getText() + "' group by std_book , std_book_session");
            while (rs.next()) {
                jLabelAbsentbook.setText(rs.getString(1));
                jLabelAbsentsession.setText(rs.getString(2));
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }


    }//GEN-LAST:event_jDateChooser2PropertyChange

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:

        /**
         * This Button is for going back on ark attendance page
         */
        jPanelForPresent.setVisible(true);
        jPanelForAbsent.setVisible(false);
        clearing();
        clearingAbsent();

    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jComboBoxSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSessionActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jComboBoxSessionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbsenteesButton;
    private javax.swing.JLabel ClassAttendanceBG;
    private javax.swing.JButton ClassAttendanceButton;
    private javax.swing.JTable ClassAttendanceTable;
    private javax.swing.JButton TableButton;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonMarkAbsentPresent;
    private javax.swing.JButton jButtonabsentTable;
    private javax.swing.JComboBox<String> jComboBoxBook;
    private javax.swing.JComboBox<String> jComboBoxSession;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAbsentPAnelBG;
    private javax.swing.JLabel jLabelAbsentbook;
    private javax.swing.JLabel jLabelAbsentsemester;
    private javax.swing.JLabel jLabelAbsentsession;
    private javax.swing.JLabel jLabelBatchCodeAbsent;
    private javax.swing.JLabel jLabelSemester;
    private javax.swing.JLabel jLabelbatchCode;
    private javax.swing.JPanel jPanelForAbsent;
    private javax.swing.JPanel jPanelForPresent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAbsent;
    // End of variables declaration//GEN-END:variables

}
