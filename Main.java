/*
 * Functional Interface is the interface having only one abstract method and can have any number of default
 * , static or methods from the object class .or @FunctionalInterface use
 * Functional Interfaces are implemented in 3 different ways to minimize the verbose code .
 * 1."implements" keyword
 * 2."Anonymous" Class
 * 3.Lamda Expression
 * 
 * There are 4 built-in Funcrtional interface and all are within java.lang.function package.
 * 1.Consumer
 * 2.Supplier
 * 3.Function
 * 4.Predicate always return boolean
 * 
 */


public class Main{
    public static void main(String[] args) {
        Bird eg = new Eagle();
        eg.canFly();
            // 2.Using Anonymous Class
            Bird eagBird = new Bird() {
                public void canFly(){
                    System.out.println(" Using Anonymous Class ::Yes");
                }
            };
             eagBird.canFly();
             //3.Using the Lambda Expressions
             Bird wBird = ()->{
                 System.out.println(" Using Lamda Expressions ::Yes");
             };
             wBird.canFly();

             //Calling Consumer
             Consumer<Integer> consumer = (Integer in)->{
                System.out.println("Passed value is" + in);
             };
             consumer.accept(12);

             //Calling Supplier
             Supplier<String> supplier = () -> {
                    System.out.println("Hello !!! It's Supplier Interface ");
                    return "Supplier executed successfully";
                };
                    System.out.println(supplier.get());

            // //Calling Function
            Function<Integer,String> function = (Integer in )-> {
                String output = in.toString();
                return output;
            };
            System.out.println(function.apply(38));


            // Calling Predicate
                    Predicate<Integer> isEven = (Integer x) -> {
                        if(x % 2 == 0){
                            return true;
                        }else{
                            return false;
                        }
                    };
                    System.out.println(isEven.test(98));

    }
}