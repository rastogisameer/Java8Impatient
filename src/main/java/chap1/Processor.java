package chap1;

public class Processor {

    public void process(ProcessString func){
        func.process("a string");
    }
    public void calculate(Calculate2Ints func){
        double c = func.calculate(2,3);
        System.out.println(c);
    }

    public void sayHello(){
        System.out.println("hello");
    }
    public void sayAsync(String freevar){

        new Thread(()-> System.out.println(freevar + this.getClass().getName())).start();
    }
}
