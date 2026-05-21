package Mock;

import java.util.HashMap;
import java.util.Stack;

public class MockInterview {
    public int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (myMap.containsKey(target - nums[i])) {
                return new int[]{myMap.get(target - nums[i]), i};
            }
            myMap.put(nums[i], i);
        }
        return new int[]{};
    }

    public int[] twoSumSorted(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else if (sum == target) {
                return new int[]{left, right};
            }

        }

        return new int[]{};
    }

    public boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stack.push('(');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case '{':
                    stack.push('{');
                    break;
                case ')': {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                ;
                break;
                case ']': {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    ;
                    break;
                }
                case '}': {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
                ;
                break;
            }
        }
        return stack.isEmpty();
    }

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int lastNonZeroFoundAt = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i];
                lastNonZeroFoundAt++;
            }
        }

        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }


}
