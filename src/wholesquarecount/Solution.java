package wholesquarecount;

public class Solution {
    // doesn't count that 0 is root for 0
    public static int solution(int A, int B){
        //if both numbers are negative - there are no roots
        if (B <= 0)
            return 0; 
        
        int res = 0, a = 0, b;      
        if (A > 0){
            //substraction decrease the result
            res = 1;
            a = (int) Math.ceil(Math.sqrt((double) A));
        }        
        b = (int) Math.floor(Math.sqrt((double) B));        
        res += b - a;
        return res;
    };
    
}
