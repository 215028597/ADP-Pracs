
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Movie implements Comparable
{
  public String title;
  public int year;
  public int rating;
  public double cost;
  // Parameters of movie object
  
  public Movie(String title, int year, int rating, double cost)
  {
      this.title = title;
      this.year = year;
      this.rating = rating;
      this.cost = cost;
      // Paramatarized constructor
  }
  
   public int compareTo(Object mve)
   {
      Movie m = (Movie)mve;
      return (this.year - m.year);
      // compareTo implemented to check movie year order.
   }  
   
   
   
   public double compRating(Object mve)
   {
     Movie m = (Movie)mve;
     return (this.rating - m.rating);
   }
   
   public String toString()
   {
      return ("Movie title: " + title + "\n Year released" + year + "\n Rating: " + rating + "\n Cost: R" + cost + "\n");
   }
  
  
  
}
