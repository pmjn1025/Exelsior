//package Thread;
//
//
//import Main.GameMain;
//import javazoom.jl.player.Player;
//
//import java.io.BufferedInputStream;
//import java.io.File;
//import java.io.FileInputStream;
//
//public class Music extends Thread {
//
//    // NULL 값뜨면 분들은 Package 이름이 default로 되어있는지 확인후
//    // default이시면 새로운 package생성하고 이름지정한 후
//    // 기존에 작성했던 파일들을 새로 생성한 package로 옮기신 후에 다시 재생해보기..
//    //근데 메인문에서 실행하면 굳이 안옮기고 패키지 이름만 메인으로(영어로!!!)
//    //바꾸면 패키지는 디폴트로 바뀌고 실행됨
//    //+a --> 음악 넣을때마다 리빌드해주기!
//
//
//    private Player player;
//    private boolean isLoop;
//    private File file;
//    private FileInputStream fis;
//    private BufferedInputStream bis;
//
//    public Music(String name, boolean isLoop){
//        try {
//            this.isLoop = isLoop;
//            file = new File(GameMain.class.getResource("../music/" + name ).toURI());
//            fis = new FileInputStream(file);
//            bis = new BufferedInputStream(fis);
//            player = new Player(bis);
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public int getTime() {
//        if(player == null)
//            return 0;
//        return  player.getPosition();
//    }
//    public void close() {
//        isLoop = false;
//        player.close();
//        this.interrupt();
//    }
//
//    @Override
//    public void run(){
//        try {
//            do {
//
//                fis = new FileInputStream(file);
//                bis = new BufferedInputStream(fis);
//                player = new Player(bis);
//                player.play();
//            }while (isLoop);
//        }catch(Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
//
//}
