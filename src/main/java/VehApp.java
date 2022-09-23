import java.sql.*;
import java.util.Scanner;

public class VehApp {








    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/vechapp","root","");
            System.out.println("connection created");
            stmt=(Statement) conn.createStatement();
            Scanner input=new Scanner(System.in);
            System.out.println("enter the modelname");
            String modelName=input.nextLine();
            System.out.println(modelName);
            System.out.println("enter brand");
            String brand= input.nextLine();
            System.out.println(brand);
            System.out.println("enter releseyear");
            int relese_year= input.nextInt();
            System.out.println(relese_year);
            System.out.println("enter the price");
            int price= input.nextInt();
            System.out.println(price);
            System.out.println("enter the sellername");
            String sellerName= input.nextLine();
            System.out.println(sellerName);
            System.out.println("enter the color");
            String colors= input.nextLine();
            System.out.println(colors);
            System.out.println("ente the date");
            String manufacturingDate= input.next();
            System.out.println(manufacturingDate);
            String qry="INSERT INTO `vehicle`( `modelname`, `brand`, `relese_year`, `price`, `sellerName`, `colors`, `manufacturingDate`) VALUES ('"+modelName+"','"+brand+"',"+relese_year+","+price+",'"+sellerName+"','"+colors+"','"+manufacturingDate+"')";
            System.out.println(qry);
            stmt.executeUpdate(qry);
            System.out.println("succesfully created");
            System.out.println(modelName);
            System.out.println(brand);
            System.out.println(relese_year);
            System.out.println(price);
            System.out.println(sellerName);
            System.out.println(colors);
            System.out.println(manufacturingDate);








        }catch(Exception e){
            System.out.println("not "+e);

        }


    }
}
