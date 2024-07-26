import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int num1=l.nextInt();
        int num2=l.nextInt();
        
        if((num1+=num1)==num2)
        {
            System.out.println("The minimum count of n levels is 1");
        }
        else if((num1+=2*num1)%num1==0)
        {
            System.out.println("The minimum count of n levels is 2");
        }
    }
}
