import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseString {

  public static void reverseStack() {
    String s = "Kunal";
      Stack<Character> stk = new Stack<>();

      for(int i = 0; i < s.length(); i++) {
        stk.push(s.charAt(i));
      }

      while(!stk.empty()) {
        System.out.print(stk.peek());
        stk.pop();
      }
    }
  }
}