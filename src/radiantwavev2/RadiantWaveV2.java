package radiantwavev2;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;
import javax.swing.JFrame;

public class RadiantWaveV2 extends Canvas implements Runnable{
    public static final int WIDTH = 480;
    public static final int HEIGHT = WIDTH / 12 * 9;
    public static final int SCALE = 2;
    public final String TITLE = "Radiant Wave";
    public double battleCount = 0;
    public int direction = 0;
    public int randomBattle = 0;
    public double hisX = 70;
    public double hisY = 660; 
    
    private boolean running = false;
    private Thread thread;
    
    private BufferedImage spriteSheet = null;
    public static BufferedImage background = null;
    public static BufferedImage bronix = null;
    private BufferedImage heroUp,heroDown,heroLeft,heroRight = null;
    
    private player p;
    private menu menu;
    private battle battle;
    
    public static enum STATE{
        MENU,
        GAME,
        BATTLE,
        GAMEOVER,
        WIN
    };
    public static STATE State = STATE.MENU;
    
    public void init(){
        BufferedImageLoader loader = new BufferedImageLoader();
        try{
            spriteSheet = loader.loadImage("graphics/sprite_sheet.png");
            background = loader.loadImage("graphics/dungeonbg1.png");
            bronix = loader.loadImage("graphics/brockBoss.gif");
            heroUp = loader.loadImage("graphics/zUp.gif");
            heroDown = loader.loadImage("graphics/zDown.gif");
            heroRight = loader.loadImage("graphics/zRight.gif");
            heroLeft = loader.loadImage("graphics/zLeft.gif");
        }catch(IOException e){
            e.printStackTrace();
        }
        addKeyListener(new KeyInput(this));
        addMouseListener(new MouseInput());
        this.requestFocus();
        p = new player(hisX,hisY,this);
        menu = new menu();
        battle = new battle();
        }
    
    private synchronized void start(){
        if(running){
            return;
        }    
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    
    private synchronized void stop(){
        if(!running)
            return;
        running = false;
        try{
            thread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.exit(1);
    }
    
    public void run(){
        init();
        long lastTime = System.nanoTime();
        final double amountOfTicks = 30.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        int updates = 0;
        int frames = 0;
        long timer = System.currentTimeMillis();
        
        while (running){
           long now = System.nanoTime();
           delta += (now - lastTime) / ns;
           lastTime = now;
           if (delta >= 1){
               tick();
               updates ++;
               delta--;
               
           }
           render();
           frames++;
           
           if (System.currentTimeMillis() - timer > 1000){
               timer += 1000;
               System.out.println(updates + "Ticks, fps" + frames);
               updates = 0;
               frames = 0;
           }
        }
        stop();
    }
    
    private void tick(){
        if (State == STATE.GAME){
          p.tick();  
        }
    }
            
    private void render(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            createBufferStrategy(2);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        if (State == STATE.GAME){
        g.drawImage(background,0,0,getWidth(),getHeight(),this);
            if (player.bronixWINS == 1){
                g.drawImage(bronix,425,120,100,100,this);
            }
            if (direction == 0){
                g.drawImage(heroDown, 0, 0,this);
                p.render(g);
            }
            if (direction == 1){
                g.drawImage(heroUp, p.getX(), p.getY(),this);
            }else if(direction == 2) {
                g.drawImage(heroDown, p.getX(), p.getY(),this);
            }else if(direction == 3) {
                g.drawImage(heroLeft, p.getX(), p.getY(),this);
            }else if(direction == 4){
                g.drawImage(heroRight, p.getX(), p.getY(),this);
            }
    }else if (State == STATE.MENU){
        menu.render(g);
    }else if (State == STATE.BATTLE){
        battle.render(g);
    }
        g.dispose();
        bs.show();
        randomBattle(g);
    }
    
    public void keyPressed(KeyEvent e){
     int key = e.getKeyCode();
     BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            createBufferStrategy(2);
            return;
        }
     
     if(State == STATE.GAME && State != STATE.BATTLE){
     
     if (key == KeyEvent.VK_RIGHT){
        direction = 4;
        p.setVelX(3);
        //battleCount ++;
     } else if (key == KeyEvent.VK_LEFT){
         direction = 3;
        p.setVelX(-3);
        //battleCount ++;
     } else if (key == KeyEvent.VK_UP){
         direction = 1;
        p.setVelY(-3);
        //battleCount ++;
     } else if (key == KeyEvent.VK_DOWN){
         direction = 2;
        p.setVelY(3);
        //battleCount ++;
     }
     } 
     System.out.println(battleCount);
     System.out.println(p.getY());
     
    }   
    
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode(); 
        if (key == KeyEvent.VK_RIGHT){
        p.setVelX(0);
     } else if (key == KeyEvent.VK_LEFT){
        p.setVelX(0);
     } else if (key == KeyEvent.VK_UP){
        p.setVelY(0);
     } else if (key == KeyEvent.VK_DOWN){
        p.setVelY(0);
     }
    }
    
    public void randomBattle(Graphics g){
        if (18 <= battleCount){
            State = STATE.BATTLE;
         battleCount = 0;
         p.setVelX(0);
         p.setVelY(0);
             }
    }
    
    public BufferedImage getSpriteSheet(){
        return spriteSheet;
    }
public static void main(String args[]){
    RadiantWaveV2 game = new RadiantWaveV2();
    
    game.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
    game.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
    game.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
    
    JFrame frame = new JFrame(game.TITLE);
    frame.add(game);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    
    game.start();
    
}    
   
}
