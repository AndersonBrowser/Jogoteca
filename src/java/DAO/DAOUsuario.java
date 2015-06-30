package DAO;


/**
 *
 * @author Izequiel
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Conexão.ConnectionFactory;
import Modelo.Usuario;

public class DAOUsuario {

	private Connection con;
	private PreparedStatement ps;

	
        public DAOUsuario() {
            con = ConnectionFactory.getConnection();
	}


	public void inserir(Usuario usuario) throws SQLException {
		ps = con.prepareStatement("insert into usuario values (?,?,?,?)");
		ps.setString(1, usuario.getLogin());
		ps.setString(2, usuario.getNome());
		ps.setString(3, usuario.getTelefone());
		ps.setString(4, usuario.getSenha());
		ps.execute();
	}

	public void atualizar(Usuario usuario) throws SQLException {
		ps = con.prepareStatement("update usuario set nome = ?, telefone = ?, senha = ? where login = ?");
		ps.setString(1, usuario.getNome());
		ps.setString(2, usuario.getTelefone());
		ps.setString(3, usuario.getSenha());
		ps.setString(4, usuario.getLogin());
		ps.execute();
	}

	public void apagar(String login) throws SQLException {

		ps = con.prepareStatement("delete from usuario where login = ?");
		ps.setString(1, login);
		ps.execute();

	}

	public Usuario localizar(String login) throws SQLException {

		Usuario usuario = null;
		ps = con.prepareStatement("select * from usuario where login = ?");
		ps.setString(1, login);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			usuario = new Usuario();
			usuario.setLogin(rs.getString("login"));
			usuario.setNome(rs.getString("nome"));
			usuario.setTelefone(rs.getString("telefone"));
			usuario.setSenha(rs.getString("senha"));
		}
		return usuario;
	}

	public Usuario[] listar() throws SQLException {
		Usuario usuario = null;
		Usuario usuarios[] = null;
		
		ps = con.prepareStatement("select count(*) from usuario");
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			int qtd = rs.getInt(1);
			
			if(qtd>0){
				
				usuarios = new Usuario[qtd];
				int cont = 0;
				
				ps = con.prepareStatement("select * from usuario");
				rs = ps.executeQuery();
				
				while (rs.next()){
					usuario = new Usuario();
					usuario.setLogin(rs.getString("login"));
					usuario.setNome(rs.getString("nome"));
					usuario.setTelefone(rs.getString("telefone"));
					usuario.setSenha(rs.getString("senha"));
					usuarios[cont] = usuario;
					cont++;
				}
			}
			
		
		}
		return usuarios;
	}
	
	

}