import java.util.ArrayList;
import java.util.Scanner;

class arrayList{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int exitFlag = 1;

        ArrayList<String> groceryList = new ArrayList();

        System.out.println("Welcome to your grocery list!");
        System.out.println("1. Enter 'a' to add an item.");
        System.out.println("2. Enter 'r' to remove an item.");
        System.out.println("3. Enter 'p' to print." );
        System.out.println("4. Enter 'f' to check for an item.");
        System.out.println("5. Enter 'c' to clear.");
        while(exitFlag != 0 ) {
            System.out.println("Enter task : ");
            char input = sc.next().charAt(0);

            if (input == 'a') {
                System.out.print("Enter item name: ");
                String item = sc.next();
                groceryList.add(item);
//                exitFlag++;
            }

            else if (input == 'r') {
                System.out.print("To remove by index enter i or to remove by name enter n: ");
                char remove = sc.next().charAt(0);
                if(remove == 'i'){
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    groceryList.remove(index);
                    exitFlag++;
                }
                else if(remove == 'n') {
                    System.out.print("Enter item name without spaces: ");
                    String item = sc.next();
                    groceryList.remove(item);
//                  exitFlag++;
                }
                else
                    System.out.print("Invalid input.");
            }

            else if (input == 'p') {
                System.out.println(groceryList);
//                exitFlag++;
            }

            else if (input == 'f') {
                System.out.print("Enter item name: ");
                String item = sc.next();
                Boolean ans = groceryList.contains(item);
                if (ans == true) System.out.println("Item found.");
                else System.out.println("Item not found.");
//               exitFlag++;a
            }

            else if (input == 'c') {
                groceryList.clear();
                exitFlag = -1;
            }

            else System.out.print("Invalid input.Try again");
        }

    }
}
