
/**
 * HW Day 22 Exercise 2.4
 * 
 * Cristalle Kwok
 * 9/17/15
 */
public class Hourglass
{
   public static void main (String[] args){
       quoteLine();
       decrease();
       doubleLine();
       increase();
       quoteLine();
    }
     public static void quoteLine(){
        System.out.print("|");
        for(int i=1; i<=10; i++){
            System.out.print("\"");
        }
        System.out.println("|");
    }
    public static void decrease(){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.print("\\");
            for(int k=1; k<=10-2*i; k++){
                System.out.print(":");
            }
            System.out.println("/");
        }
    }
    public static void doubleLine(){
        System.out.println("     ||");
    }
    public static void increase(){
        for(int i=4; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.print("/");
            for(int k=1; k<=10-2*i; k++){
                System.out.print(":");
            }
            System.out.println("\\");
        }
    }
}
