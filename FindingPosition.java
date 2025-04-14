class Solution {
    static long nthPosition(long n){
        int power = 1;
        while (power * 2 <= n) {
            power *= 2;
        }
        return power;
    }
}
