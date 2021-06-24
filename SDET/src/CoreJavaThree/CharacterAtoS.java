package CoreJavaThree;

public class CharacterAtoS  
{  
public static void main(String args[])  
{  
//character array  
char[] ch = {'D', 'e', 'v', 'l', 'a', 'b', 's', 'a' , 'l', 'l', 'i', 'a', 'n', 'c', 'e'};  
//constructor of the String class that parses char array as a parameter  
String string = new String(ch);  
//prints the string  
System.out.println(string);  

String s1="Broadridge";
char[] ch1 = s1.toCharArray();  
int len = ch1.length;  
for (int i = 0; i < len; i++) {  
    System.out.println(ch1[i]);   
}  
} 
}