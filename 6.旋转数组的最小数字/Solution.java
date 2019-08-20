import java.util.ArrayList;
import java.util.Arrays;

public class Solution{
    public int minNumberInRotateArray(int [] array) {
        int x = 0;
        Arrays.sort(array);
        if(array.length==0)    {
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
                   x= array[0] ;
            
        }
        return x;
   
    }
}