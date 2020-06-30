/*
There is a company named James Peterson & Co. The company has ‘n’ employees. The employees have skills from 0 to n-1. All the employees have distinct skills. The manager of James Peterson & Co. wants to sort the employees on the basis of their skills in ascending order. He is only allowed to swap two employees which are adjacent to each other. He is given the skills of employees in an array of size ‘n’. He can swap the skills as long as the absolute difference between their skills is 1. You need to help the manager out and tell whether it is possible to sort the skills of employees or not.
Input Format:
First Line will have an integer ‘t’ denoting the no. of test cases.
First line of each test case contains an integer ‘n’ denoting the no. of employees in the company.
Second line of each test case contains ‘n’ distinct integers in the range [0, n-1].
Output Format:
For each test case, print “Yes” if it is possible to sort the skills otherwise “No”.
Constraints:
1 <= t <= 10
1 <= n <= 10^5
Sample Input:
2
4
1 0 3 2
3
2 1 0
Sample Output:
Yes
No
Explanation:
In first T.C., [1, 0, 3, 2] -> [0, 1, 3, 2] -> [0, 1, 2, 3]
In second T.C., [2, 1, 0] -> [1, 2, 0]  OR  [2, 1, 0] -> [2, 0, 1] So, it is impossible to sort.
*/




import java.util.*;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            
            int[] temp=new int[n];
            System.arraycopy(arr,0,temp,0,n);
            
            for(int i=0;i<n-1;i++){
                
                if(temp[i+1]<temp[i]&&temp[i]-temp[i+1]==1){
                    int a=temp[i+1];
                    temp[i+1]=temp[i];
                    temp[i]=a;
                }
                
            }
            Arrays.sort(arr);
            if(check(temp,arr))
                System.out.println("Yes");
            else
                System.out.println("No");
            
        }
	}
    
    public static boolean check(int[] arr1,int[] arr2){
        
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
                return false;
            
        }
        return true;
        
    }
    
    
    
}