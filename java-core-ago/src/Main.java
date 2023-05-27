import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        List<People> list = new ArrayList<>();
        list.add(new People(1.75, "Phong"));
        list.add(new People(1.80, "An"));

        Comparator<People> peopleName =  new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return Double.compare(o1.height, o2.height) ; // return <0 => nho => lon <=> an>phong
            }
        };
        Collections.sort(list, peopleName);
        System.out.println(list.get(0).name);

        List<String> list2 = new ArrayList<>();
        list2.add("first");
        list2.add("second");
        list2.add("third");

//        Iterator<String> iterator = list2.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        for (Object element : list2) {
//            System.out.println(element);
//        }

        // java stream API
        Stream<String> stream = list2.stream();
        stream.forEach(e-> System.out.println(e));

    }
}
