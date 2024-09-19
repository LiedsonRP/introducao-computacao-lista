	package repeticao;

public class Bergamaschi {
    
    public static void main(String[] args) {

        int before1 = 0;
        int before2 = 0;
        int actual = 1;
        int step = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println(actual + " ");

            step = actual;

            if (before1 != 0 && before2 != 0) {
                actual = actual + before1 + before2;
            }

            before2 = before1;
            before1 = step;

        }
    }
}
