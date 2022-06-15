package com.java.class23;

public class HomeWorkArray {

    /// 21 32 65 48 98 51
    public static void main(String[] args) {
        int[] data = {21, 32, 65, 48, 98, 51};

        System.out.println(getMaximum(data));
        System.out.println(getIndexOfNumber(data,65));
        System.out.println(getAvgOfNumber(data));
        System.out.println(getSumOfNumber(data));
    }
    static int getAvgOfNumber(int[] data) {
        int sum=0;
        for (int i = 0; i < data.length; i++) {
            sum=sum+data[i];

        }return sum/data.length;
}
        static int getSumOfNumber(int[] data) {
        int sum=0;
        for (int i = 0; i < data.length; i++) {
          sum=sum+data[i];

            }return sum;

        }



    static int getIndexOfNumber(int[] data, int num) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == num) {
                return i;
            }

        }
        return -1;
    }


    static int getMaximum(int[] data) {
        int max = data[0];

        for (int datum : data) {
            if (datum > max) {
                max = datum;
            }
        }
        return max;


    }


}


