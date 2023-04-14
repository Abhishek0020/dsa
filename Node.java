 class BinaryTree {

    Node root;
    BinaryTree(){
        root=null;
    }
    public void Inorder(Node node){
        if(node==null){
            return;
        }
        Inorder(node.left);
        System.out.println(node.data);
        Inorder(node.right);
    }
    public void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }
    public void postorder(Node node){
        if(node==null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        BinaryTree ob = new BinaryTree();
        Node n1 = new Node(5);
        Node n2  = new Node(6);
        Node n3 = new Node(7);
        Node n4  = new Node(8);
        Node n5  = new Node(9);
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        ob.root=n1;

        ob.preorder(ob.root);
    }
}
class Node{
    Node left;
    Node right;
    int data;
    Node(int d){
        data=d;
    }
}
