package Monster;

public class RunawayApp extends Monster {

    public int atk() {

        int num = (int)(Math.random()*3);
        if(num==0 && hp >=0) {
            System.out.println("붕괴하는 API.");
            System.out.println();
            System.out.println("펑펑펑!");
            System.out.println();
            System.out.println("안드로이드의 망령의 데미지는  " + power + "비트입니다.");
            System.out.println("안드로이드의 망령의 상태는 :" + hp);
            System.out.println();
        }else if(num==1 && hp >=0) {
            System.out.println("폭주하는 에뮬레이터!.");
            System.out.println();
            System.out.println("안드로이드의 망령의 공격력이 3배로 상승합니다.");
            System.out.println();
            power *= 3;
            System.out.println("안드로이드의 망령의 데미지는  " + power + "비트입니다.");
            System.out.println("안드로이드의 망령의 상태는 :" + hp);
            System.out.println();

        }else if(num ==3 && hp>=0){
            System.out.println("안드로이드의 망령의 폭주!.");
            System.out.println();
            System.out.println("공격력이 8배, 공속이 빨라집니다. ");
            System.out.println();
            power *= 2;
            System.out.println("안드로이드의 망령의 데미지는  " + power + "비트입니다.");
            System.out.println("안드로이드의 망령의 상태는 :" + hp);
            System.out.println();
        }
        //System.out.println("나의 상태는 :" + Heroin.hp);

        return power;
    }

    public void attacked(int sum) {
        if (defense >= sum) {
            hp = hp - 0;
        } else {
            hp = hp + defense - sum;
        }
    }

}
