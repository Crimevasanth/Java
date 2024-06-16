import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static shoppingCart shopCart = new shoppingCart();
   
public static void main(String[] args){
    boolean exit = false;
    int userChoice = 0;
    printInstructions();
    while(!exit){
        System.out.println("Enter your choice");
        userChoice = scanner.nextInt();
        scanner.nextLine();
        switch(userChoice){
            case 0 :
            printInstructions();
            break;
            case 1:
            shopCart.printList();
            break;
            case 2:
            addItem();
            break;
            case 3:
            modifyItem();
            break;
            case 4:
            removeItem();
            break;
            case 5:
            searchItem();
            break;
            case 6:
            exit = true;
            break;


        }
    }
   
}


public static void printInstructions(){
    System.out.println("\nPress");
    System.out.println("0 - To print choices");
    System.out.println("1 - To print shopping List");
    System.out.println("2 - To add an item");
    System.out.println("3 - To modify an item");
    System.out.println("4 - To remove an item");
    System.out.println("5 - To search an item");
    System.out.println("6 - To exit the app");
}
public static void addItem(){
    System.out.print("Please enter the shopping item");
    shopCart.addItem(scanner.nextLine());
}
public static void modifyItem(){
    System.out.print("Enter the item number : ");
    int itemNo = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter the replacement");
    String newItem = scanner.nextLine();
    shopCart.modifyCart( itemNo-1, newItem);
}
public static void removeItem(){
    System.out.print("Insert item to search : ");
    int itemName = scanner.nextInt();
    scanner.nextLine();
    shopCart.removeItem( itemName-1);
}
public static void searchItem(){
    System.out.println("Insert item you want to search : ");
    String searchIT = scanner.nextLine();


    if ((shopCart.searchItem(searchIT)) !=null){
        System.out.println("Item found");
    }
    else System.out.println("Item not found");
}
   
}
Second Code
import java.util.ArrayList;
public class shoppingCart{
    public int[] array = new int[10];
    public ArrayList shoppingCart = new ArrayList<>();


    public void addItem(String item){
        shoppingCart.add(item);
    }


    public void printList(){
        System.out.println("There are " + shoppingCart.size()+ "items in your cart");
        for(int i =0;i< shoppingCart.size();i++){
            System.out.println("Item no " + (i+1) + "is : "+shoppingCart.get(i));
        }
    }




    public void modifyCart(int position,String newItem){
        shoppingCart.set(position , newItem);
        System.out.println("Shopping Item" + (position + 1) + "has been updated");
    }
    public void removeItem(int position){
        String itemName = shoppingCart.get(position);
        shoppingCart.remove(position);
    }


    public String searchItem(String searchItem){
        int position = shoppingCart.indexOf(searchItem);
        if(position >=0){
            return shoppingCart.get(position);
        }
        else
        return null;
    }
}




