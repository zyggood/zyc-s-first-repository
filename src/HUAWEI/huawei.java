package HUAWEI;

import java.util.Scanner;

public class huawei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            //String ssss= sc.nextInt();
            String regex = "\\s+";
            String[] nameAndnum = str.split("[\\s+]");
            System.out.println(nameAndnum[1].toString());
            for (int i = 0; i < nameAndnum.length; i++) {
                System.out.println(nameAndnum[i]);
            }
        }
    }
}
