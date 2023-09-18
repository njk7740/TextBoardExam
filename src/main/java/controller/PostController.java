package controller;

import model.Post;
import model.Posts;
import view.PostIO;

import java.util.HashMap;

public class PostController {
    Posts posts = new Posts();
    PostIO postIO = new PostIO();

    public Post get(int num){
        return posts.get(num);
    }
    public void add() {
        HashMap<String, String> map = new HashMap<>();
        postIO.setPost(map, "");
        posts.add(map.get("제목"), map.get("내용"));
        System.out.println("게시물이 추가되었습니다.");
    }

    public void list() {
        postIO.showPosts(posts.getPosts());
    }

    public void update() {
        int num = postIO.getPostNum("수정");
        if(!posts.match(num)) postIO.printNoPost();
        else {
            HashMap<String, String> map = new HashMap<>();
            postIO.setPost(map, "수정하실 ");
            posts.update(posts.getIdx(num), map.get("제목"), map.get("내용"));
            System.out.println(num + "번 게시물이 수정되었습니다.");
        }
    }

    public void delete() {
        int num = postIO.getPostNum("삭제");
        if(!posts.match(num)) postIO.printNoPost();
        else {
            posts.delete(posts.getIdx(num));
            System.out.println(num + "번 게시물이 삭제되었습니다.");
        }
    }

    public void detail() {
        int num = postIO.getPostNum("상세보기");
        if(!posts.match(num)) postIO.printNoPost();
        else postIO.showPost(posts.get(posts.getIdx(num)));
    }
}
