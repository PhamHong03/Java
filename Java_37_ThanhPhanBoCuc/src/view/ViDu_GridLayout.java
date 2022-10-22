package view;

import javax.swing.*;
import java.awt.*;

public class ViDu_GridLayout extends JFrame {
    public ViDu_GridLayout() {
        this.setTitle("ViDu_GridLayout");
        this.setSize(600,400);
        this.setLocationRelativeTo(null); // can giua cua so chuong trinh

        // Set layout
        GridLayout gridLayout = new GridLayout();
        GridLayout gridLayout1 = new GridLayout(4,4);
        GridLayout gridLayout2 = new GridLayout(4,4,25,25);


//        this.setLayout(gridLayout);
//        this.setLayout(gridLayout1);
        this.setLayout(gridLayout2);

//        JButton jButton1 = new JButton("1");
//        JButton jButton2 = new JButton("2");
//        JButton jButton3 = new JButton("3");
        for(int i=0;i<16;i++){
            JButton jButton1 = new JButton(i+"");
            this.add(jButton1);
        }
        // add thanh phan
//        this.add(jButton1);
//        this.add(jButton2);
//        this.add(jButton3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new ViDu_GridLayout();

    }

}
