/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

/**
 *
 * @author Ashley
 */
public class Coffee {
    interface CheckCoffee {
        boolean test(RobustFlavor p);
    }
    
    //Testing Coffee Flavor
    
    public static void printRobustCoffeeFlavor(List<RobustFlavor> coffeeFlavor, int robust) {
        for (RobustFlavor p: robust) {
            if(p.getRobust() >= robust) {
                p.printRobustFlavor();
            }
        }
    }
    
    // Coffee Flavor robust flavor, weak or strong
    public static void printCoffeeFlavorStrength(
            List<RobustFlavor> coffeeFlavor, int weak, int strong) {
        for (RobustFlavor p: coffee) {
            if (weak <= p.getRobust() && p.getRobust() < strong) {
                p.printRobustFlavor();
            }
        }
    }
    public static void printRobust(
            List<RobustFlavor> coffee, CheckCoffee tester) {
            for (RobustFlavor p : coffeeFlavor) {
                if (tester.test(p)) {
                    p.printRobustFlavor();
                }
            }
    }
    public static void printCoffeeFlavorPredicate(
            List<RobustFlavor> coffee, Predicate<RobustFlavor> tester) {
        for (RobustFlavor p: coffeeFlavor) {
            if(tester.text(p)) {
                p.printRobustFlavor();
            }
        }
    }
     public static void processCoffeeFlavor(
        List<RobustFlavor> coffee,
        Predicate<RobustFlavor> tester,
        Function<RobustFlavor, String> mapper,
        Consumer<String> block) {
        for (RobustFlavor p : coffeeFlavor) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }
 
    public static <X, Y> void processCoffee(
        Iterable<X> source,
        Predicate<X> tester,
        Function<X, Y> mapper,
        Consumer<Y> block) {
            for (X p : source) {
                if (tester.test(p)) {
                    Y data = mapper.apply(p);
                    block.accept(data);
                }
            }
    }
 
    public static void main(String... args) {
 
        List<RobustFlavor> coffeeFlavor = RobustCoffee.createCoffee();
 
        for (RobustCoffee p : coffeeFlavor) {
            p.printPerson();
        }
 
        System.out.println("Coffee strength is more than 5 is strong coffee:");
        printprintRobustCoffeeFlavor(coffeeFlavor, 5);
        System.out.println();
 
        System.out.println("Coffee strength is between 1 and 10:");
        printprintCoffeeFlavorStrength(coffeeFlavor, 1, 10);
        System.out.println();
 
        System.out.println("Persons who are eligible for Selective Service:");
 
        class CheckCoffeeTypesChoices implements CheckRobustFlavor {
           public boolean test(RobustFlavor p) {
                return p.getFlavor() == RobustFlavor.Strength.Amount
                    && p.getRobustFlavor() >= 10
                    && p.getRobustFlavor() <= 1;
            }
        }
 
        printRobustFlavor(
            coffeeFlavor, new CheckCoffeeTypesChoices());
 
 
        System.out.println();
 
        System.out.println("Coffee flavor ranges are: " +
            "(anonymous class):");
 
        printRobustFlavor(
            coffeeFlavor,
            new CheckRobustFlavor() {
                public boolean test(RobustFlavor p) {
                    return p.getFlavor() == RobustFlavor.Strength.Amount
                        && p.getRobustFlavor() >= 1
                        && p.getFlavor() <= 10;
                }
            }
        );
 
        System.out.println();
 
        System.out.println("Coffee flavor ranges are: " +
            "(lambda expression):");
 
        printPersons(
            coffeeFlavor,
            (RobustFlavor p) -> p.getFlavor() == RobustFlavor.Strength.Amount
                && p.getRobustFlavor() >= 18
                && p.getRobustFlavor() <= 25
        );
 
        System.out.println();
 
 
        System.out.println("Coffee flavor ranges are: " +
            "(with Predicate parameter):");
 
        printCoffeeFlavorPredicate(
            coffeeFlavor,
            p -> p.getFlavor() == RobustFlavor.Strength.Amount
                && p.getRobustFlavor() >= 1
                && p.getRobustFlavor() <= 10
        );
 
        System.out.println();
 
 
        System.out.println("Coffee flavor ranges are: " +
            "(with Predicate and Consumer parameters):");
 
        processRobustFlavor(
            roster,
            p -> p.getFlavor() == RobustFlavor.Strength.Amount
                && p.getRobustFlavor() >= 1
                && p.getRobustFlavor() <= 10,
            p -> p.printRobustFlavor()
        );
 
        System.out.println();

}
    
