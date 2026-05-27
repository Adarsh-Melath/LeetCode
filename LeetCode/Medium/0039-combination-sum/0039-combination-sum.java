class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> current = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0, candidates, target, 0);
        return result;
    }

    public void backtrack(int index, int[] candidates, int target, int total) {
        if (total == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index >= candidates.length || total > target) {
            return;
        }

        current.add(candidates[index]);

        backtrack(index, candidates, target, total + candidates[index]);

        current.remove(current.size() - 1);

        backtrack(index + 1, candidates, target, total);
    }
}