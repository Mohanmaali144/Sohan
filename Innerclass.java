class Innerclass {
    public static void main(String[] args) {
        Test t = new Test() {

            public void m1() {
                System.out.println("hello");
            }
        };
        t.m1();
    }
}

abstract class Test {

    abstract void m1();
}