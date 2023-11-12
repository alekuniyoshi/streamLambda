import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> cities = new ArrayList<>();

        cities.add("Buenos Aires");
        cities.add("Yokohama");
        cities.add("Tokio");

        //Lamdba
        cities.stream().forEach(System.out::println);

        //Reference to a method
        cities.stream().forEach(Main::printCity);

        //More simple
        cities.forEach(Main::printCity);

        cities.stream().parallel().forEach(System.out::println);

        /*terminal methods is going to be at the final like collect and foreach, if is not a final
          method the stream not return nothing is not been execute.
         */
        cities.stream().filter(city -> city.startsWith("B"))
                .filter(city -> city.contains("n"))
                .forEach(System.out::println);

        List<String> filteredCities = cities.stream().filter(city -> city.startsWith("B"))
                .filter(city -> city.contains("n"))
                .collect(Collectors.toList());

    }

    public static void printCity(String city) {
        System.out.println(city);
    }
}