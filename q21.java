class th1 implements Runnable{
    public void run(){
    try{
    for(int i=0;i<5;i++){
        Thread.currentThread().sleep(1000);
        System.out.println("Hello I am BCA Second Year Student.");
    }
    }
    catch(Exception e){
        System.out.println("Found an Exception.");
    }
    }
}
class th2 implements Runnable{
    public void run(){
    try{
    for(int i=0;i<5;i++){
        Thread.sleep(3000);
        System.out.println("I am well.");
    }
    }
    catch(Exception e){
        System.out.println("Found an Exception.");
    }
    }
}
class q21{
    public static void main(String...s){
        Thread thr1=new Thread(new th1());
        Thread thr2=new Thread(new th2());
        thr1.start();
        thr2.start();
    }
}
