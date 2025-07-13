class MinStack {
        Node top;
        class Node{
            int data;
            int min;
            Node next;
            Node(int val,int m){
                data=val;
                min=m;
                next=null;
            }
        }
    public MinStack() {
        top=null;
    }
    
    public void push(int val) {
        if(top==null){
        Node newNode=new Node(val,val);
        top=newNode;
        return;
        }
        else{
        int m=Math.min(val,top.min);
        Node newNode=new Node(val,m);
        newNode.next=top;
        top=newNode;
        }
    }
    
    public void pop() {
        top=top.next;
    }
    
    public int top() {
        return top.data;
    }
    
    public int getMin() {
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
