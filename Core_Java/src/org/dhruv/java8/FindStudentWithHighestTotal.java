package org.dhruv.java8;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindStudentWithHighestTotal {

    public static void main(String[] args) {
        Map<String, List<Integer>> marks = Map.of("Deetya",List.of(100,100,100),
                "Dhruv",List.of(100,89,94),
                "Aneri",List.of(100,95,94));

        //Stream.of(marks).map((k,v) -> (k,FindStudentWithHighestTotal::findTotal)).forEach(System.out::print);

        /*Map<String, Integer> totalMarksMap = marks.entrySet().stream().collect(Collectors.toMap(
                e -> e.getKey(),
                e-> FindStudentWithHighestTotal.findTotal(e.getValue())));*/

        Map<String, Integer> totalMarksMap = marks.entrySet().stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                e-> e.getValue().stream().reduce(0,Integer::sum)));

        Optional<Map.Entry<String, Integer>> highestMark = totalMarksMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).findFirst();

        System.out.println(highestMark.get());

        /*totalMarksMap.entrySet().stream().forEach(e ->
                System.out.println(e.getKey()+" -- > "+ e.getValue()));*/

        //Stream.of(marks).collect(Collectors.toMap(k,FindStudentWithHighestTotal::findTotal));
    }

    static int findTotal(List<Integer> list){
        return list.stream().reduce(0,Integer::sum);
    }
}
