/*
Sajal and Ruhi are playing a game. Sajal is going to tell one number and one operation (Even, Odd, Prime and Factorial), Ruhi have to apply the operation and tell the output.

Input Format

Two space seperated numbers, first number on which need to apply operation and second number will be 1 for checking the number is even or not, 2 for checking number is odd or not, 3 for checking number is prime or not and 4 for calculating factorial of number.

Constraints

First number will be positive integer value. Second number can be in range of 1 to 4.

Output Format

Yes / No for first three operations and an integer value if operation four is performed.

Sample Input 0

5 1
Sample Output 0

NO
Sample Input 1

5 4
Sample Output 1

120*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int opt=sc.nextInt();
        if(no>0 && (opt>=1 && opt<=4))
        {
            
        if(opt==1)
        {
            if(no%2==0)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("NO");
            }
        }
        else if(opt==2)
        {
            if(no%2!=0)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("NO");
            }
        }
        else if(opt==3)
        {
            int m=no/2,flag=0;
            if(no==0||no==1)
            {
                System.out.println("NO");
            }
            else{
                for(int i=2;i<=m;i++)
                {
                    if(no%i==0)
                    {
                        System.out.println("NO");
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                {
                    System.out.println("Yes");
                }
            }
        }
        else{
            int fac=1;
            for(int i=no;i>0;i--)
            {
                fac=fac*i;
            }
            System.out.println(fac);
        }
        }
    }
}