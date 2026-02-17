package MultiLevelInhertance;

import java.math.BigDecimal;

public class SeniorDeveloper extends Developer {
    public BigDecimal expyears;

    public SeniorDeveloper(String name, BigDecimal emp_id, String primarySkill, BigDecimal expyears) {
        super(name, emp_id, primarySkill);
        this.expyears = expyears;
    }


    public void displayExperience() {
        System.out.println("Experience as a Senior Developer : " +expyears);
    }
}
