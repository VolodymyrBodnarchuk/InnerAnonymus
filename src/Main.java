

class Innert{                                // inner class

    public void method2(){             // void method
        System.out.println("Hello World!");

    }
}
public class Main {

    private int i = 15;
    public static void main(String[] args){     // main method

        Inner inner = new Main(). new Inner();
        inner.method();
                                    // call method Diaplay();
        Innert innert = new Innert();
        innert.method2();

        Innert innert1 = new Innert(){
            @Override
            public void method2() {
                System.out.println("Hello Anonymous");
            }

        };
        innert1.method2();


    }

    class Inner {
        private int k = 6;
        void method(){
            System.out.println(i);
        }

    }

}