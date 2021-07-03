package com.company;

public class PayRoleExecutor {
    public static void main(String []args){
   Employee emp1=new Employee();
   emp1.setEid(100);
   emp1.setFname("Sherene");
   emp1.setLname("Surya");
   emp1.setAge(27);

   Employee emp2=new Employee();
   emp2.setEid(101);
   emp2.setFname("Sufiya");
   emp2.setLname("Niraimathi");
   emp2.setAge(32);

   Employee emp3=new Employee();
   emp3.setEid(103);
   emp3.setFname("Arsath");
   emp3.setLname("Roshan");
   emp3.setAge(65);

   Engineer eng1 =new Engineer();
   eng1.setEid(104);
   eng1.setFname("Wadhudh");
   eng1.setLname("Kavi");
   eng1.setAge(54);

   Director dir1= new Director();
   dir1.setEid(105);
   dir1.setFname("Yafiya");
   dir1.setLname("Narumugai");
   dir1.setAge(27);

   Manager mgr1 =new Manager();
   mgr1.setEid(106);
   mgr1.setLname("Fadhila");
   mgr1.setLname("Ilamathi");
   mgr1.setAge(42);

       int salary1= PayRoleProcessor.getSalary(emp1);
       int salary2= PayRoleProcessor.getSalary(emp2);
       int salary3= PayRoleProcessor.getSalary(emp3);
       int salary4= PayRoleProcessor.getSalary(eng1);
       int salary5= PayRoleProcessor.getSalary(dir1);
       int salary6= PayRoleProcessor.getSalary(mgr1);

       System.out.println(salary1);
       System.out.println(salary2);
       System.out.println(salary3);
       System.out.println(salary4);
       System.out.println(salary5);
       System.out.println(salary6);





}
}
