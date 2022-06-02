/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac15;

import java.io.Serializable;

/**
 *
 * @author Keago
 */
public class Product implements Serializable  { // Use interface to store in .ser file
    int prodType;
    String prodDescription;
    int prodSellPrice;
    int prodQuantity;
    
    Product()
    {
        
    }
    
    Product(int typ, String descr, int pr, int quant)
    {
        prodType = typ;
        prodDescription = descr;
        prodSellPrice = pr;
        prodQuantity = quant;
    }
    
    public void setProdType(int prodType)
    {
        this.prodType = prodType;
    }
    
    public int getProdType()
    {
        return prodType;
    }
    
    public void setProdDescription(String prodDescription)
    {
        this.prodDescription = prodDescription;
    }
    
    public String getProdDescription()
    {
        return prodDescription;
    }
    
    public void setProdSellPrice(int prodSellPrice)
    {
        this.prodSellPrice = prodSellPrice;
    }
    
    public int getprodSellPrice()
    {
        return prodSellPrice;
    }
    
    public void setProdQuantity (int prodQuantity)
    {
        this.prodQuantity = prodQuantity;
    }
    
    public int getProdQuantity()
    {
        return prodQuantity;
    }
    
    public String toString()
    {
        return (prodType + " " + prodDescription + " " + prodSellPrice + " " + prodQuantity);
    } // Returns files in order with spaces for easy processing
}

