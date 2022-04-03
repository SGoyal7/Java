import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        //System.out.println(count(5, 3));
        //path("", 3, 3);
        //System.out.println(pathDiagonal("", 3, 3));

        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };
        int[][] path = new int[board.length][board[0].length];
        //pathObstacles("",board, 0,0);
        //Allpaths("", board, 0, 0);
        AllpathsPrint("", board, 0, 0, path, 1);
    }

    static int count(int r, int c) {
        if(r == 1 || c == 1) {
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);
        return left + right;
    }

    static void path(String p, int r, int c) {
        if(r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if(r > 1) {
            path(p + 'D', r - 1, c);
        }
        if(c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathList(String p, int r, int c) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1) {
            list.addAll(pathList(p + 'D', r - 1, c));
        }
        if(c > 1) {
            list.addAll(pathList(p + 'R', r, c - 1));
        }
        return list;
    }

    static ArrayList<String> pathDiagonal(String p, int r, int c) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        
        if(r > 1 && c > 1) {
            list.addAll(pathDiagonal(p + 'D', r - 1, c-1));
        }
        if(r > 1) {
            list.addAll(pathDiagonal(p + 'V', r - 1, c));
        }
        if(c > 1) {
            list.addAll(pathDiagonal(p + 'H', r, c - 1));
        }
        return list;
    }

    static void pathObstacles(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false) {
            return;
        }

        if(r < maze.length - 1) {
            pathObstacles(p + 'D', maze, r +1, c);
        }
        if(c < maze[0].length - 1) {
            pathObstacles(p + 'R', maze, r, c +1);
        }
    }

    static void Allpaths(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if(maze[r][c] == false) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;

        if(r < maze.length - 1) {
            Allpaths(p + 'D', maze, r +1, c);
        }
        if(c < maze[0].length - 1) {
            Allpaths(p + 'R', maze, r, c +1);
        }

        if(r > 0) {
            Allpaths(p + 'U', maze, r-1, c);
        }
        if(c > 0) {
            Allpaths(p + 'L', maze, r, c - 1);
        }

        //this line is where the function will be over
        //so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }

    static void AllpathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(maze[r][c] == false) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1) {
            AllpathsPrint(p + 'D', maze, r +1, c, path, step+1);
        }
        if(c < maze[0].length - 1) {
            AllpathsPrint(p + 'R', maze, r, c +1, path, step+1);
        }

        if(r > 0) {
            AllpathsPrint(p + 'U', maze, r-1, c, path, step+1);
        }
        if(c > 0) {
            AllpathsPrint(p + 'L', maze, r, c - 1, path, step+1);
        }

        //this line is where the function will be over
        //so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
