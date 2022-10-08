package ThreadAttack;

import Heroin.Heroin;
import Monster.BadCondingMento;
import Monster.Boss;

public class MonsterAttack6 extends Thread{

    public void run() {
        Heroin heroin = new Heroin();
        Boss boss = new Boss();
        boss.name = "뽀스";
        boss.hp = 475000;
        boss.level = 10;
        boss.power = 540;
        boss.defense = 100;
        boss.experience = 10000;


        boolean test = true;
        while(true) {
            if(heroin.hp>0) {
                heroin.attacked(boss.atk());
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
