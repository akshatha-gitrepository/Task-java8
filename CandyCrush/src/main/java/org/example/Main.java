package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Main {
    public static void getAllCandy(List<Candy> candylist, Function<Candy, Boolean> function) {
        List<String> collect = candylist.stream()
                .filter(function::apply)
                .map(Candy::getName)
                .toList();
        collect.forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Candy> candyLists = List.of(new Candy("whiteCandy", "white", "wrapper"),
                new Candy("redCandy", "red", "striped"),
                new Candy("redCandy", "red", "wrapper"),
                new Candy("blueCandy", "blue", "wrapper"),
                new Candy("yellowCandy", "yellow", "wrapper"),
                new Candy("GreenCandy", "green", "striped"),
                new Candy("purpleCandy", "purple", "striped")
        );
        //get all the candies based on decoration
        getAllCandy(candyLists,c->c.getDecoration().equals("striped"));
        System.out.println();
        getAllCandy(candyLists, c -> c.getDecoration().equals("wrapper"));
        System.out.println();
        //returns all the candies which are not blue
        List<Candy> candy = candyLists.stream().filter(c -> !c.getColor().equals("blue")).toList();
        candy.stream().map(Candy::getName).toList().forEach(System.out::println);
        System.out.println();
        //applied partitioningBy to the candyList based on "Striped" candy. Return both truelist and falselist
        Map<Boolean, List<Candy>> candyList = candyLists.stream()
                .collect(Collectors.partitioningBy(candy1 -> candy1.getDecoration().equals("striped")));
        candyList.forEach((key, value) -> {
            System.out.println("Striped decoration: " + key);
            value.forEach(candy1 -> System.out.println(candy1.getName()));
        });
        System.out.println();
       //applied groupingBy to the candyList based on "red" color  candy.
        Map<String,List<Candy>> candies = candyLists.stream().filter(c->"red".equalsIgnoreCase(c.getColor()))
                .collect(Collectors.groupingBy(Candy::getColor));
        candies.forEach((key,value)->
        {
            System.out.println("Candy color: " + key);
            value.forEach(candy1 -> System.out.println(candy1.getDecoration()));
        });
        System.out.println();
       //return null if specified candy is not present in the candyList
        String candyName="orange";
        Optional<Candy> candiess= candyLists.stream().filter(c->c.getName().equalsIgnoreCase(candyName)).findFirst();
        System.out.println(candiess.orElse(null));
       // System.out.println(candiess.orElseThrow());
    }
}