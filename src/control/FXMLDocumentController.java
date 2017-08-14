package control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import Modelo.AcImagenes;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author HOGAR
 */
public class FXMLDocumentController implements Initializable {
    
    Modelo.AcImagenes AcIma;
    Timeline tLine;
    
    @FXML
    private Label lbImagen;
           
    @FXML
    public void secuencia(){
        tLine = new Timeline(
                new KeyFrame(Duration.seconds(2),
                        new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        sigImage();
                    }
                }));

        tLine.setCycleCount(Timeline.INDEFINITE);
        tLine.play();
        lbImagen.setGraphic(new ImageView(AcIma.retImagen()));
        tLine.play(); 
    }
    
    @FXML
    public void sigImage(){
        lbImagen.setGraphic(new ImageView(AcIma.retImagen()));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        AcIma = new AcImagenes();
        secuencia();
    }    
    
}
