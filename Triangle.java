class Solution {
    //Time Complextity:(n*m)
    //Space Complexity:O(1)
    public int minimumTotal(List<List<Integer>> triangle) {
        
        for (int i = triangle.size()-2;i >=0; i--){
            for (int  j =0; j < triangle.get(i).size(); j++){
        triangle.get(i).set(j,  Math.min (triangle.get(i).get(j) + triangle.get(i+1).get(j),
        triangle.get(i).get(j)+ triangle.get(i+1).get(j+1))); 
            }

        }
        return triangle.get(0).get(0);
    }
}
