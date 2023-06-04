import java.util.Scanner;

class Task3 {
    public static void main(String args[]){
        Scanner details = new Scanner(System.in);
        System.out.println("Enter you age , name ");
        int age = details.nextInt();
        String name = details.nextLine();

        System.out.println(String.format("Hello,%s! You are %d years old!", name ,age));

    }

}
