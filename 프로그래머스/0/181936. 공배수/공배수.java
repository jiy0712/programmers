public class Solution {
    public int solution(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
      
    }
}
