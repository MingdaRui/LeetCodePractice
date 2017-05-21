package mingda.leetCode;

public class Solution {

	int[] test1 = new int[] { 1, 1, 1, 2, 2, 3 };
	int[] test2 = new int[] { 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 5, 6, 6,6,7 };
	
	public int removeDuplicates( int[] nums ) {
		
		int elementA, elementB, elementC = 0;
		int indexOfA;
		int indexOfNextShouldBeDiff;
		
		if( nums.length <= 2 ) {
			return nums.length;
		}
		
		indexOfA = 0;
		elementA = nums[ 0 ];
		elementB = nums[ 1 ];
		indexOfNextShouldBeDiff = 2;
		
		for( int i = 0; i < nums.length - 2; i++ ) {

			System.out.println("\n\nfor loop " + i);
			System.out.println("elementA["+indexOfA+"] -> " + elementA + "  elementB["+(indexOfA+1)+"] -> " + elementB);
			
			if( elementA == elementB ) {
				
				System.out.println("elementA == elementB");
				
				indexOfNextShouldBeDiff = indexOfA + 2;
				
				elementC = nums[ i + 2 ];
				System.out.println("elementC["+(i+2)+"] -> "+elementC);
				
				if( elementC != elementB && i < nums.length - 3 ) {
					
					
					nums[ indexOfNextShouldBeDiff ] = nums[ i + 2 ];
					nums[ indexOfNextShouldBeDiff + 1 ] = nums[ i + 3 ];
					elementA = nums[ indexOfNextShouldBeDiff ];
					elementB = nums[ indexOfNextShouldBeDiff + 1 ];
					indexOfA = indexOfNextShouldBeDiff;
					i++; System.out.println("i= "+i);
					
				} else if( elementC != elementB && i == nums.length - 3 ) {
					System.out.println("elementC != elementB && i == nums.length - 3");
					nums[ indexOfNextShouldBeDiff ] = nums[ i + 2 ]; //System.out.println("1. "+nums[i+2]+"\n2. ("+indexOfNextShouldBeDiff+")"+nums[indexOfNextShouldBeDiff]);
//					break;
					indexOfNextShouldBeDiff = indexOfA + 2;
					return indexOfNextShouldBeDiff + 1;
					
				}
				
			} else if( elementA != elementB ) {
				System.out.println("elementA != elementB");
				System.out.println("elementC["+(i+2)+"] -> " + nums[i+2]);
//				elementA = nums[ indexOfA + 1 ];
//				elementB = nums[ indexOfA + 2 ];
//				indexOfA = i + 1;
				nums[ indexOfA + 2 ] = nums[ i + 2 ];
				elementA = nums[ indexOfA + 1 ];
				elementB = nums[ i + 2 ];
				indexOfA++;
//				indexOfA = i + 2;
//				System.out.println( "elementA[" + ( indexOfA ) + "] -> " + elementA );
//				System.out.println( "elementB[" + ( indexOfA + 1 ) + "] -> " + elementB );
				
			} 
			
				System.out.println("0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0");
			
			for(int j = 0; j<nums.length; j++){
				System.out.print(nums[j]+" ");
			} System.out.println();
			
		}
		
		indexOfNextShouldBeDiff = indexOfA + 2;
		return indexOfNextShouldBeDiff;
		
	}
	
	public static void main( String[] arg ) {
		
		Solution s = new Solution();
		int result = s.removeDuplicates(s.test2);
		System.out.println( "\n\nShow result: \n" + result);
		
		for( int i = 0; i < result; i++ ) {
			System.out.print( s.test2[i] + " " );
		}
		System.out.println();
		
		for( int i = 0; i < s.test2.length; i++ ) {
			System.out.print( s.test2[i] + " " );
		}
		System.out.println();
		
	}
	
	
	
}
