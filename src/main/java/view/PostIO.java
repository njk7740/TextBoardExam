package view;

import model.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PostIO {
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

    public HashMap<String, String> setPost(HashMap<String, String> map, String str) {
        System.out.print(str + "제목을 입력해주세요 : ");
        map.put("제목", getString());
        System.out.print(str + "내용을 입력해주세요 : ");
        map.put("내용", getString());
        return map;
    }

    public void printNoPost(){
        System.out.println("없는 게시물 번호입니다.");
    }

    public void showPosts(ArrayList<Post> posts) {
        if(posts.isEmpty()) System.out.println("게시물이 없습니다.");
        else {
            for (Post post : posts) {
                System.out.println("====================");
                System.out.println("게시물 번호 : " + post.getNumber());
                System.out.println("제목 : " + post.getTitle());
                System.out.println("====================");
            }
        }
    }

    public void showPost(Post post) {
        System.out.println("====================");
        System.out.println("게시물 번호 : " + post.getNumber());
        System.out.println("제목 : " + post.getTitle());
        System.out.println("내용 : " + post.getContent());
        System.out.println("====================");
    }

    public int getPostNum(String str) {
        System.out.print(str + "하실 게시물 번호 : ");
        return getInt();
    }

}
