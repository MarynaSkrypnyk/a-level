package src.ua.skrypnyk.hw7;

import java.util.Arrays;

public class Vector {
    public int x;
    public int y;
    public int z;
    public Vector (int ax, int ay, int az) {
        this.x = ax;
        this.y = ay;
        this.z = az;
    }

    public static void main(String[] args) {

        Vector vector = new Vector(3,5,9);

        System.out.println("vector length "+ vector.countVectorLength(vector));
        System.out.println("countVectorProduct"+ vector.countVectorProduct(vector, 2,2,2));
        System.out.println("cosinus between two vector " + vector.cosinusBetweenTwoVector(vector,2,2,2));
        System.out.println("sumVectors" + vector.sumVectors(vector,2,2,2));
        System.out.println("differenceVectors"+vector.differenceVectors(vector,2,2,2));
        Vector [] vectors = generate(2);
        System.out.println(Arrays.toString(vectors));

    }

    public double countVectorLength(Vector vector){
        double vectorLength = Math.sqrt(Math.pow(x,2)+ Math.pow(y,2)+ Math.pow(z,2));
        return vectorLength;
    }
    public Vector countVectorProduct(Vector vector, int bx, int by, int bz) {
        return new Vector(
                bz * vector.y - by * vector.z,
                bx * vector.z - bz * vector.x,
                by * vector.x - bx * vector.y
        );
    }
    public double cosinusBetweenTwoVector (Vector vector, int bx, int by, int bz){
        int sklarProduct = x * bx + y * by + z * bz;
        double vectorLengthSeconVector = Math.sqrt(Math.pow(bx,2)+ Math.pow(by,2)+ Math.pow(bz,2));
        double cosinusBetweenTwoVector = (sklarProduct/(countVectorLength(vector) * vectorLengthSeconVector));
        return cosinusBetweenTwoVector;
    }
    public Vector sumVectors(Vector vector, int bx, int by, int bz) {
        return new Vector(
                bx + vector.x,
                by + vector.y,
                bz + vector.z
        );
    }

    public Vector differenceVectors(Vector vector, int bx, int by, int bz) {
        return new Vector(
                vector.x - bx,
                vector.y - by,
                vector.z - bz
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
