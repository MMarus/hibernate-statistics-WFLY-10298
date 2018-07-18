import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Marek Marusic <mmarusic@redhat.com> on 7/3/18.
 */
@Stateless(name = "ServiceService")
public class Loop {

    @PersistenceContext(unitName = "myDS")
    EntityManager em;

    public List<Product> loop() {
        for (int i=0; i<10; i++) {
            Product p = new Product();
            p.setName("MyProduct"+i);
            em.persist(p);
        }

        List<Product> products = em.createQuery("Select p From Product p").getResultList();
        System.out.println(products);
        return products;
    }

}
