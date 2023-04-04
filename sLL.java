//public class sLL {
//    Node head;
//    private int size;
//    sLL()
//    {
//        size=0;
//    }
//    class Node {
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//            size++;
//        }
//    }
//
//    public void insertAtFirst(int data) {
//        Node node = new Node(data);
//        if (head == null) {
//            head = node;
//            return;
//        }
//
//        node.next = head;
//        head = node;
//    }
//
//    public void insertAtLast(int data) {
//        Node node = new Node(data);
//        if (head == null) {
//            insertAtFirst(data);
//            return;
//        }
//        Node temp = head;
//        while (temp.next != null) {
//            temp = temp.next;
//        }
//
//        temp.next = node;
//    }
//
//    public void display() {
//        if (head == null) {
//            System.out.println("Empty Linked List");
//            return;
//        } else {
//            Node temp = head;
//            while (temp != null) {
//                System.out.print(temp.data + "->");
//                temp = temp.next;
//            }
//            System.out.println("NULL");
//        }
//    }
//
//    public void deleteFirst() {
//        if (head == null) {
//            System.out.println("Empty linked list");
//            return;
//        }
//        size--;
//        head = head.next;
//    }
//
//    public void deleteLast() {
//        if (head == null) {
//            System.out.println("Empty linked list");
//        }
//        size--;
//        if (head.next == null) {
//            head = null;
//            return;
//        }
//
//        Node secondlast = head;
//        Node lastnode = head.next;
//        while (lastnode.next != null) {
//            lastnode = lastnode.next;
//            secondlast = secondlast.next;
//        }
//        secondlast.next = null;
//    }
//    public int getSize()
//    {
//        return size;
//    }
//    public void insertAtPos(int data,int pos)
//    {
//        Node node=new Node(data);
//        Node temp=head;
//        for(int i=0;i<pos-1;i++)
//        {
//            temp=temp.next;
//        }
//        node.next=temp.next;
//        temp.next=node;
//    }
//    public void deleteAtPos(int pos)
//    {
//        Node temp=head;
//        for(int i=0;i<pos-1;i++)
//        {
//            temp=temp.next;
//        }
//        temp.next=temp.next.next;
//    }
//}
//
//
