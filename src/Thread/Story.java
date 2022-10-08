package Thread;

public class Story extends Thread {

    String str;

    public Story(String str){
        this.str =str;
    }

    public void run(){
        char[] array_str = new char[str.length()]; // 스트링을 담을 배열

        for(int i=0;i<array_str.length;i++) {
            //array_str[i] = (str.charAt(i));//스트링을 한글자씩 끊어 배열에 저장
            System.out.print(str.charAt(i)); //출력


            try {
                Thread.sleep( 15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
