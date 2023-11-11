
public class SevenNumber {

    public static void main(String[] args) {
        //iの値が0から21より小さい間、処理を繰り返す
        for(int i = 0; i <= 100; i++) {
            //iの値が2で割り切れるとき
            if(i % 7 == 0 || i % 10 == 7 || i / 10 ==7) {
                //iの値を表示する
                System.out.println("clap!");
            }else {
                    System.out.println("i =" + i);
            }
        }
    }
}
