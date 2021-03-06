package be.vdab.profiles.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author Arne Van Eycken
 * @version 1.0
 */

@DataJpaTest
class DataSourceTest {
    private final DataSource dataSource;

    public DataSourceTest(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Test
    void dataBaseNaam() throws SQLException{
        try(var connection = dataSource.getConnection()){
            System.out.println(connection.getCatalog());
        }
    }
}
