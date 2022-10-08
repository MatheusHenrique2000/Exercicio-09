import java.util.Scanner;   
public class App{

    public static void main (String[] args) {
        // Faça um progrma que peça a temperatura em graus Fahrenheit,
        // transforme e mostre a temperatura em graus Celsius. C = 5*((F-32) / 9)
        double temperaturaF;
        double temperaturaC;

        System.out.println("programa de temperatura. Bem-vindo!");
        // 1) ação do usuário: temperatura Fahrenheit
        Scanner teclado = new Scanner(System.in);
        temperaturaF = teclado.nextDouble();
        teclado.close();
        // 2) Tarefa do programa
        temperaturaC = 5 * ((temperaturaF-32)/9);
        // 3) Resposta do programa: Mostrar o resultado em Celsius
        System.out.print("A temperatura em °C é ");
        System.out.print(temperaturaC);
    }
}