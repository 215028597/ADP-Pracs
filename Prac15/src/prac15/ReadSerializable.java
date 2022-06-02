/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Keago
 */

public class ReadSerializable {
    
public void ReadArray() throws FileNotFoundException, IOException
{
    ArrayList<Product> SerialProducts = new ArrayList<Product>(); // Creates ArrayList to store from .ser file
    
    try
    {
        FileInputStream fis = new FileInputStream("prod.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        SerialProducts = (ArrayList)ois.readObject(); // Reads entire object and writes to ArrayList
        Collections.sort(SerialProducts, new CompareDescription()); // Uses Comparator to sort by Description
          
        File file=new File("Output.txt");
        FileWriter fw=new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw=new BufferedWriter(fw);
        String Heading = ("Type Desc Sell price Quantity"); // Creates a heading for all records
        bw.write(Heading);
        bw.newLine();
        int total = 0;
        for(Product s: SerialProducts)
        {
            bw.write(s.toString());
            bw.newLine();
            total = total +1;
        }
        bw.newLine();
        String totAmount = ("Number of records = " + total);
        bw.write(totAmount);
        bw.close();
        ois.close();
        fis.close();
        
    } catch (Exception e) {
     
    }
    
     // Use Comparator to organize list by Description
      for (Product Product : SerialProducts) {
            System.out.println(Product); // Prints out entire SerialProducts ArrayList
        }
     
}
    
}
