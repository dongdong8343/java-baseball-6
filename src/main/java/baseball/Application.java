package baseball;
import camp.nextstep.edu.missionutils.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    static int[] arr = new int[10];
    static List<Integer> checkList = new ArrayList<>();
    // 랜덤 3자리 수 생성
    public static String GetAnswer(){
        String answer = "";
        while(answer.length() < 3){
            int num = Randoms.pickNumberInRange(1, 9);
            if(arr[num] == 1) continue;
            arr[num] = 1;
            answer += num;
        }
        System.out.println(answer);
        return answer;
    }
    // 플레이어 수 입력
    public static int InputNum(){
        int num;
        System.out.print("숫자를 입력해주세요 : ");
        try{
            num = Integer.parseInt(Console.readLine());
            if(String.valueOf(num).length() != 3) {
                IllegalArgumentException e = new IllegalArgumentException();
                throw e;
            }
        }catch (IllegalStateException e){
            return -1;
        }
        return num;
    }
    // 스트라이크 수 카운팅
    public static int CountStrike(String answer, String num){
        int cnt = 0;

        for(int i = 0; i < 3; i++){
            if(answer.charAt(i) == num.charAt(i)) cnt++;
            else checkList.add(Integer.parseInt(String.valueOf(num.charAt(i))));
        }

        return cnt;
    }

    // 볼 수 카운팅
    public static int CountBall(){
        int cnt = 0;
        for(int x : checkList){
            if(arr[x] == 1) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String answer = GetAnswer();
        int num = InputNum();
        int strikeCnt = CountStrike(answer, String.valueOf(num));
        int ballCnt = CountBall();

    }
}
