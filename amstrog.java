import java.util.*;
class amstrog
{
public static void main(String args[])
{
int u,l,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the lower limit");
l=sc.nextInt();
System.out.println("enter the upper limit");
u=sc.nextInt();
for(i=l;i<=u;i++)
{
int r,c=i,s=0;
while(c!=0)
{
r=c%10;
s=s+(r*r*r);
c=c/10;
}
if(s==i)
{
System.out.println(" "+i);
}
}
}
}