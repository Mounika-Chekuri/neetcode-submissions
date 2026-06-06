class MedianFinder {
    ArrayList<Integer> addList;

    public MedianFinder() {
        addList = new ArrayList<>();
        
    }
    
    public void addNum(int num) {
        addList.add(num);
        
    }
    
    public double findMedian() {
        Collections.sort(addList);
        int n = addList.size();
        if(n%2!=0)
        {
            
        
            return addList.get(n/2);
            
        }
        
            return (addList.get(n/2) + addList.get(n/2-1))/ 2.0;
        
        
    }
}
