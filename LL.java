import javax.xml.soap.Node;

class LL{
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if (tail == null) {
            tail=head;
        }
        size +=1;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value +" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    private class Node{
        private int value;
        private  Node next;
        public Node(int value){
            this.value=value;

        }

    }
}