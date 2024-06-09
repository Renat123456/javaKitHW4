public class Employee {
    private Integer personnelNumber;
    private Integer phone;
    private String name;
    private Integer experience;

    public Employee(Integer personnelNumber, Integer phone, String name, Integer experience) {
        this.personnelNumber = personnelNumber;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }

    public Integer getPersonnelNumber() {
        return personnelNumber;
    }

    public Integer getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public Integer getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personnelNumber=" + personnelNumber +
                ", phone=" + phone +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
