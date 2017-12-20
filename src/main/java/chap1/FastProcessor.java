package chap1;

public class FastProcessor extends  Processor {
    public void sayHello(){

        Thread t = new Thread(super::sayHello);
        t.start();
    }
}
