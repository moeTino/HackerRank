import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        // Complete this function
        int february = 28;
        int day = 12;
        
        if(year == 1918){
            february = 15;
        }
        else if(year < 1918 && year % 4 == 0){
            february = 29;
        } else if(year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0) )){
            february = 29;
        }
        day = 256 - (215 + (february));
        return day + ".09." + year;
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
	// Took 20m
	// https://www.hackerrank.com/challenges/day-of-the-programmer/submissions/code/43542916
}
