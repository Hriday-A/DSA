class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> dic=  new HashMap<>();
        dic.put('I',1);
        dic.put('V',5);
        dic.put('X',10);
        dic.put('L',50);
        dic.put('C',100);
        dic.put('D',500);
        dic.put('M',1000);

        int sum=0;
        for(int i = 0; i<s.length(); i++){
            if(i<s.length()-1 && (dic.get(s.charAt(i+1)) > dic.get(s.charAt(i)))) sum-=dic.get(s.charAt(i));
            else sum+= dic.get(s.charAt(i));
        }
        return sum;


    }
}