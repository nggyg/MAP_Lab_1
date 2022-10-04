import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("AM schimbat ceva");
        Scanner scan=new Scanner(System.in);
        int i=0,m=0;
        String str;
        while(true){
            str=scan.nextLine();
            if(str.equalsIgnoreCase(""))
                break;
            i++;
            m+=Integer.parseInt(str);
        }
        System.out.println(m/i);
    }
}