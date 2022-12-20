class Solution {
    public int majorityElement(int[] nums) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            li.add(nums[i]);
        }
        int ans=0;
        Set<Integer> set=new HashSet<>(li);
        for(int i:set){
            int c=Collections.frequency(li,i);
            System.out.println(c);
            if(c>nums.length/2){
               ans+=i;
            }
        }
        return ans;
    }
}