package view;

import javax.swing.*;

public class MyWindown extends JFrame {
    public MyWindown() {

    }
    public void shows(){
        this.setVisible(true);
    }
    public void shows(String title){
        this.setTitle(title);
        this.setVisible(true);
    }
    public void shows(String title, int weight, int height){
        this.setTitle(title);
        this.setSize(weight,height);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyWindown m1 = new MyWindown();
        m1.shows();
        MyWindown m2 = new MyWindown();
        m2.shows("Windown 2");
        MyWindown m3 = new MyWindown();
        m3.shows("Windown3",600,400);
    }

}
