import java.util.List;
import java.util.Arrays;

public class Solution {
    public int solution(int[] num_list, int n) {
        for (int num : num_list) {
            if (num == n) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        
    }
}
