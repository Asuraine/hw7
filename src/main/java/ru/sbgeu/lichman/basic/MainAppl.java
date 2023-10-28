package ru.sbgeu.lichman.basic;

import java.util.Arrays;

public class MainAppl {
    public static int SIZE_X;
    public static int SIZE_Y;

    public static void main(String[] args) {

        int[][] array = new int[10][10];
        SIZE_Y = 6;
        SIZE_X = 4;
        int[][] size1 = new int[SIZE_X][SIZE_Y];
        randomArray(array);
        System.out.println(sumPositiveElement(randomArray(array)));
        stars(size1);
        dioganal(array);
        dioganalSer(array);
        System.out.println(findMax(array));
        System.out.println(sumArray(array));

        // System.out.println(sumArray(array));

    }

    public static int sumPositiveElement(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }


    public static int[][] randomArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        return array;
    }

    public static void stars(int[][] size1) {
        for (int[] subArray : size1) {
            for (int i : subArray) {
                System.out.print(" * ");
            }
            System.out.println();


        }
    }

    public static void dioganal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 0;

                }
            }
        }
    }

    public static void dioganalSer(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }

    public static int findMax(int[][] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }

        }
        return max;
    }


    public static int sumArray(int[][] array) {
        int sumFirst = 0;
        if (array.length <= 1) {
            sumFirst = -1;
        } else {
            for (int i = 0; i < array.length; i++) {
                sumFirst += array[1][i];


            }
        }
        return sumFirst;
    }
}

