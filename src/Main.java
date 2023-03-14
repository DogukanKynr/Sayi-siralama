import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("A sayısını giriniz : ");
        a = input.nextInt();
        System.out.print("B sayısını giriniz : ");
        b = input.nextInt();
        System.out.print("C sayısını giriniz : ");
        c = input.nextInt();

        if(a < b && a < c){
            if (b < c){
                System.out.print("a < b < c");
            }else if (c < b){
                System.out.print("a < c < b");
            }
        }else if(b < a && b < c){
            if(a < c){
                System.out.print("b < a < c");
            }else if(c < a){
                System.out.print("b < c < a");
            }
        }else if(c < a && c < b){
            if(a < b){
                System.out.print("c < a < b");
            }else if(b < a){
                System.out.print("c < b < a");
            }
        }

    }
}