public class LIS {
    public int lengthOfLIS(int[] nums) {
        int[] result = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            result[i] = 1;
        }
        for (int i=0; i<nums.length; i++){
            int j = 0;
            while (j <= i){

                if (nums[i] > nums[j]){
                    if (result[j] + 1 > result[i]){
                        result[i] = result[j] + 1;
                    }
                }
                j++;
            }
        }
        int maxIndex = 0;
        for (int i=0; i< result.length; i++){
            if (result[i] > result[maxIndex]){
                maxIndex = i;
            }
        }
        return result[maxIndex];
    }
}
