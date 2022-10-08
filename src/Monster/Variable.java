package Monster;

import Heroin.Heroin;

public class Variable extends Monster {

    public int atk() {

        int num = (int)(Math.random()*3);
        if(num==0 && hp >=0) {
            System.out.println("중얼거리는 변수가 공격을 합니다.");
            System.out.println();
            System.out.println("스트링, 스트링, 스트링,......");
            System.out.println();
            System.out.println("변수의 데미지는  " + power + "비트입니다.");
            System.out.println("변수의 상태는 :" + hp);
            System.out.println();
        }else if(num==1 && hp >=0) {
            System.out.println("중얼거리는 변수가 공격을 합니다.");
            System.out.println();
            System.out.println("int, int, int,......");
            System.out.println();
            power *= 2;
            System.out.println("변수의 데미지는  " + power + "비트입니다.");
            System.out.println("변수의 상태는 :" + hp);
            System.out.println();

        }else if(num ==2 && hp>=0){
            System.out.println("중얼거리는 변수가 공격을 합니다.");
            System.out.println();
            System.out.println("long, long, long,......");
            System.out.println();
            power *= 3;
            System.out.println("변수의 데미지는  " + power + "비트입니다.");
            System.out.println("변수의 상태는 :" + hp);
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
