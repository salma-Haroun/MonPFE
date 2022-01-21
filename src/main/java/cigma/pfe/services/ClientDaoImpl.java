package cigma.pfe.services;

import cigma.pfe.DAO.IClientDao;
import cigma.pfe.models.Client;

public class ClientDaoImpl implements ClientService {
    private IClientDao dao;
    public void setDao(IClientDao dao) {
        this.dao = dao;
    }
    @Override
    public Client save(Client c) {
        return dao.save(c);
    }
    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }

}
