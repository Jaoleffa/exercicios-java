import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Testando set básico e suas operações
        /*
        Set<String> set = new LinkedHashSet<>(); //new TreeSet<> vai ordenado ou new LinkedHashShet<> mantém a ordem dos fatores incluidos
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        set.remove("Notebook");
        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }

         */

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
        //Juntando conjunto c com a + b
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);
        //intersection, apenas elementos em comum
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);
        //difference, produtos diferentes apenas
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}