package com.company.基础.Dijkstra的双栈算术表达式求值算法;

import java.util.Scanner;
import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        while (scanner.hasNext()) {
            //读取字符，如果是运算符则压入栈
            String s = scanner.next();
            if (s.equals("(")) ;
            else if (s.equals("end")) break;
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                //如果是），弹出运算符和操作数，计算结果并压入栈
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("*")) v = vals.pop() * v;
                else if (op.equals("/")) v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            } else vals.push(Double.parseDouble(s));//如果为数字则压入操作数栈
        }
        System.out.println(vals.pop());
    }
}
