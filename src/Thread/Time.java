package Thread;

import Heroin.Heroin;
import Monster.Monster;

public class Time extends Thread{

    public int n=0;
    public boolean stop;



    public Time() {
        this.stop = false;
    }

    @Override
    public void run(){

        while(true){

            try{
                n++;
                time(n);

                sleep(8000);


                if(n==5) {
                    System.out.println("                                                 10분 경과.\n");



                }else if(n==10) {
                    System.out.println("                                                 15분 경과.\n");


                }else if(n==15) {
                    System.out.println("                                                 20분 경과.\n");

                }else if(n==20) {
                    System.out.println("                                                 25분 경과.\n");

                }else if(n==25) {
                    System.out.println("                                                 30분 경과.\n");


                }else if(n==30) {
                    System.out.println("                                                 35분 경과.\n");

                }else if(n==35){
                    System.out.println("                                                 40분 경과.\n");

                }else if(n==40){
                    System.out.println("                                                 45분 경과.\n");

                }else if(n==45) {
                    System.out.println("                                                 50분 경과.\n");

                }else if(n==50){
                    System.out.println("                                                 55분 경과.\n");


                }else if(n==55){
                    System.out.println("                                                 1시간 경과.(건물이 무너질것 같습니다.)\n");

                }else if(n==60){
                    System.out.println("                                                 1시간 10분경과.\n");

                } else if (n == 65) {
                    System.out.println("                                                 1시간 15분경과.\n");

                }else if(n==70){
                    System.out.println("                                                 1시간 25분 경과.\n");

                }else if(n==75){
                    System.out.println("                                                 건물이 무너지기 일보직전입니다.\n");


                }else if(n==80){
                    System.out.println("방이 무너져서 죽었습니다..");
                    System.out.println("""
                           
                           ####   #####   ##   ###### ##  ##\s
                           ## ##  ##      ##     ##   ##  ##\s
                           ##  ## ##     # ##    ##   ##  ##\s
                           ##  ## ####   # ##    ##   ######\s
                           ##  ## ##    ######   ##   ##  ##\s
                           ## ##  ##    #   ##   ##   ##  ##\s
                           ####   ##### #   ##   ##   ##  ##\s
                           
                           """);
                    System.exit(0);
                }
            }
            catch(Exception e){
                return;
            }
        }
    }

    public void threadStop(boolean stop){
        this.stop = stop;
    }

    public int time(int n) {
        // TODO Auto-generated method stub
        //System.out.println("");
        //System.out.println("                  "+n+"초 경과");
        return n;
    }


}
