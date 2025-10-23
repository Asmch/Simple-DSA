class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> mpp=new HashMap<>();
        mpp.put(0,1);
        int prefixsum=0,count=0;
        for(int i=0;i<n;i++)
        {
            prefixsum+=nums[i];
            int remove=prefixsum-k;
            count+=mpp.getOrDefault(remove,0);
            mpp.put(prefixsum,mpp.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}
