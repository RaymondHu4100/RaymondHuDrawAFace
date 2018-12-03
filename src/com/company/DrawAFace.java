package com.company;

public class DrawAFace
{
    private String[][] face;

    public DrawAFace(String[][] face)
    {
        this.face = face;
    }
    public void fill(String str)
    {
        for(int x = 0; x < face.length; x++)
        {
            for(int y = 0; y < face[x].length; y++)
            {
                face[x][y] = str;
            }
        }
    }
    public void edit(String replace, int row, int column)
    {
        face[row][column] = replace;
    }
    public String toString()
    {
        String facey = "";
        for(int row = 0; row < face.length; row++)
        {
            for(int column = 0; column < face[row].length; column++)
            {
                facey = facey + face[row][column];
            }
            facey = facey + "\n";
        }
        return facey;
    }
}

