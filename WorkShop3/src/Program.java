
import container.Department;
import model.Employee;


public class Program {
    public static void main(String[] args){
//        Employee nv = new Employee();
//        nv.input();
//        nv.display();

          Department deptHanhChinh = new Department();
          deptHanhChinh.input();
          deptHanhChinh.display();
          
          System.out.println("Lương cao nhất phòng hành chính là:" + deptHanhChinh.getMaxSalary() + " USD");
          System.out.println("Tổng lương của nhân viên " + deptHanhChinh.sumSalary() + " USD");
          
    }
}
