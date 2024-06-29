class Solution {
    public int reverse(int x) {
        int sum=0; 
         int temp = Math.abs(x);
        while(temp>0)
        {
            int r = temp%10;
            if(sum > (Integer.MAX_VALUE - r)/10)
            {
                return 0;
            }
            temp=temp/10;  
            sum = (sum*10)+r;   
        }
        return (x < 0) ? (-sum) : sum;
       /// return sum;
    }
}
