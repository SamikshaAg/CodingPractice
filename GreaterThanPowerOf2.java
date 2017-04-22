
package mycodeschool;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GreaterThanPowerOf2 {
    public static void main(String[] args)throws Exception
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    
    /* Method 1
    double x= Math.log10(n)/Math.log10(2);
    int fac=(int)Math.ceil(x);
    int res= 1 << fac;
    System.out.print(res);
            */
    
    System.out.print(PowerGreater(n));
    }

   /* Method 2 
    private static int PowerGreater(int n) {
        if((n & ~(n&(n-1))) == n) 
            return n;
        int c=0;
        while(n!=0)
        {
        n= n>>1;
        c++;
        }
        return 1<<c;
    }*/

    // Method 3
    private static int PowerGreater(int n) {
        if((n & ~(n&(n-1))) ==n)
            return n;
        int p=1;
        while(p<n)
        p= p<<1;
        return p;
    }
}
