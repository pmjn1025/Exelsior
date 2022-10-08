package ThreadAttack;

import Heroin.Heroin;
import Monster.BadCondingMento;
import Monster.RunawayApp;

public class MonsterAttack5 extends Thread {

    public void run() {
        Heroin heroin = new Heroin();
        BadCondingMento badCondingMento = new BadCondingMento();
        badCondingMento.name = "타락한 코딩멘토";
        badCondingMento.hp = 55000;
        badCondingMento.level = 5;
        badCondingMento.power = 420;
        badCondingMento.defense = 60;
        badCondingMento.experience = 3000;


        boolean test = true;
        while(true) {
            if(heroin.hp>0) {
                heroin.attacked(badCondingMento.atk());
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
