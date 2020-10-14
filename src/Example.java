import java.util.ArrayList;
import java.util.List;

public class Example<T extends Number> {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Mohammed");
        names.add("Hammad");
        names.add("Ahmed");
        names.add("Abdul");
        names.add("Hassan");
        System.out.println(names);

//        names.removeIf(s -> s.charAt(0) != 'H'  );
//        System.out.println(names);

//        names.sort(Comparator.naturalOrder());
//        System.out.println(names);
        StringBuilder builder = new StringBuilder();
        names.forEach(s -> builder.append(s).append("\t"));
        System.out.println(builder.toString());
    }

}
