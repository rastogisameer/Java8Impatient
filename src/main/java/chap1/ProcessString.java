package chap1;

@FunctionalInterface
public interface ProcessString {
    public void process(String s);
    default void printName(){
        System.out.println("ProcessString");
    }
}