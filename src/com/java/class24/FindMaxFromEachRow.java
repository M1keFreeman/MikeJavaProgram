package com.java.class24;

public class FindMaxFromEachRow {
    public static void main(String[] args) {
        int data[][] = {{100, 13, 3}, {-24, -51, -36}, {70, 28, 59}};



        for (int i = 0; i < data.length; i++) {
            //initialized firts number from each row as max
        int max = data[i][0];
        //in this for loop if we have any number which is greater that our max number
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] > max)
                    max = data[i][j];
            }
            System.out.println(max);
        }
    }
}
