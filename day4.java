//735

// We are given an array asteroids of integers representing asteroids in a row. The indices of the asteriod in the array represent their relative position in space.

// For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

// Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.


class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<a.length; i++){
            int xx=a[i];
            if(xx>0){
             st.push(xx);
            }
             else{
          while(!st.isEmpty() && st.peek()>0){
             if(st.peek()< Math.abs(xx)){
                st.pop();
                continue;
              }
             else if(st.peek()==Math.abs(xx)){
                st.pop();
              }
             xx=0; 
             break;
          }
          if (xx != 0) {
            st.push(xx);
         }
            }}
        int x[]=new int[st.size()];
        for(int i=x.length-1; i>=0; i--){
            x[i]=st.pop();
        }   
         return x;
    }
}

import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            while (!st.isEmpty() && a < 0 && st.peek() > 0) {
                if (Math.abs(a) > st.peek()) {
                    st.pop();
                } else if (Math.abs(a) == st.peek()) {
                    st.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                st.push(a);
            }
        }

        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i
