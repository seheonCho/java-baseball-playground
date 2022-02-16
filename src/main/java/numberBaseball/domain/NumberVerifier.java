package numberBaseball.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberVerifier {

    final Set<Integer> NUMBER_SET = new HashSet<>();

    public NumberVerifier(List<Integer> numbers) {
        numbersVerifier(numbers);
    }

    private void numbersVerifier(List<Integer> numbers) {
        for (int num : numbers) {
            NUMBER_SET.add(num);
        }
        if (numbers.size() != NUMBER_SET.size()) throw new NumberFormatException("게임에 알맞지 않은 숫자들 입니다.");
    }
}
