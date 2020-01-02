package Oops.InheritencePrograms;

public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		show(e);
		System.out.println("---------------------");
		Manager m=new Manager();
		show(m);
		System.out.println("---------------------");
		Director d= new Director();
		show(d);

	}
	static void show(Object a){
		if (a instanceof Employee){
			System.out.println("Employee");
		}
		 if (a instanceof Manager){
			System.out.println("Manager");
		}
		 if (a instanceof Director){
			System.out.println("Director");
		}
		else{
			System.out.println("Invalid");
		}
		
	}

}
class Employee extends Object{
	
}
class Manager extends Employee{
	
}
class Director extends Manager{
	
}