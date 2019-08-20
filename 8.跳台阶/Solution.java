public class Solution {
    public int JumpFloor(int target) {
        if (target==1){
            return target;
        }else if(target==2){
            return target;
        }else{
            return JumpFloor(target-1)+JumpFloor(target-2);

        }

    }
}
