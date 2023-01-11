class Solution {
    public String getPermutation(int n, int k) {

      List<Integer> arr=new ArrayList<>();
      int fact=1;
      for(int i=1;i<n;i++)
      {
          fact*=i;
          arr.add(i);
      }
      arr.add(n);
      k-=1;
      String ans="";
      while(true)
      {
           ans+=arr.get(k/fact);
           arr.remove(k/fact);
           if(arr.size()==0)break;

           k=k%fact;
           fact/=arr.size();

      }
        return ans;

    }
}