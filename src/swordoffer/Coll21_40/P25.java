package swordoffer.Coll21_40;

/**
 * 输入一个复杂链表（每个节点中有节点值，
 * 以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class P25 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }

        RandomListNode currentNode;
        currentNode = pHead;
        while (currentNode != null) {
            RandomListNode copyNode = new RandomListNode(currentNode.label);
            RandomListNode nextNode = currentNode.next;
            currentNode.next = copyNode;
            copyNode.next = nextNode;
            currentNode = nextNode;
        }
        currentNode = pHead;
        while (currentNode != null) {
            RandomListNode randomNode = currentNode.random;

            currentNode.next.random = randomNode == null ? null : randomNode.next;
            currentNode = currentNode.next.next;
        }
        currentNode = pHead;
        RandomListNode newHead = pHead.next;
        while (currentNode != null) {
            RandomListNode copyNode = currentNode.next;
            currentNode.next = copyNode.next;
            copyNode.next = copyNode.next == null ? null : copyNode.next.next;
            currentNode = currentNode.next;

        }
        return newHead;
    }
}
