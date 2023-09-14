package information;

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

    //Get
    public String getSecretIdentity(){
        return secretIdentity;
    }
    public String getRealName(){
        return realName;
    }
    public String getSuperPower(){
        return superPower;
    }
    public int getYearCreated(){
        return yearCreated;
    }
    public int getStrength(){
        return strength;
    }
    //Set


    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public void setRealName(String realName){
        this.realName = realName;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }
}
