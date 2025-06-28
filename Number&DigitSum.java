class Sol {
    public static long numberCount(long N, long K) {
        long m;
        int c=0;
        long sum=0;
        while(N>0){
            m=N;
            sum=0;
            while(m>0){
                sum=sum+m%10;
                m=m/10;
            }
            if(!(K<=N-sum)){
                return c;
            }else{
                N--;
                c++;
            }
        }
        return c;
    }
}
