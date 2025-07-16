
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" -------------- Fibonacci --------------");
        System.out.println("Nombre: Daniel Cajas");
        System.out.println("----------------------------------------");
        runEjerciciosPD();
    }

    public static void runEjerciciosPD() {
            EjerciciosPD ejerciciosPD = new EjerciciosPD();
            System.out.println("Fibonacci Recursivo");
            long start = System.nanoTime();
            Long resultado = ejerciciosPD.getFibonaci(100);
            long end = System.nanoTime();
            long duracion = end - start;
            System.out.println("Resultado = " + resultado + " , Tiempo = " + duracion);
            
            System.out.println("Fibonacci Recursivo con Catching");
            start = System.nanoTime();
            resultado = ejerciciosPD.getFibonaciPD(5);
            end = System.nanoTime();
            duracion = end - start;
            System.out.println("Resultado = " + resultado + " , Tiempo = " + duracion);
        }
}
