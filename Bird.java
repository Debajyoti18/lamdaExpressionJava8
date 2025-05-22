// public interface Bird {
//     void canFly();// public abstract automatically
//     default void canSing(){
//         System.err.println("KooKoo");
//     }
//     static void bColor(){
//         System.out.println("Black");
//     }
//     String toString();
    
// }
@FunctionalInterface
public interface Bird {

    void canFly();
}