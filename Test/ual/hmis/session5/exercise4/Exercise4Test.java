package ual.hmis.session5.exercise4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exercise4Test {
    
        @Test
        void testGetDiagonals() {
            Exercise4 diagonals = new Exercise4();

            int[][] matrix = {{1, 3, 6, 9}, {2, 4, 7, 10}, {3, 5, 8, 11}, {4, 6, 9, 12}};

            int[][] expected = {{1, 4, 8, 12}, {9, 7, 5, 4}};
            int[][] result = diagonals.getDiagonals(matrix);

            assertArrayEquals(expected, result);
        }

        @Test
        void testAddColumnsEmpty() {
            Exercise4 empty = new Exercise4();

            double[][] emptyMatrix = {};

            double[] expected = {};
            double[] result = Exercise4.addColumns(emptyMatrix);

            assertArrayEquals(expected, result);
        }

        @Test
        public void testAddColumns() {
            Exercise4 adding = new Exercise4();
            double[][] matrix = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}
            };

            double[] expectedColumnSums = {12.0, 15.0, 18.0};
            double[] actualColumnSums = adding.addColumns(matrix);

            assertArrayEquals(expectedColumnSums, actualColumnSums);
        }

        @Test
        public void testAddColumnsOneValue() {
            double[][] oneMatrix = {{17.0}};

            double[] expected = {17.0};
            double[] actual = Exercise4.addColumns(oneMatrix);

            assertArrayEquals(expected, actual);
           }

        @Test
        public void testAddColumnsMinus() {
            double[][] matrix = {{-1.0, -3.0, -4.0},{-21.0, -6.0, -9.0}, {-11.0, -9.0, -10.0}};

            double[] expected = {-33.0, -18.0, -23.0};
            double[] actual = Exercise4.addColumns(matrix);

            assertArrayEquals(expected, actual);
        }

        @Test
        public void testAddColumnsZero() {
            double[][] matrix = {{0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}, {0.0, 0.0, 0.0}};

            double[] expected = {0.0, 0.0, 0.0};
            double[] actual = Exercise4.addColumns(matrix);
            assertArrayEquals(expected, actual);
        }


}
