package view;

import java.util.Scanner;

public class BoardIO {
    Scanner sc = new Scanner(System.in);

    public String getString() {
        return sc.nextLine();
    }

    public int getInt() {
        return Integer.parseInt(sc.nextLine());
    }

    public String getFunc(){
        System.out.print("명령어를 입력해주세요 : ");
        return getString();
    }
}
