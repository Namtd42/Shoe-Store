package dao;

import context.DBContext;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT  * FROM product";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt("ID"),
                        rs.getString("name"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getString("image"),
                        rs.getInt("brandId"),
                        rs.getInt("price"));
                list.add(p);
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    public List<Product> getProductByBrand(String id) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product where brandid like ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt("ID"),
                        rs.getString("name"),
                        rs.getString("title"),
                        rs.getString("description"),
                        rs.getString("image"),
                        rs.getInt("brandId"),
                        rs.getInt("price"));
                list.add(p);
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    public void insertToCart(int userid,int productid, int amount, float price) {
        List<Product> list = new ArrayList<>();
        String query = "insert into cart(userid,productid, amount,price,totalprice) values(?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, userid);
            ps.setInt(2, productid);
            ps.setInt(3, amount);
            ps.setFloat(4, price);
            ps.setFloat(4, amount*price);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
