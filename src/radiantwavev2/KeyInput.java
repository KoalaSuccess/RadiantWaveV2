package radiantwavev2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
    RadiantWaveV2 game;
    
    public KeyInput(RadiantWaveV2 game){
        this.game = game;
    }
    
    public void keyPressed(KeyEvent e){
        game.keyPressed(e);
    }   
    
    public void keyReleased(KeyEvent e){
        game.keyReleased(e);
    }
}