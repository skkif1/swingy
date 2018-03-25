package com.omotyliu.swingy.ui;

import javax.swing.*;
import java.awt.*;

public class MainMenuPanel extends JPanel
{

    private static final String BUTTONS[] = {"create player", "choose player"};

    private static Dimension buttonSize = new Dimension(150, 100);

    private static Color buttonColor = new Color(255);

    public MainMenuPanel()
    {

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        for (String button : BUTTONS)
        {
            JButton jbutton = new JButton(button);
            jbutton.setPreferredSize(buttonSize);
            jbutton.setBackground(buttonColor);
            jbutton.setContentAreaFilled(false);
            jbutton.setOpaque(true);
            jbutton.setVisible(true);
            this.add(jbutton);
        }
    }

}
