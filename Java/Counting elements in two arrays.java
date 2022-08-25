class Solution
{
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       ArrayList<Integer> ans = new ArrayList<>();
       Arrays.sort(arr2);
       for(int i=0;i<m;i++){
           int target = arr1[i];
           int l=0,u=n-1;
           while(l<=u){
               int mid = (l+u) >> 1;
               if(arr2[mid] <= target){
                   l = mid+1;
               }else{
                   u = mid-1;
               }
           }
           ans.add(l);
       }
       return ans;
    }
}