import java.util.*;

public class main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        Collection arrayList = new ArrayList();
        Collection linkedList = new LinkedList();
        Collection hashSet = new HashSet();
        Collection linkedHashSet = new LinkedHashSet();
        Collection treeSet = new TreeSet();
        for (int i = 0; i < 10; i++) {
            arrayList.add(generator.next());
        }
        for (int i = 0; i < 10; i++) {
            linkedList.add(generator.next());
        }
        for (int i = 0; i < 10; i++) {
            hashSet.add(generator.next());
        }
        for (int i = 0; i < 10; i++) {
            linkedHashSet.add(generator.next());
        }
        for (int i = 0; i < 10; i++) {
            treeSet.add(generator.next());
        }
        System.out.println("Arraylist contents " + arrayList);
        System.out.println("Linkedlist contents " + linkedList);
        System.out.println("Hashset contents " + hashSet);
        System.out.println("LinkedHashSet contents " + linkedHashSet);
        System.out.println("TreeSet contents " + treeSet);
    }
}