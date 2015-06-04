package mipatronDAO;

import misclases.Administrador;

public interface IAdministradorDAO {
	public void guardarAdministrador(Administrador administrador);
	public void modificarAdministrador(Administrador administrador);
	public void eliminarAdministrador(Long administrador);
	
}
