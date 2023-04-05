package linkedList;


class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
public class SingleLL {


    public void traverse(Node head)
    {
        Node curr=head;

        while(curr != null)
        {
            System.out.print(curr.data+ "    ");
            curr=curr.next;
        }
    }


    public void insertNode(int data, Node head, int position)
    {
        //creating new node
        Node newNode=new Node(data);
        if(position == 0)
        {
            newNode.next=head;
            head=newNode;
            return;
        }


        Node prev=head;

        for(int i=0; i < position-1; i++)
        {
            prev=prev.next;
        }
        newNode.next=prev.next;
        prev.next=newNode;

    }

    public void deleteNode(Node head, int position)
    {

        if(position==0)
        {
            head.next=head;
            return;
        }
        Node prev=head;
        for(int i=0; i < position-1; i++)
        {
            prev=prev.next;
        }
        prev.next=prev.next.next;
    }

    public boolean isCycle(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }

    public Node reverse(Node head)
    {
        Node curr=head;
        Node prev=null;
        while(curr != null)
        {
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
        return head;
    }

    public static void main(String[] args)
    {
        //creating a LL
        Node n1=new Node(40);
        Node n2=new Node(60);
        Node n3=new Node(80);
        Node n4=new Node(90);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;

        Node head=n1;
        SingleLL sll=new SingleLL();
//        System.out.println("--Travsering---");
//        sll.traverse(head);
//
//        System.out.println("--Adding a Node---");
//        sll.insertNode(70,head,3);
//        sll.traverse(head);
//
//        System.out.println("--Deleting/Removing a Node---");
//        sll.deleteNode(head,2);
//        sll.traverse(head);
//
//        System.out.println("--Revsering a List---");
//        Node curr=sll.reverse(head);
//        sll.traverse(curr);

        System.out.println("--Detect Cycle---");
        boolean result=sll.isCycle(head);
        System.out.println("--Detect Cycle present: "+ result);



    }
}
