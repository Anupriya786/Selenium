package week1Day2;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				String[] studentName= {"Raj","Ravi","Ram","Anu","Bhaskar"};
				int[] age= {23,21,22,24,26};
				//char[][] grades= {{'A','B','C','D','B'},{'A','A','A','B','B'},{'A','A','D','D','B'},{'A','B','B','D','B'},{'A','B','C','A','B'},};
				for(String name: studentName)
				{
					System.out.println("Name Of The Student is  \n"+ name);
					int count= name.length();
					System.out.println("Number Of Characters in Name is \n "+count);
				}
				for(int agelist: age)
				{
					System.out.println( "Age Of The Student is \n" + agelist);
				}
				
			

	


	}

}
