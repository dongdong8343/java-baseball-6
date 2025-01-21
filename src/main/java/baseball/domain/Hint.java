package baseball.domain;

public class Hint {
    private int ballCount;
    private int strikeCount;

    public Hint(int ballCount, int strikeCount) {
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
    }

    public String getHint(){
        if(this.ballCount == 0 && this.strikeCount == 0){
            return "낫싱";
        }else if(this.strikeCount == 3){
            return "3스트라이크" + "\n" + "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
        }else {
            return this.ballCount + "볼 " + this.strikeCount + "스트라이크";
        }
    }
}
