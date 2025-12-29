import java.util.HashMap;

class Solution {
    public boolean isSubset(int a[], int b[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int m : a) {
            map.put(m, map.getOrDefault(m, 0) + 1);
        }

        for (int n : b) {
            if (!map.containsKey(n) || map.get(n) == 0) {
                return false;
            }
            map.put(n, map.get(n) - 1);
        }

        return true;
    }
}
