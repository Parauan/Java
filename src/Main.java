public class Main {
    public static void nomain(String[] args) {
        System.out.println("Hello \n" +
                "Vasile");


        int x = 2;
        double y = 3;
        double z = x + y;
        System.out.println(z);

        System.out.println(50/3);

        System.out.println(-5 + 8 * 6);

        System.out.println((55+9) % 9 );

        System.out.println(20 + -3*5 / 8 );

        System.out.println(5 + 15 / 3 * 2 - 8 % 3 );


    }

    public static void main(String[] args) {

        printMyName();
        adunare();
        impartire();
        inmultire();
        procent();
        adunareimpartire();
        adunareinmultire();
        System.out.println("Rezultatul adunarii este: " + adunare(2,3));
        System.out.println("Rezultatul scaderii este: " + scadere(5,3));
        System.out.println("Rezultatul inmultirii este: " + inmultire(7,9));
        System.out.println("Rezultatul impartirii este: " + impartire(10,15));
        java print;
        print.printJAVA();
    }

    public static void printMyName(){

        System.out.println("Hello \n Cosmin");
    }

    public static void adunare(){
        int x = 2;
        double y = 3;
        double z = x + y;
        System.out.println(z);

    }

    public static void impartire(){
        System.out.println(50/3);
    }

    public static void inmultire(){
        System.out.println(-5 + 8 * 6);
    }

    public static void procent(){
        System.out.println((55+9) % 9 );
    }

    public static void adunareimpartire(){
        System.out.println(20 + -3*5 / 8 );
    }

    public static void adunareinmultire(){
        System.out.println(5 + 15 / 3 * 2 - 8 % 3 );
    }


    public static int adunare(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar + alDoileaNumar;

        return rezultat;

    }

    public static int scadere(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar - alDoileaNumar;

        return rezultat;

    }

    public static int inmultire(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar * alDoileaNumar;

        return rezultat;

    }

    public static int impartire(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar / alDoileaNumar;

        return rezultat;

    }
}
