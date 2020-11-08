
public class BubbleSort implements SortStrategy{

	@Override
	public void sort(int[] a) throws Exception {
		
		boolean flipped = true;
		
		for(int i=a.length; i-- >=0;) {
			flipped = false;
			for(int j = 0; j < i; j++) {
				if(a[j]> a[j+1]) {
					int temp = a[j];
					a[j] = a[j +1];
					a[j+1] = temp;
					flipped = true;
				}
			}
		}
		if(!flipped) {
			return;
		}
		
		
	}

}
