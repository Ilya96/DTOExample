//import com.mysql.fabric.jdbc.FabricMySQLDriver;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import bl.HibernateUtil;
import Entity.Cities;
import Entity.Landmarks;
import org.hibernate.Session;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/my_schema?useSSL=false"/*"jdbc:mysql://localhost:3306/systempdd?autoReconnect=true"*/;

    public static void main(String[] args) throws SQLException{
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Cities city = new Cities();
        //cities.setIdcity(new Long());
        city.setNameCity("Gotham City");

//        Landmarks landmark = new Landmarks();
//        landmark.setNamelandmarks("Batman");

//        Set<Landmarks> landmarks = new HashSet<Landmarks>();
//        landmarks.add(landmark);
//        city.setSetOfLandmarks(landmarks);

        session.save(city);
//        session.save(landmark);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
        /*Connection connection = null;
        Driver driver;
        try{
            driver = new FabricMySQLDriver();
        } catch (SQLException e) {
           System.out.println("Ошибка при создании драйвера((");
           return;
        }

        try{
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            System.out.println("Не удалось зарегать драйвер((");
            return;
        }

        try{
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("..........................");
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }
        finally {
            if(connection!=null)
                connection.close();
        }*/
    }
}
