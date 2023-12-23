public class Solution {
    public boolean isPathCrossing(String path) {
        Set<Pair<Integer, Integer>> set = new HashSet<>();
        int x = 0, y = 0;
        set.add(new Pair<>(x, y));

        for (char ch : path.toCharArray()) {
            if (ch == 'N') y++;
            else if (ch == 'E') x++;
            else if (ch == 'S') y--;
            else x--;

            if (set.contains(new Pair<>(x, y))) {
                return true;
            }

            set.add(new Pair<>(x, y));
        }

        return false;
    }};