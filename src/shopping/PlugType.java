package shopping;

public enum PlugType {

    TYPE_A("Type A Plug In"),
    TYPE_B("Type B Plug In"),
    TYPE_C("Type C Plug In"),
    TYPE_D("Type D Plug In"),
    TYPE_E("Type E Plug In"),
    TYPE_F("Type F Plug In");

    PlugType(String type){
        this.type = type;
    }


    private String type;

    public String getType() {
        return type;
    }
}
