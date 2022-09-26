import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);

        double lado,area,dobroarea;
        System.out.print("Digite o valor do lado do quadrado: ");
        lado = console.nextDouble();

        area=lado*lado;
        dobroarea = area*2;

        System.out.println("valor da área do quadrado é "+ area + " e o dobro do valor da área é "+dobroarea);
        console.close();
    }
}
