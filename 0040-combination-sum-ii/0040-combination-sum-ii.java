class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        backtrack(candidates, 0, 0, target, list, result);
        return result;

    }

    private void backtrack(int[] cand, int index, int totalSum, int target, List<Integer> list,
            List<List<Integer>> result) {
        if (totalSum == target) {
            result.add(new ArrayList(list));
            return;
        }
        if (totalSum > target || index == cand.length)
            return;
        // include candidate
        list.add(cand[index]);
        backtrack(cand, index+1, totalSum + cand[index], target, list, result);
        list.remove(list.size() - 1);
        // skip candidates
        while (index + 1 < cand.length && cand[index] == cand[index + 1]) {
            index += 1;
        }
        backtrack(cand, index + 1, totalSum , target, list, result);

    }
}