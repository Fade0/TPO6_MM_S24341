package src.zad1.tpo6_mm_s24341;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.google.gson.Gson;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "PokeCenter", value = "/pokecenter")
public class HelloServlet extends HttpServlet {
    private String message;

    private Gson gson = new Gson();


    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        String pokemon_id = "";
        String pokemon_name = "";
        String pokemon_type_primary = "";
        String pokemon_type_secondary = "";
        String pokemon_hp = "";
        String pokemon_attack = "";
        String pokemon_defense = "";
        String pokemon_speed = "";

        pokemon_id  = request.getParameter("pokemon_id");
        System.out.println(pokemon_id);
        DataSourceConnect.initProps();

        Connection connection = DataSourceConnect.getConnection();
        String pokemon_idString = "";
        String nameString = "";

        ArrayList<Pokemon> queryList = new ArrayList<>();


        PrintWriter out = response.getWriter();
        out.println(pokemon_idString);
        try {
            String sqlQuery = "SELECT * From pjatk.pokemon";
            boolean anythingAdded = false;
            if (pokemon_name == null){

            }

            /*
            "SELECT * From pjatk.pokemon " +
                    "WHERE pokemon_id =" + pokemon_id +
                    " AND name = " + pokemon_name +
                    " AND (type_primary = " + pokemon_type_primary + "OR type_secondary =" + pokemon_type_primary

             */
            ResultSet rs = connection.prepareStatement(sqlQuery).executeQuery();


            while (rs.next()){
                System.out.println(rs.getString("pokemon_id"));
                //queryList.add(rs.getString("author"));
                queryList.add(new Pokemon(rs.getInt("pokemon_id"),
                            rs.getString("name"),
                            rs.getString("type_primary"),
                            rs.getString("type_secondary"),
                            rs.getString("hp"),
                            rs.getString("attack"),
                            rs.getString("defense"),
                            rs.getString("speed")));

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