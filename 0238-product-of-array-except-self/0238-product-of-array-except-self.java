class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int l=nums.length;
        // int [] arr=new int[l];
        // for(int i=0;i<l;i++){
        //     int product=1;
        //     for(int y=0;y<l;y++){
        //     if(i!=y)
        //     product=product*nums[y];
        //     }
        //     if(product>=0)
        //     arr[i]=product;
        //     else
        //     arr[i]=0;
        //  }
        //  return arr;
    int length=nums.length;
     int ans[]=new int[length];
     // preffix:
     ans[0]=1;
     for(int i=1;i<length;i++){
        ans[i]=ans[i-1]*nums[i-1];
     }
     // suffix:
     int suffix=1;
     for(int j=length-2;j>=0;j--){
        suffix=suffix*nums[j+1];
        ans[j]=ans[j]*suffix;
     }
        return ans;


        
    }
}