package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputUser {

    public List<String> inputNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        return List.of(Console.readLine().split(","));
    }

    public int inputNumber() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String S = Console.readLine();

        return Integer.parseInt(S);
    }
}