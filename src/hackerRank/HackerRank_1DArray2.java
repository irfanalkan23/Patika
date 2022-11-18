package hackerRank;

import java.util.Scanner;

public class HackerRank_1DArray2 {
//    public static boolean canWin(int leap, int[] game) {
//        // Return true if you can win the game; otherwise, return false.
//        boolean win = false;
//        int i = 0;
//
//        while (i < game.length){
//
//            while (game[i+1] == 0){
//                i++;
//            }
//
//            if(game[i + leap] == 0){
//                i += leap;
//                continue;
//            }
//
//            boolean check = false;
//            if((i + leap) > game.length){
//                win = true;
//                break;
//            } else {
//                for (int j = 1; j <= leap - 2; j++) {
//                    i--;
//                    if(game[i + leap] == 0){
//                        i += leap;
//                        check = true;
//                    }
//                    if (check){
//                        break;
//                    }
//                }
//                if (check){
//                    break;
//                }
//            }
//        }
//        if (i > game.length - 1){
//            win = true;
//        }
//        return win;
//    }

//    private static boolean solve(int leap, int[] game, int i) {
//        if (i < 0 || game[i] == 1) {
//            return false;
//        }
//
//        game[i] = 1;
//
//        return solve(leap, game, i + leap) || solve(leap, game, i + 1) || solve(leap, game, i - 1);
//    }

    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap,game,0);
    }

    public static boolean isSolvable(int leap, int[] game, int i){
        if (i >= game.length){
            return true;
        }
        if (i < 0 || game[i] == 1){
            return false;
        }
        game[i] = 1;

        return isSolvable(leap, game, i + leap) ||
                isSolvable(leap, game, i + 1) ||
                isSolvable(leap, game, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
