class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      HashMap<Character, Integer> hm = new HashMap<>();

     char[] chj = jewels.toCharArray();
     char[] chs = stones.toCharArray();

     for(int i=0;i<chs.length;i++)
     {
         if(hm.containsKey(chs[i]))
         {
             hm.put(chs[i],hm.get(chs[i])+1);
         }
         else
         {
             hm.put(chs[i],1);
         }
     }
     int sum=0;
     for(int i=0;i<chj.length ;i++)
     {
         if(hm.containsKey(chj[i]))
         {
             sum+=hm.get(chj[i]);
         }
     }
      return sum;
   }
}
