package bestStock;

public class BestStock {
    public static int solution(int[] prices) {
        int buy = prices[0];
        int buyDay = 0;
        for(int i=0;i<prices.length;i++){
            int sell = prices[i];
            if(buy > sell) {
                buy = sell;
                buyDay = i+1;
            }
            
        }
        System.out.println(buy);
        System.out.println(buyDay);

        int sellDay = buyDay;
        int sell=0;
        while(sellDay != prices.length){
            
            if (prices[sellDay]> sell){
                sell = prices[sellDay];
            }
            sellDay++;
        }
        System.out.println(sell);
        System.out.println(sellDay);

        return sellDay-1;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        // int[] prices = {7,6,4,3,1};
        solution(prices);
    }

}
