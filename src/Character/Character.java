package Character;

public class Character {

    // damage와 power구분하기

    public String name;
    public int level;
    public static int hp;
    public int power;
    public int damage;
    public int stamina;
    public int max_power;
    public int min_power;
    public int defense;

    public int atk() {

        int num = (int)(Math.random()*3);
        if(num==0 && hp >=0) {

        }else if(num==1 && hp >=0) {


        }else if(num ==2 && hp>=0){

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
