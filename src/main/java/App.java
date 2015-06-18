import entities.Gebruiker;
import org.hibernate.Session;

/**
 * Created by Thomas on 17-6-2015.
 */
public class App {

    public static void main(String[] args){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Gebruiker gebruiker = new Gebruiker("Thomas","Maurer","ckx@cks.com","root", null, null,null);
        session.save(gebruiker);
        session.getTransaction().commit();
        HibernateUtil.getSessionFactory().close();

    }
}
