package autoWiring;

public class MyService {
	MyDAO myDAO;

	public void setMyDAO(MyDAO myDAO) {
		this.myDAO = myDAO;
	}
	
	public void sayHi(String word){
		System.out.print("MyService:");
		myDAO.sayHi(word);
	}
	
}
