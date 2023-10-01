import java.util.ArrayList;
import java.util.Random;

public class Cartela {


    int[][] cartela = new int[5][5];
    ArrayList<Integer> conferenum = new ArrayList<>();
    int num;


    public int[][] getCartela() {
        return cartela;
    }

    public void setCartela(int[][] cartela) {

        this.cartela = cartela;
    }

    public Cartela() {
        Random random = new Random();
        //conferenum[75] = random.nextInt(76);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                do {
                    num = random.nextInt(15) + (15 * i) + 1;
                } while (conferenum.contains(num));
                conferenum.add(num);
                cartela[j][i] = num;
                cartela[2][2] = -1;
            }

        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.printf("[%4d]", cartela[i][j]);

            }
            System.out.println();

        }

    }
}











