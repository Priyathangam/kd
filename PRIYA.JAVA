import java.util.Arrays; 
import java.util.HashSet; 
import java.util.Set; 

public class arrayset { 

public static void main(String[] a) { 
String elements[] = { "A", "B", "C", "D", "E" }; 
Set set = new HashSet(Arrays.asList(elements)); 

elements = new String[] { "A", "B", "C" }; 
Set set2 = new HashSet(Arrays.asList(elements)); 

System.out.println(set.containsAll(set2));
} 
}