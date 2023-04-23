class FindMiddle {
   public static void getMiddle(Stack<Integer> s, int size) {

      if((size/2)+1 == s.size()) {
        System.out.println(s.peek());
        return;
      }

      int temp = s.peek();

      s.pop();

      getMiddle(s, size);

      s.push(temp);
    }
}