import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");



    }


    public Map<String, Long> countElements(List<String> toCountList) {
        return toCountList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
