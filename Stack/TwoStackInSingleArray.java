class TwoStackInSingleArray {

  static int top1;
  static int top2;
  static int max = 6;
  static int[] arr = new int[max];

  TwoStackInSingleArray() {
    top1 = -1;
    top2 = max;
  }

  public static void push1(int data) {

    if(top2-top1 == 1) {
      System.out.println("Stack is overflow");
    } else {
      arr[++top1] = data;
    }
  }

  public static void push2(int data) {

    if(top2-top1 == 1) {
      System.out.println("Stack is overflow");
    } else {
      arr[--top2] = data;
    }
  }

  public static void pop1() {

    if(top1<0) {
      System.out.println("Stack is underflow");
    } else {
      arr[top1--] = 0;
    }
  }

  public static void pop2() {

    if(top2>=max) {
      System.out.println("Stack is underflow");
    } else {
      arr[top2++] = 0;
    }
  }

  public static void print() {

    for (int i = 0; i<max; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}