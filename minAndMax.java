class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        Arrays.sort(arr);
        return new Pair<>(arr[0],arr[arr.length-1]);
    }
}
