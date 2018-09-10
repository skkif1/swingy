package com.omotyliu;

import java.io.*;
import java.nio.*;
import java.util.*;

public class FileLoader
{
    public List<String> getFiles(String fileName)
    {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource("resources/" + fileName).getFile());
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            lines = new ArrayList<>();
            String temp;

            while ((temp = reader.readLine()) != null) {
                lines.add(temp);
            }
        } catch (IOException e) {
            System.out.println("file was not found " + fileName);
        }

        return lines;
    }
}
