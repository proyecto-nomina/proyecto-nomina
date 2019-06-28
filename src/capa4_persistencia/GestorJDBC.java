package capa4_persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lain
 */
public abstract class GestorJDBC {

    protected Connection conexion;

    public abstract void abrirConexion() throws Exception;

    public void cerrarConexion() throws SQLException {
        try {
            conexion.close();
        } catch (Exception e) {
            throw new SQLException("Ocurrio un problema con la conexión", e);
        }

    }

    public void iniciarTransaccion() throws SQLException {
        try {
            conexion.setAutoCommit(false);
        } catch (Exception e) {
            throw new SQLException("Ocurrio un problema con la conexión", e);
        }
    }

    public void terminarTransaccion() throws SQLException {
        try {
            conexion.commit();
            conexion.setAutoCommit(true);
            conexion.close();
        } catch (Exception e) {
            throw new SQLException("Ocurrio un problema con la conexión", e);
        }
    }

    public void cancelarTransaccion() throws SQLException {
        try {
            conexion.rollback();
            conexion.setAutoCommit(true);
            conexion.close();
        } catch (Exception e) {
            throw new SQLException("Ocurrio un problema con la conexión", e);
        }
    }

    public PreparedStatement prepararSentencia(String sql) throws SQLException {
        try {
            return conexion.prepareStatement(sql);
        } catch (Exception e) {
            throw new SQLException("Ocurrio un problema con la conexión", e);
        }
    }

    public ResultSet ejecutarConsulta(String sql) throws SQLException {
        try {
            Statement sentencia;
            ResultSet resultado;
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            return resultado;
        } catch (Exception e) {
            throw new SQLException("Ocurrio un problema con la conexión", e);
        }
    }
}
