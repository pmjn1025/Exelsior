package Monster;

import Heroin.Heroin;

public class StopRecyclerView extends Monster {


    public int atk() {

        int num = (int)(Math.random()*3);
        if(num==0 && hp >=0) {
            System.out.println("Everyting constraint......");
            System.out.println();
            //System.out.println("(매서운 눈빛으로 쳐다볼뿐이다.)");
            System.out.println();

            System.out.println("응답없는 리사이클러뷰의 데미지는  " + power + "비트입니다.");
            System.out.println("응답없는 리사이클러뷰의 상태는 :" + hp);
            System.out.println();
        }else if(num==1 && hp >=0) {
            System.out.println("Linear is important.....");
            System.out.println();
            //System.out.println("(입가에는 침묵만이 흐를뿐이다.");
            System.out.println();
            power *= 2;
            System.out.println("응답없는 리사이클러뷰의 데미지는  " + power + "비트입니다.");
            System.out.println("응답없는 리사이클러뷰의 상태는 :" + hp);
            System.out.println();

        }else if(num ==2 && hp>=0){
            System.out.println("중첩된 레이아웃!!!!");
            System.out.println();
            //System.out.println("(약간 웃고 있는것 같은데?");
            System.out.println();
            System.out.println("Everyting constraint......");
            System.out.println("Linear is important.....");
            System.out.println();
            power *=3;
            hp += 1000;
            System.out.println("응답없는 리사이클러뷰의 데미지는  " + power + "비트입니다.");
            System.out.println("응답없는 리사이클러뷰의 체력이 상승합니다.");
            System.out.println("응답없는 리사이클러뷰의 상태는 :" + hp);
            System.out.println();
            System.out.println("Everyting constraint......");
            System.out.println("Linear is important.....");
            System.out.println();
            //System.out.println("(입가에는 침묵만이 흐를뿐이다.");
            System.out.println();

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
