package capa4_persistencia;

import java.sql.DriverManager;

public class GestorJDBCPostgre extends GestorJDBC {

    @Override
    public void abrirConexion() throws Exception {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/NominaBD";
            conexion = DriverManager.getConnection(url, "postgres", "123456");
        } catch (Exception e) {
            throw new Exception("Ocuurio un problema en la conexión con la base de datos.", e);
        }

    }

}
