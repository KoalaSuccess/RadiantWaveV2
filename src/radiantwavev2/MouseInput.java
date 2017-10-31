package radiantwavev2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class MouseInput implements MouseListener {
    private int noMenu = 0;
    public static int attackSpeed = 0;
    private hobospirit e;
    @Override
    public void mouseClicked(MouseEvent e) {
     
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();
        
        if (mx >= 0 && mx <= 960 && noMenu == 0){
            if (my >= 0 && mx <= 720){
                RadiantWaveV2.State = RadiantWaveV2.STATE.GAME;
                try {
                    Thread.sleep(600);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    }
                noMenu ++;
            }
        }
        if (((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (mx >= 0 && mx <= 100)) && (my >= 0 && my <= 50)){
            RadiantWaveV2.State = RadiantWaveV2.STATE.GAME;
            try {
                    Thread.sleep(600);
            } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
        }
        }
        ////////////////////Zurui//////////////////////////////////
        if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (mx >= 105 && mx <= 180) && (my >= 595 && my <= 630) && (battle.randomGen()==0)){
            hobospirit.hoboHealth -= 30;
                if (hobospirit.hoboHealth <= 0){
                    try {
                    Thread.sleep(800);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    }
                    RadiantWaveV2.State = RadiantWaveV2.STATE.GAME;
                    hobospirit.hoboHealth = 300;
                }
        }else if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (mx >= 105 && mx <= 180) && (my >= 595 && my <= 630) && (battle.randomGen()==1)){
            Slime.slimeHealth -= 30;
                if (Slime.slimeHealth <= 0){
                    try {
                    Thread.sleep(800);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    }
                    RadiantWaveV2.State = RadiantWaveV2.STATE.GAME;
                    Slime.slimeHealth = 360;
                }
                        
        }else if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (mx >= 105 && mx <= 180) && (my >= 595 && my <= 630) && (battle.randomGen()==2)){
            Bedsheet.bedsheetHealth -= 30;
                if (Bedsheet.bedsheetHealth <= 0){
                    try {
                    Thread.sleep(800);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    }
                    RadiantWaveV2.State = RadiantWaveV2.STATE.GAME;
                    Bedsheet.bedsheetHealth = 240;
                }
                
        }else if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (mx >= 105 && mx <= 180) && (my >= 595 && my <= 630) && (player.bronixWINS==2)){
            Bronix.bronixHealth -= 20;
                if (Bronix.bronixHealth <= 0){
                    try {
                    Thread.sleep(800);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    }
                    RadiantWaveV2.State = RadiantWaveV2.STATE.WIN;
                }
        }
        ////////////////////Juan/////////////////////////////////////////////
        if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (mx >= 415 && mx <= 490) && (my >= 595 && my <= 630) && (battle.randomGen()==0)){
            hobospirit.hoboHealth -= 20;
                if (hobospirit.hoboHealth <= 0){
                    try {
                    Thread.sleep(800);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    }
                    RadiantWaveV2.State = RadiantWaveV2.STATE.GAME;
                    hobospirit.hoboHealth = 300;
                }
        }else if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (mx >= 415 && mx <= 490) && (my >= 595 && my <= 630) && (battle.randomGen()==1)){
            Slime.slimeHealth -= 20;
                if (Slime.slimeHealth <= 0){
                    try {
                    Thread.sleep(800);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    }
                    RadiantWaveV2.State = RadiantWaveV2.STATE.GAME;
                    Slime.slimeHealth = 360;
                }
                        
        }else if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (mx >= 415 && mx <= 490) && (my >= 595 && my <= 630) && (battle.randomGen()==2)){
            Bedsheet.bedsheetHealth -= 20;
                if (Bedsheet.bedsheetHealth <= 0){
                    try {
                    Thread.sleep(800);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    }
                    RadiantWaveV2.State = RadiantWaveV2.STATE.GAME;
                    Bedsheet.bedsheetHealth = 240;
                }
        }else if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (mx >= 415 && mx <= 490) && (my >= 595 && my <= 630) && (player.bronixWINS==2)){
            Bronix.bronixHealth -= 14;
                if (Bronix.bronixHealth <= 0){
                    try {
                    Thread.sleep(800);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    }
                    RadiantWaveV2.State = RadiantWaveV2.STATE.WIN;
                }
        }
        //////////////////////Luna///////////////////////////////////////
        if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (mx >= 725 && mx <= 800) && (my >= 595 && my <= 630) && (battle.randomGen()==0)){
            hobospirit.hoboHealth -= 37;
                if (hobospirit.hoboHealth <= 0){
                    try {
                    Thread.sleep(800);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    }
                    RadiantWaveV2.State = RadiantWaveV2.STATE.GAME;
                    hobospirit.hoboHealth = 300;
                }
        }else if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (mx >= 725 && mx <= 800) && (my >= 595 && my <= 630) && (battle.randomGen()==1)){
            Slime.slimeHealth -= 37;
                if (Slime.slimeHealth <= 0){
                    try {
                    Thread.sleep(800);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    }
                    RadiantWaveV2.State = RadiantWaveV2.STATE.GAME;
                    Slime.slimeHealth = 360;
                }
                        
        }else if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (mx >= 725 && mx <= 800) && (my >= 595 && my <= 630) && (battle.randomGen()==2)){
            Bedsheet.bedsheetHealth -= 37;
                if (Bedsheet.bedsheetHealth <= 0){
                    try {
                    Thread.sleep(800);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    }
                    RadiantWaveV2.State = RadiantWaveV2.STATE.GAME;
                    Bedsheet.bedsheetHealth = 240;
                }
        }else if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (mx >= 725 && mx <= 800) && (my >= 595 && my <= 630) && (player.bronixWINS==2)){
            Bronix.bronixHealth -= 100;
            System.out.println("HP" + Bronix.bronixHealth);
                if (Bronix.bronixHealth <= 0){
                    try {
                    Thread.sleep(800);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    }
                    RadiantWaveV2.State = RadiantWaveV2.STATE.WIN;
                } 
        }
        ////////////////////////ENEMY/////////////////////////////////////
        if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (battle.randomGen() == 0)){
            if (enemyAttack() == 0){
                battle.playerHealth -= hobospirit.hoboAttack;
                if (battle.playerHealth <= 0){
                    RadiantWaveV2.State = RadiantWaveV2.STATE.GAMEOVER;
                }
            }
        }
        if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (battle.randomGen() == 1)){
            if (enemyAttack() == 0){
                battle.playerHealth -= Slime.slimeAttack;
                if (battle.playerHealth <= 0){
                    RadiantWaveV2.State = RadiantWaveV2.STATE.GAMEOVER;
                }
            }
        }
        if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (battle.randomGen() == 2)){
            if (enemyAttack() == 0){
                battle.playerHealth -= Bedsheet.bedsheetAttack;
                if (battle.playerHealth <= 0){
                    RadiantWaveV2.State = RadiantWaveV2.STATE.GAMEOVER;
                }
            }
        }
        if ((RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE) && (player.bronixWINS == 2)){
            if (enemyAttack() == 0){
                Bronix.bronixHealth -= 100;
                if (battle.playerHealth <= 0){
                    RadiantWaveV2.State = RadiantWaveV2.STATE.GAMEOVER;
                }
            }
        }
    }

    public static int enemyAttack(){
        Random randomGenerator = new Random();
        if (RadiantWaveV2.State == RadiantWaveV2.STATE.BATTLE){
        attackSpeed = randomGenerator.nextInt(1);    
        }
        return attackSpeed;
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
      
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
     
    }
    
}
