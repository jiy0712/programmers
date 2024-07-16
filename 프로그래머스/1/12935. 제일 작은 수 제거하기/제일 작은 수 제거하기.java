import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        
        int[] answer = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != minIndex) {
                answer[j++] = arr[i];
            }
        }
        
        return answer;
    }
}
