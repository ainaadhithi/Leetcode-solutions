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