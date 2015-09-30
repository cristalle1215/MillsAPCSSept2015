
/**
 * HW Day 28 3.1 Exercise
 * 
 * Cristalle Kwok
 * 9/29/15
 */
public class trees
{
    public static void main(String[] args){
        int segment=3;
        int height=4;
        System.out.println();
        int segment2=2;
        int height2=5;
        tree(segment2, height2);
    }
    public static void tree(int segment, int height){
        for(int parts=1; parts<=segment; parts++){
            for(int tall=1; tall<=height; tall++){
                for(int spaces=1; spaces<=(6-(tall*1))-(parts-1); spaces++){
                    System.out.print(" ");
                }
                for(int stars=1; stars<=(2*tall-1)+((parts-1)*2); stars++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        oneStar();
        oneStar();
        bottom();
    }
    public static void oneStar(){
        System.out.println("     *");
    }
    public static void bottom(){
        System.out.println("  *******");
    }
            
}
