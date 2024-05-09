package ExcetionHandleAnnotion.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ExcetionHandleAnnotion.ExctionHandling.EmplyeeNotFoundException;
import ExcetionHandleAnnotion.dto.Employee;
@Service
public class EmpService {
		private static  List<Employee> list = new ArrayList<Employee>();
		static {
			list.add(new Employee(1, "Arun", 34.0));
			list.add(new Employee(2, "Arun", 34.0));
			list.add(new Employee(3, "Arun", 34.0));
			list.add(new Employee(4, "Arun", 34.0));
			list.add(new Employee(5, "Arun", 34.0));
			list.add(new Employee(6, "Arun", 34.0));
		}
		public Employee getEmployee(int id) {
			Optional<Employee> emp = list.stream().filter(e->e.getId()==id).findFirst();
			if(!emp.isPresent()) {
				throw new EmplyeeNotFoundException("Emplyee not found on id ->"+id);
			}
			return emp.get();
		}
}
