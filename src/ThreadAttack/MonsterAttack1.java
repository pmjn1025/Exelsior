package ThreadAttack;

import Heroin.Heroin;
import Monster.Everywhile;
import Monster.Variable;

public class MonsterAttack1 extends Thread {

    public void run() {
        Heroin heroin = new Heroin();
        Everywhile everywhile = new Everywhile();
        everywhile.name = "계속 도는 while문";
        everywhile.hp = 6000;
        everywhile.stamina = 0;
        everywhile.level = 1;
        everywhile.power = 45;
        everywhile.defense = 10;
        everywhile.experience = 300;


        boolean test = true;
        while(true) {
            if(heroin.hp>0) {
                heroin.attacked(everywhile.atk());
            }
            try {
                Thread.sleep(2000);
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
