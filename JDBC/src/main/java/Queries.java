import java.sql.*;

public class Queries {
    private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/company?useSSL=false";
    private final static String USER = "root";
    private final static String PASSWORD = "root";


    public void taskOne (String divisionName) {
        String query = "SELECT company.employees.*, company.divisions.division_name " +
                "FROM company.divisions, company.employees " +
                "WHERE company.divisions.division_name = '" + divisionName + "' " +
                "AND company.divisions.division_id = company.employees.division_id " +
                "ORDER BY salary";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            Statement statement = conn.createStatement();
            statement.executeQuery(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " +
                        resultSet.getInt(2) + " " +
                        resultSet.getString(3) + " " +
                        resultSet.getString(4) + " " +
                        resultSet.getString(5) + " " +
                        resultSet.getInt(6) + " " +
                        resultSet.getString(7) + " ");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void taskTwo (String divisionName) {
        String query = "SELECT company.employees.*, company.divisions.division_name " +
                "FROM company.divisions, company.employees " +
                "WHERE company.divisions.division_name = '" + divisionName + "' " +
                "AND company.divisions.division_id = company.employees.division_id " +
                "ORDER BY name, surname, patronymic";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            Statement statement = conn.createStatement();
            statement.executeQuery(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " +
                        resultSet.getInt(2) + " " +
                        resultSet.getString(3) + " " +
                        resultSet.getString(4) + " " +
                        resultSet.getString(5) + " " +
                        resultSet.getInt(6) + " " +
                        resultSet.getString(7) + " ");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void taskThree (String surname) {
        String query = "SELECT * FROM company.employees " +
                "WHERE company.employees.salary > " +
                "(SELECT company.employees.salary " +
                "FROM company.employees " +
                "WHERE surname = '" + surname + "')";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            Statement statement = conn.createStatement();
            statement.executeQuery(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " +
                        resultSet.getInt(2) + " " +
                        resultSet.getString(3) + " " +
                        resultSet.getString(4) + " " +
                        resultSet.getString(5) + " " +
                        resultSet.getInt(6));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void taskFour (String name, String surname, String patronymic) {
        String queryEmployees = "SELECT salary FROM company.employees " +
                "WHERE company.employees.name = '" + name + "' " +
                "AND company.employees.surname = '" + surname + "' " +
                "AND company.employees.patronymic = '" + patronymic + "' " ;
        String queryDivisions = "SELECT company.employees.name, company.employees.surname, company.employees.patronymic, company.employees.salary " +
                "FROM company.employees " +
                "WHERE company.employees.division_id IN " +
                "(SELECT company.divisions.division_id FROM company.divisions " +
                "WHERE company.divisions.lead_name = '" + name + "' " +
                "AND company.divisions.lead_surname = '" + surname + "' " +
                "AND company.divisions.lead_patronymic = '" + patronymic + "') " +
                "ORDER BY name, surname, patronymic";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(queryEmployees);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
            }
            resultSet = statement.executeQuery(queryDivisions);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " +
                        resultSet.getString(2) + " " +
                        resultSet.getString(3) + " " +
                        resultSet.getInt(4));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}