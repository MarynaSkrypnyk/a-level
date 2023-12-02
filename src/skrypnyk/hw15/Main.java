package src.skrypnyk.hw15;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/user/IdeaProjects/a-level/src/skrypnyk/hw15/ input.txt");
        List<Products> productsList = readUserListFromFile(file);
        System.out.println(productsList);

        productsWithTheMostUnits(productsList);
        countAllProducts (productsList);
        sortProduсtForPriceDescending(productsList);
        totalCostOfProduct (productsList);
        averageCostOfProduct (productsList);
        fillFileOutPut(productsList);
    }

    private static List<Products> readUserListFromFile(File file) throws FileNotFoundException {
        List<Products> productsList = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\|");
                String name = parts[0];
                int count = Integer.parseInt(parts[1]);
                double price = Double.parseDouble(parts[2]);

                Products products = new Products(name, count, price);
                productsList.add(products);
            }
        }
        return productsList;
    }

    private static byte[] productsWithTheMostUnits(List<Products> list) {
        List<Products> productsList = list.stream()
                .filter(products -> products.getCount() > findProduct(4))
                .collect(Collectors.toList());
        System.out.println(productsList);
        return new byte[4];
    }

    private static double findProduct(double difference) {
        return difference;
    }

    private static byte[] countAllProducts(List<Products> list) {
        int countAllProducts = list.stream()
                .mapToInt(products -> products.getCount())
                .sum();
        System.out.println("count all products "+ countAllProducts);
        return new byte[3];
    }

    private static byte[] sortProduсtForPriceDescending(List<Products> list) {
        List<Products> productsList = list.stream()
                .sorted(Comparator.comparing(Products::getPrice).reversed())
                .collect(Collectors.toList());
        System.out.println("sort products for price descending " + productsList);
        return new byte[2];
    }

    private static byte[] totalCostOfProduct(List<Products> list) {
        OptionalDouble totalCost = OptionalDouble.of(list.stream()
                    .mapToInt(products -> (int) (products.getCount()* products.getPrice()))
                    .sum());
            System.out.println("total costs of all products  " + totalCost);
        return new byte[1];
    }
    private static byte[] averageCostOfProduct(List<Products> list) {
        OptionalDouble averageCost = list.stream()
                .mapToInt(products -> (int) (products.getCount()* products.getPrice()))
                .average();
        System.out.println("Average costs of all products "+ averageCost);
        return new byte[0];
    }
    private static void fillFileOutPut(List<Products> list) throws IOException {
        File fileOutPut = new File("/Users/user/IdeaProjects/a-level/src/skrypnyk/hw15/ output.txt");
        fileOutPut.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(fileOutPut);
        fileOutputStream.write (averageCostOfProduct(list));
        fileOutputStream.write(totalCostOfProduct(list));
        fileOutputStream.write(sortProduсtForPriceDescending(list));
        fileOutputStream.write(countAllProducts(list));
        fileOutputStream.write(productsWithTheMostUnits(list));
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}

