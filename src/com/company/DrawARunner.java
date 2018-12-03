package com.company;

public class DrawARunner
{
    public static void main(String[] args)
    {
        String[][] face = new String[5][5];
        DrawAFace facey = new DrawAFace(face);
        facey.fill("x");
        facey.edit(" ",0,0);
        facey.edit(" ",0,4);
        facey.edit("x",0,3);
        facey.edit("x",1,4);
        facey.edit("o",2,1);
        facey.edit("o",2,3);
        facey.edit("O",3,2);
        facey.edit("U",2,2);
        facey.edit(" ",4,0);
        facey.edit(" ",4,4);
        facey.edit("x",0,2);
        facey.edit("-",1,1);
        facey.edit("-",1,3);
        System.out.println(facey);
    }
}
