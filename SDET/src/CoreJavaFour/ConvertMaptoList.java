package CoreJavaFour;
import java.util.*;
import java.util.stream.*;
  
public class ConvertMaptoList {
  
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
  
        // create a Hashmap which maps rollno with student name
        Map<String, String> map = new HashMap<String, String>();
        System.out.println("Enter No of Students");
  
        // Take Input to Hashmap
        int noOfStudents = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < noOfStudents; i++) {
            String input = sc.nextLine();
            String[] studentdata = input.split(" ");
            String rollno = studentdata[0];
            String name = studentdata[1];
            map.put(rollno, name);
        }
  
        // create list of keys and values
        List<String> ListofKeys = null;
        List<String> ListofValues = null;
  
        // convert hashmap to list of keys and values
        ListofKeys = map.keySet().stream().collect(Collectors.
                                       toCollection(ArrayList::new));
        ListofValues = map.values().stream().collect(Collectors.
                                       toCollection(ArrayList::new));
  
        // print list of rollno and name of students
        System.out.println("List of RollNo of Students");
        System.out.println(ListofKeys.toString());
        System.out.println("List of Name of Students");
        System.out.println(ListofValues.toString());
    }
}