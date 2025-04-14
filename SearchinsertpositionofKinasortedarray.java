class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
         for (int i = 0; i < N; i++) {
            if (Arr[i] >= k) {
                return i;
            }
        }
        return N;
    }
}
