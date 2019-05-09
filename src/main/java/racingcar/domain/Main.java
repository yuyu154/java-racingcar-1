package racingcar.domain;

import racingcar.domain.result.RacingGameResult;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> carList = InputView.getCars();
        GameCount gameCount = InputView.getGameCount();
        RacingGameResult racingGameResult = new RacingGame(carList, gameCount).start();
        OutputView.showRacingGameResult(racingGameResult);
        OutputView.showWinners(racingGameResult);
    }
}
