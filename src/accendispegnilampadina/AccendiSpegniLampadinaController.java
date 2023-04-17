/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accendispegnilampadina;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author IP5 PRO 16ACH6
 */
public class AccendiSpegniLampadinaController implements Initializable {
    @FXML
    private ImageView imgLampadina;
    @FXML
    private Button btnAccendiSpegni;
    private boolean accesa;
            
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        accesa=false;
        /*
        File file = new File("spenta.png");
        Image image1 = new Image(file.toURI().toString());
        imgLampadina.setImage(image1);
*/
    }    
    public void gestioneClick(ActionEvent event){
        if(accesa){
            File file = new File("spenta.png");
            Image image1 = new Image(file.toURI().toString());
            imgLampadina.setImage(image1);
            accesa=!accesa;
            btnAccendiSpegni.setText("Accendi");
        }else{
            File file = new File("accesa.png");
            Image image1 = new Image(file.toURI().toString());
            imgLampadina.setImage(image1);
            accesa=!accesa;
            btnAccendiSpegni.setText("Spegni");
        }
    }
    
}
