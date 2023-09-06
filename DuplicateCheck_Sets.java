import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Sets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Double> numberSet = new HashSet<>();
        int count = 0;
        boolean loop = true;
        while(true){
            System.out.print("Enter a number: ");
            double temp  =sc.nextDouble() ;
            if(numberSet.contains(temp)){
                System.out.println("Repeated number.");
            }
            else {
                System.out.println("Not repeated. Adding to set...");
                numberSet.add(temp);
            }
        }
    }
}

