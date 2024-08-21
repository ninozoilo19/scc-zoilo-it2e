
package ninozoilo.bsit2e;

import java.util.Scanner;

public class Sales {
    public void getSales(){
        Scanner input = new Scanner(System.in);
        
        String  customername , productname ;
        int price  , quantity;
       
        float cash , total , change;
        
        System.out.print("Enter Customer Name: ");
        customername = input.nextLine();
        System.out.print("Enter Product Name: ");
        productname = input.nextLine();
        System.out.print("Enter Quantity: ");
        quantity = input.nextInt();
        System.out.print("Enter Price: ");
        price = input.nextInt();
        System.out.print("Enter Cash: ");
        cash = input.nextInt();
        
        total = price * quantity;
        change = cash - total;
        
        System.out.println("----------------");
        System.out.println("RECIEPT: ");
        System.out.println("----------------");
        
        System.out.println("Name: " + customername);
        System.out.println("Item Name: " + productname);
        System.out.println("Quantity: " + quantity );
        System.out.println("----------------");
        System.out.println("Total Due: " + total );
        System.out.println("Cash: " +  cash );
        System.out.println("----------------");
        System.out.println("Change: " + change);
        System.out.println("----------------");
    }
    
}
