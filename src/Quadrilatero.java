public class Quadrilatero {
    public static void area(double lado) {
        System.out.println("A area do Quadrado é: "+ (lado * lado));
        
    }
    public static void area(double lado1, double lado2) {
        System.out.println("A area do Reatangulo é: "+ (lado1 * lado2));
        
    }
    public static void area(double baseMaior,double baseMenor, double altura) {
        System.out.println("A area do Trapezio é: "+ ((baseMaior + baseMenor) * altura)/2);
        
    }
}
