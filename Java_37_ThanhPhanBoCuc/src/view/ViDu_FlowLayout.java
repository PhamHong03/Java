package view;

import javax.swing.*;
import java.awt.*;

public class ViDu_FlowLayout  extends JFrame {
    public ViDu_FlowLayout() {
        this.setTitle("ViDu_FLowLayout");
        this.setSize(600,400);
        this.setLocationRelativeTo(null); // can giua cua so chuong trinh

        // Set layout
        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER, 50 ,50);


//        this.setLayout(flowLayout);
//        this.setLayout(flowLayout_1);
        this.setLayout(flowLayout_2);
        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");

        // add thanh phan
        this.add(jButton1);
        this.add(jButton2);
        this.add(jButton3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new ViDu_FlowLayout();

    }

}
