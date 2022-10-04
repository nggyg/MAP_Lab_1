import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,i=0,m=0;
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