public class Solution {
    public int solution(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += (i == n / i) ? 1 : 2;
            }
        }
        return count;
    }
}
