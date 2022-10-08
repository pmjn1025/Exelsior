package Main;

import Heroin.Heroin;
import ITem.*;
import Monster.*;
import Thread.*;
import ThreadAttack.*;



import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) {

        //Music introMusic = new Music("intromusic.mp3", true);

        //introMusic.start();

        Inventory inventory = new Inventory();
        //Nunettine nunettine = new Nunettine();
        //Pot pot = new Pot();
        /*Churining churining = new Churining();
        BasicNotebook basicNotebook = new BasicNotebook();
        Pedding pedding = new Pedding();
        NewNotebook newNotebook = new NewNotebook();*/


        //EmptyBottle emptyBottle = new EmptyBottle();
        //Question question = new Question();

        Heroin heroin = new Heroin();
        heroin.power = 25;
        heroin.defense = 5;
        heroin.level = 1;
        heroin.hp = 100000;
        heroin.stamina = 100;
        heroin.experience = 0;

        /*heroin.experience += 100;
        heroin.print();*/


        Scanner scanner = new Scanner(System.in);
        int num;
        String tmp;

        Story story = new Story("""
                                                 Prologue
                
                오늘도 어김없이 수업이군.. 그런데 오늘 다들 왜이렇게 늦으시는거지?? 지금 11:59분인데? 
                                
                내가 시간을 잘못 알았나?
                                
                아무도 그런말씀 없으셨는데? 다들 늦으시는건가? 
                                
                어떡하지? 
                                
                피곤한데 잠이나 좀잘까?? 
                                
                아니면 밖으로 나가볼까?

                """);
        story.start();
        try {
            story.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("""               
                                
                ===========================================
                당신의 선택은??
                1.그냥 낮잠을 잔다.
                2.가만히 있을 수 없다. 밖으로 나가본다.             
                ===========================================

                """);


        num = scanner.nextInt();

        if (num == 1) {
            Story story1 = new Story("""
                    
                    민준씨 일어나세요, 오늘 다들 늦어서 지금 수업시작해요.
                                        
                    이번주 어땠어요? 다들 열심히 하셨나요??
                                        
                    누구부터 발표 해볼까요?
                                        
                    이렇게 발표를 하고 모든 팀원들과 함께 안드로이드로 무사히 올라갔다고 한다.


                    """);
            story1.start();
            try {
                story1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("""
                    
                                        
                    ######## ####  ######   ##     ## ######## #### ##    ##  ######  \s
                    ##        ##  ##    ##  ##     ##    ##     ##  ###   ## ##    ## \s
                    ##        ##  ##        ##     ##    ##     ##  ####  ## ##       \s
                    ######    ##  ##   #### #########    ##     ##  ## ## ## ##   ####\s
                    ##        ##  ##    ##  ##     ##    ##     ##  ##  #### ##    ## \s
                    ##        ##  ##    ##  ##     ##    ##     ##  ##   ### ##    ## \s
                    ##       ####  ######   ##     ##    ##    #### ##    ##  ######  \s
                                        
                    파이팅~~    
                    """);
            System.exit(0);
        }

        if (num == 2) {

            //Music music = new Music("earthquake.mp3",true);
            //music.start();

            Story story2 = new Story("""
                    .
                    .
                    .
                    .
                    .
                    .
                    .
                    .
                    .
                    
                    그래, 밖으로 나가 봐야지! 아무도 오지않는게 너무 이상한데, 어?! 왜 갑자기 문이 열리지 않지?
                                        
                    덜컹, 덜컹, 어 문이 고장난것 같은데? 안되겠다. 파트장님께 연락드려봐야겠다. 
                                        
                    어?! 여보세요? 파트장님? 지지직 지지직~~~
                                        
                    우르르쾅쾅 덜덜덜덜덜 
                                        
                    순간 갑자기 지진이 일어났고 무언가 내 목덜미를 치고 그자리에서 정신을 잃어버렸다.
                    .
                    .
                    .
                    .
                    .
                    .
                    .
                    .
                                        
                    당신의 이름은?

                    """);
            story2.start();
            try {
                story2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //music.close();


            heroin.name = scanner.next();

            System.out.println("""
                                    
                                    
                             
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    

                    """);

            Story story3 = new Story("시간이 얼만큼 흘렀을까? 누군가 나를 부르는 듯한 소리에 눈을 떴다");
            try {
                story3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println();
            System.out.println("정신이 좀 드나?  " + heroin.name);
            System.out.println();
            Story story4 = new Story("""
                    으... 뭐야 어떻게 된거지? 일어나 주위를 돌아보니 6사무실이 완전히 엉망으로 변해있었다.
                                        
                    52 52 정신이 좀 드냐구?
                                        
                    고함아닌 고함같은 소리에 소리의 근원지로 눈을 돌려 보았다.
                                        
                    그러나 그곳에는 검은 그림자만 있을 뿐 아무것도 없었다.
                                        
                    누가 말하고 있는거야? 여긴 나밖에 없는것 같은데?
                                        
                    너 밖에 없는거 아니야. 나도 6사무실에 있어.
                                        
                    그래요 어디계세요? 나와보세요. 
                                        
                    여기 있잖아 검은 그림자. 그게 나야.
                                        
                    ????: 어쨌든 빨리 얘기하도록 하지. 너는 자바의 망령에 홀린거야. 너는 빨리 여기서 탈출하지 않으면
                                        
                    나처럼 검은그림자로 변할거야. 그러니 저기 화이트보드를 잘 보고 여기서 나가야만해.
                                        
                    저... 정말??
                                        
                    빨리 읽어봐 지금도 시간이 가고있어.
                                        
                      
                      
                                                          -화이트보드-
                      
                                       6사무실에 비밀번호가 있다. 그것을 찾아서 돌아가라
                                       
                                       그뿐이다. 다만, 이곳에서 길을 잃거나 죽는다면 자바의 망령이 될것이다.
                                       
                                        
                             
                                        
                    자바의 망령 : 알겠냐? 너도 나처럼 되고싶지 않으면 빨리 행동하는 것이 좋을걸?
                                        
                    으.... 어떻게 하면 좋지???
                                        
                    그리고 이것이 제발 현실이 아니기를 바라면서 눈을 잠시 감았다.  


                    """);
            story4.start();

            try {
                story4.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
        //Music effect = new Music("pickup.mp3",true);
        //effect.start();
        System.out.println("""
                                
                ==========================================================          
                                
                테크트리 스킬은 1.원의 방정식!, 2.빛의 클래스,3.정의의 메서드입니다.
                                
                기본 방어구는 : 후줄근한 추리닝입니다.
                                
                기본 무기는 : 반쯤 부서진 노트북입니다.
                                
                ==========================================================     

                """);
        //effect.close();
        System.out.println();
        System.out.println("자바의 망령: " + heroin.name + " 건투를 빌지. 부디 나와 친구가 되는일은 없도록 빌겠네.");
        System.out.println("");
        System.out.println("");
        System.out.println("아무키나 눌러주세요");

        num = scanner.nextInt();

        Loading loading = new Loading("▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷");

        loading.start();
        try {
            loading.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("""
                                
                                
                         
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                
                                

                """);

        System.out.println("==========================================================================================");
        System.out.println(" ########:'##::::'##::'######::'########:'##::::::::'######::'####::'#######::'########::");
        System.out.println(" ##.....::. ##::'##::'##... ##: ##.....:: ##:::::::'##... ##:. ##::'##.... ##: ##.... ##:");
        System.out.println(" ##::::::::. ##'##::: ##:::..:: ##::::::: ##::::::: ##:::..::: ##:: ##:::: ##: ##:::: ##:");
        System.out.println(" ######:::::. ###:::: ##::::::: ######::: ##:::::::. ######::: ##:: ##:::: ##: ########::");
        System.out.println(" ##...:::::: ## ##::: ##::::::: ##...:::: ##::::::::..... ##:: ##:: ##:::: ##: ##.. ##:::");
        System.out.println(" ##:::::::: ##:. ##:: ##::: ##: ##::::::: ##:::::::'##::: ##:: ##:: ##:::: ##: ##::. ##::");
        System.out.println(" ########: ##:::. ##:. ######:: ########: ########:. ######::'####:. #######:: ##:::. ##:");
        System.out.println(" ........::..:::::..:::......:::........::........:::......:::....:::.......:::..:::::..::");
        System.out.println("==========================================================================================");
        System.out.println("");

        boolean run = true;
        int speed = 0;
        int keycode = 0;

        //introMusic.close();

        //Music intromusic1 = new Music("6thoffice1.mp3", true);
        //intromusic1.start();

        Time time = new Time();
        time.start();

        System.out.println("*************************EXCELSIOR**************************");
        System.out.println("[설명] 시간제한이 있습니다. 시간안에 탈출하지 못하면 건물이 무너집니다.");
        System.out.println("[설명] 각 사무실마다 히든 아이템이있습니다(스토리에는 큰 지장이없습니다.)");
        System.out.println("[설명] 6사무실에서 아이템을 많이 챙겨가는것을 추천합니다.");
        System.out.println("[설명] 질문횟수는 유용하게 쓰입니다. ");
        System.out.println("[설명] 반드시 비밀번호는 찾아야합니다.");
        System.out.println("*************************EXCELSIOR**************************");
        System.out.println();
        System.out.println();


        //1.monster 스킬넣기
        //2.아이템 물병, 가방 넣기
        //3.방어구, 무기 더넣고 배열정리하기

        //필요한 모든 아이템객체 여기다가 모으기. 단 몬스터 객체는 따로 필요한 곳에만.
        Churining churining = new Churining();
        BasicNotebook basicNotebook = new BasicNotebook();
        Pedding pedding = new Pedding();
        NewNotebook newNotebook = new NewNotebook();
        TeamNovaPedding teamNovaPedding = new TeamNovaPedding();
        TeamNovaNotebook teamNovaNotebook = new TeamNovaNotebook();
        PartNotebook partNotebook = new PartNotebook();
        FinalNotebook finalNotebook = new FinalNotebook();



        //주인공 기본 물품 장착
        heroin.myitem[0] = churining.name;
        heroin.Churining();
        heroin.myitem[1] = basicNotebook.name;
        heroin.BasicNotebook();

        //죄물쇠 효과
        Lock lock = new Lock();

        //6사무실 스토리 아이템.
        Item ghost_item = new Item();
        //ghost_item.item = 0;
        ghost_item.name = "자바 망령의 부탁";

        Item ghost_stone = new Item();
        ghost_stone.name = "자바의 망령의 돌";

        Item mentor_item1 = new Item();
        mentor_item1.name = "멘토의 가르침";

        //패스 워드 실험(초기화)
        Heroin.password[0] = "000";
        Heroin.password[1] = "000";
        Heroin.password[2] = "000";


        //heroin.myitem [0] = "착용도구 없음";
        //heroin.myitem [0] = basicNotebook.name;

        //7사무실 퀘스트 아이템
        Item ghost_item3 = new Item();
        ghost_item3.name = "안드로이드의 망령의 부탁1";

        Item ghost_item4 = new Item();
        ghost_item4.name = "안드로이드의 망령의 부탁2";

        Item parts = new Item();
        parts.name = "정수기부품1???";

        Item parts1 = new Item();
        parts1.name = "정수기부품2???";

        Item ghost_water = new Item();
        ghost_water.name = "자바의 망령을 위한 물??";

        Item seven_password = new Item();
        seven_password.name = "7사무실의 비밀번호";

        Item seven_password1 = new Item();
        seven_password1.name = "히든 이벤트";

        Item seven_hidden = new Item();
        seven_hidden.name = "7사 코딩멘토 이벤트";

        Item seven_event = new Item();
        seven_event.name = "1강의실 탐색";

        Item seven_event1 = new Item();
        seven_event1.name = "2강의실 탐색";

        Item seven_event2 = new Item();
        seven_event2.name = "가위바위보";

        //3사무실 퀘스트 아이템

        Item codingMentor_event = new Item();
        codingMentor_event.name = "코딩멘토 이벤트 유무";

        Item ghost_java_event = new Item();
        ghost_java_event.name = "자바의 망령 이벤트 유무";

        Item boss_event = new Item();
        boss_event.name = "보스이벤트 유무";

        Item final_event = new Item();
        final_event.name = "최종이벤트";



        //본격적인 게임 시작.
        while (true) {
            System.out.println("===========================================");
            System.out.println("무엇을 해볼까?" + "\n");
            System.out.println("1.상태체크.");
            System.out.println("2.인벤토리 확인.");
            System.out.println("3.6사무실 안을 탐색해보자."); // 성수로 다가가기 ,누네띠네 챙기기,다른아이템 챙기기
            System.out.println("4.켜져있는 컴퓨터쪽으로 가보자."); //컴퓨터를킨다(변수죽이고 아이템얻고),컴퓨터 주변을 찾아본다.
            System.out.println("5.자바의 망령에게 말을 건다."+lock.office6); // 빨리가라고 하지만 망령의 잃어버린 물건을 찾아주면 말이걸어지고 비밀번호를 말해준다
            System.out.println("6.탈출?! 하자."+lock.office6_1); // 비밀번호가 없으면 못간다.
            System.out.println("===========================================");
            num = scanner.nextInt();


            switch (num) {
                case 1:
                    heroin.print();
                    break;

                case 2:
                    inventory.print();
                    break;

                case 3:

                    System.out.println("===========================================");
                    System.out.println("어떤곳을 조사해보시겠습니까?");
                    System.out.println("1.누네띠네 통을 뒤진다.");
                    System.out.println("2.정수기를 작동시켜본다.");
                    System.out.println("3.잔해더미 속에서 쓸만한 것들을 찾아본다.");
                    System.out.println("4.돌아간다.");
                    System.out.println("===========================================");
                    num = scanner.nextInt();

                    // **************시각적 효과를 위해****************
                    /*.
                    .
                    .
                    .
                    .
                    .*/
                    //넣기.


                    if (num == 1) {
                        if (Nunettine.nunettine <= 0) {
                            //Music effect1 = new Music("pickup.mp3",true);
                            //effect1.start();
                            System.out.println("따끈한 누네띠네를 발견했습니다" + "누네띠네 +5개 획득");
                            Nunettine.nunettine += 5;
                            //effect1.close();
                        } else if (Nunettine.nunettine >= 5) {
                            System.out.println("더이상 누네띠네가 없습니다.");
                        }

                    }
                    if (num == 2) {

                        if (EmptyBottle.emptybottle >= 1) {
                            //Music music1 = new Music("drinking.mp3",true);
                            //music1.start();
                            System.out.println("정수기에서 성수를 한병채웁니다.");
                            Pot.pot += 1;
                            EmptyBottle.emptybottle -= 1;
                        //music1.close();
                        } else if (EmptyBottle.emptybottle <= 0) {
                            System.out.println("물병이 없습니다.");
                        } else if (Pot.pot >= 5) {
                            System.out.println("정수기의 물이 다떨어 졌습니다.");
                        }

                    }
                    if (num == 3) {
                        if (EmptyBottle.emptybottle < 5) {
                            //Music effect2 = new Music("pickup.mp3",true);
                            //effect2.start();
                            //Music music2 = new Music("plasticbottle",true);
                            //music2.start();
                            System.out.println("빈 물병을 얻었습니다." + "빈 물병 5개 획득");
                            EmptyBottle.emptybottle += 5;
                            //effect2.close();
                            //music2.close();
                        } else if (pedding.item_Count == 0) {
                            //Music effect3 = new Music("pickup.mp3",true);
                            //effect3.start();
                            System.out.println("누군가 벗어놓은 패딩을 발견하였습니다." + "방어력 +15");
                            pedding.item_Count += 1;
                            heroin.myitem[0] = pedding.name;
                            heroin.Pedding();
                            //effect3.close();

                        } else if (pedding.item_Count == 1 && ghost_item.item_Count == 0) {
                            System.out.println("뭔가 있는데 손에 닿질 않는다.");
                        } else if (pedding.item_Count == 1 && ghost_item.item_Count == 1) {
                            //Music effect4 = new Music("pickup.mp3",true);
                            //effect4.start();
                            System.out.println("어 뭔가 닿는 느낌이 드는데, 조금만 더 조금만.....");
                            System.out.println("이건.. 붉은색 키보드 알이잖아. 이게 돌이야??");
                            ghost_stone.item_Count += 1;
                            //effect4.close();


                        } else if (ghost_stone.item_Count == 1) {
                            System.out.println("이미 수행 했습니다.");
                            System.out.println();
                            System.out.println("자바의 망령과 대화를 해보세요.");
                        }

                    }


                    break;

                case 4:
                    System.out.println("컴퓨터 앞에 앉았다. 무엇을 실행시켜 볼까?");
                    System.out.println("1.인텔리제이를 실행시킨다.");
                    System.out.println("2.인터넷을 실행시킨다.");
                    System.out.println("3.코딩멘토에게 질문을 한다.");
                    System.out.println("4.다른 행동을 한다.");

                    num = scanner.nextInt();

                    switch (num) {
                        case 1:
                            Variable variable = new Variable();
                            variable.name = "중얼거리는 변수";
                            variable.hp = 3000;
                            variable.level = 1;
                            variable.power = 40;
                            variable.defense = 5;
                            variable.experience = 10;

                            //System.out.println("방어구 :" + churining.name);

                            Story communication = new Story("""
                                    컴퓨터가 켜져있네, 잠시만 모니터만 켜져있는데, 작동이 되나?
                                                                        
                                    시험삼아 인텔리제이를 실행시켜보자.
                                                                        
                                    자바의 망령 : 껄껄껄 조심하는게 좋을걸?
                                                                        
                                    뭐라고?!
                                                                        
                                    int...int...int... short.. short...                      


                                    """);
                            communication.start();
                            try {
                                communication.join();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }


                            System.out.println("갑자기 모니터가 변수 괴물로 변하여 공격을 합니다.");

                            MonsterAttack monsterAttack = new MonsterAttack();
                            monsterAttack.start();

                            while (true) {



                                System.out.println("나의 체력은 : " + heroin.hp);
                                System.out.println("자의 지구력은 : " + heroin.stamina);
                                System.out.println();

                                variable.attacked(heroin.atk()); // 주인공 공격
                                //heroin.attacked(variable.atk()); // 몬스터 공격


                                if (variable.hp <= 0) {
                                    //Music effect5 = new Music("pickup.mp3",true);
                                    //effect5.start();
                                    variable.hp = 0;
                                    System.out.println("변수가 거품을 물고 쓰러집니다!!!" + "\n");
                                    System.out.println("누네띠네1개와 빈병 1개를 얻었습니다.");
                                    System.out.println("질문횟수 5회를 받았습니다.");
                                    System.out.println("경험치 100을 얻었습니다.");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("변수의 상태는 :" + variable.hp);
                                    System.out.println("나의 체력는 : " + heroin.hp);
                                    System.out.println("나의 지구력은: " + heroin.stamina);
                                    heroin.experience += 100;
                                    EmptyBottle.emptybottle += 1;
                                    Nunettine.nunettine += 1;
                                    Question.question += 5;
                                    //effect5.close();

                                    System.out.println("""
                                                                                        
                                            헉... 다음부터 인텔리제이는 조심해서 실행 시켜야겠군.
                                                                                        
                                            자바의 망령 : 그러길래 조심해라구 했잖아. 껄껄.
                                                                                        
                                            (근데 자꾸 반말이네?)                                           

                                            """);
                                    monsterAttack.stop();
                                    break;
                                }

                                if (heroin.hp <= 0) {

                                    heroin.hp = 0;
                                    System.out.println("===========================================");
                                    System.out.println("여기까진가??.....");
                                    System.out.println("당신은 죽었습니다. ==데스엔딩==");
                                    System.exit(0);
                                    break;

                                }
                            }
                            break;
                        case 2:

                            Everywhile everywhile = new Everywhile();
                            everywhile.name = "계속 도는 while문";
                            everywhile.hp = 6000;
                            everywhile.stamina = 0;
                            everywhile.level = 1;
                            everywhile.power = 45;
                            everywhile.defense = 10;
                            everywhile.experience = 300;

                            Story communication1 = new Story("""
                                    하.. 인텔리제이 말고 이번에는 인터넷을 실행시켜봐야지, 
                                                                        
                                    자바의 망령 : 인터넷까지 실행시킨다구?! 껄껄 어디한번 해봐?
                                                                        
                                    뭐라구?! 또......
                                                                        
                                    휘리리릭~~~~~                                                  



                                    """);
                            communication1.start();
                            try {
                                communication1.join();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println("아.. 또야??");
                            System.out.println("");
                            System.out.println("갑자기 모니터가 while 괴물로 변하여 공격을 합니다.");

                            MonsterAttack1 monsterAttack1 = new MonsterAttack1();
                            monsterAttack1.start();

                            while (true) {


                                System.out.println("나의 상태는 : " + heroin.hp);
                                System.out.println("자의 지구력은 : " + heroin.stamina);
                                System.out.println();

                                if (keycode != 13 && keycode != 10){
                                    System.out.println("==============================================================");
                                    System.out.println("1.false;를 입력한다, 2.continue;를 입력한다. , 3.break;를 입력한다.");
                                    System.out.println("==============================================================");
                                    System.out.println("선택 : ");

                                }

                                keycode = scanner.nextInt();

                                if (keycode == 1){
                                    speed++;
                                    System.out.println("파트장님이 보고있습니다!!!!!!!.");
                                    System.out.println("while문의 공격속도 + 1 ");
                                }else if (keycode == 2){
                                    speed++;
                                    System.out.println("팀원들이 보고있습니다!!!!");
                                    System.out.println("while문의 공격속도 + 1");
                                }else if (keycode == 3){
                                    everywhile.hp -= 10000;
                                    run = false;

                                }

                                //everywhile.attacked(heroin.atk()); // 주인공 공격
                                //heroin.attacked(everywhile.atk()); // 몬스터 공격


                                if (everywhile.hp <= 0) {
                                    //Music effect6 = new Music("pickup.mp3",true);
                                    //effect6.start();
                                    everywhile.hp = 0;
                                    System.out.println("while문이 작동을 멈춥니다!!!" + "\n");
                                    System.out.println("누네띠네2개와 빈병 2개를 얻었습니다.");
                                    System.out.println("질문횟수 5회를 받았습니다.");
                                    System.out.println("경험치 300을 얻었습니다.");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("변수의 체력은 :" + everywhile.hp);
                                    System.out.println("나의 체력은 : " + heroin.hp);
                                    System.out.println("나의 지구력은: " + heroin.stamina);
                                    heroin.experience += 100;
                                    EmptyBottle.emptybottle += 2;
                                    Nunettine.nunettine += 2;
                                    Question.question += 5;
                                    lock.setOffice6(" ");
                                    monsterAttack1.stop();
                                    //effect6.close();

                                    System.out.println("""
                                                                                        
                                            이럴수가 인터넷도 안되는군......
                                                                                        
                                            자바의 망령 : 하하...
                                                                                        
                                            (자바의 망령과 대화를 해보십시오.)                                           

                                            """);

                                    break;
                                }

                                if (heroin.hp <= 0) {
                                    heroin.hp = 0;

                                    System.out.println("===========================================");
                                    System.out.println("여기까진가??.....");
                                    System.out.println("당신은 죽었습니다. ==데스엔딩==");
                                    System.exit(0);
                                    break;

                                }


                            }
                            break;
                        case 3:
                            System.out.println("카페에 접속했다. 코딩멘토가 접속해있다!!");
                            System.out.println("1.코딩멘토에게 질문한다.");
                            System.out.println("2.코딩멘토와 하브루타를 한다.");
                            System.out.println("3.코딩멘토에게 고민상담을 한다.");
                            System.out.println("4.다른 행동을 한다.");

                            num = scanner.nextInt();

                            switch (num) {
                                case 1:
                                    if (Question.question <= 4) {
                                        Story communication2 = new Story("""
                                                안녕하세요? 멘토님!!!
                                                
                                                코딩멘토 : 네 안녕하세요? 무엇이 궁금하시죠?
                                                
                                                다름이 아니고 제가 6사무실에 갇혀있습니다.
                                                
                                                코딩멘토 : 왜 갇혀있을까요?? 생각은 좀 해보셨나요?
                                                
                                                아니 그것이, 제가 수요일 12:00시 수업시간에.....
                                                
                                                코딩멘토 : 질문을 정리해서 다시 질문해 주세요~~
                                                
                                                .......네 알겠습니다.

                                                """);
                                        communication2.start();
                                        try {
                                            communication2.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }


                                    } else if (newNotebook.item_Count==0) {
                                        Story communication3 =new Story("""
                                                안녕하세요? 멘토님!!!
                                                
                                                코딩멘토 : 네 안녕하세요? 무엇이 궁금하시죠?
                                                
                                                제가 6사무실에서 정신을 잃고 눈을 떠보니                                                
                                                화이트보드에 비밀번호를 알면 여기서 나갈수 있다고 적혀있습니다.
                                                
                                                코딩멘토 :비밀번호를 직접알려달라는 말인가요??
                                                
                                                아닙니다. 비밀번호를 이해할 수있는 다른 접근법이나 혹시 제가 모르고 넘어간 부분이 있으면 코칭을 해주십시오.
                                                
                                                코딩멘토 : 음... 6사무실 정수기 옆 상자 혹시 살펴보셨나요?? 살펴보세요~~
                                                
                                                네 알겠습니다.
                                                
                                               
                                                """);
                                        communication3.start();
                                        try {
                                            communication3.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        //Music effect7 = new Music("pickup.mp3",true);
                                        //effect7.start();

                                        System.out.println("정수기 옆을 보니 상자가 있다. 상자를 열어보니 깨끗한 노트북이 들어있다.");
                                        System.out.println("깨끗한 노트북 획득 공격력+50");
                                        Question.question -= 1;
                                        heroin.myitem[1] = newNotebook.name;
                                        newNotebook.item_Count = 1;
                                        heroin.NewNotebook();

                                        //effect7.close();


                                    }else if(newNotebook.item_Count == 1){
                                        System.out.println("이미 질문 하셨습니다.");
                                    }
                                    break;

                                case 2:// 퀘스트 아이템으로 취급하여 나중에 이것을 가지고 자바의 망령 이벤트도 만들기.
                                    System.out.println("멘토님 여기서 탈출할 수있는 방법에 대해서 하브루타 요청합니다.");
                                    System.out.println("음... 그럼 여기서 한번 골라 보시죠.");
                                    System.out.println("1. 파트장님의 3분완성 기초강의 + 공격력 50000");//나중에 퀘스트 아이템으로 취급
                                    System.out.println("2. 팀장님의 피드백 + 지구력 30000");//나중에 퀘스트 아이템으로 취급
                                    System.out.println("3. 사장님의 필수강의 + 방어력 40000");//나중에 퀘스트 아이템으로 취급

                                    num = scanner.nextInt();

                                    if (num == 1) {
                                        if (Question.question >= 300) {
                                            System.out.println("그냥 몸이 불타고 있습니다. 파괴의 신이 된 느낌입니다.");
                                            heroin.power += 500000;
                                            Question.question -= 300;
                                            heroin.myitem[1] = partNotebook.name;
                                            heroin.PartNotebook();

                                        } else {
                                            System.out.println("질문횟수가 부족합니다.");
                                        }
                                    }
                                    if (num == 2) {
                                        if (Question.question >= 350) {
                                            System.out.println("지치질 않습니다. 어떤 것도 바로 해낼수 있다는 생각이 마구 듭니다.");
                                            heroin.stamina += 300000;
                                            Question.question -= 350;

                                        } else {
                                            System.out.println("질문횟수가 부족합니다.");
                                        }
                                    }
                                    if (num == 3) {
                                        if (Question.question >= 400) {
                                            System.out.println("어떤 공격을 해도 겁이 나지 않습니다. 아니 자신감이 흘러 넘칩니다.");
                                            heroin.defense += 400000;
                                            Question.question -= 400;

                                        } else {
                                            System.out.println("질문횟수가 부족합니다.");
                                        }
                                    }
                                    break;

                                case 3:
                                    System.out.println("멘토님 고민상담을 요청합니다.");
                                    System.out.println("어떤 고민이죠??.");
                                    System.out.println("1.체력이 없습니다.");
                                    System.out.println("2.지구력이 없습니다.");

                                    num = scanner.nextInt();

                                    if (num == 1) {
                                        if (Question.question >= 1) {
                                            //Music effect8 = new Music("hpup.mp3",true);
                                            //effect8.start();
                                            System.out.println("진심어린 멘토와의 상담으로 체력이 증가합니다. 체력 +150");
                                            heroin.power += 150;
                                            Question.question -= 1;
                                            //effect8.close();

                                        } else {
                                            System.out.println("질문횟수가 없습니다.");
                                        }
                                    }
                                    if (num == 2) {
                                        if (Question.question >= 1) {
                                            //Music effect9 = new Music("hpup.mp3",true);
                                            //effect9.start();
                                            System.out.println("진심어린 멘토와의 상담으로 지구력이 증가합니다. 지구력 +150");
                                            heroin.stamina += 150;
                                            Question.question -= 1;
                                            //effect9.close();
                                        } else {
                                            System.out.println("질문횟수가 없습니다.");
                                        }
                                    }
                                    break;

                            }
                            break;


                    }
                    break;
                case 5:
                    if (Question.question <= 0) {

                        System.out.println("자바의 망령 : 좀 돌아보고 다시와! 너무 빨리 나서려는 거 아냐?? 다시한번 말하지만 비밀번호를 알아야 탈출 할 수 있어");

                    } else if (ghost_stone.item_Count == 0) {

                        Story communication4 = new Story("""
                                
                                자바의 망령 : 훗 훗... 아직도 비밀번호를 못찾았나? 아니면 코딩멘토가 가르쳐주지 않던가?
                                                            
                                이봐, 지금 여기 다 뒤져봤다구! 저기 잔해 더미 뒤에 뭔가 있는 것 같은데. 그게 비밀번호와 관련되있어?
                                                            
                                자바의 망령 : ?! 그게 어떻게 생겼지? 조그만 돌같은거 아니었나?
                                                            
                                그런것 같기도 하고 잘은 모르겠는걸?
                                                                
                                자바의 망령 : 그럼 이렇게 하지 그걸 나한테 가져다 주면 내가 비밀번호를 가르쳐주지? 어때?
                                                                
                                뭐야?!! 너 알고 있었어?? 왜 내가 말걸기 전까지 아무말도 하지 않았지?
                                                                
                                자바의 망령 : 껄껄 탈출하는건 내가 아냐, 너가 탈출하는거지, 그래도 6사무실을 탐색하면서 얻은게 많을텐데?..
                                                                
                                (어쩔수 없지..) 좋아. 그렇게 하지.
                                                                
                                자바의 망령 : 그래, 이걸 가지고 가서 빨리 그걸 가지고 와.


                                """);
                        communication4.start();
                        try {
                            communication4.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                        System.out.println("자바의 망령이 자신의 지팡이를 잠시 빌려 주었습니다.");
                        ghost_item.item_Count += 1;
                    } else if (ghost_stone.item_Count == 1) {
                        Story communication5 = new Story("""
                                
                                이봐 이거 맞아? 붉은색 돌이 아니라 키보드 알인데?? 어떻게 된거야?
                                                                
                                자바의 망령: 오! 이것이야 내가 그 오래전부터 쓰던 나의 키보드의 흔적이지. 얼마나 오래 있었으면 돌이 되어버렸을까?
                                                                
                                1시간 정도 있었던거 아니야?
                                                                
                                자바의 망령 : 그건 너가 여기 온것이 1시간인것이고 난 그전부터 존재해왔으니까 그만해!
                                                                
                                알았어. 일단 비밀번호나 말해줘.
                                                                
                                자바의 망령 : 그래 그렇지 비밀번호는 "135"이다. 꼭 기억해둬.
                                                                
                                그렇게 하지.


                                """);
                        communication5.start();
                        try {
                            communication5.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //Music effect10 = new Music("pickup.mp3",true);
                        //effect10.start();
                        System.out.println("첫번째 비밀번호를 얻었습니다. 비밀번호를 인벤토리에서 확인하세요!");
                        Heroin.password[0] = "135";
                        lock.setOffice6_1(" ");
                        //effect10.close();
                    }


                    break;
                case 6:
                    if (Heroin.password[0] == "000") {
                        System.out.println("덜컹 덜컹!! 뭐야 문이 잠겨버렸잖아??");
                        System.out.println();
                        System.out.println("자바의 망령 : 비밀번호를 찾아야 넘어갈수 있다고!!!");
                        System.out.println();
                        System.out.println("자바의 망령 : 나와의 약속은 잊지 않았겠지??");
                        break;
                    } else if (Heroin.password[0] == "135") {
                        System.out.println("비밀번호를 입력해주세요.");

                        num = scanner.nextInt();

                        if (newNotebook.item_Count == 0 && num ==135) {
                            Story communication6 = new Story("""
                                    자바의 망령 : 훗 훗 뭔가 하나 빠져먹은것 같지만 처음치고는 잘했어.
                                                                    
                                    나에게 용케 비밀번호를 알아내다니.. 앞으로 잘해보자구 친구??
                                                                    
                                    응??! 잘해보자고?? 그게 무슨 뜻이야? 나랑 같이 가겠다는 건가??
                                                                    
                                    자바의 망령 : 왠지 너와 같이 간다면 재미있는 일이 많이 일어날것 같아서 말야.
                                                                    
                                    무슨 말이야?! 난 너랑 같이 탈출하는건 부담스럽다구!                            
                                                                    
                                    스테이지 보너스 :+체력 150 +공격력 50, +방어력 50, +지구력 100, +경험치 1000
                                                                    
                                    질문횟수 +10 레벨업! +LV1
                                                                    
                                    (숨겨진 아이템은 깨끗한 노트북이었습니다. 2회차때 찾아보세요!)
                                                                    
                                    (드디어?! 탈출입니다. 아무키나 눌러주세요.)


                                    """);
                            communication6.start();
                            try {
                                communication6.join();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            heroin.hp += 150;
                            heroin.power += 50;
                            heroin.defense += 50;
                            heroin.stamina += 100;
                            heroin.experience += 1000;
                            heroin.level += 1;
                            Question.question += 10;


                        } else if (newNotebook.item_Count == 1 && num ==135) {
                            Story communication7 = new Story("""
                                    자바의 망령 : 오 처음인데 빠뜨린것 없이 다 챙기다니 대단한걸??.
                                                                    
                                    나에게 용케 비밀번호를 알아내다니.. 앞으로 잘해보자구 친구??
                                                                    
                                    응??! 잘해보자고?? 그게 무슨 뜻이야? 나랑 같이 가겠다는 건가??
                                                                    
                                    자바의 망령 : 왠지 너와 같이 간다면 재미있는 일이 많이 일어날것 같아서 말야.
                                                                    
                                    무슨 말이야?! 난 너랑 같이 탈출하는건 부담스럽다구!                             
                                                                    
                                    스테이지 보너스 + 히든아이템 보너스 : +체력 200 +공격력 100, +방어력 100, +지구력 100, +경험치 1000
                                                                    
                                    질문횟수 +10 레벨업! +LV1
                                                                    
                                    (드디어!? 탈출입니다. 아무키나 눌러주세요.) 


                                    """);
                            communication7.start();
                            try {
                                communication7.join();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }


                            heroin.hp += 200;
                            heroin.power += 100;
                            heroin.defense += 100;
                            heroin.stamina += 100;
                            heroin.experience += 1000;
                            heroin.level += 1;
                            Question.question += 10;


                        }else if (num != 135){
                            System.out.println("비밀번호가 틀렸습니다. 다시 입력해주세요");
                            break;
                        }

                        num = scanner.nextInt();
                    }

                    Loading loading1 = new Loading("▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷");
                    loading1.start();
                    try {
                        loading1.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    //intromusic1.close();
                    time.interrupt();

                    //Music music3 = new //Music("door_open.mp3",true);
                    //music3.start();
                    //music3.close();

                    //Music music4 = new Music("walk.mp3", true);
                   // music4.start();
                    //music4.close();

                    System.out.println("""
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            


                            """);


                    Story story5 = new Story("""
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            
                            6사무실로 빠져나오니 눈앞에는 어디서 본듯한 계단이 있었고 계단을 올라가지 눈에 익숙한 강의실이 나왔다.
                            
                            너무 어두워서 일단 불을 켰다. 그리고 7사무실의 1,2강의실이 눈에 들어왔다.
                            
                            이거 뭐야???? 이거 7사무실이잖아? 탈출이라면서?!!?!?!
                            
                            자바의 망령 : ?!! 이거 뭔가 잘못되가고있군. 크크크크
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            
                            
                            


                            """);
                    story5.start();
                    try {
                        story5.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    //Music intromusic2 = new Music("7thoffice.mp3" , true);
                   // intromusic2.start();

                    Time time1 = new Time();
                    time1.start();

                    System.out.println("""




                                                      




                                                        
                                                        
                                                        
                            

                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        




                             ________  __       __                     _____       ____     ____     ______      ____       ____     \s
                            /\\_____  \\/\\ \\__   /\\ \\                   /\\  __`\\    /\\  _`\\  /\\  _`\\  /\\__  _\\    /\\  _`\\    /\\  _`\\   \s
                            \\/___//'/'\\ \\ ,_\\  \\ \\ \\___               \\ \\ \\/\\ \\   \\ \\ \\L\\_\\\\ \\ \\L\\_\\\\/_/\\ \\/    \\ \\ \\/\\_\\  \\ \\ \\L\\_\\ \s
                                /' /'  \\ \\ \\/   \\ \\  _ `\\              \\ \\ \\ \\ \\   \\ \\  _\\/ \\ \\  _\\/   \\ \\ \\     \\ \\ \\/_/_  \\ \\  _\\L \s
                              /' /'     \\ \\ \\_   \\ \\ \\ \\ \\              \\ \\ \\_\\ \\   \\ \\ \\/   \\ \\ \\/     \\_\\ \\__   \\ \\ \\L\\ \\  \\ \\ \\L\\ \\
                             /\\_/        \\ \\__\\   \\ \\_\\ \\_\\              \\ \\_____\\   \\ \\_\\    \\ \\_\\     /\\_____\\   \\ \\____/   \\ \\____/
                             \\//          \\/__/    \\/_/\\/_/               \\/_____/    \\/_/     \\/_/     \\/_____/    \\/___/     \\/___/\s
                                                    \s
                            """);
                    System.out.println("*************************EXCELSIOR**************************");
                    System.out.println("*[설명] 안드로이드의 망령과 먼저 대화를 해야 해메지 않습니다!!!!!");
                    System.out.println("[설명] 히든이벤트를 찾아 보세요!! ");
                    System.out.println("[설명] 7사무실의 몬스터는 6사무실보다 훨씬 강합니다.");
                    System.out.println("[설명] 질문횟수는 유용하게 쓰입니다. ");
                    System.out.println("[설명] 반드시 비밀번호는 찾아야합니다.");
                    System.out.println("*************************EXCELSIOR**************************");
                    System.out.println();
                    System.out.println();


                    // 안드로이드 망령과 대화를 먼저 나누고 안드로이드망령이 물이 마시고 싶은데 정수기가 고장나서 부품들을
                    // 찾아달라고 한다. 정수기를 고치면 비밀번호를 가르쳐 준다고 거래함 부품들을 찾아서 정수기를 작동시키지만
                    // 물이 아닌 음료수가 나오고 이걸 그대로 자바의 망령이 마시자 망령이 갑자기 배신이라며 주인공을 공격함.

                    while (true) {

                        System.out.println("====================================================================");
                        System.out.println("무엇을 할까?" + "\n");
                        System.out.println("1.상태체크.                           6.8사무실을 탐색한다."); //
                        System.out.println("2.인벤토리 확인.                       7.안드로이드의 망령과 대화를 시도한다.");//안드로이드 망령이 부품을 들고 있다.-->폭주하는 앱
                        System.out.println("3.7사 1강의실 안을 탐색해보자.           8.또다시 탈츨?!을 하자."+lock.office7_2);
                        System.out.println("4.7사 2강의실 안을 탐색해보자.           ");
                        System.out.println("5.부서진 스마트폰을 작동시킨다.");// 고장나서 고장난거 고치는 것 // 정수기에서 비밀번호
                        //퀘스트 아이템1,2 + 질문5번 ---> 고치면 정수기 사용가능
                        System.out.println("=====================================================================");

                        num = scanner.nextInt();

                        //아이템 생성하기
                        //몬스터 스킬 완성
                        //

                        switch (num) {
                            case 1:
                                heroin.print();
                                break;

                            case 2:
                                inventory.print();
                                break;

                            case 3:
                                System.out.println("여기도 폐허가 되었군.");
                                System.out.println("1. 무언가 서있는 형체에 다가간다.");
                                System.out.println("2. 어질러진 물건들을 탐색한다."+lock.office7);
                                System.out.println("3. 나간다.");

                                num = scanner.nextInt();

                                if (num == 1) {

                                    SilenceJava silenceJava = new SilenceJava(); // 고치기 침묵하는 자바
                                    silenceJava.name = "침묵하는 자바";
                                    silenceJava.hp = 20000;
                                    silenceJava.level = 1;
                                    silenceJava.power = 50;
                                    silenceJava.defense = 10;
                                    silenceJava.experience = 400;

                                    Story communication8 = new Story("""
                                            저기요?? 혹시 누구 신가요??
                                                                                
                                            침묵하는 자바 : .....
                                                                                
                                            자바의 망령 : 흐흐 뭔가 했더니. 흐흐..
                                                                                
                                            누군데?! 사람이야??
                                                                                
                                            무엇인가 매서운 눈빛과 마주쳤다.


                                            """);
                                    communication8.start();
                                    try {
                                        communication8.join();
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }

                                    System.out.println("으어어어억");
                                    System.out.println("");
                                    System.out.println("스도승 복장을 한 검은 물체가 느닺없이 공격을 하기 시작합니다.");

                                    MonsterAttack2 monsterAttack2 = new MonsterAttack2();
                                    monsterAttack2.start();


                                    while (true) {


                                        System.out.println("나의 체력은 : " + heroin.hp);
                                        System.out.println("자의 지구력은 : " + heroin.stamina);
                                        System.out.println();

                                        silenceJava.attacked(heroin.atk()); // 주인공 공격
                                        //heroin.attacked(silenceJava.atk()); // 몬스터 공격


                                        if (silenceJava.hp <= 0) {
                                            //Music effect11 = new Music("pickup.mp3",true);
                                           // effect11.start();
                                            silenceJava.hp = 0;
                                            System.out.println("침묵하는 자바가 형체도 없이 사라졌습니다!!!" + "\n");
                                            System.out.println("누네띠네3개와 빈병 3개를 얻었습니다.");
                                            System.out.println("질문횟수 3회를 받았습니다.");
                                            System.out.println("경험치 400을 얻었습니다.");
                                            System.out.println("침묵하는 자바의 체력은 :" + silenceJava.hp);
                                            System.out.println("나의 체력은 : " + heroin.hp);
                                            System.out.println("나의 지구력은: " + heroin.stamina);
                                            //effect11.close();
                                            heroin.experience += 400;
                                            EmptyBottle.emptybottle += 3;
                                            Nunettine.nunettine += 3;
                                            Question.question += 3;
                                            lock.setOffice7(" ");
                                            seven_event.item_Count += 1;
                                            monsterAttack2.stop();

                                            Story cm15 = new Story("""
                                                    
                                                    헉... 헉... 내가 약한건가?? 죽다 살았네..
                                                                                                
                                                    자바의 망령 : 여기 괴물들은 세다고 했잖아. 껄껄.
                                                                                                        
                                                    잔해를 치워보자!!!
                                                                                                
                                                    (웃어?)   


                                                    """);
                                            cm15.start();
                                            try {
                                                cm15.join();
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }

                                            break;
                                        }

                                        if (heroin.hp <= 0) {

                                            heroin.hp = 0;
                                            System.out.println("===========================================");
                                            System.out.println("여기까진가??.....");
                                            System.out.println("당신은 죽었습니다. ==데스엔딩==");
                                            System.exit(0);
                                            break;

                                        }


                                    }
                                }
                                if (num == 2) {
                                    if (seven_event.item_Count <= 0) {
                                        Story communication9 = new Story("""
                                                어떤 형체를 지나쳐야 될 것같다.
                                                
                                                너가 한번 갔다 와봐. 나는 들킬것 같아.
                                                
                                                자바의 망령 : 싫은데?~ 룰루랄라.                                                
                                               

                                                """);
                                        communication9.start();
                                        try {
                                            communication9.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }

                                    } else if (Nunettine.nunettine <= 8) {
                                        //Music effect12 = new Music("pickup.mp3",true);
                                        //effect12.start();
                                        Story cm10 = new Story("""
                                                영~차 저기 나좀 도와줘.
                                                
                                                자바의 망령 : 한번 도와줄까? 흐흐.
                                                
                                                무엇인가 손에 잡힌다.
                                                
                                                성수 2병과 누네띠네4개를 발견했다.

                                                """);

                                        Pot.pot += 2;
                                        Nunettine.nunettine += 4;

                                        cm10.start();
                                        try {
                                            cm10.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        //effect12.close();

                                    } else if (teamNovaPedding.item_Count == 0) {
                                        //Music effect13 = new Music("pickup.mp3",true);
                                        //effect13.start();
                                        Story cm11 = new Story("""
                                                아니 이것은 00에서 나온 신상 패딩이잖아??
                                                
                                                자바의 망령 : 이 친구 운이 좋군..
                                                
                                                00 빅사이즈 패딩을 획득하셨습니다.
                                                
                                                방어력 +50

                                                """);

                                        teamNovaPedding.item_Count += 1;
                                        heroin.myitem[0] = teamNovaPedding.name;
                                        heroin.TeamNovaPedding();

                                        cm11.start();
                                        try {
                                            cm11.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        //effect13.close();


                                    } else if (teamNovaPedding.item_Count == 1 && ghost_item3.item_Count == 0) {

                                        Story cm12 = new Story("""
                                                뭔가 더있는것 같은데 저기 한번만 더 도와줘.
                                                
                                                자바의 망령 : 저건 누군가의 도움이 더 필요해
                                                
                                                그게 무슨??? 일단 돌아가자.

                                                """);
                                        cm12.start();
                                        try {
                                            cm12.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }

                                    } else if (teamNovaPedding.item_Count == 1 && ghost_item3.item_Count == 1) {

                                        //Music effect14 = new Music("pickup.mp3",true);
                                        //effect14.start();

                                        Story cm13 = new Story("""
                                                
                                                자바의 망령이 안드로이드의 주문을 외운다.
                                                
                                                덜덜덜..잔해가 요동치면서 위로 올라간다.
                                                .
                                                .
                                                .
                                                .
                                                .
                                                무언가 휙하고 날아온다!.
                                                                                                
                                                스마트폰 부품 1 획득. 
                                                

                                                """);

                                        cm13.start();
                                        try {
                                            cm13.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        //effect14.close();


                                        parts.item_Count = 1;


                                    }else if(parts.item_Count==1){
                                        System.out.println("이미 부품을 얻었다.");
                                    }


                                }
                                break;

                            case 4:
                                System.out.println("여기도 폐허가 되었군.");
                                System.out.println("1. 책상위에 진동하는 스마트폰을 잡는다.");
                                System.out.println("2. 2강의실을 탐색한다."+lock.office7_1);
                                System.out.println("3. 나간다.");

                                num = scanner.nextInt();

                                if (num == 1) {

                                    StopRecyclerView stopRecyclerView = new StopRecyclerView();
                                    stopRecyclerView.name = "응답없는 리사이클러뷰";
                                    stopRecyclerView.hp = 25000;
                                    stopRecyclerView.level = 1;
                                    stopRecyclerView.power = 80;
                                    stopRecyclerView.defense = 30;
                                    stopRecyclerView.experience = 700;

                                    Story cm14 = new Story("""
                                            
                                            지이이이이이잉
                                                                                
                                            여기에 왜 핸드폰이 있지??                                           
                                                                                
                                            자바의 망령 : 안돼!! 잡지마!... 그거 스마트폰....
                                                                                
                                            앗 깜작이야! 왜 소리를...
                                                                                
                                            이미 손에는 스마트폰이 쥐어져 있었고 스마트폰이 점점 커지면서 손에서 빠져나갔다.
                                                                                                                                                 
                                            액정에는 리사이클러뷰만 떠있다.


                                            """);
                                    cm14.start();
                                    try {
                                        cm14.join();
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }

                                    System.out.println("뭐야? 이거?");
                                    System.out.println("");
                                    System.out.println("지직 지직 하면서 스마트 폰이 달려듭니다.");

                                    MonsterAttack3 monsterAttack3 = new MonsterAttack3();
                                    monsterAttack3.start();

                                    while (true) {


                                        System.out.println("나의 체력은 : " + heroin.hp);
                                        System.out.println("자의 지구력은 : " + heroin.stamina);
                                        System.out.println();

                                        stopRecyclerView.attacked(heroin.atk()); // 주인공 공격
                                        //heroin.attacked(stopRecyclerView.atk()); // 몬스터 공격


                                        if (stopRecyclerView.hp <= 0) {
                                            //Music effect15 = new Music("pickup.mp3",true);
                                            //effect15.start();

                                            stopRecyclerView.hp = 0;
                                            System.out.println("응답없는 리사이클러뷰가 응답을 하면서 전원이 꺼집니다!!!" + "\n");
                                            System.out.println("누네띠네5개와 빈병 5개를 얻었습니다.");
                                            System.out.println("질문횟수 5회를 받았습니다.");
                                            System.out.println("경험치 600을 얻었습니다.");
                                            System.out.println();
                                            System.out.println("응답없는 리사이클러뷰의 상태는 :" + stopRecyclerView.hp);
                                            System.out.println("나의 체력은 : " + heroin.hp);
                                            System.out.println("나의 지구력은: " + heroin.stamina);
                                            heroin.experience += 600;
                                            EmptyBottle.emptybottle += 5;
                                            Nunettine.nunettine += 5;
                                            Question.question += 5;
                                            lock.setOffice7_1(" ");
                                            seven_event1.item_Count +=1;
                                            monsterAttack3.stop();
                                            //effect15.close();

                                            Story cm16 = new Story("""
                                                    
                                                    2강의실을 탐색해보자!
                                                                                                        
                                                    자바의 망령 : ?!?!

                                                    """);

                                            cm16.start();
                                            try {
                                                cm16.join();
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }

                                            break;
                                        }

                                        if (heroin.hp <= 0) {

                                            heroin.hp = 0;
                                            System.out.println("===========================================");
                                            System.out.println("여기까진가??.....");
                                            System.out.println("당신은 죽었습니다. ==데스엔딩==");
                                            System.exit(0);
                                            break;

                                        }

                                    }

                                }
                                if (num == 2) {
                                    if (seven_event1.item_Count <= 0) {
                                        System.out.println("잔해를 치울수 없을 것 같다.");
                                        System.out.println();
                                    } else if (teamNovaNotebook.item_Count == 0) {
                                        //Music effect16 = new Music("pickup.mp3",true);
                                       // effect16.start();

                                        Story cm17 = new Story("""
                                                아니 이건 00 추천 노트북이잖아?
                                                
                                                이렇게 귀한게 어떻게 여기있지?
                                                
                                                자바의 망령 : (진짜 탈출할 수 있을지도 모르겠군..)
                                                
                                                추천 노트북을 획득하였습니다.
                                                
                                                공격력 +150

                                                """);

                                        cm17.start();
                                        try {
                                            cm17.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        //effect16.close();

                                        teamNovaNotebook.item_Count += 1;
                                        heroin.myitem[1] = teamNovaNotebook.name;
                                        heroin.TeamNovaNotebook();

                                    } else if (teamNovaNotebook.item_Count == 1 && ghost_item4.item_Count == 0) {
                                        Story cm18 = new Story("""
                                                안쪽에 또 뭔가 더 있는 것 같아.
                                                
                                                자바의 망령 : 저것도 마찬가지로 누군가의 도움이 더 필요해.
                                                
                                                뭐야?? 또? (말만 많은 녀석이군..)                                                    

                                                """);

                                        cm18.start();
                                        try {
                                            cm18.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }

                                    } else if (teamNovaNotebook.item_Count == 1 && ghost_item4.item_Count == 1) {
                                        //Music effect17 = new Music("pickup.mp3",true);
                                       // effect17.start();

                                        Story cm19 = new Story("""
                                                
                                                
                                                자바의 망령이 안드로이드의 주문을 외운다.
                                                
                                                덜덜덜..잔해가 요동치면서 위로 올라간다.
                                                .
                                                .
                                                .
                                                .
                                                .
                                                무언가 휙하고 날아온다!.
                                                                                                
                                                스마트폰 부품 2 획득.                                                

                                                
                                                


                                                """);
                                        cm19.start();
                                        try {
                                            cm19.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        //effect17.close();


                                        parts1.item_Count = 1;

                                    }else if (parts1.item_Count >=1){
                                        System.out.println("이미 부품을 얻었다.");
                                    }


                                }
                                break;
                            case 5:
                                if (parts.item_Count == 0 && parts1.item_Count == 0) {

                                    Story cm20 = new Story("""
                                            툭 툭 뭐야 이거 전혀 작동하지 않는데??
                                                                                        
                                            이걸 고치고 싶은데 어떤 방법이 없을까??
                                                                                        
                                            자바의 망령 : 후후후 너보다 더 애타게 기다리고 있는 존재가 있을것 같은데?
                                                                                        
                                            뭐라고?? 어디 있어?? 어쨌든 작동하지 않으니 여기서 할 일은 없는 것 같다. 

                                            """);

                                    cm20.start();
                                    try {
                                        cm20.join();
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }

                                } else if (parts.item_Count == 1 && parts1.item_Count == 1) {
                                    Story cm21 = new Story("""
                                            띠리링~~~
                                                                                        
                                            자바의 망령 : (뒤적 뒤적) 
                                                                                        
                                            작동된다!
                                                                                        
                                            자바의 망령 : 잠시만, 이건 내가 가지고 있는것이 낫겠어.
                                                                                        
                                            왜그래? 내가 들고 있으면 안되나?.
                                                                                        
                                            자바의 망령 : 탈출을 위해서는 가지고 있지 않느것이 좋을걸??
                                                                                        
                                            (믿어야되는거 맞나?) 어쨌든.. 알겠어. 


                                            """);

                                    cm21.start();
                                    try {
                                        cm21.join();
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }

                                    System.out.println("안드로이드의 망령을 위한 스마트폰??을 습득했습니다.");
                                    ghost_water.item_Count += 1;

                                }else{
                                    System.out.println("부품이 필요합니다.");
                                }
                                break;
                            case 6:
                                System.out.println("8사무실에 들어왔다. 무엇을 하지?");
                                System.out.println("1. 켜져있는 모니터 앞에 앉는다.");
                                System.out.println("2. 8강의실을 탐색한다.");
                                System.out.println("3. 나간다.");

                                num = scanner.nextInt();

                                switch (num) {
                                    case 1:

                                        System.out.println("카페에 접속했다. 코딩멘토가 접속해있다!!");
                                        System.out.println("1.코딩멘토에게 질문한다.");
                                        System.out.println("2.코딩멘토와 하브루타를 한다.");
                                        System.out.println("3.코딩멘토에게 고민상담을 한다.");
                                        System.out.println("4.다른 행동을 한다.");

                                        num = scanner.nextInt();

                                        switch (num) {
                                            case 1:
                                                if (seven_hidden.item_Count == 0) {
                                                    Story cm22 = new Story("""
                                                            
                                                            
                                                            안녕하세요? 멘토님!!!
                                                            
                                                            코딩멘토 : 네 안녕하세요? 아직도 6사무실인가요??
                                                            
                                                            아니 농담이 아니라 밖에는 사람이 한명도 없고 지금 7사무실인데...
                                                            
                                                            코딩멘토 : 설마?! 그럼 그쪽도 자바의 망령에 홀려 갇힌것인가요??
                                                            
                                                            네 맞아요. 비밀번호가 있어야 탈출을 할 수 있다고 하더라고요. 
                                                            
                                                            코딩멘토 : 그래요!! 그렇다면 혹시 제 부탁하나만 들어 주실수 있으신가요?
                                                            
                                                            뭐든 말하세요.
                                                            
                                                            코딩멘토 : 저도 지금 3사무실에 갇혀있는데 7사무실의 비밀번호를 까먹은거에요.
                                                            혹시 비밀번호를 찾으면 보내 주실 수 있으신가요? 대신에 제가 드릴게요.
                                                            
                                                            네 알겠습니다. 바로 보내 드리죠.
                                                            
                                                            자바의 망령 : 껄껄껄. 크크크
                                                            
                                                            왜 웃는 거야?                                                         


                                                            """);
                                                    cm22.start();
                                                    try {
                                                        cm22.join();
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }


                                                } else if (seven_password.item_Count == 1 && seven_hidden.item_Count == 1) {

                                                    Story cm23 = new Story("""
                                                            멘토님!!!
                                                            
                                                            코딩멘토 : 네, 비밀번호를 찾으셨나요?
                                                            
                                                            예 찾았어요!!!                                                           


                                                            """);
                                                    cm23.start();
                                                    try {
                                                        cm23.join();
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }

                                                    System.out.println("비밀번호는" + Heroin.password[1] + "예요.");

                                                    //Music effect18 = new Music("pickup.mp3",true);
                                                   // effect18.start();

                                                    Story cm24 = new Story("""
                                                            코딩멘토 : 고마워요!! 혹시 같이 탈출 할 수 있으면 같이 탈출할까요?.
                                                            
                                                            네 알겠어요. 3사무실에서 만나요!!
                                                            
                                                            코딩멘토 : 그래요 기다리고 있을게요!. 이건 선물이에요~~
                                                            
                                                            자바의 망령 : 하하하하, 껄껄껄
                                                            
                                                            질문횟수 +40000


                                                            """);
                                                    cm24.start();
                                                    try {
                                                        cm24.join();
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                    //effect18.close();

                                                    Question.question += 40000;
                                                    seven_password1.item_Count += 1;
                                                }
                                                break;

                                            case 2:// 퀘스트 아이템으로 취급하여 나중에 이것을 가지고 자바의 망령 이벤트도 만들기.
                                                System.out.println("멘토님 여기서 탈출할 수있는 방법에 대해서 하브루타 요청합니다.");
                                                System.out.println("음... 그럼 여기서 한번 골라 보시죠. 하나만 구입하실수 있습니다.");
                                                System.out.println("1. 파트장님의 3분완성 기초강의 + 공격력 50000");//나중에 퀘스트 아이템으로 취급
                                                System.out.println("2. 팀장님의 피드백 + 지구력 30000");//나중에 퀘스트 아이템으로 취급
                                                System.out.println("3. 사장님의 필수강의 + 방어력 40000");//나중에 퀘스트 아이템으로 취급

                                                num = scanner.nextInt();

                                                if (num == 1) {
                                                    if (Question.question >= 30000) {
                                                        //Music effect19 = new Music("pickup.mp3",true);
                                                      //  effect19.start();
                                                        System.out.println("그냥 몸이 불타고 있습니다. 파괴의 신이 된 느낌입니다.");
                                                        heroin.power += 50000;
                                                        Question.question -= 20000;

                                                        heroin.myitem[1] = partNotebook.name;
                                                        System.out.println(partNotebook.name + "을 얻었습니다.");
                                                        heroin.PartNotebook();
                                                        partNotebook.item_Count += 1;
                                                        //effect19.close();

                                                    } else {
                                                        System.out.println("질문횟수가 부족합니다.");
                                                    }
                                                }
                                                if (num == 2) {
                                                    if (Question.question >= 35000) {
                                                        //Music effect20 = new Music("pickup.mp3",true);
                                                      //  effect20.start();
                                                        System.out.println("지치질 않습니다. 어떤 것도 바로 해낼수 있다는 생각이 마구 듭니다.");
                                                        System.out.println("+지구력 30000");
                                                        heroin.stamina += 30000;
                                                        Question.question -= 20000;
                                                        //effect20.close();

                                                    } else {
                                                        System.out.println("질문횟수가 부족합니다.");
                                                    }
                                                }
                                                if (num == 3) {
                                                    if (Question.question >= 40000) {
                                                        //Music effect21 = new Music("pickup.mp3",true);
                                                       // effect21.start();
                                                        System.out.println("어떤 공격을 해도 겁이 나지 않습니다. 아니 자신감이 흘러 넘칩니다.");
                                                        System.out.println("+방어력 40000 ");
                                                        heroin.defense += 40000;
                                                        Question.question -= 20000;
                                                        //effect21.close();

                                                    } else {
                                                        System.out.println("질문횟수가 부족합니다.");
                                                    }
                                                }
                                                break;

                                            case 3:
                                                System.out.println("멘토님 고민상담을 요청합니다.");
                                                System.out.println("어떤 고민이죠??.");
                                                System.out.println("1.체력이 없습니다.");
                                                System.out.println("2.지구력이 없습니다.");

                                                num = scanner.nextInt();

                                                if (num == 1) {
                                                    if (Question.question >= 1) {
                                                        //Music effect22 = new Music("hpup.mp3",true);
                                                       // effect22.start();
                                                        System.out.println("진심어린 멘토와의 상담으로 체력이 증가합니다. 체력 +150");
                                                        heroin.power += 150;
                                                        Question.question -= 1;
                                                        //effect22.close();

                                                    } else {
                                                        System.out.println("질문횟수가 없습니다.");
                                                    }
                                                }
                                                if (num == 2) {
                                                    if (Question.question >= 1) {
                                                        //Music effect23 = new Music("hpup.mp3",true);
                                                       // effect23.start();
                                                        System.out.println("진심어린 멘토와의 상담으로 지구력이 증가합니다. 지구력 +150");
                                                        heroin.stamina += 150;
                                                        Question.question -= 1;
                                                        //effect23.close();

                                                    } else {
                                                        System.out.println("질문횟수가 없습니다.");
                                                    }
                                                }
                                        }
                                        break;
                                    case 2:

                                        Story cm25 = new Story("""
                                                자바의 망령 : 넌 8사무실의 망령??
                                                
                                                8사무실의 망령 : 쉿! 조용히해!! 여기 하브루타가 안된다고!!!
                                                
                                                자바의 망령 : 감히 나에게 명령을하다니!!! 아직도 질문횟수를 뺏고 다니는군.
                                                
                                                8사무실의 망령 : .... 
                                                
                                                자바의 망령 : 소문이 사실이었군 "목숨을 건" 가위 바위 보를 한다더니...
                                                
                                                8사무실의 망령 : 한번 해볼테냐??
                                                
                                                자바의 망령 : 난 아니고 이친구가 대신 할걸세..
                                                
                                                뭐?!!?!?!?
                                                
                                                (단판 승부입니다!!!!  잘못하면 죽을 수있습니다!! 신중히 생각하세요.)


                                                """);

                                        cm25.start();
                                        try {
                                            cm25.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }

                                        System.out.println("가위바위보게임을 하시겠습니까?");
                                        System.out.println();
                                        System.out.println("1.그냥 한다.");
                                        System.out.println("2.그냥 줄행랑을 친다.");
                                        System.out.println();

                                        num = scanner.nextInt();

                                        if (num ==1 && seven_event2.item_Count == 0){
                                            System.out.println("어이 진정하라구!! 게임의 규칙은 알지?");
                                            System.out.println("가위(1) , 바위(2), 보(3)중 하나를 입력하십시오.");

                                            int user = scanner.nextInt();
                                            int com = (int)(Math.random()*3)+1;

                                            Loading loading2 = new Loading("▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▶▷▶▷▶▷▶▶▷▶▷▶▷▶▶▷▶▷▶▷▶");
                                            loading2.start();
                                            try {
                                                loading2.join();
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }
                                            System.out.println("""
                                                    
                                                    
                                                    
                                                    
                                                    
                                                    
                                                    
                                                    
                                                    
                                                    
                                                    
                                                    


                                                    """);

                                            System.out.println("당신은" + user+"입니다.");
                                            System.out.println("8사무실의 망령은" + com +"입니다.");

                                            switch (user - com){
                                                case 2: case -1:
                                                    Story cm26 = new Story("""
                                                            
                                                            
                                                            
                                                            당신이 졌습니다.
                                                            
                                                            8사무실의 망령 : 약속대로 목숨을 가져가지.. 퍽!
                                                            
                                                            8사무실의 망령 : 아니 왜 안죽지???
                                                            
                                                            자바의 망령 : 크크크크
                                                            
                                                            8사무실의 망령 : 자바의 망령 너 이자식!!!
                                                            
                                                            자바의 망령 : 후후후후.
                                                            
                                                            체력이 200감소하였습니다.


                                                            """);

                                                   cm26.start();
                                                    try {
                                                        cm26.join();
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }

                                                    seven_event2.item_Count=1;
                                                    heroin.hp -= 200;

                                                    break;

                                                case 1: case -2:
                                                    //Music effect25 = new Music("pickup.mp3",true);
                                                   // effect25.start();

                                                    Story cm27 = new Story("""
                                                            당신이 이겼습니다.
                                                            
                                                            8사무실의 망령 : 흥 한번 이겼다고 좋아하긴....
                                                            
                                                            자바의 망령 : 이얍!! 
                                                            
                                                            8사무실의 망령 : 으아악..... 자바의 망령 이자식....
                                                            
                                                            8사무실의 망령이 연기가 되어 점점 사라집니다.
                                                            
                                                            8사무실의 망령이 뺏은 질문횟수를 가져갑니다.
                                                            
                                                            +질문횟수 20000


                                                            """);

                                                    cm27.start();
                                                    try {
                                                        cm27.join();
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                    //effect25.close();


                                                    Question.question += 20000;
                                                    seven_event2.item_Count=1;

                                                    break;

                                                case 0:
                                                    //Music effect26 = new Music("pickup.mp3",true);
                                                   // effect26.start();

                                                    Story cm28 = new Story("""
                                                            비겼습니다.
                                                            
                                                            8사무실의 망령 : 운이 좋군. 친구.
                                                            
                                                            자바의 망령 : 그렇군.
                                                            
                                                            +경험치 8000;
                                                            
                                                            +LV 레벨업! 


                                                            """);
                                                    cm28.start();
                                                    try {
                                                        cm28.join();
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }
                                                    //effect26.close();

                                                    heroin.level += 1;
                                                    seven_event2.item_Count = 1;

                                                    break;
                                            }

                                        }else if (num ==1 && seven_event2.item_Count == 1){
                                            System.out.println("이미 한판 승부를 하셨습니다.");

                                        }else if(num ==2){
                                            System.out.println("겁이 너무나서 도망갔습니다.");

                                        }
                                        //가위바위보게임 넣기


                                }
                                break;


                            case 7:
                                if (ghost_item3.item_Count == 0 || ghost_item4.item_Count == 0) {

                                    Story cm29 = new Story("""
                                            자바의 망령 : 오랜만일세. 안드로이드의 망령이여.
                                                                                        
                                            안드로이드의 망령 : 그렇군, 자네가 여기 왜 있는가? 자바의 망령이여..
                                                                                        
                                            자바의 망령 : 여기 이 친구가 길을 해매서 같이 다니려고 왔네.
                                                                                        
                                            안드로이드의 망령 : 이상한 일이군... 오래된 나의 벗이여.. 나에게 도움을 줄 수 있겠나?
                                                                                        
                                            자바의 망령 : 보다싶이 나도 망령이라 도움을 주지 못하네 그려. 이 친구에게 부탁해보지 않겠나?
                                                                                        
                                            안드로이드의 망령 : 젊은이여, 나도 그대와 같은 시절이 있었네만, 이제는 그렇지 않네.
                                                                                        
                                            오래전부터 힘을 갈망했네만 났네만, "그녀석"때문에 어쩔수가 없었네. 자네가 나에게 도움을 줄 수있겠나?
                                                                                        
                                            그러죠, 어떻게 하면 되죠?
                                                                                        
                                            안드로이드의 망령 : 어딘가에 있는 스마트폰을 내게 건네주면 되네. 그렇지만 그것이 고장이 났지 뭔가.
                                                                                        
                                            안드로이드의 부품은 7사무실을 탐색해보면 나올것이네.
                                                                                        
                                            자바의 망령 : 그렇게만 해주면 비밀번호를 가르쳐준다고 약속을 해주시게.
                                                                                        
                                            안드로이드의 망령 : 음... 그렇게 하겠네 약속을 하지. 그리고 탐색을 할 때 이것들이 필요할 걸세.
                                            
                                            단, 몬스터들이 있으면 해치워야 될것일세.
                                                                                        
                                            안드로이드의 망령의 주문1, 안드로이드의 주문 2를 획득 했습니다.


                                            """);

                                    cm29.start();
                                    try {
                                        cm29.join();
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }


                                    ghost_item3.item_Count += 1;
                                    ghost_item4.item_Count += 1;


                                } else if (ghost_water.item_Count == 1) {

                                    RunawayApp runawayApp = new RunawayApp();
                                    runawayApp.name = "안드로이드의 망령";
                                    runawayApp.hp = 45000;
                                    runawayApp.level = 5;
                                    runawayApp.power = 300;
                                    runawayApp.defense = 60;
                                    runawayApp.experience = 1000;

                                    Story cm30 = new Story("""
                                            안드로이드의 망령 : 왔구나 젊은이여, 나를 위해서 스마트폰을 고쳐주니. 너무 좋구나.
                                                                                
                                            자바의 망령 : 자, 가져가시게, 나의 오래된 벗 안드로이드의 망령이여...                                       
                                                                                
                                            안드로이드의 망령 : 이게 뭔가? 자바의 망령이여. 이건 스마트폰이 아니지 않은가?
                                                                                        
                                            이것은....폴더 폰??!!!
                                                                                
                                            자바의 망령 : 그럴리 없네, 우리가 찾은 것이 이것임에는 틀림이없네.
                                                                                
                                            안드로이드의 망령 : 나는 스마트폰 이외의 것을 만지면 부식되어 죽는다는 것을 모르는가?
                                                                                                                                                 
                                            자바의 망령 : 잘알고 있네.. 이제 푹 쉬게나...
                                                                                        
                                            안드로이드의 망령 : 자바의 망령이여!!! 어떻게 이럴수 있는가? 자네 이세계를...
                                                                                        
                                            자바의 망령 : 하하하하하.
                                                                                        
                                            안드로이드의 망령 : 그렇다면 자네도 같이 죽게나!!! 이런 배신자!!


                                            """);
                                    cm30.start();
                                    try {
                                        cm30.join();
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }

                                    System.out.println("?!?!?!? 분명히 스마트폰이었는데?!");
                                    System.out.println("");
                                    System.out.println("안드로이드의 망령이 폭주합니다.");

                                    MonsterAttack4 monsterAttack4 = new MonsterAttack4();
                                    monsterAttack4.start();

                                    while (true) {


                                        System.out.println("나의 체력은 : " + heroin.hp);
                                        System.out.println("나의 지구력은 : " + heroin.stamina);
                                        System.out.println();

                                        runawayApp.attacked(heroin.atk()); // 주인공 공격
                                        //heroin.attacked(runawayApp.atk()); // 몬스터 공격


                                        if (runawayApp.hp <= 0) {

                                            runawayApp.hp = 0;
                                            System.out.println("안드로이드의 망령이 재로 변하면서 사라집니다.!!!" + "\n");
                                            System.out.println("누네띠네10개와 빈병 10개를 얻었습니다.");
                                            System.out.println("질문횟수 20회를 받았습니다.");
                                            System.out.println("경험치 1600을 얻었습니다.");
                                            System.out.println();
                                            System.out.println("안드로이드의 망령의 체력은 :" + runawayApp.hp);
                                            System.out.println("나의 체력은 : " + heroin.hp);
                                            System.out.println("나의 지구력은: " + heroin.stamina);
                                            heroin.experience += 1600;
                                            EmptyBottle.emptybottle += 10;
                                            Nunettine.nunettine += 10;
                                            Question.question += 20;
                                            seven_password.item_Count += 1;
                                            seven_hidden.item_Count += 1;
                                            Heroin.password[1] = "246";
                                            lock.setOffice7_2(" ");
                                            monsterAttack4.stop();

                                            //Music effect27 = new Music("pickup.mp3",true);
                                          //  effect27.start();

                                            Story cm31 = new Story("""
                                                    왜 스마트폰대신 폴더폰을 건냈지? 왜?! 그리고 언제 바꾼거지??
                                                                                                        
                                                    자바의 망령 : .......
                                                                                                        
                                                    비밀번호가 새로 생겼습니다. 인벤토리에서 확인해 주세요.  


                                                    """);
                                            cm31.start();
                                            try {
                                                cm31.join();
                                            } catch (InterruptedException e) {
                                                e.printStackTrace();
                                            }

                                            //effect27.close();


                                            break;
                                        }

                                        if (heroin.hp <= 0) {

                                            heroin.hp = 0;
                                            System.out.println("===========================================");
                                            System.out.println("여기까진가??.....");
                                            System.out.println("당신은 죽었습니다. ==데스엔딩==");
                                            System.exit(0);
                                            break;

                                        }

                                    }

                                } else if (ghost_water.item_Count >= 1 && seven_password.item_Count >= 1) {

                                    System.out.println("자바의 망령의 재만 남아있을 뿐이다.");

                                }
                                break;
                            case 8:
                                if (Heroin.password[1] == "000") {

                                    System.out.println("덜컹 덜컹!! 문이 잠겼잖아??");
                                    System.out.println();
                                    System.out.println("자바의 망령 : 비밀번호가 있어야 나갈 수 있다구!");

                                    break;
                                } else if (Heroin.password[1] == "246") {
                                    System.out.println("비밀번호를 입력해주세요");

                                    num = scanner.nextInt();

                                    if (seven_password1.item_Count == 0 && num ==246) {

                                        Story cm32 = new Story("""
                                                자바의 망령 : 결국 7사무실의 비밀번호도 알아냈군.... 대단한걸
                                                                                                
                                                그렇구나! 어쩌다보니 7사무실까지 왔군... 
                                                                                                
                                                자바의 망령 : 아직 좋아하긴 일러.. 
                                                                                                
                                                이봐 탈출구가 있긴 있는거야?
                                                                                                
                                                자바의 망령 : (과연 이친구가 탈출할 수 있을까?)......
                                                                                                
                                                (갑자기 말이 없군).......
                                                                                                
                                                히든이벤트가 있었습니다. 2회차에는 코딩멘토에게 질문해보아요! 
                                                                                                
                                                스테이지 보너스 +공격력 200, +방어력 150, +지구력 150, +경험치 3000
                                                                    
                                                레벨업! +LV1
                                                                    
                                                (탈출을 하시겠습니까? 아무키나 눌러주세요.) 


                                                """);
                                        cm32.start();
                                        try {
                                            cm32.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }

                                        heroin.power += 200;
                                        heroin.defense += 150;
                                        heroin.stamina += 150;
                                        heroin.experience += 3000;
                                        heroin.level += 1;

                                    } else if (seven_password1.item_Count == 1 && num == 246) {

                                        Story cm33 = new Story("""
                                                자바의 망령 : 결국 7사무실의 비밀번호도 알아냈군.... 대단한걸
                                                                                                
                                                그렇구나! 어쩌다보니 7사무실까지 왔군... 
                                                                                                
                                                자바의 망령 : 아직 좋아하긴 일러.. 
                                                                                                
                                                이봐 탈출구가 있긴 있는거야?
                                                                                                
                                                자바의 망령 : (과연 이친구가 탈출할 수 있을까?)......
                                                                                                
                                                (갑자기 말이 없군).......                                       
                                                                                                
                                                스테이지 보너스, 히든이벤트 +체력 200 +공격력 200, +방어력 150, +지구력 150, +경험치 3000
                                                                   
                                                질문횟수 +30 레벨업! +LV1 
                                                                    
                                                (탈출을 하시겠습니까? 아무키나 눌러주세요.)  


                                                """);

                                        cm33.start();
                                        try {
                                            cm33.join();
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }


                                        heroin.hp += 200;
                                        heroin.power += 200;
                                        heroin.defense += 150;
                                        heroin.stamina += 150;
                                        heroin.experience += 3000;
                                        heroin.level += 1;
                                        Question.question += 30;

                                    }else if(num != 246){
                                        System.out.println("비밀번호를 다시 입력해주세요.");
                                        break;
                                    }

                                    num = scanner.nextInt();
                                }

                                Loading loading3 = new Loading("▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷");
                                loading3.start();
                                try {
                                    loading3.join();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                                //intromusic2.close();
                                time1.interrupt();

                                //Music music5 = new Music("door_open.mp3",true);
                                //music5.start();
                                //music5.close();

                                //Music music6 = new Music("walk.mp3", true);
                                //music6.start();
                                //music6.close();

                                //Music music7 = new Music("sigh.mp3", true);
                                //music7.start();
                                //music7.close();

                                System.out.println("""
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        


                                        """);




                                Story story6 = new Story("""
                            드디어 탈출이다!!!!!
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            
                            아무것도 모른채 문을 열고 나가니 3사무실이 아닌가????
                            
                            아니 대체?!! 너무나도 열받은 주인공은 그자리에서 한숨이 나왔다.
                            
                            아아아아아아아아아아아
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            .
                            
                            
                            


                            """);

                                story6.start();
                                try {
                                    story6.join();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                                //Music intromusic3 = new Music("3thoffice.mp3",true);
                              //  intromusic3.start();


                                System.out.println("""
                                           
                                           
                                           
                                           
                                           




                                                                  




                                                                    
                                                                    
                                                                    
                                                                    

                                                                    
                                                                    
                                                                    
                                           __      __       __                     _____       ____     ____     ______      ____       ____     \s
                                         /'_ `\\   /\\ \\__   /\\ \\                   /\\  __`\\    /\\  _`\\  /\\  _`\\  /\\__  _\\    /\\  _`\\    /\\  _`\\   \s
                                        /\\ \\L\\ \\  \\ \\ ,_\\  \\ \\ \\___               \\ \\ \\/\\ \\   \\ \\ \\L\\_\\\\ \\ \\L\\_\\\\/_/\\ \\/    \\ \\ \\/\\_\\  \\ \\ \\L\\_\\ \s
                                        \\/_> _ <_  \\ \\ \\/   \\ \\  _ `\\              \\ \\ \\ \\ \\   \\ \\  _\\/ \\ \\  _\\/   \\ \\ \\     \\ \\ \\/_/_  \\ \\  _\\L \s
                                          /\\ \\L\\ \\  \\ \\ \\_   \\ \\ \\ \\ \\              \\ \\ \\_\\ \\   \\ \\ \\/   \\ \\ \\/     \\_\\ \\__   \\ \\ \\L\\ \\  \\ \\ \\L\\ \\
                                          \\ \\____/   \\ \\__\\   \\ \\_\\ \\_\\              \\ \\_____\\   \\ \\_\\    \\ \\_\\     /\\_____\\   \\ \\____/   \\ \\____/
                                           \\/___/     \\/__/    \\/_/\\/_/               \\/_____/    \\/_/     \\/_/     \\/_____/    \\/___/     \\/___/\s                                     
                                                                    
                                                                    
                                                                           
                                        """);


                                System.out.println("*************************EXCELSIOR**************************");
                                System.out.println("[설명] 순서대로 진행하시면 됩니다. ");
                                System.out.println("[설명] 몬스터들이 많이 많이 강합니다. ");
                                System.out.println("[설명] 반드시 비밀번호는 찾아야합니다.");
                                System.out.println("[설명] 3사무실은 시간제약이 없습니다.");
                                System.out.println("*************************EXCELSIOR**************************");
                                System.out.println();
                                System.out.println();



                                while (true) { // 코딩멘토 퀘템 --> 자바망령 대화 후 퀘템--> 존재(보스) 비밀번호 --> 비밀번호 입력!

                                    System.out.println("====================================================================");
                                    System.out.println("무엇을 할까?" + "\n");
                                    System.out.println("1.상태체크.                           5.무엇인가를 지키고 있는 존재와 대화를 한다."+lock.office3_1); //
                                    System.out.println("2.인벤토리 확인.                       6.비밀번호를 입력하자!."+lock.office3_2);
                                    System.out.println("3.코딩멘토와 대화를 한다."); // 아이템 x ==>마지막 대화(왜 끝에 가서 나를 위해 배신했냐고) 아이템 o --> 자바의 망령이 사라짐
                                    System.out.println("4.자바의 망령과 대화를 한다."+lock.office3);

                                    num = scanner.nextInt();
                                    System.out.println("=====================================================================");

                                    //아이템 생성하기
                                    //몬스터 스킬 완성
                                    //

                                    switch (num) {
                                        case 1:
                                            heroin.print();
                                            break;

                                        case 2:
                                            inventory.print();
                                            break;

                                        case 3:
                                            if(codingMentor_event.item_Count==0){

                                                BadCondingMento badCondingMento = new BadCondingMento();
                                                badCondingMento.name = "타락한 코딩멘토";
                                                badCondingMento.hp = 55000;
                                                badCondingMento.level = 5;
                                                badCondingMento.power = 420;
                                                badCondingMento.defense = 60;
                                                badCondingMento.experience = 3000;

                                                Story cm34 = new Story("""
                                                        (타락한)코딩멘토 : 드디어 왔군요! 당신이 아까 연락한 팀원인가요???
                                                                                
                                            예, 맞습니다. 이제 같이 탈출할까요?? 탈출구가 어디죠? 멘토님?                                       
                                                                                
                                            (타락한)코딩멘토 : 이건 00 추천 노트북?!!... 빅사이즈 패딩??
                                                                                        
                                            이거 다 어디서 났죠??
                                                                                
                                            7사무실에서 찾았습니다. 왜 그러시죠??
                                                                                
                                            자바의 망령 : 낄낄낄..
                                                                                                                                                 
                                            (타락한)코딩멘토 : 그럼 안드로이드의 망령이...... 안드로이드의 망령 소환!!!,, 소환!!!....
                                            
                                            ?????
                                                                                        
                                            "타락한" 코딩멘토 : 자바의 망령! 명령한다 저 친구를 죽여! 지금 바로!!
                                                                                        
                                            자바의 망령 : 싫다면???
                                            
                                            "타락한" 코딩멘토 : 네 녀석이 배신자였군!! 이 세계를 망하게 할 생각이냐???
                                            
                                            멘토님?? 무슨 말씀이시죠?? 그게 무슨...
                                            
                                            퍽! 윽! (체력이 100 감소합니다.)
                                            
                                            "타락한" 코딩멘토 : 네 물건을 나에게 전부 넘겨야겠어..                                  
                                                                                        
                                            자바의 망령 : .....
                                                        


                                                        """);

                                                cm34.start();
                                                try {
                                                    cm34.join();
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }


                                                heroin.hp -= 100;

                                                MonsterAttack5 monsterAttack5 = new MonsterAttack5();
                                                monsterAttack5.start();

                                                while (true) {


                                                    System.out.println("나의 체력은 : " + heroin.hp);
                                                    System.out.println("자의 지구력은 : " + heroin.stamina);
                                                    System.out.println();

                                                    badCondingMento.attacked(heroin.atk()); // 주인공 공격
                                                    //heroin.attacked(badCondingMento.atk()); // 몬스터 공격


                                                    if (badCondingMento.hp <= 0) {
                                                        //Music effect30 = new Music("pickup.mp3",true);
                                                     //   effect30.start();
                                                        badCondingMento.hp = 0;
                                                        System.out.println("타락한 코딩멘토가 비명을 지르며 쓰러집니다!!!" + "\n");
                                                        System.out.println("누네띠네20개와 빈병 20개를 얻었습니다.");
                                                        System.out.println("질문횟수 100회를 받았습니다.");
                                                        System.out.println("경험치 5000을 얻었습니다.");
                                                        System.out.println("+LV1 했습니다.");
                                                        System.out.println("");
                                                        System.out.println("타락한 코딩멘토의 체력은 :" + badCondingMento.hp);
                                                        System.out.println("나의 체력은 : " + heroin.hp);
                                                        //System.out.println("나의 지구력은: " + heroin.stamina);
                                                        heroin.experience += 5000;
                                                        heroin.level += 1;
                                                        EmptyBottle.emptybottle += 20;
                                                        Nunettine.nunettine += 20;
                                                        Question.question += 100;
                                                        codingMentor_event.item_Count =1;
                                                        lock.setOffice3(" ");
                                                        monsterAttack5.stop();
                                                        //effect30.close();


                                                        Story cm35 = new Story("""
                                                                "타락한" 코딩멘토 : 으..으...자바의 망령 이 비겁한 놈... 
                                                                                                                    
                                                                자바의 망령 : 후후.. 너도 이제 끝이다! 잘가라
                                                                                                                    
                                                                친구여! 마지막 일격을 날려주게..
                                                                
                                                                "타락한" 코딩멘토 : 이거나 받아라!!
                                                                
                                                                자바의 망령이 나의 몸을 대신해 맞았다.
                                                                
                                                                퍽! 쨍그랑.. 아니 이것은 안드로이드의 망령이 마셧던 포카리??!!
                                                                
                                                                자바의 망령 : 끄어어어!!!
                                                                
                                                                자바의 망령의 몸에 연기가 나고있다.
                                                                
                                                                괜찮아??


                                                                """);
                                                        cm35.start();
                                                        try {
                                                            cm35.join();
                                                        } catch (InterruptedException e) {
                                                            e.printStackTrace();
                                                        }


                                                        break;
                                                    }

                                                    if (heroin.hp <= 0) {

                                                        System.out.println("===========================================");
                                                        System.out.println("""
                                                                ####   #####   ##   ###### ##  ##\s
                                                                ## ##  ##      ##     ##   ##  ##\s
                                                                ##  ## ##     # ##    ##   ##  ##\s
                                                                ##  ## ####   # ##    ##   ######\s
                                                                ##  ## ##    ######   ##   ##  ##\s
                                                                ## ##  ##    #   ##   ##   ##  ##\s
                                                                ####   ##### #   ##   ##   ##  ##\s


                                                                """);
                                                        System.out.println("여기까진가??.....");
                                                        heroin.hp = 0;
                                                        System.out.println("당신은 죽었습니다. ==데스엔딩==");
                                                        System.exit(0);
                                                        break;

                                                    }
                                                }

                                            }else if (codingMentor_event.item_Count==1){
                                                System.out.println();
                                                System.out.println("코딩멘토는 사라지고 없다...");
                                                System.out.println();
                                                break;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("1.자바의 망령의 얘기를 듣는다.");
                                            System.out.println("2.무기를 교환한다.");
                                            System.out.println("3.다른행동을 한다.");

                                            num= scanner.nextInt();
                                            if(num==1) {
                                                if (codingMentor_event.item_Count == 0 && ghost_java_event.item_Count == 0) {
                                                    System.out.println();
                                                    System.out.println(" 지금은 얘기 할 시간이 아닌것 같군.");
                                                    System.out.println();

                                                } else if (codingMentor_event.item_Count == 1) {

                                                    Story cm36 = new Story("""
                                                            왜 그랬어?? 너는 몸이 없어서 그냥 피하면 될걸???
                                                                                                                    
                                                            자바의 망령 : 헉!....헉!... 시간이 얼마없어....
                                                            
                                                            나도 언제까지고 이정표 역할만 할순 없지 않나... 이러고 살 수는 없지않나......
                                                            
                                                            자네는 부디 여기서 탈출해서 뛰어난 개발자가 되어주게... 부...디..
                                                            
                                                            난 이 노트북에서 당신과 가끔 대화를 하겠네...
                                                            
                                                            (자바의 망령이 깃든 노트북을 획득하였습니다. + 공격력 10000) 
                                                            
                                                            +LV1                                                         
                                                            


                                                            """);
                                                    cm36.start();
                                                    try {
                                                        cm36.join();
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }


                                                    heroin.myitem[1] = finalNotebook.name;
                                                    heroin.FinalNotebook();
                                                    ghost_java_event.item_Count =1;
                                                    heroin.level += 1;
                                                    lock.setOffice3_1(" ");


                                                }
                                                break;
                                            }
                                            if (num ==2){
                                                System.out.println("1.파트장님의 강의가 수록된 노트북");
                                                System.out.println("2.자바의 망령이 깃든 노트북");
                                                System.out.println("3.바꾸지 않는다.");

                                                num = scanner.nextInt();

                                                if(num ==1){ // 나름 잘한 코딩방식 특히 무기 다시바꾸는 것.
                                                    if(heroin.myitem[1].equals(partNotebook.name)){
                                                        System.out.println("이미 가지고 있는 물품입니다.");
                                                    }else if (heroin.myitem[1].equals(finalNotebook.name) && partNotebook.item_Count ==1){
                                                        System.out.println("파트장님의 강의가 수록된 노트북으로 다시 무기를 바꿉니다.");
                                                        System.out.println();
                                                        System.out.println("이벤트 효과가 살아납니다.");
                                                        heroin.myitem[1] = partNotebook.name;
                                                        heroin.PartNotebook();
                                                        heroin.power += 50000;
                                                    }else{
                                                        System.out.println("2회차때 이용해보세요.");
                                                    }
                                                }
                                                if(num==2){
                                                    if (heroin.myitem[1].equals(partNotebook.name)){
                                                        System.out.println("자바의 망령이 깃든 노트북으로 무기를 바꿉니다.");
                                                        System.out.println();
                                                        System.out.println("이벤트효과가 사라집니다.");

                                                        heroin.myitem[1] = finalNotebook.name;
                                                        heroin.FinalNotebook();
                                                        heroin.power -= 50000;
                                                    }else if(heroin.myitem[1].equals(finalNotebook.name)){

                                                        System.out.println("이미 가지고 있는 물품입니다.");
                                                    }else{
                                                        System.out.println("해당되는 무기가 없습니다.");
                                                    }
                                                }

                                            }
                                            break;
                                        case 5:
                                            if(codingMentor_event.item_Count ==0 || ghost_java_event.item_Count ==0){
                                                System.out.println();
                                                System.out.println("Zzz...Zzz...Zzz 졸고 있는 모양이다.");


                                            }else if(codingMentor_event.item_Count ==1 && ghost_java_event.item_Count ==1){

                                                Boss boss = new Boss();
                                                boss.name = "뽀스";
                                                boss.hp = 475000;
                                                boss.level = 10;
                                                boss.power = 540;
                                                boss.defense = 100;
                                                boss.experience = 10000;

                                                Story cm37 = new Story("""
                                                        이봐 일어나 툭...툭....
                                            
                                            뽀스 : 누구세요?? 하~~암. 잠시 졸았네..
                                            
                                            너가 보스지??
                                            
                                            뽀스 : 네? 제이름을 어떻게 아시죠??
                                            
                                            너가 지금 출구 입구를 막고 있잖아?
                                            
                                            뽀스 : 네?? 아.. 이거 비밀번호가 안먹혀서 그리고 너무 잠이와서..
                                            
                                            그걸 말이라고 해?? 잔말 말고 비켜!!!
                                            
                                            뽀스 : 아니 왜....
                                            
                                            잔말 말고 붙자!!
                                                        


                                                        """);


                                                cm37.start();
                                                try {
                                                    cm37.join();
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }

                                                MonsterAttack6 monsterAttack6 = new MonsterAttack6();
                                                monsterAttack6.start();

                                                while (true) {


                                                    System.out.println("나의 체력은 : " + heroin.hp);
                                                    System.out.println("나의 지구력은 : " + heroin.stamina);
                                                    System.out.println();

                                                    boss.attacked(heroin.atk()); // 주인공 공격
                                                    //heroin.attacked(boss.atk()); // 몬스터 공격


                                                    if (boss.hp <= 0) {
                                                        //Music effect35 = new Music("pickup.mp3",true);
                                                      //  effect35.start();
                                                        boss.hp = 0;
                                                        System.out.println("뽀스가 울음을 터뜨리며 주저 앉습니다.!!!" + "\n");
                                                        System.out.println("+LV1 했습니다.");
                                                        System.out.println("");
                                                        System.out.println("뽀스의 체력은 :" + boss.hp);
                                                        System.out.println("나의 체력은 : " + heroin.hp);
                                                        System.out.println("나의 지구력은: " + heroin.stamina);

                                                        heroin.level += 1;
                                                        Heroin.password[2] = "098";
                                                        boss_event.item_Count += 1;
                                                        lock.setOffice3_2(" ");
                                                        monsterAttack6.stop();
                                                        //effect35.close();

                                                        Story cm38 = new Story("""
                                                                너가 보스가 아니라면 왜 이렇게 강한거지??
                                                                
                                                                뽀스 : 저 이거 지금 5번 넘게 돌았어요....
                                                                
                                                                ?!?!?
                                                                
                                                                뽀스 : 저도 팀......
                                                                
                                                                그렇게 형체가 서서히 사라졌다.
                                                                
                                                                그가 남기고 간 가방 속 비밀번호함께 텀블러에는 20기 김뽀스라고 적혀있다.
                                                                
                                                                아니!!! 내가 무슨 짓을?.............
                                                                
                                                                (비밀번호가 갱신되었습니다. 인벤토리에서 비밀번호를 확인하세요!!)

                                                                """);
                                                        cm38.start();
                                                        try {
                                                            cm38.join();
                                                        } catch (InterruptedException e) {
                                                            e.printStackTrace();
                                                        }


                                                        break;
                                                    }

                                                    if (heroin.hp <= 0) {

                                                        System.out.println("===========================================");
                                                        System.out.println("""
                                                                ####   #####   ##   ###### ##  ##\s
                                                                ## ##  ##      ##     ##   ##  ##\s
                                                                ##  ## ##     # ##    ##   ##  ##\s
                                                                ##  ## ####   # ##    ##   ######\s
                                                                ##  ## ##    ######   ##   ##  ##\s
                                                                ## ##  ##    #   ##   ##   ##  ##\s
                                                                ####   ##### #   ##   ##   ##  ##\s


                                                                """);
                                                        System.out.println("여기까진가??.....");
                                                        heroin.hp = 0;
                                                        System.out.println("당신은 죽었습니다. ==데스엔딩==");
                                                        System.exit(0);
                                                        break;
                                                    }

                                                    }

                                            }else if (boss_event.item_Count ==1){
                                                System.out.println();
                                                System.out.println("이미 엎질러진 물입니다. 더이상 물러설 곳이 없습니다. 앞으로 가십시오");
                                                System.out.println();
                                            }
                                            break;
                                        case 6:

                                            //intromusic3.close();

                                            //Music intromusic4 = new Music("ending.mp3",true);
                                           // intromusic4.start();

                                            System.out.println("1.비밀번호를 입력한다.");
                                            System.out.println("2.남아서(타락한)코딩멘토가 된다.");

                                            num = scanner.nextInt();

                                            if(num ==1 ){
                                                System.out.println("전체 비밀번호를 입력해주세요.");

                                                num = scanner.nextInt();

                                                Loading loading4 = new Loading("▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷▶▷");
                                                loading4.start();
                                                try {
                                                    loading4.join();
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }

                                                System.out.println();


                                                if(num ==135246098){

                                                    Story cm39 = new Story("""
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            
                                                            비밀번호를 입력하자 갑자기 손끝부터 모래처럼 변하면서 어딘가로 흩날리고 있다.
                                                            
                                                            으아아아아
                                                            
                                                            .
                                                            .
                                                            .
                                                            .
                                                            .
                                                            .
                                                            
                                                            그렇게 눈을 뜨니 6사무실이었고 주변을 돌아보니 이미 팀원들은 가방을 챙기고 있었고 
                                                            
                                                            수업은 끝나있었다.
                                                            
                                                            언제 수업시작 했지??
                                                            
                                                            그리고 노트북에는 
                                                            
                                                            "자바의 망령 : 다시 돌아온것을 축하해!" 라고 써있다.
                                                            


                                                            """);
                                                    cm39.start();
                                                    try {
                                                        cm39.join();
                                                    } catch (InterruptedException e) {
                                                        e.printStackTrace();
                                                    }

                                                    System.out.println("""                                                            
                                                           
                                                            
                                                            
                                                            
                                                            #####   ##   ###  ######    ###   ##   ###    ####\s
                                                            #       ##   #    #    ##    #    ##   #    ##   #\s
                                                            # #     # #  #    #      #   #    # #  #    #     \s
                                                            ###     #  # #    #      #   #    #  # #   #      \s
                                                            # #     #  # #    #      #   #    #  # #   #   ###\s
                                                            #       #   ##    #      #   #    #   ##   #    # \s
                                                            #       #   ##    #    ##    #    #   ##   ##   # \s
                                                            #####   ##   #    ######    ###   ##   #     ##### \s
                                                                

                                                            """);
                                                    System.exit(0);



                                                }else {
                                                    System.out.println("비밀번호를 다시 입력해주세요");
                                                    break;
                                                }


                                            }

                                            if (num ==2){

                                                Story cm40 = new Story("""
                                                        음.... 아니야 굳이 돌아갈 지금 돌아갈필요는 없잖아??
                                                            
                                                            보니까 나만 갇힌게 아닌걸??? 
                                                            
                                                            나만 탈출하는 것 보다 다른 사람들이랑 같이 탈출하는 것이 낫잖아??
                                                            
                                                            그리고 나도 여기서 계속 공부하고 그리고 공부다하면 탈출 하면 어떨까?
                                                            
                                                            .
                                                            .
                                                            .
                                                            .
                                                            .
                                                            .
                                                            
                                                            그렇게 3사무실의 켜진 노트북에 앉으며 비밀번호 대신 들어가
                                                            
                                                            코딩멘토의 아이디로 접속했다.
                                                            
                                                            띠리링~~~
                                                            
                                                            벌서 한명이 질문을 요청하고 있었다.
                                                            
                                                            (멘토님 제가 이상하게 들릴지 모르겠지만 지금 6사무실에 갇혀있습니다....)
                                                            
                                                            그렇다 시작은 이러했다.
                                                            
                                                            
                                                            자바의 망령 : 후후후 성공한건가???


                                                        """);
                                                cm40.start();
                                                try {
                                                    cm40.join();
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }

                                                System.out.println("""
                                                            
                                                                                                               
                                                            #####   ##   ###  ######    ###   ##   ###    ####\s
                                                            #       ##   #    #    ##    #    ##   #    ##   #\s
                                                            # #     # #  #    #      #   #    # #  #    #     \s
                                                            ###     #  # #    #      #   #    #  # #   #      \s
                                                            # #     #  # #    #      #   #    #  # #   #   ###\s
                                                            #       #   ##    #      #   #    #   ##   #    # \s
                                                            #       #   ##    #    ##    #    #   ##   ##   # \s
                                                            #####   ##   #    ######    ###   ##   #     ##### \s
                                                                

                                                            """);
                                                System.exit(0);


                                            }


                                    }



                                }
                        }
                    }
            }
        }


        //물채울때 가득찬병+1,빈병-1




































































        /*Variable variable = new Variable();
        variable.name = "중얼거리는 변수";
        variable.hp = 3000;
        variable.level = 1;
        variable.power = 8;
        variable.defense = 5;
        variable.experience = 10;

        System.out.println("방어구 :" + churining.name);



        System.out.println("엇?! 고등어다!!!" + "\n");
        System.out.println("잠깐 이거 고등어 맞아?");

        while (true) {


            System.out.println("나의 상태는 : " + heroin.hp);
            System.out.println();

            variable.attacked(heroin.atk()); // 주인공 공격
            heroin.attacked(variable.atk()); // 몬스터 공격


            if (variable.hp <= 0) {
                variable.hp = 0;
                System.out.println("고등어의 멘탈이 나갔다!!!" + "\n");
                System.out.println("고기10개와 경험치를 얻었습니다.");
                System.out.println("고등어의 상태는 :" + variable.hp);
                System.out.println("나의 상태는 : " + heroin.hp);
                //System.out.println("나의 지구력은: " + heroin.stamina);
                heroin.experience += 100;

                break;
            }

            if (heroin.hp <= 0) {

                System.out.println("===========================================");
                System.out.println("여기까진가??.....");
                heroin.hp = 0;
                System.out.println("당신은 죽었습니다. ==데스엔딩==");
                System.exit(0);
                break;

            }
        }*/


    }
}
