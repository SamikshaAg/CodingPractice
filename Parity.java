
package mycodeschool;


public class Parity {
  public static void main(String args[])throws Exception
  {
  int n=7,c=0;
  while(n!=0)
  {
  if((n & 1)==1)
   c++;
  n=n>>1;
  }
 if(c%2 == 0)
     System.out.println("Even parity");
 else
     System.out.println("Odd parity");
  }
}
