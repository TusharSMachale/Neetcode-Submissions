class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c1 = 0;
        int c2 = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == a){
                c1++;
            }else if(nums[i] == b){
                c2++;
            }else if(c1 == 0){
                a = nums[i];
                c1++;
            }else if(c2 == 0){
                b = nums[i];
                c2++;
            }else{
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;
        for(int num : nums){
            if(num == a){
                c1++;
            }else if(num == b){
                c2++;
            }
        }

        if(c1 > n/3){
            ans.add(a);
        }
        if(c2 > n/3){
            ans.add(b);
        }
        return ans;
    }
}