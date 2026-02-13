package com.fooddelivery;

import java.util.Scanner;

import com.fooddelivery.DAO.CustomerDAO;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        

        System.out.println("Food Delivery App:");
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1)Add customer");
        
        int ch;
        
        do{
            System.out.println("Select any choice :");
            ch = sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1 : {
                    System.out.print("Enter name :");
                    String name = sc.nextLine();
                    System.out.print("Enter id : ");
                    int id = sc.nextInt();
                    CustomerDAO.saveCustomer(name, id);

                    break;
                }
                case 2 : {
                    System.out.println("Enter Id to search for Student:");
                    System.out.println(CustomerDAO.getCustomer(sc.nextInt()));
                }
            }
        }while(ch!=0);

        

        sc.close();

    }
}
