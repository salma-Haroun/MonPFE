package cigma.pfe.DAO;
import cigma.pfe.models.Client;

public interface IClientDao {
    Client save(Client c);
    Client update(Client c);
    void deleteById(long idClient);
    Client findById(long idClient);


}
