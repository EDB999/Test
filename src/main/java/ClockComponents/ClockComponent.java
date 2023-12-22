package ClockComponents;

import observerComponents.Interfaces.Observer;

import javafx.scene.text.Text;
import observerComponents.Interfaces.Observer;

import java.util.Date;


public class ClockComponent implements Observer {
    private final Text text = new Text();
    @Override
    public void update(Date date) {
        text.setText(date.toString());
    }
    public Text getClock(){
        return this.text;
    }
}
