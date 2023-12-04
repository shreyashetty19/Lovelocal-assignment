
//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times



class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        //Create a map to store the count of each element in the array
        Map<Integer, Integer> elementCountMap = new HashMap<>();
        
        // Iterate through the input array to count element occurrences
        for (int i = 0; i < nums.length; i++) {
            elementCountMap.put(nums[i], elementCountMap.getOrDefault(nums[i], 0) + 1);
        }
        
        List<Integer> majorityElements = new ArrayList<>();
        
        // Calculate the threshold for majority
        int threshold = nums.length / 3;
        
  // Iterate through the entries in the elementCountMap
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();
            
            if (count > threshold) {
                majorityElements.add(element);
            }
        }
        
        return majorityElements;
    }
}