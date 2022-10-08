package Thread;

public class Loading extends Thread {

    String str;
    public Loading(String str){
        this.str = str;
    }
    public void run(){
        char[] array_str = new char[str.length()];
        for(int i =0; i<array_str.length;i++){
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


}
