package MultiLevelInhertance;

import java.math.BigDecimal;

public class CompanyPlayGround {
    public static void main(String[] args){
        SeniorDeveloper seniordeveloper1 = new SeniorDeveloper("Amy", new BigDecimal(23456432),"Java",new BigDecimal(10));

        seniordeveloper1.displayEmployeeDetails();
        seniordeveloper1.displaySkill();
        seniordeveloper1.displayExperience();
    }
}
