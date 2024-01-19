//
//package bakeryApplication;
//
//import dto.Product;
//import dto.User;
//
//import java.util.Scanner;
//
//public class AdminMainApp {
//
//    private static Scanner sc = new Scanner(System.in);
//    private static AdminMainApp service;
//
//    public static void main(User user) {
////        System.out.println("this is admin page "+ user.getUserName());
//
//        System.out.println("SELECT OPERATION ");
//        System.out.println("1. INSERT PRODUCT");
//        System.out.println("2. REMOVE PRODUCT");
//        System.out.println("3. UPDATE PRODUCT");
//        System.out.println("4. DISPLAY PRODUCT");
//        System.out.println("5. SEARCH PRODUCT BY ID ");
//        System.out.println("6. EXIT");
//        int ch = sc.nextInt();
//
//        switch (ch) {
//            case 1:
//                insertProduct();
//                break;
//            case 2:
//                //removeProduct();
//                break;
//            case 3:
//                //updateProduct();
//                break;
//            case 4:
//                //displayAllProduct();
//                break;
//            case 5:
//                //searchProductById();
//                break;
//            case 6:
//                System.exit(0);
//                break;
//            default:
//                System.out.println("INVALID INPUT ");
//        }
//
//
//    }
//
//    private static void insertProduct() {
//        System.out.println("ENTER ID ");
//        int productId = sc.nextInt();
//        System.out.println("ENTER PRODUCT NAME ");
//        String productName = sc.next();
//        System.out.println("ENTER PRODUCT PRICE ");
//        double productPrice = sc.nextDouble();
//        System.out.println("ENTER PRODUCT TYPE ");
//        int productQty = sc.nextInt();
//
//        Product newProduct = new Product(productName, productPrice, productQty);
//
//        int n = service.insertProduct(newProduct);
//        System.out.println(n + " RECORD ADDED !!");
//
//    }
//}
package bakeryApplication;

import dto.User;

public class AdminMainApp {
    public static void main(User user){
        System.out.println("this is admin page "+ user.getUserName());
    }
}