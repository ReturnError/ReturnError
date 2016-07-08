package sdkd.com.ec.dao.impl;

import java.sql.*;

/**
 * 用户DAO
 * Created by SDUST-132 on 2016/7/5.
 */
public class EbUserDao {
    public static void testAdd(){
        //JDBC的步骤
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.桥梁--Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.210.143:3306/easybuy","root","");
            //3.CRUD
            String sql = "insert into easybuy_user(eu_user_name) values('陈浩')";
            PreparedStatement ps = con.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println(result);
            //sout+Tab
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static void testUpdate(){
        //JDBC的步骤
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.桥梁--Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.210.143:3306/easybuy","root","");
            //3.CRUD
            String sql = "update easybuy_user set eu_user_name = '陈浩南' where eu_user_id = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println(result);
            //sout+Tab
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testDelete(){
        //JDBC的步骤
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.桥梁--Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.210.143:3306/easybuy","root","");
            //3.CRUD
            String sql = "delete from easybuy_user where eu_user_id = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println(result);
            //sout+Tab
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void testQuery(){
        //JDBC的步骤
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.桥梁--Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.210.143:3306/easybuy","root","");
            //3.CRUD
            String sql = "select * from easybuy_news";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("en_title");
                System.out.println("name："+name);
            }
            //sout+Tab
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        test();
//        testUpdate();
//        testDelete();
        testQuery();
    }
}
