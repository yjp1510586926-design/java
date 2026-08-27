package collection;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class Exercise2_Queue_Stack {
    public static void main(String[] args) {
        System.out.println("\n===== 练习二 =====");

        Queue<String> queueList = new ArrayDeque<>();
        queueList.offer("zs");
        queueList.offer("ls");
        queueList.offer("ww");
        System.out.println("当前队列:" + queueList);

        while (queueList.size() > 0) {
            System.out.println(queueList.poll());
        }
        System.out.println("出队后队列:" + queueList);

        Deque<String> stackList = new ArrayDeque<>();
        stackList.push("输入文字A");
        stackList.push("加粗文字");
        stackList.push("插入图片");
        System.out.println("栈" + stackList);

        stackList.pop();
        System.out.println("弹栈" + stackList);
    }
}
