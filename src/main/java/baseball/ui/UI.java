package baseball.ui;

import java.util.Scanner;

public enum UI {
    INSTANCE;

    private Scanner scanner;

    private UI() {
        scanner = new Scanner(System.in);
    }

    public void printStartMsg() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printHint(String hint) {
        System.out.println(hint);
    }

    public String getInput() {
        System.out.print("숫자를 입력해주세요 : ");

        String input = scanner.nextLine();

        return input;
    }

    public int askRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        int isRestart = Integer.parseInt(scanner.nextLine());

        return isRestart;
    }
}
