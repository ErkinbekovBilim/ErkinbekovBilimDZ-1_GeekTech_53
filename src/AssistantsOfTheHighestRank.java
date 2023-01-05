public class AssistantsOfTheHighestRank extends HighestRankSamurai{
    private int damage;
    private String companion;
    private Mission mission;

    public AssistantsOfTheHighestRank(int age, int experience, String name,
                                      Rank rank, int damage, String companion, Mission mission) {
        super(age, experience, name, rank);
        this.damage = damage;
        this.companion = companion;
        this.mission = mission;

    }


    public int getDamage() {
        return damage;
    }

    public String getCompanion() {
        return companion;
    }

    public Mission getMission() {
        return mission;
    }
    final public void MissionReport() {
        System.out.println("Mission completed");
    }


    public String getInfo() {
        return "\nAge: " + getAge() +
                "\nExperience: " + getExperience() +
                "\nName: " + getName() +
                "\nRank: " + getRank() +
                "\nDamage: " + damage +
                "\nCompanion: " + companion  +
                "\nMission : " + mission.getTask() +
                "\nMission number: " + mission.getNumber();
    }
}
