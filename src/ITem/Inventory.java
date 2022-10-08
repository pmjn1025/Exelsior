package ITem;


import Heroin.Heroin;



//퀘스트 아이템 & 인벤토리 기능
public class Inventory extends Item {

    Question question = new Question();
    EmptyBottle emptyBottle = new EmptyBottle();
    Nunettine nunettine = new Nunettine();
    Pot pot = new Pot();
    Heroin heroin = new Heroin();


    public void print(){
        System.out.println("===========================================");
        System.out.println(nunettine.name+" : "+Nunettine.nunettine+" 개");
        System.out.println(pot.name +" : " + Pot.pot+" 개");
        System.out.println(emptyBottle.name+" : "+EmptyBottle.emptybottle+"개");
        System.out.println(question.name+" : "+Question.question +" 번");
        System.out.println("비밀번호 (1) : "+heroin.password[0]);
        System.out.println("비밀번호 (2) : "+heroin.password[1]);
        System.out.println("비밀번호 (3) : "+heroin.password[2]);
        System.out.println("===========================================");

    }

}
