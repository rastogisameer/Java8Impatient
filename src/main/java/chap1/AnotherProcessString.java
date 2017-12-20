package chap1;

public interface AnotherProcessString {
    default void printName(){
        System.out.println("ProcessString");
    }
}
