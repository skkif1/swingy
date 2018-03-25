package com.omotyliu.swingy.ui;


import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame
{

    private static Dimension windowSize = new Dimension(1024, 950);

    public MainWindow()
    {
        setPreferredSize(windowSize);
        add(new ChoosePlayerPanel());
        setLocationRelativeTo(null);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) throws InterruptedException {
        MainWindow main = new MainWindow();
        Thread.sleep(1000);
    }


}
