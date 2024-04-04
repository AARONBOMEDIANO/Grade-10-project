/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package project.q3;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Aaron
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Button optionsButton, quitButton, playButton;
    @FXML private ImageView bodybg;
    
    @FXML private void play(ActionEvent event){
    
    }
    @FXML private void options(ActionEvent event){
    
    }
    @FXML private void quit(ActionEvent event){
    
    }
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image img = new Image(getClass().getResourceAsStream("Images/Forest_of_Wales.jpg"));
        bodybg.setImage(img);
    }    
    
}
