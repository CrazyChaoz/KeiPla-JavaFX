package GUI_source;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;

/**
 * Created by testuser on 09.05.2017.
 */
public class Multi_End {
    public Multi_End(){
        try {
            UI_FXML.currStage.close();
            UI_FXML.currStage=new Stage(StageStyle.TRANSPARENT);
            UI_FXML.currStage.setTitle("Score");
            Scene s=new Scene(FXMLLoader.load(getClass().getResource("Multi_end.fxml")));
            s.setFill(Color.TRANSPARENT);
            UI_FXML.currStage.setScene(s);
            UI_FXML.currStage.getIcons().add(new Image(this.getClass().getResourceAsStream("res"+ File.separator+"KeiPla-Icon-128.png")));
            UI_FXML.currStage.show();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}