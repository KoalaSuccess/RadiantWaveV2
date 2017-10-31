package radiantwavev2;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class player {
    public static double x, y;
    public static double velX, velY = 0;
    public static double bronixWINS = 0;
    public static int bronixBATTLE = 0;
    
    private BufferedImage playerDown, playerUp, playerLeft, playerRight;
    private BufferedImage heroUp, heroDown, heroLeft,heroRight;
    
    public player(double x, double y, RadiantWaveV2 game){
        this.x = x;
        this.y = y;
        
        SpriteSheet ss = new SpriteSheet(game.getSpriteSheet());
        playerUp = ss.grabImage1(heroUp);
        playerDown = ss.grabImage2(heroDown);
        playerLeft = ss.grabImage3(heroLeft);
        playerRight = ss.grabImage4(heroRight);
    }
   
    public void tick(){
        x+=velX;
        y+=velY;
        
        if (x <= 0)
            x = 0;
        if (x >= 960 - 22)
            x = 960 - 22;
        if (y < 0)
            y = 0;
        if (y >= 720 - 36)
            y = 720 - 36;
        if ((x >= 382 && x <= 547) && (y >= 0 && y <= 10)){
            BufferedImageLoader loader = new BufferedImageLoader();
            try{
                RadiantWaveV2.background = loader.loadImage("graphics/dungeonbg2.png");
                bronixWINS = 1;
            }catch(IOException e){
                e.printStackTrace();
            }
                x = 450;
                y = 720;
                bronixBATTLE = 10002;
        }
         if ((x >= 0 && x <= 960) && (y >= 0 && y <= 200) && (bronixBATTLE == 10002)){
            System.out.println("hello bronix");
            RadiantWaveV2.State = RadiantWaveV2.STATE.BATTLE;
            bronixWINS = 2;
        }
    }
    public void render(Graphics g){
        g.drawImage(playerDown, (int)x,(int)y,null);
    }
    
    public void renderup(Graphics g){
        g.drawImage(playerUp, (int)x,(int)y,null);
    }
    
    public void renderright(Graphics g){
        g.drawImage(playerRight, (int)x,(int)y,null);
    }
    public void renderleft(Graphics g){
        g.drawImage(playerLeft, (int)x,(int)y,null);
    }
    public int getX(){
        return (int)x;
    }
    
    public int getY(){
        return (int)y;
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    public void setVelX(double velX){
        this.velX = velX;
    }
    public void setVelY(double velY){
        this.velY = velY;
    }
}
