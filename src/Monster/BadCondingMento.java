package Monster;

import ITem.Medicine;

public class BadCondingMento extends Monster {

    public int atk() {

        int num = (int)(Math.random()*3);
        if(num==0 && hp >=0) {
            System.out.println("Java of Darkness.");
            System.out.println();
            //System.out.println("어둠의 메서드, 어둠의 클래스!");
            System.out.println();
            power *=2;
            System.out.println("타락한 코딩멘토의 데미지는  " + power + "비트입니다.");
            System.out.println("타락한 코딩멘토의 상태는 :" + hp);
            System.out.println();
        }else if(num==1 && hp >=0) {
            System.out.println("Android of Darkness.");
            System.out.println();
            //System.out.println(".");
            System.out.println();
            power *= 3;
            System.out.println("타락한 코딩멘토의 데미지는  " + power + "비트입니다.");
            System.out.println("타락한 코딩멘토의 상태는 :" + hp);
            System.out.println();

        }else if(num ==2 && hp>=0){
            System.out.println("PHP of Darkness.");
            System.out.println();
            //System.out.println("공격력이 8배, 공속이 빨라집니다. ");
            System.out.println();
            power *= 5;
            System.out.println("타락한 코딩멘토의 데미지는  " + power + "비트입니다.");
            System.out.println("타락한 코딩멘토의 상태는 :" + hp);
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
