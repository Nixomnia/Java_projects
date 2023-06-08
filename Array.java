import java.util.Scanner;

class Task4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers :");

        int [] numbers = new int[5];
        int sum = 0;
        int max = 0;

        for(int i = 0; i<5;i++){
            numbers[i]= sc.nextInt();
        }
        int min = numbers[0];
        for(int j = 0;j<=4;j++){
            sum += numbers[j];
            if(numbers[j]>max) max = numbers[j];
            if(numbers[j]<min) min = numbers[j];
        }
        double average = (double)sum/5;
        System.out.println("The sum is : " + sum);
        System.out.println("The average is : " + average);
        System.out.println("The maximum value is : " + max);
        System.out.println("The minimum value is : " + min);







    }

}