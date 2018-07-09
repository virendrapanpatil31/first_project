/*
 Border Layout Demo
 */
package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;


public class BorderLayoutDemo {

    private final JButton btnNorth;
    private final JButton btnSouth;
    private final JButton btnWest;
    private final JButton btnEast;
    private final JButton btnCenter;
    private final JFrame aFrame;

    public BorderLayoutDemo() {
        aFrame = new JFrame("Border Demo");
        btnNorth = new JButton("North Region");
        btnSouth = new JButton("South Region");
        btnEast = new JButton("East");
        btnWest = new JButton("West");
        btnCenter = new JButton("Center");

    }

    public void launchFrame() {
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aFrame.setLocation(200, 100);
        aFrame.setSize(new Dimension(400, 400));
        btnNorth.setPreferredSize(new Dimension(110, 30));
        btnEast.setPreferredSize(new Dimension(110, 30));
        btnWest.setPreferredSize(new Dimension(110, 30));
        btnCenter.setPreferredSize(new Dimension(110, 30));
        btnSouth.setPreferredSize(new Dimension(110, 30));
        Container contentPane = aFrame.getContentPane();
   //    JPanel contentPane = new JPanel();
 
        contentPane.setBackground(Color.RED);

//        contentPane.setLayout(new BorderLayout());
        contentPane.setLayout(new BorderLayout(10, 10));

        contentPane.add(btnNorth, BorderLayout.NORTH);
        contentPane.add(btnSouth, BorderLayout.SOUTH);
        contentPane.add(btnWest, BorderLayout.WEST);
        contentPane.add(btnEast, BorderLayout.EAST);
        Border border = BorderFactory.createLoweredBevelBorder();
        btnCenter.setBorder(border);
        contentPane.add(btnCenter, BorderLayout.CENTER);

      //  aFrame.setContentPane(contentPane);
        aFrame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BorderLayoutDemo myApp = new BorderLayoutDemo();
        myApp.launchFrame();
    }

}
