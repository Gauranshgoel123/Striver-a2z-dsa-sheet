//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Solution obj = new Solution();
            int ans[] = obj.passedBy(n, m);

            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int[] passedBy(int a, int b) {
        // code 
        int[] ans=new int[2];
        int x=value(a);
        ans[0]=x;
        int y=ref(b);
        ans[1]=y;
        return ans;
    }
    public static int value(int a){
        return a+1;
    }
    public static int ref(int b){
        return b+2;
    }
}

