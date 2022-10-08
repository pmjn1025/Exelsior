package ThreadAttack;
import Character.*;
import Heroin.*;
import Monster.*;

public class MonsterAttack extends Thread {

    public void run() {
        Heroin heroin = new Heroin();
        Variable variable = new Variable();
        variable.name = "중얼거리는 변수";
        variable.hp = 3000;
        variable.level = 1;
        variable.power = 40;
        variable.defense = 5;
        variable.experience = 10;


        boolean test = true;
        while(true) {
            if(heroin.hp>0) {
                heroin.attacked(variable.atk());
            }
            try {
                Thread.sleep(4000);
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
