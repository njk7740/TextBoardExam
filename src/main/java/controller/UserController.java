package controller;

import model.Users;
import view.UserIO;

import java.util.HashMap;

public class UserController {
    Users users = new Users();
    UserIO userIO = new UserIO();

    public void signup() {
        HashMap<String, String> map = new HashMap<>();
        map.put("아이디", userIO.getId());
        if(users.matchID(map.get("아이디"))) System.out.println("이미 존재하는 아이디입니다.");
        else {
            userIO.getUserinfo(map);
            users.add(map.get("아이디"), map.get("비밀번호"), map.get("닉네임"));
            System.out.println("회원가입이 완료되었습니다.");
        }
    }
}
