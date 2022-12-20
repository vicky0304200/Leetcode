class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            li.add(nums[i]);
        }
        List<Integer> t=new ArrayList<>();
        t.add(val);
        li.removeAll(t);
        for(int i=0;i<li.size();i++){
            nums[i]=li.get(i);
        }
        for(int i=li.size();i<nums.length;i++){
            nums[i]=0;
        }
        return li.size();

    }
}