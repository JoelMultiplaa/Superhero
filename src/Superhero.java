public class Superhero {
    private String secretIdentity;
    private String realName;
    private String superPower;
    private int yearCreated;
    private String isHuman;
    private int strength;

    //Constructør - et objekt består af attributer
    public Superhero(String secretIdentity, String realName,
                     String superPower, int yearCreated, String isHuman, int strength){
        this.secretIdentity = secretIdentity;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;

    }
}
