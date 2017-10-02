import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getWays(int[] squares, int d, int m){
        // Complete this function
        
        int totalCount = 0;
        int count = 0;
        for(int i=0; i<squares.length; i++){
            for(int j=i; j<i+m; j++){
                if(j<squares.length){
                    count += squares[j];
                }
            }
            if(count == d){
                totalCount++;
            }
            count = 0;
        }
        return totalCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
        
        
    }
	
	// Took 13m 30s
	// https://www.hackerrank.com/challenges/the-birthday-bar?h_r=next-challenge&h_v=zen
}
