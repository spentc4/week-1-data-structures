
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number []= {2,4,16,5,23};
		int temp;
		boolean sorted = false;
		while(sorted == false) {
			sorted = true;
		}
		
		for(int i=0; i<number.length-1; i++) {
			if(number [i]>number[i+1]) {
				temp = number[i+1];
				number[i+1]=number[i];
				number[i]=temp;
				sorted = false;
			}
		}
		
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		

	}

}
