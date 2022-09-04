import java.util.*;
class LargeOf3m{
public static void main(String args[]){
Scanner a = new Scanner(System.in);
System.out.println("Enter 3 digit");
int x = a.nextInt();
int y = a.nextInt();
int z = a.nextInt();
if(x>y)
	if(x>z)
	System.out.println("Latgest is "+ x);
	else
	System.out.println("Largest is "+ z);
else if(y>z)
	System.out.println("Largest is " + y);
	else
	System.out.println("Largest is " + z);

}
}