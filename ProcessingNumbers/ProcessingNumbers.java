
/**
 * Pairs Project (Processing Numbers)
 * 
 * Cristalle Kwok
 * 11/4/15
 */
import java.util.*;
public class ProcessingNumbers
{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many numbers?");
        int x = userInput.nextInt();
        System.out.println("What's the first number?");
        int y = userInput.nextInt();
        int sum;
        if (y%2==0){
            sum = y;
        } else {
            sum = 0;
        }
        int min = y;
        int max = y;
        largestAndSmallest(x, max, min, sum);
    }
      
    public static void largestAndSmallest(int x, int min, int max, int sum){
        int maximum = max;
        int minimum = min;
        int summation = sum;
        int even = summation;
        int i = 1;
        while(i< x){
            Scanner userInput = new Scanner(System.in);
            System.out.println("What is your next number?");
            int a = userInput.nextInt();
            if (a%2==0){
                summation+=a;
                if(even==0){
                    even+=summation;
                }
                even = Math.max(even,a);
        }
            maximum = Math.max(max,a);
            minimum = Math.min(min,a);
            i++;
            }
        
        System.out.println("The largest number is "+maximum+" and the smallest number is "+minimum);
        System.out.println("The sum of all the even numbers is "+summation);
        System.out.println("The largest even number is "+even);
    }
}
        
        
        
        
       
            
            
        
    
       
        
        