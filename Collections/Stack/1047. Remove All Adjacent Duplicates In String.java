// class Solution {
//     public String removeDuplicates(String s) {
//         Stack<Character> stack=new Stack<>();
//         for(char c:s.toCharArray()){
//             if( !(stack.isEmpty()) && stack.peek()== c)
//               stack.pop();
//             else
//             stack.push(c);
//         }
//         StringBuilder sb=new StringBuilder();
//         while(!stack.isEmpty()){
//            sb.insert(0,stack.pop());
//         }
//         return  sb.toString();
//     }
// }
class Solution {
   public String removeDuplicates(String s) {
    char[] stack=new char[s.length()];
    int i=-1;
    for(char c:s.toCharArray()){
        if(i==-1)
         stack[++i]=c;
        else if(stack[i]==c)
           i=i-1;
        else
          stack[++i]=c;
    }
    StringBuilder sb=new StringBuilder();
    for(int j=0;j<=i;j++){
          sb.append(stack[j]);
    }
    return sb.toString();
   }
}
