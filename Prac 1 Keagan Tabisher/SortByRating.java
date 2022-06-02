
/**
 * Write a description of class SortByRating here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class SortByRating implements Comparator
{
     public int compare(Object o1, Object o2)
    {
       Movie m1 = (Movie)o1;
       Movie m2 = (Movie)o2;
       
       return ((m1.rating) - (m2.rating));
    }
}
