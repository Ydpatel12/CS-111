/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {



	// WRITE YOUR CODE HERE
    double b[] = new double[array.length];
    for (int i=0; i<array.length; i++){
        b[i] = array[i];
    }
    return b;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

	// WRITE YOUR CODE HERE
    for(int i = 0; i<x.length; i++){
        x[i] *= alpha;
        y[i] *= alpha;
    }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

	// WRITE YOUR CODE HERE
    for(int i = 0; i<x.length; i++){
        x[i] += dx;
        y[i] += dy;
    }
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

	// WRITE YOUR CODE HERE
    double z = Math.toRadians(theta);

    for (int i = 0; i < x.length; i++){

    double x2 = x[i];
    x[i] = (x[i] * Math.cos(z)) - (y[i] * Math.sin(z));
    y[i] = (y[i] * Math.cos(z)) - (x2 * Math.sin(z));

    }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
// Rotates polygon 45 degrees. 


	// WRITE YOUR CODE HERE
    }
}
