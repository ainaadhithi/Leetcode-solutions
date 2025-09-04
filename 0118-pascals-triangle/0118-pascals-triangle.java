class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i < numRows;i++){
            List<Integer> innerlist=new ArrayList<>();
            if(list.size()==0){
                innerlist.add(1);
            }
            else if(list.size()==1){
                innerlist.add(1);
                innerlist.add(1);
            }
            else{
                innerlist.add(1);
                innerlist.add(1);

                int size=list.size();
                int innersize=list.get(size-1).size();
                int sum=0;
                for(int j=innersize-2;j>=0;j--){
                    sum =list.get(size-1).get(j) + list.get(size-1).get(j+1);
                    innerlist.add(1,sum);//adding at 1st index
                    sum=0;
                }
            }
        list.add(innerlist);    
        }
    return list;
    }
}





NOTES:
# Another method by binomial coefficient:(from Strivers sde)
Also see Variations for this question from strivers-->https://takeuforward.org/data-structure/program-to-generate-pascals-triangle/ 
```
import java.util.*;

public class tUf {
    public static int nCr(int n, int r) {
        long res = 1;
        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        // Store the entire Pascal's triangle:
        for (int row = 1; row <= n; row++) {
            List<Integer> tempLst = new ArrayList<>(); // temporary list
            for (int col = 1; col <= row; col++) {
                tempLst.add(nCr(row - 1, col - 1));
            }
            ans.add(tempLst);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
```
