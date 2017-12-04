
import Animals.Puppy;
import utils.ArrayUtils;
import utils.Math;

public class Driver {
    public static void main(String[] args) {
        Puppy joey = new Puppy("Joey");
        System.out.println(joey.getName());
        Puppy chandler = new Puppy("Chandler");
        System.out.println(chandler.getName());
        Puppy ross = new Puppy("Ross");
        System.out.println(ross.getName());
        
      
        
        System.out.println(ArrayUtils.stringifyArray(ArrayUtils.reverse(new int[] {9, 20, 3, 44, 88, 300})));
        
        double var = 15.1;
        
        System.out.println(Math.factorial((int) var));
        
    }
}