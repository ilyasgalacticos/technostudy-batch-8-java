package week11.lesson4.example2;

public enum Zodiac {

    RAM("Aries", 1),
    BULL("Taurus", 2),
    TWINS("Gemini", 3),
    CRAB("Cancer", 4),
    LION("Leo", 5),
    MAIDEN("Virgo", 6),
    SCALES("Libra", 7),
    SCORPION("Scorpius", 8),
    ARCHER("Sagittarius", 9),
    CAPRICORN("Capricornus", 10),
    WATER_BEARER("Aquarius", 11),
    FISHES("Pisces", 12);

    private String latinCode;
    private int zodiacCode;

    Zodiac(String latinCode, int zodiacCode){
        this.latinCode = latinCode;
        this.zodiacCode = zodiacCode;
    }

    public String getLatinCode(){
        return this.latinCode;
    }

    public int getZodiacCode(){
        return this.zodiacCode;
    }

}
