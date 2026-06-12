package team.RPG;

import java.util.Scanner;

public class Job {

    int jobNum;
    String job;
    int atkBonus;
    int defBonus;
    int hpBonus;
    int mpBonus;

    public Job(int jobNum, String job, int atkBonus, int defBonus, int hpBonus, int mpBonus) {
        this.jobNum = jobNum;
        this.job = job;
        this.atkBonus = atkBonus;
        this.defBonus = defBonus;
        this.hpBonus = hpBonus;
        this.mpBonus = mpBonus;
    }
    public static Job selectJob(int jobNum){
        switch (jobNum){
            case 1 :
                return new Job(1, "전사", 5, 3, 10, 0);
            case 2 :
                return new Job(2, "궁수", 6, 1, 2, 4);
            case 3 :
                return new Job(3, "마법사", 1, 1, 0, 10);
            default :
                return null;
        }
    }
}
