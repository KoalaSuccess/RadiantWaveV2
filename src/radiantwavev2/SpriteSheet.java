package radiantwavev2;

import java.awt.image.BufferedImage;
import java.io.IOException;
import static radiantwavev2.RadiantWaveV2.background;

public class SpriteSheet {
    
    private BufferedImage heroStand,heroWalk1, heroWalk2;
    
    public SpriteSheet(BufferedImage image){
        this.heroStand = image;
        this.heroWalk1 = image;
        this.heroWalk2 = image;
        
    }
    
    public BufferedImage grabImage1(BufferedImage heroUp){
        BufferedImageLoader loader = new BufferedImageLoader();
        try{
            heroUp = loader.loadImage("graphics/zUp.gif");
        }catch(IOException e){
            e.printStackTrace();
        }
        return heroUp;
    }
    
    public BufferedImage grabImage2(BufferedImage heroDown){
        BufferedImageLoader loader = new BufferedImageLoader();
        try{
            heroDown = loader.loadImage("graphics/zDown.gif");
        }catch(IOException e){
            e.printStackTrace();
        }
        return heroDown;
    }
    
    public BufferedImage grabImage3(BufferedImage heroLeft){
        BufferedImageLoader loader = new BufferedImageLoader();
        try{
            heroLeft = loader.loadImage("graphics/zLeft.gif");
        }catch(IOException e){
            e.printStackTrace();
        }
        return heroLeft;
    }
    
    public BufferedImage grabImage4(BufferedImage heroRight){
        BufferedImageLoader loader = new BufferedImageLoader();
        try{
            heroRight = loader.loadImage("graphics/zRight.gif");
        }catch(IOException e){
            e.printStackTrace();
        }
        return heroRight;
    }
    
}
