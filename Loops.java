import java.util.Scanner;

class Task4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nmmbers from 1 to 10 ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+ " ");
        }         System.out.println();

        int j = 1;
        System.out.println("Even numbers between 1 and 20 ");
        while(j<=20){
            if(j%2==0) {
                System.out.print(j + " ");
            }
            j++;
        } System.out.println();

        int num;
        do{
            System.out.print("Enter a number between 1 and 10: ");
            num = sc.nextInt();
        }
        while(num<1 || num>10 );
        System.out.println("You entered " + num);




    }

}