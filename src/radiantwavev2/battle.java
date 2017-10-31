package radiantwavev2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import javax.swing.JFrame;

public class battle {
    JFrame frame = new JFrame("Battle!");
    
    private BufferedImage background = null;
    private BufferedImage zurui = null;
    private BufferedImage juan = null;
    private BufferedImage luna = null;
    private BufferedImage turnGO = null;
    private BufferedImage hobo = null;
    private BufferedImage slime = null;
    private BufferedImage bedsheet = null;
    private BufferedImage bronix = null;
    public static int whichBattle = 0;
    public static int playerHealth = 900;
        
        public void render(Graphics g){
        Font fnt0 = new Font("agency fb",Font.PLAIN, 20);
        g.setFont(fnt0);
        
        BufferedImageLoader loader = new BufferedImageLoader();
        try{
        g.drawImage(background,0, 0,null);
        g.drawImage(zurui,25,540,null);
        g.drawImage(juan,335, 540,null);
        g.drawImage(luna,645,540,null);
        background = loader.loadImage("graphics/battlebg1.png");
        zurui = loader.loadImage("graphics/zuruibattle.png");
        juan = loader.loadImage("graphics/juanbattle.png");
        luna = loader.loadImage("graphics/lunabattle.png");
        }catch(IOException e){
            e.printStackTrace();
        }
        g.setColor(Color.GREEN);
        g.fillRoundRect(30, 660, playerHealth, 15,45,70);
        
        g.setColor(Color.yellow);
        g.drawRect(0,0,100,50);
        g.drawString("H E A L T H",450, 699);
//        g.setColor(Color.black);
//        g.drawRect(415,595,75,35);
//        g.drawRect(725,595,75,35);
//        g.drawRect(105,595,75,35);
        
        if (player.bronixWINS == 2){
        battle4(g);
        }else if ((randomGen() == 0) && (player.bronixWINS != 2)) {
        battle1(g);
        }else if ((randomGen() == 1) && (player.bronixWINS != 2)){
        battle2(g);
        }else if ((randomGen() == 2)&& (player.bronixWINS != 2)){
        battle3(g);
      }
        }
        
        
        public static int randomGen(){
        Random randomGenerator = new Random();
        int randomInt = whichBattle;
        if (RadiantWaveV2.State == RadiantWaveV2.STATE.GAME){
        whichBattle = randomGenerator.nextInt(3);    
        }
        return randomInt;
    }
        
        public void battle1(Graphics g){
    g.drawImage(hobo,375,200,null);
    g.setColor(Color.GREEN);
    g.fillRect(340,450,hobospirit.hoboHealth,10);
    
    BufferedImageLoader loader = new BufferedImageLoader();
    try{
    hobo = loader.loadImage("graphics/hobo.png");
    }catch(IOException e){
            e.printStackTrace();    
            
    }
}
      
        public void battle2 (Graphics g){ 
     g.drawImage(slime, 375, 275, null);
     g.setColor(Color.GREEN);
     g.fillRect(340,450,Slime.slimeHealth,10);
     
    BufferedImageLoader loader = new BufferedImageLoader();
    try{
    slime = loader.loadImage("graphics/slime.png");
    }catch(IOException e){
            e.printStackTrace();
    
        }
        }
        
        public void battle3 (Graphics g){  
     g.drawImage(bedsheet, 375, 200, null);
     g.setColor(Color.GREEN);
     g.fillRect(340,450, Bedsheet.bedsheetHealth,10);
           
    BufferedImageLoader loader = new BufferedImageLoader();
    try{
    bedsheet = loader.loadImage("graphics/bedsheet.png");
    }catch(IOException e){
            e.printStackTrace();
        }
            
        }
        public void battle4 (Graphics g){
     g.drawImage(bronix,375,150,null);
            
    BufferedImageLoader loader = new BufferedImageLoader();
    try{
    bronix = loader.loadImage("graphics/brockBoss.gif");
    g.setColor(Color.RED);
    g.fillRect(0,450, Bronix.bronixHealth,30);
    g.setColor(Color.YELLOW);
    g.drawString("B R O N I X   H E A L T H",425, 473);
    }catch(IOException e){
            e.printStackTrace();
              
        }
        }

}

