package week11.lesson4.example4;

public enum School {

    MON("Monday", 1){
        public void tasks(){
            System.out.println("Math Lesson");
            System.out.println("Physics Lesson");
            System.out.println("History Lesson");
            System.out.println("Lunch");
            System.out.println("Literature");
            System.out.println("Music");
        }
    },
    TUE("Tuesday", 2){

        @Override
        public void tasks(){
            System.out.println("Chemistry Lesson");
            System.out.println("Physical Education");
            System.out.println("English Lesson");
            System.out.println("Lunch");
            System.out.println("German Lesson");
            System.out.println("Biology Lesson");
        }
    },
    WED("Wednesday", 3){

        @Override
        public void tasks(){
            System.out.println("Math Lesson");
            System.out.println("Programming Lesson");
            System.out.println("Java Lesson");
            System.out.println("Lunch");
            System.out.println("Calculus Lesson");
            System.out.println("Art Lesson");
        }
    },
    THU("Thursday", 4){

        @Override
        public void tasks(){
            System.out.println("Art Lesson");
            System.out.println("Music Lesson");
            System.out.println("Physical Education");
            System.out.println("Lunch");
            System.out.println("History Lesson");
            System.out.println("Law Lesson");
        }
    },
    FRI("Friday", 5){

        @Override
        public void tasks(){
            System.out.println("Programming Lesson");
            System.out.println("Java Lesson");
            System.out.println("Geography Lesson");
            System.out.println("Lunch");
        }
    },
    SAT("Saturday", 6){
        @Override
        public void tasks(){
            System.out.println("Do Home Works");
            System.out.println("Do Home Works");
            System.out.println("Do Home Works");
            System.out.println("Lunch");
            System.out.println("Play Football");
            System.out.println("Play Play Station");
        }
    },
    SUN("Sunday", 7){

        @Override
        public void tasks(){
            System.out.println("Go to Picnic");
            System.out.println("Go to Picnic");
            System.out.println("Go to Picnic");
            System.out.println("Lunch");
            System.out.println("Sleep");
            System.out.println("Sleep");
        }
    };

    private int dayNum;
    private String dayText;

    School(String dayText, int dayNum){
        this.dayNum = dayNum;
        this.dayText = dayText;
    }

    public int getDayNum() {
        return dayNum;
    }

    public void setDayNum(int dayNum) {
        this.dayNum = dayNum;
    }

    public String getDayText() {
        return dayText;
    }

    public void setDayText(String dayText) {
        this.dayText = dayText;
    }

    public abstract void tasks();

}
