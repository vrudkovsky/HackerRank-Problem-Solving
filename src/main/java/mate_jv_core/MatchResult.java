package mate_jv_core;

public class MatchResult {
    public static int matchResult(int r1, int r2, int b1, int b2) {
        //Write code below this line
        return (r1 == b1 && r2 == b2) ? 2 :
                ((r1 > r2 && b1 > b2)
                || (r1 < r2 && b1 < b2)
                || (r1 == r2 && b1 == b2)) ? 1 : 0;
        //Write code above this line
    }

    public static void main(String[] args) {
    }
}
