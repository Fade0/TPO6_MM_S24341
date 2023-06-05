package src.zad1.tpo6_mm_s24341;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Listener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContextListener.super.contextInitialized(sce);
        System.out.println("It works!");

        DataSourceConnect.initProps();

        Connection connection = DataSourceConnect.getConnection();

        try {
            ResultSet rs = connection.prepareStatement("SELECT * From pjatk.pokemon").executeQuery();
            rs.next();

            while (rs.next()){
                System.out.println(rs.getString("pokemon_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
