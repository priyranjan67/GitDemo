package GitDemo.GitDemo;

public class ArraysConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] emp = new String[3];
		emp[0]="rahul";
		emp[1]= "jain";
		emp[2]= "kavi";
		
		for (int i =0; i<emp.length; i++) {
			System.out.println(emp[i]);
			
			if (emp[i].equals("jain")){
				System.out.println("Jain salary is :" + 10000);
				break;
				
			}
		}
		
	}

}
