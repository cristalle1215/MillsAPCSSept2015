
/**
 * Homecoming Project
 * 
 * Cristalle Kwok 
 * 10/25/15
 */
import java.util.*;
public class Homecoming
{
 public static void main (String[] args){
   Scanner userInput = new Scanner(System.in);
   String x = getADate(userInput);
   damage(userInput, x);
}

public static String getADate(Scanner userInput){
    System.out.println("Hi! My name is Cristalle. What's your name?");
    String x = userInput.nextLine();
    System.out.println("Nice to meet you "+x);
    System.out.println("Would you like to go to Homecoming with me?");
    String q = userInput.nextLine();
    System.out.println("Great it'll be a magical night -- "+x+" and Cristalle going to Mills Homecoming Dance 2015!");
    return x;
}

public static void damage(Scanner userInput, String x){
    System.out.println();
    System.out.println("Let's figure out the damage for the evening.");
    System.out.println();
    System.out.println("What are your estimated costs?");
    System.out.print("Tickets(each): ");
    double a = userInput.nextInt();
    System.out.print("Flowers(total for both of you): ");
    double b = userInput.nextInt();
    System.out.print("Pictures: ");
    double c = userInput.nextInt();
    System.out.print("Dinner(per meal): ");
    double d = userInput.nextInt();
    System.out.print("New clothes(Tie to match dress? Vest? Dress? Non-tennis shoes?): ");
    double e = userInput.nextInt();
    System.out.print("Any other expenses: ");
    double f = userInput.nextInt();
    double z = (int)(100*((a*2.0)+b+c+((2.0*d)+e+f)*1.0825));
    z /=100;
    double y = z/2.0;
    System.out.println("So, you should expect to spend, including tax, "+z);
    System. out.println("If you split the costs with your date, each will pay: "+y);
    statsTable(a,b,c,d,e,f,x);
}

public static void statsTable(double a, double b, double c, double d, double e, double f, String x){
    System.out.println();
    System.out.println("MHS Homecoming 2015");
    System.out.println("Cristalle Kwok and "+x);
    System.out.println();
    System.out.println("Tickets(total):                 "+(a*2.0));
    System.out.println("Flowers(for both of you):       "+b);
    System.out.println("Pictures:                       "+c);
    System.out.println("Dinner(for two):                "+(d*2.0));
    System.out.println("New clothes:                    "+e);
    System.out.println("Any other expense:              "+f);
    double r = ((2.0*a)+b+c+(d*2.0)+e+f);
    double s = (int)(100*(((2.0*d)+e+f)*0.0825));
    s /=100;
    double t= r+s;
    System.out.println("                      Subtotal: "+r);
    System.out.println("                     Sales tax: "+s);
    System.out.println("                         Total: "+t);
}
}
    
    
    
    

    


