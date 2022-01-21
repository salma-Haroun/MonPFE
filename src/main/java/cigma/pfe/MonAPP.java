package cigma.pfe;


import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Client;
import cigma.pfe.models.FACTURE;
import cigma.pfe.models.promotion;
import models.Facture; import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Arrays;
import java.util.List;
public class MonAPP {
    ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    ClientController ctr= (ClientController) ctx.getBean("ctrl1");
    Client client = new Client("OMAR");
    CarteFidelio carteFidelio = new CarteFidelio("A29930489");
    carteFidelio.setClient(Client);
    client.setCarteFidelio(CarteFidelio);
    ctr.save(Client);
}

}
