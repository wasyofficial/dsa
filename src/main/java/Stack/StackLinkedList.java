package Stack;
//creating stack using LinkedList

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = null;
    }
}
class StackByLL {

        public static Node head;

        public static boolean isEmpty()
        {
            if(head == null)
            {
                return true;
            }
            return false;
        }
// adding a value
        public static void push(int data)
        {
            Node newNode= new Node(data, null);
            if(isEmpty())
            {
                head=newNode;
                return;
            }
            else{
                newNode.next=head;
                head=newNode;
                return;
            }
        }
        // deleting value top

        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            else{
                int top=head.data;
                head=head.next;
                return top;
            }
        }

        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            else{
                int top=head.data;
                return top;
            }
        }


}

public class StackLinkedList {

    public static void main(String[] args)
    {
        StackByLL sll=new StackByLL();

        sll.push(40);
        sll.push(30);
        sll.push(20);

        while(!sll.isEmpty())
        {
            System.out.println(sll.peek());
            sll.pop();
        }

    }




}
