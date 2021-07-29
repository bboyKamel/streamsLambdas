import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(countElements(myRepo()));
        System.out.println(filterElements(countElements(myRepo()), "ła"));

    }


    public static Map<Object, Long> countElements(List<Object> toCountList) {
        return toCountList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static Map<Object, Long> filterElements(Map<Object, Long> filteringMap, String mapFilter) {
        return filteringMap.entrySet().stream().filter(x -> x.getKey().toString().contains(mapFilter)).collect(Collectors.toMap(x -> x.getKey(), y -> y.getValue()));
    }

    public static List<Object> myRepo(){
        List<Object> exStrList = new ArrayList();
            exStrList.add("wacław");
            exStrList.add("rusłan");
            exStrList.add("tobiasz");
            exStrList.add("rusłan");
            exStrList.add(7);
            exStrList.add(3);
            exStrList.add(7);
        return exStrList;
    }
}
