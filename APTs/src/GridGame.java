public class GridGame {
    char[][] fours;

    public int winningMoves(String[] grid) {
        int count = 0;
        fours = new char[grid.length][grid[0].length()];
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length(); j++) {
                fours[i][j] = grid[i].charAt(j);
            }

        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length(); j++) {
                if (move(j, i))
                    count++;
            }
        return count;

    }

    public boolean yes(int x, int y) {
        if (none(x - 1, y) && none(x + 1, y) && none(x, y + 1) && none(x, y - 1) && fours[y][x] == '.') {
            return true;
        } else {
            return false;
        }
    }

    public boolean none(int x, int y) {
        if (x < 0 || x >= fours.length || y < 0 || y >= fours.length) {
            return true;
        } else if (fours[y][x] != '.') {
            return false;
        } else {
            return true;
        }
    }

    public boolean move(int x, int y) {
        if (yes(x, y)) {

            boolean bool = false;
            fours[y][x] = 'X';
            for (int i = 0; i < fours.length; i++)
                for (int j = 0; j < fours[0].length; j++)
                    if (move(j, i))
                        bool = true;

            fours[y][x] = '.';
            return !bool;
        } else
            return false;
    }
}

