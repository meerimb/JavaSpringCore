package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee=context.getBean("employeeId",Employee.class);
        System.out.println(employee);
        employee.sing();
        System.out.println(employee.getCar());
        employee.drive();

    }
}
