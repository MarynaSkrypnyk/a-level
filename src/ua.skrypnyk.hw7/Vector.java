package src.ua.skrypnyk.hw7;

import java.util.Arrays;

public class Vector {
    public int x;
    public int y;
    public int z;
    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {

        Vector vector = new Vector(5,6,7);
        Vector vectorTwo = new Vector(2,3,4);

        System.out.println("vector length "+ vector.countVectorLength(vector));
        System.out.println("countVectorProduct"+ vector.countVectorProduct(vectorTwo));
        System.out.println("cosinus between two vector " + vector.cosinusBetweenTwoVector(vectorTwo));
        System.out.println("sumVectors" + vector.sumVectors(vectorTwo));
        System.out.println("differenceVectors"+vector.differenceVectors(vectorTwo));
//        Vector [] vectors = generate(2);
//        System.out.println(Arrays.toString(vectors));

    }

    public double countVectorLength(Vector vector){
        double vectorLength = Math.sqrt(Math.pow(x,2)+ Math.pow(y,2)+ Math.pow(z,2));
        return vectorLength;
    }
    public Vector countVectorProduct(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    public double cosinusBetweenTwoVector (Vector vector){
        int sklarProduct = vector.x * x + vector.y * y + vector.z * z;
        double vectorLengthSeconVector = Math.sqrt(Math.pow(x,2)+ Math.pow(y,2)+ Math.pow(z,2));
        double cosinusBetweenTwoVector = (sklarProduct/(countVectorLength(vector) * vectorLengthSeconVector));
        return cosinusBetweenTwoVector;
    }
    public Vector sumVectors(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }

    public Vector differenceVectors(Vector vector) {
        return new Vector(
                vector.x - x,
                vector.y - y,
                vector.z - z
        );
    }

    public static Vector[] generate(int n){
    Vector[] vectors = new Vector[n];
    for(int i = 0; i < n; i++){
        vectors [i] = new Vector ((int) (Math.random()* 8), (int) (Math.random()*8), (int) (Math.random()*8));
    }
    return vectors;
}
    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

}
