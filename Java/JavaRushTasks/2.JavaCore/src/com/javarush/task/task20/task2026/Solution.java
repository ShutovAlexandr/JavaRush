package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int rectangleCount = 0;
        int countI = 1;
        int countJ = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 1) {
                    a = getRectangle(i, j, a);
                    rectangleCount++;
                }
            }
        }
        return rectangleCount;
    }

    public static byte[][] getRectangle(int i, int j, byte[][] a) {
        byte[][] copyA = a;
        int iForSearch = i;
        copyA[iForSearch][j] = 0;
        while (iForSearch != copyA.length && iForSearch+1 != copyA.length && copyA[iForSearch+1][j] == 1) {
            iForSearch++;
            copyA[iForSearch][j] = 0;

        }

        int jForSearch = j;
        while (jForSearch != copyA[i].length && jForSearch+1 != copyA[i].length && copyA[i][jForSearch+1] == 1) {
            jForSearch++;
            copyA[i][jForSearch] = 0;
            getRectangle(i, jForSearch, copyA);
        }
        return copyA;
    }
}
