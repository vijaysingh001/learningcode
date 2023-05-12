package learningjava.practise;

import java.util.Random;

class A {
    private int num;

    public A() {
        Random rand = new Random();
        this.num = rand.nextInt(10) + 1;
    }

    public int minus(B other) {
        return this.num - other.getNum();
    }

    public int plus(B other) {
        return this.num + other.getNum();
    }

    public int output() {
        return this.num;
    }
}

class B {
    private int num;

    public B() {
        Random rand = new Random();
        this.num = rand.nextInt(10) + 11;
    }

    public int minus(A other) {
        return this.num - other.output();
    }

    public int plus(A other) {
        return this.num + other.output();
    }

    public int getNum() {
        return this.num;
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        int result = a.plus(b) - 10 - 20;

        System.out.println("A - B = -10" + a.minus(b));
        System.out.println("B - A = -20" + b.minus(a));
        System.out.println("A + B - 10 - 20=0" + result);
    }
}

