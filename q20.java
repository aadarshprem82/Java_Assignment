class th1 extends Thread{
    public void run(){
    try{
    for(int i=0;i<5;i++){
        Thread.sleep(1000);
        System.out.println("Hello I am BCA Second Year Student.");
    }
    }
    catch(Exception e){
        System.out.println("Found an Exception.");
    }
    }
}
class th2 extends Thread{
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
class q20{
    public static void main(String...s){
        th1 thread1=new th1();
        th2 thread2=new th2();
        thread1.start();
        thread2.start();
    }
}
