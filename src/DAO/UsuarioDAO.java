package DAO;

import functions.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UsuarioDAO extends ExecuteSQL {
    
    public UsuarioDAO(Connection con) {
        super(con);
    }
    
    public static String CPFU, nome, idade, endereco, telefone, modalidade;
    
    public String Inserir_Usuario(Usuario a) {
        String sql = "INSERT INTO USUARIO VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getCPF());
            ps.setString(2, a.getNome());
            ps.setString(3, a.getIdade());
            ps.setString(4, a.getEndereco());
            ps.setString(5, a.getTelefone());
            ps.setString(6, (String) a.getModalidade());
            
            if(ps.executeUpdate() > 0) {
                return "Inserido com sucesso!";
            }else{
                return "Erro ao inserir!";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
    public List<Usuario> Buscar_Usuario(String CPF) {
        String sql = "SELECT * FROM USUARIO WHERE CPF LIKE'" + CPF + "'";
        List<Usuario> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null) {
                while(rs.next()) {
                    Usuario a = new Usuario();
                    nome = rs.getString(2);
                    idade = rs.getString(3);
                    endereco = rs.getString(4);
                    telefone = rs.getString(5);
                    modalidade = rs.getString(6);
                    lista.add(a);
                }
                return lista;
            }else{
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
    
    public String Atualizar_Usuario() {
        String sql = "UPDATE USUARIO SET NOME = ?, IDADE = ?, ENDERECO = ?, TELEFONE = ?, MODALIDADE = ? WHERE CPF = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, idade);
            ps.setString(3, endereco);
            ps.setString(4, telefone);
            ps.setString(5, modalidade);
            ps.setString(6, CPFU);
            
            if(ps.executeUpdate() > 0) {
                return "Atualizado com sucesso!!";
            }else{
                return "Erro ao atualizar!";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    
    public String Excluir_Usuario() {
        String sql = "DELETE FROM USUARIO WHERE CPF = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, CPFU);
            
            if(ps.executeUpdate() > 0) {
                return "Excluido com sucesso!!";
            }else{
                return "Erro ao excluir!";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
}
