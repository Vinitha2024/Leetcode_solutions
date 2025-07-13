class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens){
            if(s.matches("-?\\d+"))
              stack.push(Integer.parseInt(s));
            else if(!stack.isEmpty()){
                int b=stack.pop();
                int a=stack.pop();
                switch(s){
                    case "+":
                      stack.push(a+b);
                      break;
                    case "-":
                     stack.push(a-b);
                      break;
                    case "*":
                      stack.push(a*b);
                      break;
                    case"/":
                     if(b!=0)
                      stack.push(a/b);
                      break;
                }
            }
        }
        return stack.peek();
    }
    
}
