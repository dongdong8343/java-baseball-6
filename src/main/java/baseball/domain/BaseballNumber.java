package baseball.domain;

import java.util.List;

public class BaseballNumber {
    private List<Integer> number;

    public BaseballNumber(List<Integer> number) {
        this.number = number;
    }

    public List<Integer> getNumber() {
        return number;
    }
}
