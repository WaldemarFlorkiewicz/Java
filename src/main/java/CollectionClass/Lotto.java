package CollectionClass;

import java.util.*;

public class Lotto {


    private List<Integer> lotto = new ArrayList<>();
    private List<Integer> lottoResult;


    public void generate() {
        for (int i = 1; i < 50; i++) {
            lotto.add(i);
        }
    }

    Lotto(){
        generate();
        randomize();
    }

    public List<Integer> getLottoResult() {
        return lottoResult;
    }

    public void randomize() {
        Collections.shuffle(lotto);
        lottoResult = lotto.subList(0, 6);
    }


    public int checkResult(List<Integer> numbers) {
        int result = 0;
        for (int i = 0; i < 6; i++) {
            if (lottoResult.contains(numbers.get(i))) {
                result++;
            }
        }
        return result;
    }

}
