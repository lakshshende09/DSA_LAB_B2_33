import java.util.Scanner;

public class Stack_Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum size of the stack: ");
        int max = sc.nextInt();
        int[] stack = new int[max];
        int top = -1;

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    if (top == max - 1) {
                        System.out.println("Stack is full. Cannot push.");
                    } else {
                        System.out.print("Enter value to push: ");
                        int val = sc.nextInt();
                        top++;
                        stack[top] = val;
                        System.out.println("Value pushed: " + val);
                    }
                    break;

                case 2:
                    if (top == -1) {
                        System.out.println("Stack is empty. Nothing to pop.");
                    } else {
                        System.out.println("Popped value: " + stack[top]);
                        top--;
                    }
                    break;

                case 3:
                    if (top == -1) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Top element is: " + stack[top]);
                    }
                    break;

                case 4:
                    if (top == -1) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack elements are:");
                        for (int i = 0; i <= top; i++) {
                            System.out.print(stack[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
