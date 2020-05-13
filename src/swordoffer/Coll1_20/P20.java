package swordoffer.Coll1_20;

import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class P20 {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();
    int min = Integer.MAX_VALUE;

    public void push(int node) {
        stack1.push(node);
        if(node <= min) {
            min = node;
            stack2.push(node);
        }
    }

    public void pop() {
        int temp = stack1.pop();
        if(min == temp) {
            stack2.pop();
            min = stack2.peek();
        }


    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        if(!stack2.isEmpty()) {
            return min;
        }
        else {
            return 0;
        }
    }
}
