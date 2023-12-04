class Solution {
    public List<List<Integer>> generate(int numRows) {
        
         // Create a list to store the resulting triangle
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result; }
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<>();
            
            // Loop through each element in the current row
            for (int j = 0; j <= i; ++j) {
                
                // If the element is the first or last in the row, set it to 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }
        return result;
    }
}
