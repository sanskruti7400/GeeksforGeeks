class Solution {
    public double medianOf2(int a[], int b[]) {
        List<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            arr.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            arr.add(b[i]);
        }
        Collections.sort(arr);
        int n=arr.size();
        if(n%2!=0){
            return arr.get(n/2);
        }else{
            return (arr.get(n/2)+arr.get(n/2-1))/2.0;
        }
    }
}
