package ImageComponents;

import itemsBuilder.Joke;
import itemsBuilder.JokeBuilder;
import itemsBuilder.JokeDirector;
import javafx.animation.FadeTransition;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import observerComponents.Interfaces.Observer;

import java.util.Date;

public class ImagePane implements Observer {
    private JokeDirector jokeDirector;
    private final JokeBuilder jokeBuilder;
    private Joke joke;
    private final FadeTransition fade = new FadeTransition();

    public ImagePane(){
        jokeBuilder = new JokeBuilder();
        jokeDirector = new JokeDirector();
        joke = jokeDirector.Construct(jokeBuilder);

        fade.setNode(this.joke.getPanel());
        fade.setCycleCount(1000);
    }

    public StackPane buildJoke(){
        return joke.getPanel();
    }

    @Override
    public void update(Date date) {
        if (date.getSeconds() % 5 == 0){
            fade.setDuration(new Duration(1200));
            fade.setFromValue(0.0);
            fade.setToValue(1.0);
            fade.play();
            this.joke = new JokeDirector().Construct(jokeBuilder);
        }
        else{
            fade.stop();
        }
    }
}
