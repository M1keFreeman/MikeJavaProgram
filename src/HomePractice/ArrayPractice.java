package HomePractice;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] num = {12, 65, 87, 46};
        int temp,size ;
        size= num.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if (num[i] > num[j]) {
                    temp=num[i];
                  num[i]=num[j];
                  num[j]=temp;
                }
            }
        }
        System.out.println(num[num.length-2]);

    }
}



//    int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
//    int largest = arr[0];
//    int secondLargest = arr[0];
//
//    System.out.println("The given array is:" );
//            for (int i = 0; i < arr.length; i++) {
//        System.out.print(arr[i]+"\t");
//        }
//        for (int i = 0; i < arr.length; i++) {
//
//        if (arr[i] > largest) {
//        secondLargest = largest;
//        largest = arr[i];
//
//        } else if (arr[i] > secondLargest) {
//        secondLargest = arr[i];
//
//        }
//        }
//
//        System.out.println("\nSecond largest number is:" + secondLargest);
//
//        }
//        }