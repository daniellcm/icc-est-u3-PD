import java.util.ArrayList;
import java.util.List;

public class MazeSolverRecursivoCompleto implements MazeSolver{
     public List<Cell> getPath(boolean[][] grid, Cell start, Cell end) {
        List<Cell> path = new ArrayList<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        if (findPath(grid, start, end, path, visited)) {
            return path;
        }
        return new ArrayList<>(); 
    }

     private boolean findPath(boolean[][] grid, Cell start, Cell end, List<Cell> path, boolean[][] visited) {
         int row = start.row;
         int col = start.col;

        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length)
            return false;
        if (!grid[row][col] || visited[row][col])
            return false;

        visited[row][col] = true;
        path.add(new Cell(row, col));

        if (row == end.row && col == end.col) {
            return true;
        }

        if (findPath(grid, new Cell(row + 1, col), end, path, visited) ||
            findPath(grid, new Cell(row, col + 1), end, path, visited) ||
            findPath(grid, new Cell(row - 1, col), end, path, visited) ||
            findPath(grid, new Cell(row, col - 1), end, path, visited)) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
     }
}
