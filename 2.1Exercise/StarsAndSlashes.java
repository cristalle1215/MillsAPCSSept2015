
/**
 * 2.1 Exercise
 * 
 * Cristalle Kwok
 * 9/21/15
 */
public class StarsAndSlashes{
public static void main (String[] args){
    
        for(int i=1; i<=7;i++){ 
            for(int j=1;j<=7-i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=12-2*(i-1);l++){
                System.out.print("/");
            }
            for(int m=1;m<=2*(i-1);m++){
                System.out.print("\\");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=7-i;j++){
                System.out.print("*");
            }
            System.out.println();
    } 
}
}
    
    
    
    
    
        
  



