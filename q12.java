class cont{
    cont(){
        System.out.println("Here I am a \"Default\" constructor.");
    }
    cont(int a){
        System.out.println("Parameterized Constructor with value "+a);
    }
    cont(cont c){
        System.out.println("Copy Constructor Called.");
    }
}
class q12{
    public static void main(String...S){
        cont c1=new cont();
        cont c2=new cont(5);
        cont c3=new cont(c2);
    }
}
