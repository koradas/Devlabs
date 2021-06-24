package CoreJavaFour;

import java.util.Enumeration;
import java.util.Hashtable;

public class GetSetView {
   @SuppressWarnings("rawtypes")
public static void main(String[] args) {
      Hashtable<String, String> ht = new Hashtable();
      ht.put("9", "Nine");
      ht.put("6", "Six");
      ht.put("5", "Five");
      Enumeration e = ht.keys();
      
      while (e.hasMoreElements()) {
         System.out.println(e.nextElement());
      }
   }
}