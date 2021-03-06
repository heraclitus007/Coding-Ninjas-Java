
/*
Given an array of integers, print two integer values:
First, the sum of all numbers which are even as well as whose index are even.
Second, the sum of all numbers which are odd as well as whose index are odd.
Print the two integers space separated. (Arrays is 0-indexed)

Given an integer denoting the size of array.
Next line will have a line containing ‘n’ space separated integers.

1<=n<=10^5
1 <= Ai <= 10^6 

Two space separated integers denoting even and odd sums respectively.

Sample Input:
5
2 3 5 1 4

Sample Output:
6 4
*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
       // int[] arr=new int[n];
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(i%2==0 && num%2==0)
                sum1+=num;
            else if(i%2!=0 && num%2!=0)
                sum2+=num;
            
        }
        System.out.println(sum1+" "+sum2);
	}
}
