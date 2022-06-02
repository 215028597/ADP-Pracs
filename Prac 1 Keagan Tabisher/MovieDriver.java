
/**
 * Write a description of class MovieDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MovieDriver
{
  public static void main(String[] args)
  {
    Movie[] mov = 
    {
     new Movie ("Monster Mash", 1996, 3, 200),
     new Movie ("Digimon: The Movie", 1994, 1, 201),
     new Movie ("The Matrix", 1993, 2, 202),
     new Movie ("Zootopia", 2005, 4, 203),
     new Movie ("No Country for Old Men", 2020, 9, 204),
     new Movie ("War of the Worlds", 2012, 7, 205),
    
    };
    List<Movie> shows = new ArrayList<Movie>();
    
    for(int i = 0; i < mov.length; i++)
    {
      shows.add(mov[i]);
    }
    
    System.out.println("All movies unsorted by year of release: \n" + shows);
    Collections.sort(shows);
    System.out.println("All movies sorted by year of release: \n" + shows);
    
    System.out.println("All movies unsorted by Title \n" + shows);
    Collections.sort(shows, new SortByTitle());
    System.out.println("All movies sorted by Title \n" + shows);
    
    System.out.println("All movies unsorted by Rating: \n" + shows);
    Collections.sort(shows, new SortByRating());
    System.out.println("All movies sorted by Rating: \n" + shows);
    
  }
}
