class StockBuySell{
    public int Stockbuysell(int[] prices){

        int minPrice=Integer.MAX_VALUE;

        int maxProfit=0;

        for(int price:prices){
            if(price<minPrice){
                minPrice=price;
            }
            else{
                maxProfit=Math.max(maxProfit,price-minPrice);
            }
        }
        return maxProfit;
    }
}  
class Main{
    public static void main(String[] args) {
        StockBuySell obj= new StockBuySell();
        int[] prices ={7,1,5,3,6,4};

        System.out.println(obj.Stockbuysell(prices));
    }
}
