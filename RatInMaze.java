import java.util.*;

class Solution {
    
    static  void show(ArrayList<String> ans,int x[][],boolean vis[][],int n,int i,int j,String s)
    {
        if(i==n-1 && j==n-1)
        {
            ans.add(s);
            return ;
        }
        if(i+1<n&&x[i+1][j]==1 && vis[i+1][j]==false)
        {
            vis[i][j]=true;
            show(ans,x,vis,n,i+1,j,s+"D");
            vis[i][j]=false;
        }
        if(j-1>=0&&x[i][j-1]==1 && vis[i][j-1]==false)
        {
            vis[i][j]=true;
            show(ans,x,vis,n,i,j-1,s+"L");
            vis[i][j]=false;
        }
        if(j+1<n && x[i][j+1]==1 && vis[i][j+1]==false)
        {
            vis[i][j]=true;
            show(ans,x,vis,n,i,j+1,s+"R");
            vis[i][j]=false;
        }
        if(i-1>=0 && x[i-1][j]==1 && vis[i-1][j]==false )
        {
            vis[i][j]=true;
            show(ans,x,vis,n,i-1,j,s+"U");
            vis[i][j]=false;
        }
        
        return;
    }
    
    public static ArrayList<String> findPath(int[][] m, int n) {
   
       ArrayList<String> ans=new ArrayList<>();
       if(m[0][0]==0)return ans;
       
       boolean vis[][]=new boolean[n][n];
       show(ans,m,vis,n,0,0,"");
       return ans;
   
    }
}
class RatInMaze
{
public static void main(String ar[])
{
    Solution s=new Solution();
	int m[][]={{1,0,0,0},{1,1,0,0},{1,1,0,0},{0,1,1,1}};
	ArrayList<String> ans=s.findPath(m,m.length);
          
		  System.out.println(ans);
}
}