import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import task3.DaigonalSumOfMatrix;

class DaigonalSumOfMatrixTest {

	@Test
	void testDiagonalSum() {
		int[][] matrix = {
                {12, 54, 88},
                {23, 53, 12},
                {13, 11, 21}
        };
		
		DaigonalSumOfMatrix.getDiagonalSum(matrix, 3);
		
		 assertEquals(86, DaigonalSumOfMatrix.sumMainDiagonal);
	     assertEquals(154, DaigonalSumOfMatrix.sumSecondaryDiagonal);

	}

}
