final public class GuardsOfTheHighestRank extends AssistantsOfTheHighestRank{
    private int health;
    private double height;

    public GuardsOfTheHighestRank(int age, int experience, String name,
                                  Rank rank, int damage, String companion, Mission mission, int health, double height) {
        super(age, experience, name, rank, damage, companion, mission);
        this.health = health;
        this.height = height;
    }

    public int getHealth() {
        return health;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getInfo() {
        return  "\nAge: " + getAge() +
                "\nhealth: " + health +
                "\nheight: " + height +
                "\nExperience: " + getExperience() +
                "\nName: " + getName() +
                "\nRank: " + getRank() +
                "\nDamage: " + getDamage() +
                "\nCompanion: " + getCompanion()  +
                "\nMission : " + getMission().getTask()+
                "\nMission number: " + getMission().getNumber();
    }
}
