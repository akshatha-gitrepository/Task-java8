package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

   public static void getAllCandy(List<Candy> candylist, Function<Candy,Boolean> function){
       List<String> collect = candylist.stream()
               .filter(function::apply)
               .map(Candy::getName)
               .toList();

       collect.forEach(System.out::println);
   }




    public static void main(String[] args) {

        List<Candy> candyLists= List.of(new Candy("whiteCandy", "white", "wrapper"),
                new Candy("redCandy", "red", "striped") ,
                new Candy("blueCandy", "blue", "wrapper"),
                new Candy("yellowCandy", "yellow", "wrapper"),
                new Candy("GreenCandy", "green", "striped"),
                new Candy("purpleCandy", "purple", "striped")

                );

   //   getAllCandy(candyList,c->c.getDecoration().equals("striped"));

        getAllCandy(candyList,c->c.getDecoration().equals("wrapper"));



    }
}