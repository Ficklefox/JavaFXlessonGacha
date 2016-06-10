package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.*;

import java.util.Random;

public class Controller {

    @FXML
    private Button button1;

    @FXML
    private Label resultText;

    @FXML
    private ImageView resultImage;

    Random rnd = new Random();
    ImageController ic=new ImageController();

    public void Gacha(){
        int t=rnd.nextInt(100);
        Image image;
        String label;
        if (t>90){
            label="大当たり";
            image=ic.getRandomImage(Rarity.superrare);
        }
        else if (t>50){
            label="当たり";
            image =ic.getRandomImage(Rarity.rare);
        }
        else{
            label="ハズレ";
            image =ic.getRandomImage(Rarity.normal);
        }

        resultImage.setImage(image);
        resultText.setText(label);
    }
}
