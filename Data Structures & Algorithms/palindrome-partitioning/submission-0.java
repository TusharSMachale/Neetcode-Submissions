class Solution {
    private void backtrack(String s, int start, List<String> currentList, List<List<String>> result) {
        // Base case: If we have reached the end of the string, add the current partition to the result
        if (start == s.length()) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            // Check if the substring from 'start' to 'end' is a palindrome
            if (isPalindrome(s, start, end)) {
                // Choose: add the palindromic substring to our path
                currentList.add(s.substring(start, end + 1));
                
                // Explore: recurse for the remaining substring
                backtrack(s, end + 1, currentList, result);
                
                // Backtrack: remove the last added substring to try other possibilities
                currentList.remove(currentList.size() - 1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
