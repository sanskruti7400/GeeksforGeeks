class Solution {
    public String longestCommonPrefix(String arr[]) {
        String s=arr[0];
        for(int i=0;i<arr.length;i++){
            while(!arr[i].startsWith(s)){
                s=s.substring(0,s.length()-1);
            }
            if(s.isEmpty()){
                return "";
            }
        }
        return s;
    }
}
