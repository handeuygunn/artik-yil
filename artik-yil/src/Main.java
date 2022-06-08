import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil,a,b,c;


        Scanner input = new Scanner(System.in);

        System.out.println("lutfen yil giriniz:");
        yil = input.nextInt();
        a = yil%4;
        b = yil%100;
        c = yil%400;
        if ( b==0 && c==0){
            System.out.println(yil + "artik yildir");
        } else if ( a== 0 && b!=0){
            System.out.println(yil + "artik yildir");
        } else {
            System.out.println(yil + "artik yil degildir");
        }
    }
}
