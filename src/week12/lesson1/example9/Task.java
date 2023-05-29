package week12.lesson1.example9;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task {

    private String name;
    private String issuer;
    private LocalDateTime deadline;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public String getInfo(){

        LocalDateTime currentTime = LocalDateTime.now();
        long seconds = ChronoUnit.SECONDS.between(currentTime, this.deadline);

        if(seconds > 0){
            return "You have " + seconds + " seconds to complete this task";
        }else{
            return "Your task is failed!";
        }

    }
}
