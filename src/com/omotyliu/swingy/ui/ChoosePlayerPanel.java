package com.omotyliu.swingy.ui;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ChoosePlayerPanel extends JPanel
{

    private static String[] temp = {"player1", "player2",  "player3"};

    private static JPanel playerInfoPanel = new JPanel();

    private static Map<String, String> nameValueTextFields;


    static {
        nameValueTextFields = new HashMap<>();
        nameValueTextFields.put("name", "name Value");
        nameValueTextFields.put("name1", "name Value1");

    }

    public ChoosePlayerPanel()
    {
        JList playerList = new JList(temp);
        playerList.setVisible(true);
        playerList.setLayoutOrientation(JList.VERTICAL);
        initPlayerPanel();
        add(playerInfoPanel);
        add(playerList);
    }


    private void initPlayerPanel()
    {
        playerInfoPanel.setLayout(new FlowLayout());
        for (Map.Entry<String, String> nameValue : nameValueTextFields.entrySet())
        {
            JLabel label = new JLabel(nameValue.getKey());
            JTextField field = new JTextField(nameValue.getValue());
            playerInfoPanel.add(label, FlowLayout.LEFT);
            playerInfoPanel.add(field, FlowLayout.CENTER);
        }
    }
}
