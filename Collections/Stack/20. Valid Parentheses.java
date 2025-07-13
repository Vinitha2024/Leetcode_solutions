class Solution {
    public boolean isValid(String s) {
        Stack<Character> arr=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{'||c=='['||c=='('){
                arr.push(c);
            }
            else{
                if(arr.isEmpty())
                   return false;
                else{
                 if(arr.peek()=='('&& c==')'|| arr.peek()=='['&& c==']'||arr.peek()=='{'&& c=='}')
                    arr.pop(); 
                  else
                   return false;
                }
            }
        }
        return arr.isEmpty();
    }
}
