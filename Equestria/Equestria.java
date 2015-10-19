
/**
 * Equestria Project
 * 
 * Cristalle Kwok 
 * 10/15/15
 */
public class Equestria
{
    public static void main(String[] args){
        distance();
        System.out.println();
        roadTrip();
        System.out.println();
        stopTours();
        System.out.println();
        longestTrip();
        System.out.println();
    }
    
    public static void distance(){
        double a = distance(31,-16,34,-9);
        System.out.println(a+" miles");
        double b = distance(7,-19,22,-8);
        System.out.println(b+ "miles");
        double c = distance(25,-23,16,-14);
        System.out.println(c+" miles");
    }
    
    public static double distance(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt(Math.pow((x1-x2),2)+(Math.pow((y1-y2),2)));
        return distance;
    }
    
    public static void roadTrip(){
        double a = distance(7,-19,31,-10);
    }
    
    public static double diameter(int x1, int y1, int x2, int y2){
        double diameter = Math.sqrt(Math.pow((x1-x2),2)+(Math.pow((y1-y2),2)));
        double circumference = Math.PI*diameter;
        return circumference;
    }
    
    public static void stopTours(){
        distances();
    }
    
    public static void distances(){
        double a = distance(31,-16,34,-9);
        System.out.println(a);
        double b = distance(7,-19,22,-8);
        System.out.println(b);
        double c = distance(25,-23,16,-14);
        System.out.println(c);
        double x = angle(a,b,c);
        System.out.println(x);
        double y = angle(b,c,a);
        System.out.println(y);
        double z = angle(c,a,b);
        System.out.println(z);
    }
    
    public static double distances(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt(Math.pow((x1-x2),2)+(Math.pow((y1-y2),2)));
        return distance;
    }
  
    public static double angle(double x, double y, double z){
        double angle = Math.toDegrees(Math.acos(((Math.pow(y,2))+(Math.pow(z,2))-(Math.pow(x,2)))/(2*y*z)));
        return angle;
    }
    
    public static void longestTrip(){
        double a = length(31,-16,34,-9);
        double b = length(7,-19,22,-8);
        double c = length(25,-23,16,-14);
        double d = max(a,b,c);
        System.out.println(d);
    }
    
    public static double length(int x1, int y1, int x2, int y2){
        double longestTrip = Math.sqrt(Math.pow((x1-x2),2)+(Math.pow((y1-y2),2)));
        return longestTrip;
    }
    
    public static double max(double a, double b, double c){
        double d = Math.max(Math.max(a,b),c);
        return d;
    }
}
        
  
        
    
    
    
    
  
        
        
        
   
