class Solution {
    public class Info {
        int val;
        int count;

        Info(int val) {
            this.val = val;
            this.count = 1;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {

        if (nums.length == 1) {
            return new int[]{nums[0]};
        }

        HashMap<Integer, Info> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.get(num).count++;
            } else {
                map.put(num, new Info(num));
            }
        }

        ArrayList<Info> list = new ArrayList<>(map.values());

        Collections.sort(list, (a, b) -> b.count - a.count);

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).val;
        }

        return ans;
    }
}