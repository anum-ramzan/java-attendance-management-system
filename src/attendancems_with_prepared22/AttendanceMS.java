/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancems_with_prepared22;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Iqbal-Asi
 */
public class AttendanceMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    JFrame frame = new JFrame("Test");

    final BufferedImage image = ImageIO.read(new URL("C://Users/Iqbal-Asi/Documents/NetBeansProjects/AttendanceMS with_Prepared2/src/attendancems_with_prepared22/Project_Images/FrameBG.png"));

    JTable table = new JTable(16, 3) {{
        setOpaque(false);
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {{
            setOpaque(false);
        }});
    }};

    frame.add(new JScrollPane(table) {{
            setOpaque(false);
            getViewport().setOpaque(false);
        }
        @Override
        protected void paintComponent(Graphics g) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            super.paintComponent(g);
        }

    });
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}
}