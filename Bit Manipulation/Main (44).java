/*
You are given two integers N and i. You need to clear all bits from MSB to ith bit (start i from right to left) and return the updated N.
Counting of bits starts from 0 from right to left.
Input Format :
Two integers N and i (separated by space)
Output Format :
Updated N
Sample Input 1 :
15 2
Sample Output 1 :
3
Sample Output 1 Explanation :
We need to clear all bits from MSB to ith bit i.e. clear all bits except 0th and 1st.
Sample Input 2 :
4 4
Sample Output 2 :
4
*/





public class Solution {

	public static int clearAllBits(int n, int i) {
		//your code goes here
        return n&((1<<i)-1);
	}

}

/* 
		00001111
        00000011
        --------
        00000011
        
        
        00000100
        
*/