package ITem;

public class Nunettine extends Medicine {

    public static int nunettine;


    public Nunettine(){

        name = "따끈한 누네띠네";
        addhp = 100;
    }

    public int Nunettine(){
        name = "누네띠네";
        addhp = 100;
        nunettine -= 1;

        return addhp;
    }


}
