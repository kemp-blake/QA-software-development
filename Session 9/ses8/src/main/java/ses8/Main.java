package src.main.java.ses8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Runnable innerClass = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running...");
            }
        };

        innerClass.run();

        Runnable lambdaWay = () -> System.out.println("Running lambda...");

        lambdaWay.run();

        runRunnable().run();

        IntUnaryOperator square = (x) -> x*x;
        System.out.println(square.applyAsInt(123));

        IntBinaryOperator add = (a, b) -> {int x = a + b; return x;};
        System.out.println(add.applyAsInt(4,5));

        Predicate<String> isShortWord = (s) -> {return s.length() <= 5;};

        System.out.println(isShortWord.test("testing"));

        Consumer<String> print_ = System.out::println;

        print_.accept("will this print?");

        String a = "[LOG] - "; // this is effectively final, won't compile
        Consumer<String> logger = (s) -> System.out.println(a+s);
        logger.accept("crashed!");

        List<String> names = new ArrayList<>(Arrays.asList("chris","adam","bev"));
        names.sort((ab, bc) -> ab.compareTo(bc));

        System.out.println(names);

        names.forEach((s) -> System.out.println(s));
        names.forEach(System.out::println);
        for (String abc : names){
            System.out.println(abc);
        }

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        nums.removeIf((n) -> n % 2 == 0);
        System.out.println(nums);

        class Inside{
            String name = "example";
            void test(){
                Runnable r = () -> System.out.println("this.name = " + this.name);
                r.run();
            }
        }
        new Inside().test();

        List<String> words = Arrays.asList("one", "two", "three");
        words.forEach(System.out::println);

        List<String> upper = words.stream()
            .map(String::toUpperCase)
            .toList();
        System.out.println(upper);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        numbers.stream()
            .filter((n) -> n% 2 != 0)
            .forEach(System.out::println);
        Predicate<Integer> isGreaterThan3 = (n) -> n > 3;
        numbers.stream()
            .filter(isGreaterThan3)
            .forEach(System.out::println);

        List<String> names2 = Arrays.asList("chris", "bev", "adam");

        // without stream
        for (String name : names2) {
            if (name.length() > 3) {
                System.out.println(name.toUpperCase());
            }
        }

        // with stream
        names2.stream()
            .filter((n) -> n.length() > 3)
            .map(String::toUpperCase)
            .forEach(System.out::println);

        List<String> words2 = Arrays.asList("Cat", "dog", "rabbit");

        long count = words2.stream()
            .filter((n) -> n.length() > 3)
            .count();
        System.out.println(count);

        List<Integer> nums1 = Arrays.asList(1,2,3,4,5,6);
        int sum = nums1.stream()
                    .reduce(0, (y, z) -> y + z);

        System.out.println(sum);

        List<String> upper2 = words2.stream()
                                    .map(String::toUpperCase)
                                    .toList();

        System.out.println(upper2);

        List<Customer> customers = Arrays.asList(
            new Customer("John", "London"),
            new Customer("Sarah", "New York"),
            new Customer("Jane", "Paris")
            );
        
        customers.stream()
                .filter((c) -> c.getCity().equals("London"))
                .map(Customer::getName)
                .forEach(System.out::println);
        
        Optional<Customer> first = customers.stream()
                                            .filter((c) -> c.getCity().equals("London"))
                                            .findFirst();

        first.ifPresent((c) -> System.out.println(c.getName()));


    }
    public static Runnable runRunnable() {
        return () -> System.out.println("Running wrapper...");
    }
}