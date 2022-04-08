package com;
import java.util.Vector;
public class TestEmployee {
	
		public static void main(String[]args) {
			Vector<Employee> v=addInput();
			display(v);
		}
		public static Vector<Employee> addInput(){
			Employee e1=new Employee(225,"shahid","Ranchi");
			Employee e2=new Employee(226,"Deepak","gurgoan");
			Employee e3=new Employee(227,"anil","Kurnool");
			Vector<Employee>v = new Vector<Employee>();
			v.add(e1);
			v.add(e2);
			v.add(e3);
			return v;



		}
		public static void display(Vector<Employee>v)
		{
			for(Employee e:v)
			{
				System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
			}
		}

	}

