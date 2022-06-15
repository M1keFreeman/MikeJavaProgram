package HomePractice;
//find a sum of number
public class ArrayPractice2 {

    public static void main(String[] args) {
        int [] data={1,2,3,4,5,10,5,3,-4};
        sumOfNumbers(data);
        negativeNum(data);
    }

    public static void sumOfNumbers(int [] data){
        int  sum= data[0];
        for (int i =1;i<data.length;i++){

            sum+=data[i];
        }
        System.out.println(sum);
    }
    public static void negativeNum(int [] data){
        int negative=data[0];

        for (int i= 0;i< data.length;i++){
            negative=data[i];
            if (negative<data[i]){
                System.out.println(negative);
            }

        }System.out.println(negative);

    }
}
