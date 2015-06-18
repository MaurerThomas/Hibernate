import entities.Advertentie;
import entities.Category;
import entities.Gebruiker;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Thomas on 17-6-2015.
 */
public class App {

    public static void main(String[] args){

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        scenarioAddUserAndAdvert(session);

        session.getTransaction().commit();
        HibernateUtil.getSessionFactory().close();

    }

    private static void scenarioAddUserAndAdvert(Session session){
        Date date = new Date();
        List<Category> categories = new ArrayList<Category>();
        Gebruiker gebruiker = new Gebruiker("Thomas","Maurer","ckx@cks.com","root", null, null,null);
        Advertentie advertentie = new Advertentie("PC te koop","2 jaar oud",300,true,date,null,gebruiker,categories,null);

        Category category = new Category("Computers",null,null);
        categories.add(category);

        session.save(category);
        session.save(gebruiker);
        session.save(advertentie);
    }
}
