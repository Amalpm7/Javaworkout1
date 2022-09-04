import java.util.*;
public class LargeOf3 {
public static void main(String[] args) {
Scanner in= new Scanner(System.in);
System.out.println("Enter  1st digit");
int a = in.nextInt(); 
System.out.println("Enter  2nd digit");
int b = in.nextInt();
System.out.println("Enter  3rd digit");
int c = in.nextInt();
System.out.println("Largest no is"+((a > b) ? ((a > c) ? a:c) : ((b > c) ? b: c)) ); 
}
}