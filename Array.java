import java.util.ArrayList;
import java.util.Scanner;

class GroceryList{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int empty = 1;

        ArrayList<String> groceryList;
        groceryList = new ArrayList();

        System.out.println("Welcome to your grocery list!");
        System.out.println("1. Enter 'a' to add an item.");
        System.out.println("2. Enter 'r' to remove an item.");
        System.out.println("3. Enter 'p' to print." );
        System.out.println("4. Enter 'f' to check for an item.");
        System.out.println("5. Enter 'c' to clear.");
        while(empty != 0) {
            System.out.println("Enter task : ");
            char input = sc.next().charAt(0);

            if (input == 'a') {
                System.out.print("Enter item name: ");
                String item = sc.next();
                groceryList.add(item);
//                empty++;
            }

            if (input == 'r') {
                System.out.print("Enter item name: ");
                String item = sc.next();
                groceryList.remove(item);
//                empty++;
            }

            if (input == 'p') {
                System.out.println(groceryList);
//                empty++;
            }

            if (input == 'f') {
                System.out.print("Enter item name: ");
                String item = sc.next();
                Boolean ans = groceryList.contains(item);
                if (ans == true) System.out.println("Item found.");
                else System.out.println("Item not found.");
//                empty++;
            }

            if (input == 'c') {
                groceryList.clear();
                empty = -1;
            }
        }
    }
}
