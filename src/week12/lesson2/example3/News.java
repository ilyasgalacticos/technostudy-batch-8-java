package week12.lesson2.example3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class News {

    private String title;
    private String content;
    private Date addedTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }

    public String toString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMMM dd, hh:mm:ss a");
        return this.title + " "
                + this.content
                + " added at "
                + dateFormat.format(this.addedTime);
    }

}
