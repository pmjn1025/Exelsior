package ITem;

public class FullBottle extends Medicine {

    public static int fullbottle; // 아차 pot이 성수였지ㅠㅠ 지우기는 아깝다.

    public FullBottle(){
        name = "일반 생수";
        addhp = 50;
    }

    public int FullBottle(){

        addhp = 50;
        fullbottle -= 1;

        return addhp;
    }

}
