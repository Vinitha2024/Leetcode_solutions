class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int rem=0, exchange=0,drink=0;
        while(numBottles>=numExchange){
         rem=numBottles%numExchange;
         exchange=numBottles/numExchange;
          drink+=exchange*numExchange;
          numBottles=exchange+rem;
    }
      drink+=numBottles;
      return drink;
    }
}
