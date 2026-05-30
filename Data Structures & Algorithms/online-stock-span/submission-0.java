
class Pair{
    int price;
    int count;
    Pair(int price,int count)
    {
        this.price = price;
        this.count = count;
    }
}
class StockSpanner {
    Stack<Pair> stock;

    public StockSpanner() {
        stock =  new Stack<>();
        
    }
    
    public int next(int price) {
        int span =1;
        if(stock.isEmpty())
        {
            stock.push(new Pair(price,1));
            return 1;
        }
        else
        {
            
           
            while(!stock.isEmpty()&&price>=stock.peek().price)
            {
            span += stock.peek().count;
              stock.pop();
            }
            
            stock.push(new Pair(price,span));
        }
        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */