import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateAndFillTable {
    private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/company?useSSL=false";
    private final static String USER = "root";
    private final static String PASSWORD = "root";

    String createDivisionsTableQuery = "CREATE TABLE company.divisions (" +
            " division_id INT NOT NULL AUTO_INCREMENT," +
            " division_name VARCHAR(255) NOT NULL," +
            " lead_name VARCHAR(255) NOT NULL," +
            " lead_surname VARCHAR(255) NOT NULL," +
            " lead_patronymic VARCHAR(255)," +
            " PRIMARY KEY (division_id))";
    String createEmployeesTableQuery = "CREATE TABLE company.employees (" +
            " employee_id INT NOT NULL AUTO_INCREMENT," +
            " division_id INT NOT NULL," +
            " name VARCHAR(255) NOT NULL," +
            " surname VARCHAR(255) NOT NULL," +
            " patronymic VARCHAR(255)," +
            " salary INT NOT NULL," +
            " PRIMARY KEY (employee_id)," +
            " CONSTRAINT division_id" +
            " FOREIGN KEY (division_id)" +
            " REFERENCES company.divisions (division_id)" +
            " ON DELETE NO ACTION" +
            " ON UPDATE NO ACTION)";
    String insertIntoDivisionsTable = "INSERT INTO company.divisions (" +
            " division_name, lead_name, lead_surname, lead_patronymic)" +
            " VALUES ('Div1', 'Анатолий', 'Мащенко', 'Захарович')," +
            " ('Div2', 'Одинцов', 'Григорий', 'Станиславович')," +
            " ('Div3', 'Анастасия', 'Большакова', 'Ефимовна')";
    String insertIntoEmployeesTable = "INSERT INTO company.employees (" +
            " name, surname, patronymic, salary, division_id)" +
            " VALUES ('Егор', 'Шарапов', 'Константинович', 50000, 1)," +
            " ('Георгий', 'Устинов', 'Иосифович', 75000, 1)," +
            " ('Максим ', 'Мухин', 'Русланович', 55000, 2)," +
            " ('Кристина ', 'Зимина ', 'Федоровна', 41000, 3)," +
            " ('Новикова ', 'Марина ', null, 101000, 2)";

    public void fillTables() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            Statement statement = conn.createStatement();
            statement.executeUpdate(createDivisionsTableQuery);
            statement.executeUpdate(createEmployeesTableQuery);
            statement.executeUpdate(insertIntoDivisionsTable);
            statement.executeUpdate(insertIntoEmployeesTable);
            System.out.println("Tables have been created and filled in successfully");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
