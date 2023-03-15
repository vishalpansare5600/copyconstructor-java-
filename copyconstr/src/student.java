
public class student 
{
	
	int id;
	String name;
	student(int i,String n)
	{
		id=i;
		name=n;
	}
	student (student s)
	{
		id=s.id;
		name=s.name;		
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args)
	{
		student s=new student(11,"vishal");
		student s1=new student(s);
		s.display();
		s1.display();

	}

}
