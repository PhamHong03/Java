package view;

import javax.swing.*;
import java.awt.*;

public class ViDu_BorderLayout extends JFrame {
    public ViDu_BorderLayout() {
        this.setTitle("ViDu_BorderLayout");
        this.setSize(600,400);
        this.setLocationRelativeTo(null); // can giua cua so chuong trinh

        // Set layout
        BorderLayout borderLayout = new BorderLayout();
        BorderLayout borderLayout2 = new BorderLayout(50,50);


        this.setLayout(borderLayout);
        this.setLayout(borderLayout2);
        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");
        JButton jButton5 = new JButton("5");

        // add thanh phan
        this.add(jButton1, BorderLayout.NORTH);
        this.add(jButton2,BorderLayout.SOUTH);
        this.add(jButton3,BorderLayout.WEST);
        this.add(jButton4,BorderLayout.EAST);
        this.add(jButton5,BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new ViDu_BorderLayout();

    }

}
