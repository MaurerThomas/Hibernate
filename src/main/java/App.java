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

        scenarioAddUserAndAdvertWithLinkedCategories(session);

        session.getTransaction().commit();
        HibernateUtil.getSessionFactory().close();

    }

    private static void scenarioAddUserAndAdvertWithLinkedCategories(Session session){
        Date date = new Date();
        List<Category> categories = new ArrayList<Category>();
        List<Category> subcategories = new ArrayList<Category>();
        Gebruiker verkoper = new Gebruiker("Thomas","Maurer","ckx@cks.com","root", null, null,null);
        Advertentie advertentie = new Advertentie("PC te koop","2 jaar oud",300,true,date,null,verkoper,categories,null);

        Category parent1 = new Category("Computers",null,null);
        Category parent = new Category("Beeld",subcategories,null);
        Category subcategory = new Category("Televisie",null,null);
        Category parent2 = new Category("Telefoon", null,null);

        categories.add(parent1);
        categories.add(parent2);
        categories.add(parent);
        subcategories.add(subcategory);

        session.save(parent1);
        session.save(parent);
        session.save(parent2);
        session.save(subcategory);
        session.save(verkoper);
        session.save(advertentie);
    }


}
