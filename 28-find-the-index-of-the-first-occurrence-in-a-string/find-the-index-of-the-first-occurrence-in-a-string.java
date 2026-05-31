/*
class Solution {
    public int strStr(String haystack, String needle) {
        int m= haystack.length();
        int n = needle.length();
        if(n>m) return -1;
        long phash =0l;
        long kl=(long)(Math.pow(26,n-1));
        //calculating hash value for needle 
        for(int i=0;i<n;i++){
            //in
            char ch = needle.charAt(i);
            phash = phash*26+(ch-'a'+1);
        }
        //calculating hashvalue for haystack and checking for a match with needle value 
        long shash = 0l;
        for(int i =0 ; i<m;i++){
            // out 
            //checking this first to avoid overflow of values 
            if(i>=n){
                char out = haystack.charAt(i-n);
                //reduce contribution
                shash = shash-(out-'a'+1)*kl;
            }
            // in
            char in = haystack.charAt(i);
            shash = shash*26+(in-'a'+1);
            if(shash==phash) return i-n+1;
        }
        return -1;
    }
}*/
import java.math.BigInteger;

class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        if (n > m) return -1;
        if (n == 0) return 0;

        BigInteger BASE = BigInteger.valueOf(26);

        BigInteger phash = BigInteger.ZERO;
        BigInteger kl = BASE.pow(n - 1);

        // hash of needle
        for (int i = 0; i < n; i++) {
            char ch = needle.charAt(i);
            phash = phash.multiply(BASE)
                         .add(BigInteger.valueOf(ch - 'a' + 1));
        }

        BigInteger shash = BigInteger.ZERO;

        for (int i = 0; i < m; i++) {

            // remove outgoing character
            if (i >= n) {
                char out = haystack.charAt(i - n);

                shash = shash.subtract(
                    BigInteger.valueOf(out - 'a' + 1)
                              .multiply(kl)
                );
            }

            // add incoming character
            char in = haystack.charAt(i);

            shash = shash.multiply(BASE)
                         .add(BigInteger.valueOf(in - 'a' + 1));

            if (shash.equals(phash)) {
                return i - n + 1;
            }
        }

        return -1;
    }
}