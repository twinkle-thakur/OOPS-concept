package KG_coding_Stream;

import java.util.List;

public class Challenge114 {

	public static void main(String[] args) {
		List<Challenge114Employee> employee=List.of(
				new Challenge114Employee(7000,"khushi"),
				new Challenge114Employee(8000,"om"),
				new Challenge114Employee(9000,"chirag"),
				new Challenge114Employee(2000,"twinkle")
				);
		employee.stream().sorted((e1,e2)->e1.getSalary()-e2.getSalary()).forEach(e->System.out.println(e.getName()+" "+e.getSalary()));
	}

}
