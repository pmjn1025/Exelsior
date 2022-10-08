package Monster;

public class Boss extends Monster {

    public int atk() {

        int num = (int)(Math.random()*3);
        if(num==0 && hp >=0) {
            System.out.println("Mega Java Punch.");
            System.out.println();
            //System.out.println("어둠의 메서드, 어둠의 클래스!");
            System.out.println();
            power *=2;
            System.out.println("뽀스의 데미지는  " + power + "비트입니다.");
            System.out.println("뽀스의 상태는 :" + hp);
            System.out.println();
        }else if(num==1 && hp >=0) {
            System.out.println("Ultra Android kick.");
            System.out.println();
            //System.out.println(".");
            System.out.println();
            power *= 3;
            System.out.println("뽀스의 데미지는  " + power + "비트입니다.");
            System.out.println("뽀스의 상태는 :" + hp);
            System.out.println();

        }else if(num ==3 && hp>=0){
            System.out.println("Hyper PHP psychokenesis .");
            System.out.println();
            //System.out.println("공격력이 8배, 공속이 빨라집니다. ");
            System.out.println();
            power *= 8;
            System.out.println("뽀스의 데미지는  " + power + "비트입니다.");
            System.out.println("뽀스의 상태는 :" + hp);
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
