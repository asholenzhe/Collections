package Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.indexOf(0));
        System.out.println(list.size());

        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        LinkedList<Integer> link = new LinkedList();
        link.add(17);
        link.add(32);
        link.add(88);
        link.add(9);
        System.out.println(link.size());
        for (int i = 0; i < link.size(); i++){
            System.out.println(link.get(i));
        }
        System.out.println(link.indexOf(88));
        link.set(0, -2);
        for (int i = 0; i < link.size(); i++){
            System.out.println(link.get(i));
        }

        Iterator<Integer> iter1 = link.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}