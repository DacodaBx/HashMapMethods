import java.util.HashMap;

public class HashMapMeth {
    public static void main(String[] args){
    HashMap<String, String> places = new HashMap<String, String>();

    places.put("New York", "The Bronx");
    places.put("Georgia", "College Park");
    places.put("California", "San Ysidro");
    places.put("Virginia", "Ocean View");

    // Dacoda's Notes: 
    // Prints out all Keys and Values
    System.out.println(places);

    // Prints out the value
    System.out.println(places.get("New York"));    

   // Prints out the number of items
   System.out.println(places.size());

    // Prints out the value after removing the key,
    // Although the entire item key and value are removed.
    System.out.println(places.remove("Georgia"));  

    // Prints out null; Can't use value to remove with remove method.
    System.out.println(places.remove("The Bronx"));

     // Prints out the number of items
    System.out.println(places.size());

     // Prints out the value after removing the key
    System.out.println(places.values());

     // Prints out the value after removing the key
    System.out.println(places.keySet());
    }
}

// Dacoda Blak