
package utils;

public class ArrayUtils {
    
    public static int[] reverse(int[] arr) {
        
        int[] result = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++){
            
            result[arr.length - i - 1] = arr[i];
        
        }
        
        return result;
    }
    
    public static String stringifyArray(int[] arr) {
        
        String str = "";
        
        for(int i = 0; i < arr.length; i++) {          
            
            str += String.valueOf(arr[i]);
             
            
            str += ", ";
        
        }
        
        return str.substring(0, str.length() - 2);
    }
}
