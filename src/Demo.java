import java.util.Random;

public class Demo {
    public static void function1(){
        Random random = new Random();
        int a = random.nextInt() % 1000;
        int b = random.nextInt() % 1000;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        if(a > b)
            System.out.println("a>b");
        else if(a == b)
            System.out.println("a=b");
        else {
            System.out.println("a<b");
        }
    }

    public static void main(String[] args){
        function1();
    }
}