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
public class MajorityElement {

	public static void main (String[] args)throws Exception {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    int flag=0,k;
		    for(int j=0;j<n;j++)
		    arr[j]=sc.nextInt();
		   int cand=CandidateElement(arr,n);
		   int res=isMajority(arr,n,cand);
		         if(res==1)
		         System.out.println(cand);
		         else
		         System.out.println("NO Majority Element");
		}
	}
	public static int CandidateElement(int arr[], int n)
	{
	    int maj_index=0, count=1;
	    for(int i=1;i<n;i++)
	    {
	        if(arr[maj_index]==arr[i])
	        count++;
	        else
	        count--;
	        if(count==0)
	        {
	            maj_index=i;
	            count=1;
	        }
	    }
	    return arr[maj_index];
	}
	public static int isMajority(int arr[], int n, int cand)
	{
	    int count=0;
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]==cand)
	        count++;
	    }
	    if(count > n/2)
	    return 1;
	    else
	    return 0;
	}
}

