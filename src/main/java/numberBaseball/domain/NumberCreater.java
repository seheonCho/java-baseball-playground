package numberBaseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberCreater {

    final static Random random = new Random();
    List<Integer> numbers;

    NumberCreater() {
        this.numbers = new ArrayList<>(Game.NUMBERS_OF_GAME);
        setRandomNumbers(numbers);
    }

    private void setRandomNumbers(List<Integer> numbers) {

        for (int i=0; i<numbers.size(); i++) {
            setNumber(i, random.nextInt(9) + 1);
        }

    }

    private void setNumber(int index, int number) {
        numbers.set(index, number);
    }

    public List<Integer> getNumbers() {
        return this.numbers;
    }

}
