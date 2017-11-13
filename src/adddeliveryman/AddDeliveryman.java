/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adddeliveryman;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author owner
 */
public class AddDeliveryman {
    
    private static List<Deliveryman> addman= new ArrayList<>();
    
    public static void main(String[] args) {
            
        Menu();
        
    }
    
    private static void Menu(){
        Scanner reader = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("=     HR Manager Menu Task       =");
        System.out.println("=1. Add new Delivery man details =");
        System.out.println("=2. Update Delivery man details  =");
        System.out.println("==================================");
        System.out.println("Pls Enter the selection, if does not have any selection pls press key to exit:");
        int option;
        option = reader.nextInt();
        
        if(option==1){
            
           Deliveryman();
           
        }else if(option==2){
            
        }else{  
        System.out.println("Thanks for visit.");
        }
       reader.close();
    }
    
    private static void Deliveryman( ){
        String select;
        do{
        Deliveryman d= new Deliveryman();
        
        Scanner reader = new Scanner(System.in);
        //System.out.println("The no of the deliveryman :");
        
        System.out.println("Enter the name:");
        d.setd_name(reader.nextLine());
        
        System.out.println("Enter the Ic Number:");
        d.setd_IcNo(reader.nextLine());
        
        System.out.println("Enter the Phone Number:");
        d.setd_PNo(reader.nextLine());
        
        System.out.println("Enter the Status:");
        d.setd_status(reader.nextLine());
        
        System.out.println("Enter the Gender:");
        d.setd_gender(reader.nextLine());
        
        System.out.println("Enter the User Name:");
        d.setd_userName(reader.nextLine());
        
        System.out.println("Enter the Password:");
        d.setd_password(reader.nextLine());
        
        System.out.println("You have added:");
        System.out.println("Name:"+d.getd_name()+",Ic NUmber:"+d.getd_IcNo()+",Phone Number:"+d.getd_PNo()+",Satus:"+d.getd_status()+", Gender:"+d.getd_gender()+",User Name:"+d.getd_userName()+", Password:"+d.getd_password());
        System.out.println("Do yo want to add others new Deliveryman? (Yes to continue No show all the deliveryman)");
        select = reader.nextLine().toUpperCase();
        
        
        //List<Deliveryman> addman= new ArrayList<>();
        addman.add(d);
        
        }while(select.equals("YES"));
                 {
                
                 if(select.equals("NO"))
                    {             
                            Scanner reader = new Scanner(System.in);
                            System.out.println("===============");
                            System.out.println("= Deliveryman =");
                            System.out.println("===============");
                         for(int i=0;i < addman.size();++i)
                         {
                                System.out.println(1+i +"."+addman.get(i));
                         }
                         
                         System.out.println("Do you want to go to menu?(Yes to menu no to exit)");
                         String str1 = reader.nextLine().toUpperCase();
                         if(str1.equals("YES")){
                             Menu();
                         }else if(str1.equals("NO")){
                             exit();
                         }
                       
                    }
                }
                
    }
    
   /* public class AddMan{
    private List<Deliveryman> list;
    
      public void addDeliveryman(Deliveryman addman){
       
          list.add(addman);
       
    }*/
    
}
    
    /*public void AddNewDeliveryman(Deliveryman d){
        addman.add(d);
    }*/
    

