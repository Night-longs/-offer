public class Solution {
    public int RectCover(int target) {
        if(target<=2){
            return target;
        }
        int first=1;
        int second=2;
        int result = 0;
        for(int i=3;i<=target;i++){
            result=first+second;
            first=second;
            second=result;
        }
        return result;
    }
}