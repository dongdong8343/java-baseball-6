package baseball;
import camp.nextstep.edu.missionutils.*;
public class Application {
    static int[] arr = new int[10];
    static String answer = "";
    public static void GetAnswer(){
        while(answer.length() < 3){
            int num = Randoms.pickNumberInRange(1, 9);
            if(arr[num] == 1) continue;
            arr[num] = 1;
            answer += num;
        }
    }
    // 플레이어 수 입력 -> 잘못 입력하면 예외 처리
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
    public static void main(String[] args) {
        GetAnswer();
        System.out.println(InputNum());
    }
}
