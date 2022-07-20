package bms.player.beatoraja.play;

import bms.player.beatoraja.MainController;
import bms.player.beatoraja.ScoreData;

public class MyBestTargetProperty extends TargetProperty {

    @Override
    public int getTarget(MainController main) {
        ScoreData now = main.getPlayDataAccessor().readScoreData(main.getPlayerResource().getBMSModel()
                , main.getPlayerConfig().getLnmode());

        System.out.println(now);
        return now.getExscore();
    }

    @Override
    public String getName() {
        return "My Best";
    }
}
