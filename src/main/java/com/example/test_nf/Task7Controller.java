package com.example.test_nf;

import ClockComponents.ClockComponent;
import ShapeSlidesComponents.ShapeSlidesComponent;
import ImageComponents.ImagePane;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import observerComponents.TimeServer;

import java.net.URL;
import java.util.ResourceBundle;

public class Task7Controller  implements Initializable {
    @FXML
    public StackPane ImagePane;
    @FXML
    public BorderPane TimerText;
    @FXML
    TextField textField;
    @FXML
    public BorderPane MediaPage;
    private TimeServer timeServer;
    private ClockComponent clockComponent;
    private ImageComponents.ImagePane imageComponentPane;

    private ShapeSlidesComponent slidesComponent;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        timeServer = new TimeServer();
        slidesComponent = new ShapeSlidesComponent();
        imageComponentPane = new ImagePane();
        clockComponent = new ClockComponent();


        timeServer.attach(imageComponentPane);
        timeServer.attach(clockComponent);
        timeServer.attach(slidesComponent);

        this.TimerText.setCenter(clockComponent.getClock());
        this.ImagePane.getChildren().add(imageComponentPane.buildJoke());
        this.MediaPage.setCenter(slidesComponent.getPanel());


    }
}