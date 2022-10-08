package Monster;


import java.util.Scanner;

public class Everywhile extends Monster {

    public int atk() {
        int num = (int)(Math.random()*3);
        if(num==0 && hp >=0) {
            System.out.println("i=1; i<=3; i++공격을 합니다.");
            System.out.println();
            System.out.println(".....while(true)");
            power += 30;
            System.out.println();
            System.out.println("while문의 데미지는  " + power + "비트입니다.");
            System.out.println("while의 상태는 :" + hp);
            System.out.println();
        }else if(num==1 && hp >=0) {
            System.out.println("i=1; i<=6; i++ 공격을 합니다.");
            System.out.println();
            System.out.println("......while(true)");
            power += 36;
            System.out.println();
            System.out.println("while문의 데미지는  " + power + "비트입니다.");
            System.out.println("while문의 상태는 :" + hp);
            System.out.println();

        }else if(num ==2 && hp>=0){
            System.out.println("i=1; i<=9; i++ 공격을 합니다.");
            System.out.println();
            System.out.println("......while(true)");
            System.out.println();
            power += 39;
            System.out.println("while문의 데미지는  " + power + "비트입니다.");
            System.out.println("while문의 상태는 :" + hp);
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

/*   int num = (int)(Math.random()*4);
        if(num==0 && hp >=0) {
            while (true){
                System.out.println("while문이 계속 돌고 있습니다.");



            }
        }
        //System.out.println("나의 상태는 :" + Heroin.hp);

        return power;*/



/*Scanner scanner = new Scanner(System.in);
    String tmp = scanner.nextLine();*/

/*public int atk(){
        while (true){

            System.out.println("java를 외쳐줘!!");
            System.out.println("java를 입력해..");
            System.out.println("변수의 데미지는  " + power + "비트입니다.");
            System.out.println("변수의 상태는 :" + hp);
            System.out.println();

            if(tmp == "java") {
                hp = 0;

                break;
            }
            return power;
        }
        return power;
    }

    public void attacked(int sum){
        if (defense >= sum) {
            hp = hp - 0;
        } else {
            hp = hp + defense - sum;
        }
    }*/