package com.sam.Problems.Encapsulation;

import static java.lang.String.format;

public class ProblemOne {

    private int employee_id;
    private String employee_name;
    private  String getEmployee_salary;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getGetEmployee_salary() {
        return format(getEmployee_salary) ;
    }
}
