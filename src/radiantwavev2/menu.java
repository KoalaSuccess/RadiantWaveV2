package radiantwavev2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class menu {
    private BufferedImage background = null;
    
    public void render(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Font fnt0 = new Font("agency fb",Font.PLAIN, 30);
        g.setFont(fnt0);
        g.setColor(Color.white);
        
        BufferedImageLoader loader = new BufferedImageLoader();
        try{
        g.drawImage(background,0, 0, null);
        background = loader.loadImage("graphics/menuBG.png");
        }catch(IOException e){
            e.printStackTrace();
        }
        g.drawString("Click anywhere to begin",369, 550);
    }
}
