package InternalClasses;

public class Excercise {
    public static void main(String[] args) {

        int[] tab = {9, 8, 7, 6, 5, 4, 3, 2, 1, 11, 45, 67, 100};

        Sortable sortable = new Sortable() {
            @Override
            public void sort(int[] tab) {
                int n = tab.length;
                int temp = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 1; j < (n - i); j++) {
                        if (tab[j - 1] > tab[j]) {
                            temp = tab[j - 1];
                            tab[j - 1] = tab[j];
                            tab[j] = temp;
                        }

                    }

                }
                for (int a : tab) {
                    System.out.print(a + " ");
                }
            }

        };

        sortable.sort(tab);

    }
}
