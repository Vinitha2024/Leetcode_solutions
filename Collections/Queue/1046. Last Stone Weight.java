class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:stones)
            q.add(n);
        while(q.size()>1){
            int x=q.poll();
            int y=q.poll();
            if(x==y)
              continue;
            if(x!=y)
               q.add(x-y);
        }
        if(q.isEmpty())
           return 0;
        return q.poll();
    }
}
