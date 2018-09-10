package com.omotyliu;



public class WindowElement
{
    private char [][] element;

    private String text;

    private String type;

    private int size;

    private char sign;

    public int getSize() {
        return size;
    }

    public WindowElement(String text, String type, int size, char sign) {
        this.text = text;
        this.type = type;
        this.size = size;
        this.sign = sign;
    }

    public void build()
    {
        if (type.equals("rec"))
        {
            createRectangle();
        }
    }

    private void createRectangle()
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if (i == 0 && j > 0)
                    element[i][j] = sign;
            }
        }
    }


}


