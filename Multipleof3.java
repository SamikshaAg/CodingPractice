
package mycodeschool;

import java.util.Scanner;

/**
 *
 * @author Samiksha
 */
public class Multipleof3 {
    public static void main(String[] args)throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=isMultiple(n);
        if(res==1)
            System.out.print("Yes");
        if(res==0)
            System.out.print("No");
    }

    private static int isMultiple(int n) {
        if(n<0)
            n=-n;
        if(n==0)
            return 1;
        if(n==1)
            return 0;
        int odd_count=0,even_count=0;
        while(n!=0)
        {
        if((n & 1) == 1)
        odd_count++;
        n=n>>1;
        if((n & 1) == 1)
        even_count++;
        n=n>>1;
        }
        return isMultiple(Math.abs(odd_count-even_count));
    }
}
