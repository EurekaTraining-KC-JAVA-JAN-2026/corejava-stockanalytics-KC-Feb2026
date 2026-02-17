package MultiLevelInhertance;

import java.math.BigDecimal;

public class Developer extends Employee{

    public String primarySkill;

    public Developer(String name, BigDecimal emp_id, String primarySkill) {
        super(name, emp_id);
        this.primarySkill = primarySkill;
    }

    public void displaySkill() {
        System.out.println("Primary Skill : " +primarySkill);
    }
}
