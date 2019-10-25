import java.util.Scanner;

public class AiMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        while(true){
            str = scanner.next();
            str = str.replace("你","我");
            str = str.replace("我","你");
            str = str.replace("吗","");
            str = str.replace("?","!");
            str = str.replace("？","!");
            System.out.println(str);
        }
    }
}
