package bms.player.beatoraja.launcher;

import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import com.portaudio.DeviceInfo;

import bms.player.beatoraja.AudioConfig;
import bms.player.beatoraja.Config;
import bms.player.beatoraja.PlayerConfig;
import bms.player.beatoraja.TableData;
import bms.player.beatoraja.AudioConfig.DriverType;
import bms.player.beatoraja.AudioConfig.FrequencyType;
import bms.player.beatoraja.audio.PortAudioDriver;
import bms.player.beatoraja.song.SongDatabaseAccessor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class BetterBeatorajaView implements Initializable {

    @FXML
    public CheckBox disableIllegalSongsCheck;

    private PlayerConfig player;
    private Config config;

    public void initialize(URL arg0, ResourceBundle arg1) {
    }
    public void commitPlayer(PlayerConfig player) {
        System.out.println(">BB< commit player");
        this.player = player;
        if(this.player == null) {
            return;
        }
        //enableRequest.setSelected(this.player.getRequestEnable());
    }

    public void commitConfig(Config config) {
        System.out.println(">BB< commit config");
        this.config = config;
        if(this.config == null) {
            return;
        }
        config.setDisableIllegalSongsCheck(disableIllegalSongsCheck.isSelected());
    }

    public void update(Config config) {
        disableIllegalSongsCheck.setSelected(config.isDisableIllegalSongsCheck());
    }
}
