import java.util.Scanner;
public class Ascii{
	public static void main(String args[]){

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the charater :");
		char a = s.next().charAt(0);
		int b = a;
		System.out.println("The ASCII value of character "+a+" :" +b );


}


}