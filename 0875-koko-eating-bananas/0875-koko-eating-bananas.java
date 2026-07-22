class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l =1; int min=0;
        int r=piles[piles.length-1];
        
        int speed =0;
        while(l <=r){
            speed= (r +l)/2;
            long sum=0;
            for(int i=0;i<piles.length; i++){
                long rem=(int)Math.ceil((double)piles[i]/speed);
                 sum+= rem;
            }
            if(sum <= h){
                min =speed;
                r=speed-1;
            }
            else 
            l=speed+1;
        }
        return min;

        
    }
}