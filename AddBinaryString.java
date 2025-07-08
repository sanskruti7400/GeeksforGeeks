import java.math.BigInteger;
class Solution {
    public String addBinary(String s1, String s2) {
        BigInteger num1=new BigInteger(s1,2);
        BigInteger num2=new BigInteger(s2,2);
        
        BigInteger sum=num1.add(num2);
        
        return sum.toString(2);
    }
}
