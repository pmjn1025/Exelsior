package ThreadAttack;

import Heroin.Heroin;
import Monster.RunawayApp;
import Monster.StopRecyclerView;

public class MonsterAttack4 extends Thread {

    public void run() {
        Heroin heroin = new Heroin();
        RunawayApp runawayApp = new RunawayApp();
        runawayApp.name = "안드로이드의 망령";
        runawayApp.hp = 45000;
        runawayApp.level = 5;
        runawayApp.power = 300;
        runawayApp.defense = 60;
        runawayApp.experience = 1000;


        boolean test = true;
        while(true) {
            if(heroin.hp>0) {
                heroin.attacked(runawayApp.atk());
            }
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            test = false;

            if (heroin.hp <= 0) {

                heroin.hp = 0;
                System.out.println("""
                       ####   #####   ##   ###### ##  ##\s
                       ## ##  ##      ##     ##   ##  ##\s
                       ##  ## ##     # ##    ##   ##  ##\s
                       ##  ## ####   # ##    ##   ######\s
                       ##  ## ##    ######   ##   ##  ##\s
                       ## ##  ##    #   ##   ##   ##  ##\s
                       ####   ##### #   ##   ##   ##  ##\s


                                                                """);
                System.out.println("여기까진가??.....");
                System.out.println("당신은 죽었습니다. ==데스엔딩==");
                System.exit(0);
                break;
            }


        }

    }


}
