class First {
public static void main ( String args[ ]){
System.out.println( “Hello World” );
}
}


public class Main
{
 public static void main (String[]args)
 {
 int i,j, n = 5;
 for ( i=0; i<n; i++)
 {
 // inner loop to handle number spaces
 // values changing acc. to requirement
 for ( j=n-i; j>1; j--)
 {
 // printing spaces
 System.out.print(" ");
 }

 // inner loop to handle number of columns
 // values changing acc. to outer loop
 for ( j=0; j<=i; j++ )
 {
 // printing stars
 System.out.print("* ");
 }

 // ending line after each row
 System.out.println();
 }
 }
}
public class Main
{
 public static void main(String[] args)
 {
 for (int i = 5; i >= 1; i--)
 {
 for (int j = 5 - i; j >= 1; j--)
 {
 System.out.print(" ");
 }
 for (int j = 1; j <= 2 * i - 1; j++)
 {
 System.out.print("*");
 }
 System.out.println();
 }
 }
}





public class Main{
 public static void main(String [] args)
 {
 int num=4;
 for(int i=1;i<=10;i++)
 {
 System.out.printf("%d*%d=%d\n",num,i,num*i);
 }
 }
}








