package model;
import java.util.ArrayList;

public class Posts {
    ArrayList<Post> posts = new ArrayList<>();

    public Post get(int num) {
        return posts.get(num);
    }

    public void add(String title, String content) {
        Post post = new Post(title, content);
        if(posts.isEmpty()) post.setNumber(1);
        else post.setNumber(posts.get(posts.size() - 1).getNumber() + 1);
        posts.add(post);
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public boolean match(int num) {
        for(Post post : posts)
            if(post.getNumber() == num)
                return true;
        return false;
    }

    public int getIdx(int num) {
        for(int i = 0; i < posts.size(); i++)
            if (posts.get(i).getNumber() == num)
                return i;
        return -1;
    }

    public void update(int idx, String title, String content) {
        posts.get(idx).setTitle(title);
        posts.get(idx).setContent(content);
    }

    public void delete(int idx) {
        posts.remove(idx);
    }
}
