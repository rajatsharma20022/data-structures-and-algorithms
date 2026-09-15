class Solution {
    ArrayList<List<Integer>> list=new ArrayList<>();
    
    int nums[];
    
    public List<List<Integer>> subsets(int[] nums) {
        this.nums=nums;
        ArrayList<Integer>current=new ArrayList<>();
        backtracking(0, current);
        return list;
    }

    public void backtracking(int index, List<Integer>current) {
        if (index == nums.length) {
            list.add(new ArrayList<>(current));
        return;
        }

        current.add(nums[index]);
        backtracking(index + 1, current);
        current.remove(current.size() - 1);
        backtracking(index + 1, current);

    }
}