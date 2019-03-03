package service.filter;
import com.alibaba.fastjson.JSON;
import entity.Employee;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PredicateTests1 {

    public static void main(String[] args) {
        Employee employee1 = new Employee("张三", 20, 2000d, "销售部", 1);
        Employee employee2 = new Employee("李四", 25, 2050d, "业务部", 1);
        Employee employee3 = new Employee("王五", 30, 3000d, "综合部", 1);
        Employee employee4 = new Employee("赵六", 31, 6000d, "经理部", 2);
        Employee employee5 = new Employee("王三", 40, 8000d, "技术部", 2);

        List<Employee> list = Arrays.asList(
            employee1,
            employee2,
            employee3,
            employee4,
            employee5
        );

        Set<Employee> employees = new HashSet<>();
        // 需求1：取出年龄大于30的员工
        for (Employee employee : list) {
			if (employee.getAge() > 30) {
				employees.add(employee);
			}
		}
		System.out.println("年龄大于 30 的员工: ");
        System.out.println(JSON.toJSONString(employees));

        Set<Employee> employees2 = new HashSet<>();
        // 需求2：取出薪水小于等于3000的员工
        for (Employee employee : list) {
            if (employee.getSalary() <= 3000) {
                employees2.add(employee);
            }
        }
        System.out.println("薪水小于等于 3000 的员工: ");
        System.out.println(JSON.toJSONString(employees2));
        
        Set<Employee> employees3 = new HashSet<>();
        // 需求3：男员工
        for (Employee employee : list) {
        	if (employee.getGender() == 1) {
        		employees3.add(employee);
        	}
        }
        System.out.println("男员工: ");
        System.out.println(JSON.toJSONString(employees3));
    }
}
