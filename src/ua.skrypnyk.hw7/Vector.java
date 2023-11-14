package src.ua.skrypnyk.hw7;

import java.util.Arrays;

public class Vector {
    public int x;
    public int y;
    public int z;

    public Vector (int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static void main(String[] args) {
        int bx = 4;
        int by = 6;
        int bz = 10;
        Vector vector = new Vector(3,5,9);
        System.out.println("Count vector length "+ vector.countVectorLength(vector.x, vector.y, vector.z));

        int [] vectorProduct = countVectorProduct(vector.x, vector.y, vector.z, bx, by, bz);
        System.out.println("Vector product with another vector" + Arrays.toString(vectorProduct));
        System.out.println("Count cosinus between two vector " + vector.cosinusBetweenTwoVector(vector.x, vector.y, vector.z, bx, by, bz));

        int [] sumVectors = sumVectors(vector.x, vector.y, vector.z, bx, by, bz);
        System.out.println("Sum vectors " + Arrays.toString(sumVectors));

        int [] differenceVectors = differenceVectors(vector.x, vector.y, vector.z, bx, by, bz);
        System.out.println("Difference vectors " + Arrays.toString(differenceVectors));

        Vector [] vectors = generate(2);
        System.out.println(Arrays.toString(vectors));

    }

    public double countVectorLength(int x, int y, int z){
        double vectorLength = Math.sqrt(Math.pow(x,2)+ Math.pow(y,2)+ Math.pow(z,2));
        return vectorLength;
    }

    public static int [] countVectorProduct(int x, int y, int z, int bx, int by, int bz){
        int producktPointA = Math.abs(y * bz - z * by);
        int producktPointY = Math.abs(z * bx - x * bz);
        int producktPointZ = Math.abs(x * by - y * bx);
        return new int[] {producktPointA, producktPointY, producktPointZ};
    }
    public double cosinusBetweenTwoVector (int x, int y, int z, int bx, int by, int bz){
        int sklarProduct = x * bx + y * by + z * bz;
        double vectorLengthSeconVector = Math.sqrt(Math.pow(bx,2)+ Math.pow(by,2)+ Math.pow(bz,2));
        double cosinusBetweenTwoVector = (sklarProduct/(countVectorLength(x, y, z) * vectorLengthSeconVector));
        return cosinusBetweenTwoVector;
    }
    public static int [] sumVectors(int x, int y, int z, int bx, int by, int bz){
        int sumVectorsPointA = x + bx;
        int sumVectorsPointY = y + by;
        int sumVectorsPointZ = z + bz;
        return new int [] {sumVectorsPointA, sumVectorsPointY, sumVectorsPointZ};
    }
    public static int [] differenceVectors(int x, int y, int z, int bx, int by, int bz){
        int differenceVectorsPointA = x - bx;
        int differenceVectorsPointY = y - by;
        int differenceVectorsPointZ = z - bz;
        return new int [] {differenceVectorsPointA, differenceVectorsPointY, differenceVectorsPointZ};
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
