package model.dao.impl;

import db.DB;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentDaoJDBC implements DepartmentDao {
    protected Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO department "
                            +   "(Name) "
                            +   "VALUES "
                            + "(?)", Statement.RETURN_GENERATED_KEYS
            );
            st.setString(1, obj.getName());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if(rs.next()) {
                    int id = rs.getInt(1);
                    obj.setId(id);
                }
                DB.closeResultSet(rs);
            } else {
                throw new models.db.DbException("Unexpected error, no rows affected!");
            }

        } catch (SQLException e) {
            throw new models.db.DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Department obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "UPDATE department "
                            + "SET Name = ? "
                            + "WHERE Id = ? "
            );
            st.setString(1, obj.getName());
            st.setInt(2, obj.getId());

            int rows = st.executeUpdate();
            System.out.println("Linhas afetadas: " + rows);

        } catch (SQLException e) {
            throw new models.db.DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;

        try {
            st = conn.prepareStatement("DELETE FROM department WHERE Id = ? ");
            st.setInt(1, id);

            st.executeUpdate();
        } catch (SQLException e) {
            throw new models.db.DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public Department findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * FROM department WHERE Id = ? "
            );

            st.setInt(1,id);
            rs = st.executeQuery(); //Até aqui ele está pesquisando no SQL o id desejado e os parâemtros pedidos
            if (rs.next()) {
                Department dep = instantiateDepartment(rs);
                return dep;
            }
            return null;
        } catch (SQLException e) {
            throw new models.db.DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Department> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(
                    "SELECT * FROM department "
                            + "ORDER BY Id "
            );

            rs = st.executeQuery(); //Até aqui ele está pesquisando no SQL o id desejado e os parâemtros pedidos
            List<Department> list = new ArrayList<>();

            Map<Integer, Department> map = new HashMap<>();//Proteção para verificar se departamento já existe

            while (rs.next()) {
                Department dep = map.get(rs.getInt("Id"));

                if(dep == null) {
                    dep = instantiateDepartment(rs);
                    map.put(rs.getInt("Id"), dep);
                }
                list.add(dep);

            }
            return list;
        } catch (SQLException e) {
            throw new models.db.DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    public Department instantiateDepartment(ResultSet rs) throws SQLException{
        Department dep = new Department();
        dep.setId(rs.getInt("Id")); //Pegando o id achado no banco de dados e colocando ele no objeto isntanciado
        dep.setName(rs.getString("Name"));
        return dep;

    }
}
