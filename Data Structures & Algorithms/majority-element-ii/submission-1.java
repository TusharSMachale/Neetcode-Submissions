class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        int num1 = 0;
        int num2 = 0;
        int count1 = 0;
        int count2 = 0;

    // First Pass
        for(int i=0; i<n; i++){
            if(nums[i] == num1){
                count1++;
            }else if(nums[i] == num2){
                count2++;
            }else if(count1 == 0){
                num1 = nums[i];
                count1++;
            }else if(count2 == 0){
                num2 = nums[i];
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

    // Second Pass  
        count1 = 0;
        count2 = 0;
        for(int num : nums){
            if(num == num1){
                count1++;
            }else if(num == num2){
                count2++;
            }
        }

        if(count1 > n/3){
            ans.add(num1);
        }
        if(count2 > n/3){
            ans.add(num2);
        }

        return ans;
    }
}