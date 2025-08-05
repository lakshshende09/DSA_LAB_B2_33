import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter max size of the stack: ");
        int size = sc.nextInt();
        int[] stack = new int[size];
        int top = -1;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                if (top == size - 1) {
                    System.out.println("Stack is full (overflow)");
                } else {
                    System.out.print("Enter number to push: ");
                    int num = sc.nextInt();
                    top++;
                    stack[top] = num;
                    System.out.println(num + " pushed into stack.");
                }

            } else if (ch == 2) {
                if (top == -1) {
                    System.out.println("Stack is empty (underflow)");
                } else {
                    System.out.println("Popped: " + stack[top]);
                    top--;
                }

            } else if (ch == 3) {
                if (top == -1) {
                    System.out.println("Stack is empty");
                } else {
                    System.out.println("Top element: " + stack[top]);
                }

            } else if (ch == 4) {
                if (top == -1) {
                    System.out.println("Stack is empty");
                } else {
                    System.out.println("Stack elements:");
                    for (int i = 0; i <= top; i++) {
                        System.out.print(stack[i] + " ");
                    }
                    System.out.println();
                }

            } else if (ch == 5) {
                System.out.println("Program ended.");
                break;

            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}
