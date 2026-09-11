class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            map.add(nums[i]);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i = 1; i <= nums.length; i++) {
            if (!map.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }
}
