// 2. Ввести число, занести его цифры в стек. Вывести в число,
//    у которого цифры идут в обратном порядке.

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        char[] a = num.toCharArray();
        Stack stack = new Stack(); //push n pop
        for (int i = 0; i < a.length; i++)
        {
            stack.push(a[i]);
        }
        System.out.println("В стеке сейчас находится: " + stack);
        for (int i = 0; ;i++)
        {
            if (stack.empty())
            {
                break;
            }
            System.out.print(stack.pop());
        }
    }
}