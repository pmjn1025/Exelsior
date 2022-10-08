package Monster;

public class SilenceJava extends Monster {

    public int atk() {

        int num = (int)(Math.random()*3);
        if(num==0 && hp >=0) {
            System.out.println("Method of Darkness......");
            System.out.println();
            System.out.println("(매서운 눈빛으로 쳐다볼뿐이다.)");
            System.out.println();
            power *= 2;
            System.out.println("침묵하는 자바의 데미지는  " + power + "비트입니다.");
            System.out.println("침묵하는 자바의 상태는 :" + hp);
            System.out.println();
        }else if(num==1 && hp >=0) {
            System.out.println("Class of Darkness.....");
            System.out.println();
            System.out.println("(입가에는 침묵만이 흐를뿐이다.");
            System.out.println();
            power *= 3;
            System.out.println("침묵하는 자바의 데미지는  " + power + "비트입니다.");
            System.out.println("침묵하는 자바의 상태는 :" + hp);
            System.out.println();

        }else if(num ==2 && hp>=0){
            System.out.println("침묵만 할뿐 아무것도 하지 않는다.");
            System.out.println();
            System.out.println("(약간 웃고 있는것 같은데?");
            System.out.println();
            power *=4;
            hp += 300;
            System.out.println("침묵하는 자바의 데미지는  " + power + "비트입니다.");
            System.out.println("침묵하는 자바의 체력이 상승합니다.");
            System.out.println("침묵하는 자바의 상태는 :" + hp);
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
