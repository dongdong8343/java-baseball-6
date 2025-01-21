package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private static final int BALL_SIZE = 3;
    private static final int RANGE_START = 1;
    private static final int RANGE_END = 9;
    private BaseballNumber computerNumber;

    public Computer() {
        initComputerNumber();
    }

    public void initComputerNumber() {
        List<Integer> uniqueChecker = new ArrayList<>();

        while (uniqueChecker.size() < BALL_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(RANGE_START, RANGE_END);
            if (!uniqueChecker.contains(randomNumber)) uniqueChecker.add(randomNumber);
        }//end while

        this.computerNumber = new BaseballNumber(uniqueChecker);
    }

    public BaseballNumber getComputerNumber(){
        return this.computerNumber;
    }
}
