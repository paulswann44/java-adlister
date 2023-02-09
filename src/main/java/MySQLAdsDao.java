import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads
{
    private Connection connection;


public MySQLAdsDao(Config config){
    try{
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    } catch (SQLException throwables){
        throwables.printStackTrace();
    }


}


    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        String query = "SELECT * FROM ads";
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                Ad ad = new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                ads.add(ad);
            }

        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return ads;
    }


    @Override
    public Long insert(Ad ad) {
        long lastInstertedId =0;
        try {
            Statement statement = connection.createStatement();
            String insertQuery = String.format("INSERT INTO ads(user_id, title, description) VALUES(%d, '%s', '%s' )",
                    ad.getUserId(), ad.getTitle(), ad.getDescription());
            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            lastInstertedId = rs.getLong(1);

        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return lastInstertedId;
    }
    public static void main(String[] args) {
        MySQLAdsDao mySQLAdsDao = new MySQLAdsDao(new Config());
        Ad adToInsert = new Ad(
                1,
                "Test Insert Ad",
                "Test Insert Ad Description"
        );
        System.out.println(mySQLAdsDao.all());
    }
}