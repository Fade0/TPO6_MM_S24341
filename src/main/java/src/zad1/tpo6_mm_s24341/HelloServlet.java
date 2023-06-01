package src.zad1.tpo6_mm_s24341;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.google.gson.Gson;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "bookStore", value = "/book-store")
public class HelloServlet extends HttpServlet {
    private String message;

    private Gson gson = new Gson();


    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        String book_title = "";
        String book_author = "";
        String book_id = "";
        String book_ISBN = "";

        book_author = request.getParameter("author");
        System.out.println(book_author);
        DataSourceConnect.initProps();

        Connection connection = DataSourceConnect.getConnection();
        String titleString = "";
        String authorString = "";

        ArrayList<Book> queryList = new ArrayList<>();


        PrintWriter out = response.getWriter();
        out.println(titleString);
        try {

            ResultSet rs = connection.prepareStatement("SELECT * From pjatk.books WHERE author ='" + book_author +"'").executeQuery();


            while (rs.next()){
                System.out.println(rs.getString("author"));
                //queryList.add(rs.getString("author"));
                queryList.add(new Book(rs.getInt("book_id"),
                            rs.getString("title"),
                            rs.getString("author"),
                            rs.getString("description"),
                            rs.getString("isbn"),
                            rs.getDate("publishDate"),
                            rs.getInt("rating"),
                            rs.getDate("creationDate")));



            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        out.println(gson.toJson(queryList));
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void destroy() {
    }
}