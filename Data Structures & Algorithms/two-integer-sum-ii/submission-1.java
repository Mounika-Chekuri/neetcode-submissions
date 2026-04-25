class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = numbers.length;
        for(int  i=0;i<n;i++)
        {
            if(map.containsKey(target-numbers[i]))
            {
                return new int[]{map.get(target-numbers[i])+1,i+1};
            }
            else map.put(numbers[i],i);
        }
        return new int[] {-1,-1};
    }
}
