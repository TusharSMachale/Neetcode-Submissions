class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        
        Set<Integer> s1 = new HashSet<>(set1);
        Set<Integer> s2 = new HashSet<>(set2);

        s1.removeAll(set2);
        s2.removeAll(set1);

        List<Integer> l1 = new ArrayList<>(s1);
        List<Integer> l2 = new ArrayList<>(s2);

        return Arrays.asList(l1, l2);
    }
}