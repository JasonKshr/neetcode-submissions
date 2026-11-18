class Solution {
    public void sortColors(int[] nums) {

        int zero = 0;
        int one = 0;
        int two = 0;

        while(zero < nums.length){
            if(nums[zero] == 0){
                int temp = nums[one];
                nums[zero] = temp;
                nums[one] = 0;
                one++;
                two++;
            }
            zero++;
        }
        while(one < nums.length){
            if(nums[one] == 1){
                int temp = nums[two];
                nums[one] = temp;
                nums[two] = 1;
                two++;
            }
            one++;
        }
        
    }
}