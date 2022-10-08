package ThreadAttack;

import Heroin.Heroin;
import Monster.Everywhile;
import Monster.SilenceJava;

public class MonsterAttack2 extends Thread {

    public void run() {
        Heroin heroin = new Heroin();
        SilenceJava silenceJava = new SilenceJava();
        silenceJava.name = "침묵하는 자바";
        silenceJava.hp = 20000;
        silenceJava.level = 1;
        silenceJava.power = 80;
        silenceJava.defense = 10;
        silenceJava.experience = 400;


        boolean test = true;
        while(true) {
            if(heroin.hp>0) {
                heroin.attacked(silenceJava.atk());
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
