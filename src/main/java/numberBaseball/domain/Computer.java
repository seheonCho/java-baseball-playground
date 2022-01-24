package numberBaseball.domain;

import java.util.List;

public class Computer {

    NumberCreater numberCreater;
    List<Integer> numbers;

    Computer() {
        numberCreater = new NumberCreater();
    }

    public void setNumbers() {
        this.numbers = numberCreater.getNumbers();
    }
}
