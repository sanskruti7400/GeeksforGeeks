class Solution {
    public int missingNumber(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for(int num:arr){
            if(num>0){
                set.add(num);
            }
        }
        int n=1;
        while(true){
            if(!set.contains(n)){
                return n;
            }else{
                n++;
            }
        }
    }
}
