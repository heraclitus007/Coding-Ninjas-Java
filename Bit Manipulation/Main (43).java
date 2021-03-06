/*
You are given an integer Ni. You need to make first set bit of binary representation of N to 0 and return the updated N.
Counting of bits start from 0 from right to left.
Input Format :
Integer N 
Output Format :
Updated N
Sample Input 1 :
4
Sample Output 1 :
0
Sample Input 2 :
12 
Sample Output 2 :
8
*/





public class Solution {
	public static int turnOffFirstSetBit(int n) {
		//Your code goes here
        return n & ~(n & (-1*n));
	}
}
/* 
		00000100
        11111111
        --------
        00000100
        
        11111011
        00000100
        
        
        00001100
        11110111
       -----------
       	00000100
        
        11111011
        00001100
        --------
        00001000
        
*/