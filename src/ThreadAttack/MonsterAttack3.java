package ThreadAttack;

import Heroin.Heroin;

import Monster.StopRecyclerView;

public class MonsterAttack3 extends Thread {

    public void run() {
        Heroin heroin = new Heroin();
        StopRecyclerView stopRecyclerView = new StopRecyclerView();
        stopRecyclerView.name = "응답없는 리사이클러뷰";
        stopRecyclerView.hp = 25000;
        stopRecyclerView.level = 1;
        stopRecyclerView.power = 90;
        stopRecyclerView.defense = 30;
        stopRecyclerView.experience = 700;


        boolean test = true;
        while(true) {
            if(heroin.hp>0) {
                heroin.attacked(stopRecyclerView.atk());
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
