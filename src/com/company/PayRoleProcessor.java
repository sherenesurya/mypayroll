package com.company;

public class PayRoleProcessor {

    public static int getSalary(Employee e) {

        if(e.getAge() < 25)
            return 10000 + e.getSpecialpay();
        else if (e.getAge()<50)
            return 15000 +e.getSpecialpay();
        else
            return 25000 + e.getSpecialpay();

        /*       if(Employee.getAge(a)<25)
          return 10000;

        else if (Employee.getAge(a)<50)
          return 15000;

        else
          return 25000;*/

    }
}