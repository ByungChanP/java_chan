package team.RPG;

import java.util.Random;



public class Player {

    private String Class;
    private int playerHp ;
    private int playerAtk ;
    private int playerDef ;
    private int playerMp;


    public Player(String Name){

        this.playerAtk = 0;
        this.playerDef = 0;
        this.playerHp  = 0;
    }
    void getStatus(){
        do {
            playerAtk = (int) (Math.random() * 10) + 1;
            playerDef = (int) (Math.random() * 10) + 1;
            playerHp = (int) (Math.random() * 10) + 1;
            playerMp = (int) (Math.random() * 10) + 1;
        }while(playerAtk + playerDef + playerHp + playerMp <= 30);
    }
    void viewStatus(){
        System.out.println("Class: " + Class
                + "\nAtk: " + playerAtk
                + "\nDef: " + playerDef
                + "\nHp: " + playerHp
                + "\nMp: " + playerMp);
    }
    void selectJob(int choice){
        Job job = Job.selectJob(choice);
        Class = job.job;
        playerAtk += job.atkBonus;
        playerDef += job.defBonus;
        playerHp  += job.hpBonus;
        playerMp  += job.mpBonus;
    }
}

