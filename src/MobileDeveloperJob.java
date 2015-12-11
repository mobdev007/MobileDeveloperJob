import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MobileDeveloperJob
{
    int vacancy;
    int applicants;
    List<String> requirements = new ArrayList<>();
    double salary;
    int jrPosition=7;
    int srPosition=5;

    MobileDeveloperJob(int vacancy, String[] requirements)
    {
        this.vacancy=vacancy;
        this.requirements = Arrays.asList(requirements);
    }
    public static void main(String[] args)
        {
            String[] requirements ={"Android","IOS","JAVA","PHP"};
            MobileDeveloperJob mobDevJob = new MobileDeveloperJob (12,requirements);
            System.out.println("vacancy before:" +mobDevJob.vacancy);
            System.out.println("hiring...");
            mobDevJob.hire(1,"JR");
            System.out.println("vacancy after:" +mobDevJob.vacancy);
            System.out.println("JR after:" +mobDevJob.jrPosition);
            System.out.println("SR after:" +mobDevJob.srPosition);
        }
        public void hire (int numOfHired,String positionType)
        {
            vacancy= vacancy - numOfHired;
            if (positionType.equals("JR"))
            {
                jrPosition = jrPosition - numOfHired;
            }
            else
            {
                srPosition = srPosition - numOfHired;
            }
        }
        public void apply(int numOfApplicants)
        {
                applicants = applicants + numOfApplicants;
        }
        public void addRequirements(String requirement)
        {
                    requirements.add(requirement);
        }
        public void deleteRequirements(String requirement)
        {
                    requirements.remove(requirement);
        }
        public  boolean checkRequirements(List<String>requirements)
        {
            if (this.requirements.contains(requirements))
            return true;
            else{
            return false;
        }
        }
        public void depositSalary(double monthlySalary)
        {
            salary = salary - monthlySalary;
        }
        public void giveBonus(double bonus)
        {
            salary = salary + bonus;
        }
}
