package baseball.validator;

import java.util.HashSet;
import java.util.List;

// 입력한 숫자 검증하는 클래스
public class InputValidator {
    private static final int BALL_SIZE = 3;

    public boolean isValidNumber(String input) {
        if (this.hasNoDuplicates(input) && this.checkLength(input) && this.isNumeric(input)) return true;
        else throw new IllegalArgumentException("잘못된 수를 입력하셨습니다.");
    }

    // 중복 수 존재하는지 체크
    private boolean hasNoDuplicates(String input) {
        HashSet<Character> uniqueChecker = new HashSet<>();

        for (char number : input.toCharArray()) {
            uniqueChecker.add(number);
        }

        return uniqueChecker.size() == BALL_SIZE;
    }

    // 3자리 수 체크
    private boolean checkLength(String input) {
        return input.length() == BALL_SIZE;
    }

    // 숫자로 이루어져 있는지 체크
    private boolean isNumeric(String input) {
        return input.matches("[0-9]+");
    }
}
