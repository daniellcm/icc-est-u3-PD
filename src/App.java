import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" -------------- Maze Recursivo --------------");
        System.out.println("Nombre: Daniel Cajas");
        System.out.println("----------------------------------------");
        // runEjerciciosPD();
        runMaze();

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

    public static void runMaze() {
        boolean[][] predefinedMaze = {
                { true, true, true, true },
                { false, true, true, true },
                { true, true, false, true },
                { true, true, true, true }
        };

        // CLASE MAZE con variable global prefenedMaze
        Maze maze = new Maze(predefinedMaze);
        System.out.println("------------ Laberinto Cargado ------------");
        maze.printMaze();

        Cell start = new Cell(0, 0);
        Cell end = new Cell(3, 3);
        System.out.println("Recursivo Completo");

        List<MazeSolver> solvers = Arrays.asList(
                new MazeSolverRecursivo(),
                new MazeSolverRecursivoCompleto()
        );

        MazeSolver solver = solvers.get(0);
        List<Cell> path = solver.getPath(maze.getGrid(), start, end);
        Collections.reverse(path);
        System.out.println(path);

    }
}
