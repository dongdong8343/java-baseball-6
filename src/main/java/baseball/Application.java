package baseball;
import camp.nextstep.edu.missionutils.*;
public class Application {
    static int[] arr = new int[10];
    static String answer = "";
    public static void GetNum(){
        while(answer.length() < 3){
            int num = Randoms.pickNumberInRange(1, 9);
            if(arr[num] == 1) continue;
            arr[num] = 1;
            answer += num;
        }
    }
    public static void main(String[] args) {
        GetNum();

    }
}
