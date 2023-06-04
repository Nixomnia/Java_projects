import java.util.Scanner;

class Task4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(String.format("The larger number is %d.",num1));
        }
        else{
            System.out.println(String.format("The larger number is %d.",num2));
        }



    }

}
