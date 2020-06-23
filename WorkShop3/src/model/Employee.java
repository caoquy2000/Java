package model;

import java.util.Scanner;

public class Employee {

    private String code;
    private String surName;
    private String firstName;
    private double salary;

    public Employee() {

    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    public double income() {
        return salary * 12;
    }

    public void input() {
        System.out.println("Nhập thông tin nhân viên");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập mã nhân viên: ");
            code = sc.nextLine();
            if (code.isEmpty()) {
                System.out.println("Vui Lòng nhập đầy đủ thông tin.");
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("Nhập họ: ");
            surName = sc.nextLine();
            if (surName.isEmpty()) {
                System.out.println("Vui lòng nhập đầy đủ thông tin.");
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("Nhập tên: ");
            firstName = sc.nextLine();
            if (firstName.isEmpty()) {
                System.out.println("Vui lòng nhập đầy đủ thông tin.");
            } else {
                break;
            }
        }
        while (true) {
            salary = getAnDouble("Nhập lương: ", "Error");
            if (salary > -1) {
                break;
            } else {
                System.err.println("Error");
            }
        }
    }

    public void display() {
        System.out.println("Thông tin nhân viên " + surName + " " + firstName);
        System.out.println("Mã nhân viên: " + code);
        System.out.println("Lương: " + salary + " USD");
        System.out.println("Tổng thu nhập: " + income() + " USD");
    }

    public double getAnDouble(String msgInput, String msgError) {
        Scanner sc = new Scanner(System.in);
        double n;
        while (true) {
            try {
                System.out.println(msgInput);
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(msgError);
            }
        }
    }
}
