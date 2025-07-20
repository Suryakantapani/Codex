//20
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:
  
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

class Solution {
    public boolean isValid(String s) {
        Stack<Character> x=new Stack<Character>();
        for(int i=0;i<s.length();i++){
          char a=s.charAt(i); 
          if(a=='(' ||a=='{'||a=='[') {
            x.push(a);
          }
     if(a==')' ||a=='}'||a==']'){
        if(x.isEmpty())
            return false;
    else if(a==')' && x.peek()!= '('||a== '}' && x.peek()!='{' || a== ']' && x.peek()!='[')
    return false;
    else x.pop();
          }    
        }
return x.isEmpty();
}}
