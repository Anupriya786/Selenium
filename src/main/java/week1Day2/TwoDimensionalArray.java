package week1Day2;


public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentName= {"Raj","Ravi","Ram","Anu","Bhaskar"};
		int[] age= {23,21,22,24,26};
		char[][] grades= {{'A','B','C','D','B'},{'A','A','A','B','B'},{'A','A','D','D','B'},{'A','B','B','D','B'},{'A','B','C','A','B'},};
		for (int i=0;i<=4;i++)
		{
			System.out.println("Student Nmae is"+ studentName[i] + " whose Age is "+ age[i]+" years Old and Grades Obtained are" + grades[i][0]+","+grades[i][1]+","+grades[i][2]+","+grades[i][3]+","+grades[i][4]);
		}
	}

}
