class ImplementationStack {

  static int top;
  static int max = 3;
  static int[] arr = new int[max];

  ImplementationStack() {
    top = -1;
  }

  public static void push(int data) {

    if (top < max - 1) {
      arr[++top] = data;
    } else {
      System.out.println("Array is full");
    }
  }

  public static boolean isempty() {

    if (top > 0) {
      return false;
    } else {
      return true;
    }
  }

  public static int size() {

    return top;
  }

  public static void pop() {

    if (top > -1) {
      top--;
    } else {
      System.out.println("Array is underflow");
    }
  }

  public static int peek() {
    if (top > -1) {
      int x = arr[top];
      return x;
    } else {
      System.out.println("Array is underflow");
      return 0;
    }
  }

  public static void print() {
    for (int i = top; i > -1; i--) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}