import java.util.*;
public class LL1 {
  public static void main(String[] args) {
       LinkedList<String> list=new LinkedList<String>();
       list.addFirst("shiv");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("this");
        list.add("list");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
        list.removeFirst();
     System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
