package eight;

public class Location {

    // public data fields for row, column and the maximal value
    public int row, column;
    public double maxValue;

    // constructor that initalizes object for a specific array with a maximal value at a specific location
    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    // static method that locates largest element in array and returns new object with specified location
    public static Location locateLargest(double[][] a) {
        
        // row and column that stores position where maximal value will be
        int row = 0;
        int column = 0;

        // value that stores the maximal value (initially the first element of the array)
        double maxValue = a[row][column];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                // if the currently stored maximum value is less than the value at the index,
                // update the maximum value and its position
                if (maxValue < a[i][j]){
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        // return new object of Location using the newly found values
        return new Location(row, column, maxValue);
    }
}
