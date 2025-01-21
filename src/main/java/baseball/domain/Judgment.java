package baseball.domain;

import java.util.List;

public class Judgment {
    private static final int BALL_SIZE = 3;

    public Hint judge(List<Integer> userNumber, List<Integer> computerNumber){
        int strikeCount = 0, ballCount = 0;

        for(int i = 0; i < BALL_SIZE; i++){
            if(userNumber.get(i) == computerNumber.get(i)) strikeCount++;
            else if(computerNumber.contains(userNumber.get(i))) ballCount++;
        }//end for

        return new Hint(ballCount, strikeCount);
    }
}
