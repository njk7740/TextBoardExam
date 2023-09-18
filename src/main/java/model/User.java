package model;

public class User {
    private String ID;
    private String PW;
    private String nickname;

    public User(String ID, String PW, String nickname) {
        this.ID = ID;
        this.PW = PW;
        this.nickname = nickname;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPW() {
        return PW;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
