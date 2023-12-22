package itemsBuilder.Interfaces;

import itemsBuilder.Joke;

public interface IBuilder {
    public void setImage();
    public void setText();
    public void setFont();
    public void setColor();
    public Joke build();
}
