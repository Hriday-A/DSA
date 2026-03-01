class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> dic=  new HashMap<String,Integer>();
        dic.put("I",1);
        dic.put("V",5);
        dic.put("X",10);
        dic.put("L",50);
        dic.put("C",100);
        dic.put("D",500);
        dic.put("M",1000);

        int sum=0;
        String[] st= s.split("");

        for(int i=0;i< st.length;i++){
            if(dic.containsKey(st[i])){
            int v= dic.get(st[i]);
                if (i < st.length - 1 && dic.get(st[i]) < dic.get(st[i+1])) {
                    sum-=v;
                }
                else{
                    sum+=v;
                }
            }
        }

        return sum;


    }
}