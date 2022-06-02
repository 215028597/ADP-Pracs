/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Keago
 */
public class Prac15 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
       File file = new File("SalesDelim.txt");
       Scanner input = new Scanner(file);
       input.useDelimiter("\\*\\*"); // Using token specified as 
       ArrayList<Product> uProducts = new ArrayList<Product>(); // Arraylist for reading from File
       
       while(input.hasNext())
       { 
           int productType = input.nextInt();
           input.nextInt();
           String itemDescription = input.next();
           input.nextInt();
           int sellingPrice = input.nextInt();
           int quantitySold = input.nextInt();
           // Goes through file while skpping variables that aren't specified in Product class
           
           uProducts.add(new Product(productType, itemDescription, sellingPrice, quantitySold));
           // Adds new Product variable to Arraylist uProducts
        }
       
       try {
         FileOutputStream fos = new FileOutputStream("prod.ser");
         ObjectOutputStream oos = new ObjectOutputStream(fos);   
         oos.writeObject(uProducts);
         oos.close(); 
        } 
       catch(Exception ex) 
       {
        ex.printStackTrace();
       }
        
       ReadSerializable ReadFromFile = new ReadSerializable();
       ReadFromFile.ReadArray();
    }
    
}
