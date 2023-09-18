package view;

import java.util.HashMap;
import java.util.Scanner;

public class UserIO {
    Scanner sc = new Scanner(System.in);
    public String getString() {
        return sc.nextLine();
    }

    public int getInt() {
        int num = 0;
        while(true) {
            try {
                num = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("숫자만 입력해주세요 : ");
                continue;
            }
            return num;
        }
    }

    public String getId() {
        System.out.print("사용하실 ID를 입력해주세요 : ");
        return getString();
    }

    public void getUserinfo(HashMap<String, String> map) {
        System.out.print("사용하실 비밀번호를 입력해주세요 : ");
        map.put("비밀번호", getString());
        System.out.print("사용하실 닉네임을 입력해주세요 : ");
        map.put("닉네임", getString());
    }
}
