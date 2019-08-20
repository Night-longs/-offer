public class Solution {
    public boolean Find(int target, int[][] array) {
        int row = array.length;
        int clos = array[0].length;
        int i = row - 1;
        int j = 0;
        while (i >= 0 && j < clos) {
            if (target < array[i][j]) {
                i--;
            } else if (target > array[i][j]) {
                j++;
            } else {
                return true;
            }

        }
        return false;
    }
}
