import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println(countElements(myRepo()));

    }


    public static Map<String, Long> countElements(List<String> toCountList) {
        return toCountList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static List<String> myRepo(){
        List<String> exStrList = new ArrayList<>();
            exStrList.add("wacław");
            exStrList.add("rusłan");
            exStrList.add("tobiasz");
            exStrList.add("rusłan");
        return exStrList;
    }
}
