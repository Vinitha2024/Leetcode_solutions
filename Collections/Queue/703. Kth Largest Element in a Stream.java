//Priority queue
class KthLargest {
    PriorityQueue<Integer> q;
    int s;
    public KthLargest(int k, int[] nums) {
        q=new PriorityQueue<>();
        s=k;
        for(int n:nums)
          add(n);
    }
    
    public int add(int val) {
        //q.add(val);            
        //add is used to add but offer will handle case even though it cannot add elements(return false).
        q.offer(val);
        if(q.size()>s)
          q.poll();

        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
