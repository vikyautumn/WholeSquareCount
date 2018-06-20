package wholesquarecount;

public class Solution {
    public static int solution(int A, int B){
        if (B <= 0)
            return 0;
        
        int res = 0, a = 0, b;        
        if (A > 0){
            res = 1;
            a = (int) Math.ceil(Math.sqrt((double) A));
        }        
        b = (int) Math.floor(Math.sqrt((double) B));        
        res += b - a;
        return res;
    };
    
}
