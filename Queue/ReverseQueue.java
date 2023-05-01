import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main"

class Reverse {

  public static void reverse(Queue<Integer> q) {

    if (q.isEmpty()) {
      return;
    }

    int temp = q.poll();

    reverse(q);

    q.add(temp);
  }
}
class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList();
        q.add(3);
        q.add(6);
        q.add(9);
        q.add(2);
        q.add(8);

        Reverse.reverse(q);
        System.out.println(q);
    }
}
