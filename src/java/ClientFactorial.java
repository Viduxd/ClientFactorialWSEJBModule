import java.util.Scanner;

public class ClientFactorial {
    
    public static void main(String[] args) {
        System.out.println("Introduce el número para calcular su factorial:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("El factorial de " + num + " es " + factorial(num) + ".");
    }

    private static Integer factorial(int parameter) {
        factorial.FactorialWS_Service service = new factorial.FactorialWS_Service();
        factorial.FactorialWS port = service.getFactorialWSPort();
        return port.factorial(parameter);
    }
    
}
