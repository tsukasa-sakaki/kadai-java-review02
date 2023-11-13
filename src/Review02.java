
public class Review02 {

    public static void main(String[] args) {
        //iの値が1から100より小さい間、処理を繰り返す
        for(int i = 1; i <= 100; i++) {
            //iの値が3かつ5で割り切れるとき
            if(i % 3 == 0 && i % 5 == 0 ) {
               System.out.println("FizzBuzz"); //FizzBuzzを表示
            //iの値が3で割り切れるとき
           }else if(i % 3 == 0 ){
               System.out.println("Fizz"); //Fizzを表示
            //iの値が5で割り切れるとき
           }else if(i % 5 == 0 ){
               System.out.println("Buzz"); //Buzzを表示
            //それ以外の数
           }else{
               System.out.println( + i );
           }
        }
    }
}
