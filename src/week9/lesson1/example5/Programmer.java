package week9.lesson1.example5;

public class Programmer extends User {

    private String nick;
    private String github;
    private String level;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    // 1 hour to develop this method
    @Override
    public String getUserData() {
        return getNick() + " is a " + getLevel() + " developer with github link : " + getGithub();
    }
}
