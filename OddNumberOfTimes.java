/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycodeschool;
    import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Samiksha
 */
public class OddNumberOfTimes {


	public static void main (String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int j=0;j<n;j++)
		    arr[j]=sc.nextInt();
		    int res=0;
		    for(int j=0;j<n;j++)
		    res=res ^ arr[j];
		    System.out.println(res);
		}
	}
}

