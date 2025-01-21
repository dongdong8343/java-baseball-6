package baseball.manager;

import baseball.domain.BaseballNumber;
import baseball.domain.Computer;
import baseball.domain.Hint;
import baseball.domain.Judgment;
import baseball.ui.UI;
import baseball.validator.InputValidator;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static final int QUIT = 2;

    private BaseballNumber userNumber;
    private InputValidator inputValidator;
    public GameManager() {
        inputValidator = new InputValidator();
    }

    public void start() {
        UI.INSTANCE.printStartMsg();

        while (true) {
            Computer computer = new Computer();

            while(true){
                String input = UI.INSTANCE.getInput();
                // 입력 수 검증하고 userNumber에 저장
                if (this.inputValidator.isValidNumber(input)) {
                    List<Integer> checkedNumber = new ArrayList<>();

                    for (char number : input.toCharArray()) {
                        checkedNumber.add(Integer.parseInt(String.valueOf(number)));
                    }

                    userNumber = new BaseballNumber(checkedNumber);
                }

                Hint hint = Judgment.INSTANCE.judge(userNumber.getNumber(), computer.getComputerNumber().getNumber());
                UI.INSTANCE.printHint(hint.getHint());
                if(hint.getHint().equals("3스트라이크" + "\n" + "3개의 숫자를 모두 맞히셨습니다! 게임 종료")){
                    break;
                }
            }//end while
            int isRestart = UI.INSTANCE.askRestart();
            if(isRestart == QUIT) break;
        }//end while
    }
}
