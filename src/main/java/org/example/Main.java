package org.example;

import org.example.Ex1.User;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<User> users= new  ArrayList<>();
        List<Integer> nombres= new ArrayList<>();
        // ex 1
        users.stream().filter(u->u.getAge()>=18).filter(u-> u.isEstActive()).forEach(System.out::println);


        //ex 2
        nombres.stream().filter(n->n%2==0).forEach(System.out::println);

        // ex 3
        String mot ="java";

        StringBuffer motBuffer= new StringBuffer( mot);
        String reverse = motBuffer.reverse().toString();
        if(mot.equals(reverse)){
            System.out.println("palindrome");
        }else {
            System.out.println("pas palindrome");
        }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
}