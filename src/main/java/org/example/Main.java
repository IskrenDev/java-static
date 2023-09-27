package org.example;

public class Main {
    public static void main(String[] args) {
        Count count1 = new Count();
        Count count2 = new Count();
        Count count3 = new Count();
        Count count4 = new Count();

        count1.incrementInstanceCount();
        count1.incrementInstanceCount();

        count2.incrementInstanceCount();
        count2.incrementInstanceCount();
        count2.incrementInstanceCount();
        count2.incrementInstanceCount();

        count3.incrementInstanceCount();

        Count.incrementTotalCount();
        Count.incrementTotalCount();
        Count.incrementTotalCount();
        Count.incrementTotalCount();
        Count.incrementTotalCount();
        Count.incrementTotalCount();

        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);

        System.out.println("\n");
        System.out.println(Calculator.add(10, 10));
        System.out.println(Calculator.sub(10, 10));
        System.out.println(Calculator.divide(10, 10));
        System.out.println(Calculator.multiply(10, 10));

    }
}