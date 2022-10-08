package Heroin;

import Character.Character;
import ITem.*;

import java.util.Scanner;
import java.util.Vector;

public class Heroin extends Character {


   Vector item = new Vector();
   public String [] myitem = new String[10];
   public static String [] password = new String[10];
   public int experience;
   public int experience_req;
   //public int question;



   Weapon weapon = new Weapon();
   Nunettine nunettine = new Nunettine();
   Pot pot = new Pot();
   Churining churining = new Churining();
   BasicNotebook basicNotebook = new BasicNotebook();
   Pedding pedding = new Pedding();
   NewNotebook newNotebook = new NewNotebook();
   TeamNovaPedding teamNovaPedding = new TeamNovaPedding();
   TeamNovaNotebook teamNovaNotebook = new TeamNovaNotebook();
   FinalNotebook finalNotebook = new FinalNotebook();
   PartNotebook partNotebook = new PartNotebook();

    //Question question = new Question();


   //공격하는 메서드
   public int atk(){
      int sum = 0;

      Scanner scanner = new Scanner(System.in);
      System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
      System.out.println("        1. 일반 공격");
      System.out.println("        2. 테크트리 스킬");
      System.out.println("        3. 회복한다.");
      //System.out.println("        4. 도망가기  ");
      System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n");
      System.out.println("===========================================");

      System.out.print("어떤 공격을 할것인가? 번호를 선택해주세요."+"\n");

      int number = scanner.nextInt();

      if (number == 1) {
         sum += level * 40;
         sum += power * 50;
         sum += defense * 40;

         System.out.println("나의 데미지는 " + sum + " 입니다.");
         System.out.println("===========================================");

         return sum;

      }

      if (number == 2) {
         System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
         System.out.println("       1.원의 방정식!");
         System.out.println("       2.빛의 클래스");
         System.out.println("       3.정의의 메서드");
         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n");
         number = scanner.nextInt();

         if (number == 1) {
            sum += level * 55;
            sum += power * 60;
            sum += defense * 55;

            stamina -= 10;


            System.out.println("나의 데미지는 " + sum + " 입니다.");

            System.out.println("===========================================");

            return sum;
         } else if (number == 2) {
            sum += level * 55;
            sum += power * 60;
            sum += defense * 55;

            stamina -= 10;

            System.out.println("나의 데미지는 " + sum + " 입니다.");

            System.out.println("===========================================");

            return sum;
         } else if (number == 3) {
            sum += level * 60;
            sum += power * 60;
            sum += defense * 70;

            stamina -= 15;


            System.out.println("나의 데미지는 " + sum + " 입니다.");
            System.out.println("===========================================");

            return sum;

         }
      }
      if (number == 3) {
         System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
         System.out.println("    1.팀노바의 성수를 마신다.");
         System.out.println("    2.따끈한 누네띠네를 먹는다.");
         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n");
         number = scanner.nextInt();
         if(number == 1){
            if(pot.pot >= 1) {

               System.out.println("팀노바의 성수를 마십니다.");
               pot.pot -= 1;
               hp += pot.addstamina;
            }else{
               System.out.println("성수가 없습니다.");
            }

            return sum;

         }
         if (number == 2){
            if(nunettine.nunettine>=1) {

               System.out.println("따끈한 누네띠네를 먹습니다.");
               nunettine.nunettine -=1;
               hp += nunettine.addhp;

            }else{
               System.out.println("누네띠네가 없어요!!!");
            }

            return sum;
         }

         return sum;

         }

      return sum;
   }

   //방어력이 공격력에 따라 받는 데미지.
   public void attacked(int sum){
      if (defense >= sum) {
         hp = hp;
         //stamina -= stamina;
      } else {
         hp = hp + defense - sum;
      }


   }



   public void drink(){
      System.out.println("6사무실의 성수를 마십니다.");

         hp += pot.addstamina;
         pot.pot -= 1;

   }

   public void eat(){
      System.out.println("따끈한 누네띠네를 먹습니다.");

         hp += nunettine.addhp;
         nunettine.nunettine -= 1;


   }

   public void Churining(){
      defense += churining.add_defense;
   }

   public void BasicNotebook(){
      power += basicNotebook.add_power;

   }

   public int Pedding(){
      defense += pedding.add_defense;

      return defense;

   }

   public int NewNotebook(){
      power += newNotebook.add_power;

      return power;
   }

   public int TeamNovaPedding(){
      defense += teamNovaPedding.add_defense;

      return defense;

   }

   public int TeamNovaNotebook(){
      power += teamNovaNotebook.add_power;

      return power;
   }

   public int FinalNotebook(){

      power += finalNotebook.add_power;

      return power;

   }

   public int PartNotebook(){

      power += partNotebook.add_power;

      return power;
   }



   //도망가기
   /*public boolean run() {
      if (Math.random() <= 0.3){

         return true;
      }else{
         return false;
      }
   }*/


   public void print(){

      System.out.println("===========================================");
      System.out.println("스탯을 확인합니다.");
      System.out.println("나의 이름은 : " + name);
      System.out.println("나의 체력은 : " + hp);
      System.out.println("나의 지구력은 : " + stamina);
      System.out.println("나의 레벨은 : " + level);
      System.out.println("나의 개발력은 : " + power);
      System.out.println("나의 멘탈은 : " + defense);
      System.out.println("나의 경험치는 : " + experience);
      System.out.println("방어구 : " + myitem[0] );
      System.out.println("무기 : " + myitem[1]);
      System.out.println("===========================================");


   }








}
