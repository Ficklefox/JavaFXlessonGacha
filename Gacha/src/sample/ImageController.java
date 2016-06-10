package sample;

import javafx.scene.image.Image;

import java.util.Random;

/**
 * Created by FickleFox on 2016/06/09.
 */
public class ImageController {

    Image[] images_normal;
    Image[] images_rare;
    Image[] images_superrare;

    Random rnd = new Random();

    public ImageController(){

        images_normal = new Image[4];
        for (int i = 0; i < 4; i++) {
            images_normal[i]= new Image("resources/normal/00"+i+".jpg");
        }
        images_rare = new Image[4];
        for (int i = 0; i < 4; i++) {
            images_rare[i]= new Image("resources/rare/00"+i+".jpg");
        }
        images_superrare = new Image[4];
        for (int i = 0; i < 4; i++) {
            images_superrare[i]= new Image("resources/superrare/00"+i+".jpg");
        }
    }

    public Image getRandomImage(Rarity rarity){
        int t=rnd.nextInt(4);
        switch (rarity) {
            case normal:
                return images_normal[t];
            case rare:
                return images_rare[t];
            case superrare:
                return images_superrare[t];
            default:
                return null;
        }
    }

}

enum Rarity{normal,rare,superrare}
