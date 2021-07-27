import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(countElements(myRepo()));

    }


    public static Map<Object, Long> countElements(List<Object> toCountList) {
        return toCountList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
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
