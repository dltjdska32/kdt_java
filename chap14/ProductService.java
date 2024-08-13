package chap14;

import java.awt.image.DataBufferDouble;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductService {

    List<Product> lists = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int counter;
    private String file = "C:/Users/dltjd/kdt_java/chap14/product.txt";

    public void showMenu() {
        readConf();

        while (true) {


            System.out.println("----------------------------------------------------------------");
            System.out.println("1. 등록 |  2. 목록  |  3. 입고  | 4. 판매  |  5. 매출  | 6. 종료 ");
            System.out.println("----------------------------------------------------------------");

            System.out.println("선택 : ");
            String selectNo = scanner.nextLine();

            switch (selectNo) {

                case "1": registerProduct(); break;
                case "2": showProducts(); break;
                case "3":  break;
                case "4": saleProduct(); break;
                case "5": break;
                case "6": return;
            }
        }
    }


    private void registerProduct() {

        try {



            counter = lists.get(lists.size() - 1).getPno();

            Product product = new Product();
            product.setPno(++counter);

            System.out.print("상품명 : ");
            product.setName(scanner.nextLine());

            System.out.print("가격 : ");
            product.setPrice(Integer.parseInt(scanner.nextLine()));

            System.out.print("재고 : ");
            product.setStock(Integer.parseInt(scanner.nextLine()));



            lists.add(product);

            writeFile();

        } catch (Exception e) {
            System.out.println("등록 에러 :  " + e.getMessage());

        }
    }

    public void showProducts() {
        System.out.printf("%-5s %-8s %-8s %-8s %s%n", "상품코드", "상품명", "단가", "재고", "판매수량");
        System.out.println("---------------------------------------------");

        for (Product p : lists) {
            System.out.printf("%-8d %-8s %-8d %-5d %d%n", p.getPno(), p.getName(), p.getPrice(), p.getStock(), p.getSaleQuantity());

        }
    }

    public void saleProduct() {






    }



    public void readConf(){

        try {
             FileReader fis = new FileReader(file);

             BufferedReader br = new BufferedReader(fis);
             String str;
            while((str = br.readLine()) != null){

                StringTokenizer st = new StringTokenizer(str, ",");

                if (st.countTokens() == 5) {

                        Product pd = new Product();
                        pd.setPno(convertToInt(st.nextToken()));
                        pd.setName(st.nextToken().trim());
                        pd.setPrice(convertToInt(st.nextToken()));
                        pd.setStock(convertToInt(st.nextToken()));
                        pd.setSaleQuantity(convertToInt(st.nextToken()));

                        lists.add(pd);
                    }

            }
        } catch (Exception e) {
            System.out.println("일기오류 : " + e.getMessage());
        }
    }


    public void writeFile() {


        String s;
        try{
            FileWriter fileWriter = new FileWriter(file);
            for (Product list : lists) {
                s = list.getPno() + ", " + list.getName() + ", " + list.getPrice() + ", " + list.getStock() + ", " + list.getSaleQuantity() + "\n";
                fileWriter.write(s);

            }

            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public int convertToInt(String str) {
        int nVal;
        try{
            nVal = Integer.parseInt(str.trim());

        } catch(Exception e){
            return 0;
        }
        return nVal;
    }

}
