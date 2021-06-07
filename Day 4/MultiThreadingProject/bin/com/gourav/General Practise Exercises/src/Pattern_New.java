
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pattern_New
{
    public static void main(String args[] ) throws Exception {
        int i,j;
        for(i=1;i<8;i++)
        {
            for(j=7;j>1;j--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
            System.out.println();
            
        }
    }
}