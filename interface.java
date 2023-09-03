
interface FuncInterface {

    void abstractFun();

    default void normalFun() {
        m2();
        System.out.println("Hello");
    }

    private static void m2() {
        System.out.println("hello Ashi");
    }

    static void m1() {
        m2();
        System.out.println("hello sohan");
    }
}

class Test1 implements FuncInterface {
    public void abstractFun() {
        System.out.println("mohan");
        FuncInterface.m1();
    }

    public void normalFun() {
        FuncInterface.super.normalFun();
        System.out.println("Hello1");
    }
}

class Test {
    public static void main(String args[]) {
        Test1 sohan = new Test1();
        sohan.normalFun();
    }
}
