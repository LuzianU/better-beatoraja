package bms.player.beatoraja.play;

import bms.player.beatoraja.MainController;
import bms.player.beatoraja.ScoreData;

public class MyBestTargetProperty extends TargetProperty {

    @Override
    public int getTarget(MainController main) {
        ScoreData now = main.getPlayDataAccessor().readScoreData(main.getPlayerResource().getBMSModel()
                , main.getPlayerConfig().getLnmode());

        if(now == null)
            return 0;
        return now.getExscore();
    }

    @Override
    public String getName() {
        return "My Best";
    }
}
