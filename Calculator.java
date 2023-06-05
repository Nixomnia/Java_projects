import java.util.Scanner;

class Task4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        double num1 = sc.nextDouble();
        System.out.println("Enter 2nd number : ");
        double num2 = sc.nextDouble();
        System.out.println("Enter operation (+,-,* or / ):");
        char operation = sc.next().charAt(0);
        if(operation == '+'){
            System.out.println(String.format("Ans = %f",num1+num2));
        }
        else if(operation == '-'){
            System.out.println(String.format("Ans = %f",num1 - num2));
        }
        else if(operation == '*'){
            System.out.println(String.format("Ans = %f",num1 * num2));
        }
        else if(operation == '/'){
            System.out.println(String.format("Ans = %f",num1 / num2));
        }



    }

}
