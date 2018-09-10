package com.omotyliu;

import java.io.*;
import java.util.*;
import org.apache.commons.lang3.*;


public class MainMenuWindow
{

    private String format;

    public MainMenuWindow()
    {
        List<String> lines = new FileLoader().getFiles("MainMenu");
        format = StringUtils.join(lines, "\n");
    }

    public void write()
    {
        System.out.println(String.format(format, "new Game", "Continue"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
