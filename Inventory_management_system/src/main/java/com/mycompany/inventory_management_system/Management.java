// this is the management system to manage the console prompts and the gui to launch each of the classes objects.
package com.mycompany.inventory_management_system;
import java.util.Scanner;
/**
 *
 * @author LVN
 */
public class Management {
    private int option = 0;
    
    void start(){
        Scanner sc = new Scanner(System.in);
        Management.printWelcomeBox();
        while(option != 4){
            System.out.println("Please Enter your option: ");
        try{
            option = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Error: " + e);
            sc.nextLine();
            continue;
        }

            switch(option){
                case 1:
                    System.out.println("Entering...");
                    continue;
                case 2:
                    System.out.println("Entering...");
                    continue;
                case 3:
                    System.out.println("Entering...");
                    continue;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    break;
                default:
                    System.out.println("Incorrect option...");
            }
        }
    }
    
    private static void printWelcomeBox(){
        System.out.println("**************************************");
        System.out.println("*            WELCOME TO              *");
        System.out.println("*        St Mary's Warehouse         *");
        System.out.println("**************************************");
        System.out.println("*  1. Manage Inventorys              *");
        System.out.println("*  2. Manage Orders                  *");
        System.out.println("*  3. Manage Shipment                *");
        System.out.println("*  4. Exit                           *");
        System.out.println("**************************************");
    }
}
