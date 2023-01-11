import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Treugolnik treugolnik=new Treugolnik();
        treugolnik.a= scan.nextDouble();
        treugolnik.b= scan.nextDouble();
        treugolnik.c= scan.nextDouble();
        treugolnik.area();
    }
}