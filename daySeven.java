package Calculator;
import java.util.stream.Collectors;
import java.util.*;

class Employee{
	public int id;
	public String name;
	public double salary;
	Employee(int id,String nm,double sl){
		this.id = id;
		this.name = nm;
		this.salary = sl;
	}
	
}

class Product{
	List<String> al = new ArrayList<String>();
	Product(String ...a){
		for(String x:a){
			al.add(x);
		}
	}
}

public class daySeven{
	public static void main(String[] args) {
		//question 1;
		List<String> sList = Arrays.asList("Shubham","KUmar","Rahul","Poudyal","Sumer","kumar");
		List<String> fList= new ArrayList<String>();

		fList=sList.stream().filter(i->(i.length()>5 && i.length()<8)).collect(Collectors.toList());
		System.out.println(fList);

		//question 2;
		Employee e1 = new Employee(0, "shubham", 7857);
		Employee e2 = new Employee(1,"Gautam",15000);
		List<Employee> eList = Arrays.asList(e1,e2);
		eList.stream().map(i->(i.salary = i.salary + (i.salary*0.10))).forEach(System.out::println);

		//question 3;
		System.out.println("Answer of question 3 :--- ");
		Product p1 = new Product("laptop,acer laptop,samsung".split(","));
		Product p2 = new Product("phone,acer,samsung".split(","));
		Product p3 = new Product("camera,acer,samsung".split(","));
		List<Product> prodList = Arrays.asList(p1,p2,p3);
		prodList.stream().flatMap(i->i.al.stream()).forEach(System.out::println);
	}
}

