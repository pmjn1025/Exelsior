package ITem;

public class Pot extends Medicine {
    public static int pot;

    public Pot(){
        name = "00의 성수";
        addstamina = 50;

    }

    public int Pot () {
        addhp = 100;

        pot -= 1;

        return addhp;
    }

}
