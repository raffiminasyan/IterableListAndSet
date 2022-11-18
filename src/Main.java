import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(2);
        ll.add(43);
        ll.add(49);
        for (Integer integer : ll) {
            System.out.print(integer + " ");
        }
    }
}