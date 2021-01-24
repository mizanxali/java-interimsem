import java.util.io;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");

//        List<String> gNumbers = new ArrayList<>();

//        someBingoNumbers.forEach(number -> {
//            if(number.toUpperCase().startsWith("G")){
//                gNumbers.add(number);
//            }
//        });
//
//        gNumbers.sort((s1, s2) -> s1.compareTo(s2));
//        gNumbers.forEach(gNumber -> System.out.println(gNumber));

        someBingoNumbers
                .stream()
                .map(String::toUpperCase) //same as .map(s -> s.toUpperCase())
                .filter(s -> s.startsWith("G")) //cannot write String::startsWith because startsWith method receives arg
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println); //same as .forEach(item -> System.out.println(item))
    }
}
