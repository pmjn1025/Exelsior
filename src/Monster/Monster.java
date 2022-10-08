package Monster;

import Character.Character;

public class Monster extends Character {
    public int hp;
    public int experience;


    // 공격하기.(랜덤으로 딜을 넣을때 함수 실험?!)
    public int atk() {
        //damage = (int) (Math.random() * (max_power - min_power) + min_power);
        return power;
    }

    public void atked(int sum){

    }


    //회피
    public boolean dodge() {
        if (Math.random() < 0.1)
            return true;
        else
            return false;
    }





}
