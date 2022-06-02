/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac15;

import java.util.Comparator;

/**
 *
 * @author Keago
 */
public class CompareDescription implements Comparator {
    
    
    public int compare(Object a, Object b)
    {
        Product p1 = (Product)a;
        Product p2 = (Product)b;
        return p1.getProdDescription().compareTo(p2.getProdDescription());
    }
    
}
