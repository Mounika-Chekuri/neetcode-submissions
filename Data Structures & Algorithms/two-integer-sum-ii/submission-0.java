class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int [] index = new int[2];
        int j=numbers.length-1;
        while(i<j)
        {
            if(numbers[i]+numbers[j]==target)
            {
                index[0]=i+1;
                index[1]=j+1;
                break;

            }
            else if(numbers[i]+numbers[j]<target)
            {
                i++;
            }
            else j--;
        }
        return index;
    }
}
