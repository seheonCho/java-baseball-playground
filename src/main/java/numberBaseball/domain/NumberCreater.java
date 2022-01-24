package numberBaseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberCreater {

    List<Integer> numbers;

    Random random = new Random();

    NumberCreater() {
        clearNumbers();
        this.numbers = new ArrayList<>(Game.NUMBER_OF_NUMBERS);
        setRandomNumbers(random);
    }

    private void setRandomNumbers(Random random) {

        for (int i=0; i<numbers.size(); i++) {
            setNumber(i, random.nextInt(9) + 1);
        }

    }

    private void setNumber(int index, int number) {
        numbers.set(index, number);
    }

    private void clearNumbers() {
        numbers.clear();
    }

    public List<Integer> getNumbers() {
        return this.numbers;
    }

}
