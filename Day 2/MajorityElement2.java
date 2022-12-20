class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            li.add(nums[i]);
        }
        Set<Integer> set=new HashSet<>(li);
        for(int i:set){
            int c=Collections.frequency(li,i);
            System.out.println(c);
            if(c>li.size()/3){
                ans.add(i);
            }
        }
        return ans;
    }
}