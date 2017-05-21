package mingda.leetCode;

public class SolutionFinal {

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

			if( elementA == elementB ) {

				indexOfNextShouldBeDiff = indexOfA + 2;
				
				elementC = nums[ i + 2 ];
				
				if( elementC != elementB && i < nums.length - 3 ) {
					
					nums[ indexOfNextShouldBeDiff ] = nums[ i + 2 ];
					nums[ indexOfNextShouldBeDiff + 1 ] = nums[ i + 3 ];
					elementA = nums[ indexOfNextShouldBeDiff ];
					elementB = nums[ indexOfNextShouldBeDiff + 1 ];
					indexOfA = indexOfNextShouldBeDiff;
					i++;
					
				} else if( elementC != elementB && i == nums.length - 3 ) {
					nums[ indexOfNextShouldBeDiff ] = nums[ i + 2 ]; 
					indexOfNextShouldBeDiff = indexOfA + 2;
					return indexOfNextShouldBeDiff + 1;
					
				}
				
			} else if( elementA != elementB ) {

				nums[ indexOfA + 2 ] = nums[ i + 2 ];
				elementA = nums[ indexOfA + 1 ];
				elementB = nums[ i + 2 ];
				indexOfA++;
				
			} 
			
		}
		
		indexOfNextShouldBeDiff = indexOfA + 2;
		return indexOfNextShouldBeDiff;
		
	}
	
}
