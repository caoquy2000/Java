package container;

import java.util.Scanner;
import model.Employee;

public class Department {

    private String deptName;
    private int numberOfEmp;
    private Employee[] listEmp;

    public Department() {

    }

    public String getDeptName() {
        return deptName;
    }

    public int getNumberOfEmp() {
        return numberOfEmp;
    }

    public Employee[] getListEmp() {
        return listEmp;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setNumberOfEmp(int numberOfEmp) {
        this.numberOfEmp = numberOfEmp;
    }

    public void setListEmp(Employee[] listEmp) {
        this.listEmp = listEmp;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập phòng ban: ");
            deptName = sc.nextLine();
            if (deptName.isEmpty()) {
                System.out.println("Vui lòng nhập đầy đủ thông tin.");
            } else {
                break;
            }
        }
        while (true) {
            numberOfEmp = getAnInt("Nhập số lượng nhân viên: ", "Error");
            if (numberOfEmp > 0) {
                break;
            }
        }

        listEmp = new Employee[numberOfEmp];

        for (int i = 0; i < numberOfEmp; i++) {
            Employee emp = new Employee();
            emp.input();
            listEmp[i] = emp;
        }
    }

    public void display() {
        System.out.println("Thông tin phòng ban " + deptName);
        for (Employee emp : listEmp) {
            emp.display();
        }
    }

    public double getMaxSalary() {
        double max = 0;
        for (Employee emp : listEmp) {
            if (max < emp.getSalary()) {
                max = emp.getSalary();
            }
        }
        return max;
    }

    public double sumSalary() {
        double sum = 0;
        for (Employee emp : listEmp) {
            sum = sum + emp.getSalary();
        }
        return sum;
    }
    

    public int getAnInt(String msgInput, String msgError) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            try {
                System.out.println(msgInput);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(msgError);
            }
        }
    }
}
