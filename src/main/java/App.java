import entities.*;
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
        List<Bod> biedingen = new ArrayList<Bod>();
        List<AdvertentieReactie> reacties = new ArrayList<AdvertentieReactie>();
        List<Category> subcategories = new ArrayList<Category>();
        Gebruiker verkoper = new Gebruiker("Thomas","Maurer","ckx@cks.com","root", null, null,null);
        Advertentie advertentie = new Advertentie("PC te koop","2 jaar oud",300,true,date,biedingen,verkoper,categories,reacties,null);

        Gebruiker koper1 = new Gebruiker("Wouter","Naloop","jeboy@wouter.com","root",null,null,null);
        Gebruiker koper2 = new Gebruiker("Sjaak","Franks","jeboy@sjaak.com","root",null,null,null);

        Bod bod1 = new Bod(10,null,advertentie,koper1);
        biedingen.add(bod1);
        Bod bod2 = new Bod(50,null,advertentie,koper2);
        biedingen.add(bod2);
        Bod bod3 = new Bod(100,null,advertentie,koper1);
        biedingen.add(bod3);
        Bod bod4 = new Bod(200,null,advertentie,koper2);
        biedingen.add(bod4);
        Bod bod5 = new Bod(400,null,advertentie,koper1);
        biedingen.add(bod5);

        advertentie.setKoper(bod5.getBieder());
        advertentie.setAdvertentieActief(false);

        Category parent1 = new Category("Computers",null,null);
        Category parent = new Category("Beeld",subcategories,null);
        Category subcategory = new Category("Televisie",null,null);
        Category parent2 = new Category("Telefoon", null,null);

        categories.add(parent1);
        categories.add(parent2);
        categories.add(parent);
        subcategories.add(subcategory);

        AdvertentieReactie reactie1 = new AdvertentieReactie("dit is super mooi",null,advertentie,koper2);
        reacties.add(reactie1);
        AdvertentieReactie reactie2 = new AdvertentieReactie("ik wil hem",null,advertentie,koper1);
        reacties.add(reactie2);
        AdvertentieReactie reactie3 = new AdvertentieReactie("bied maar",null,advertentie,verkoper);
        reacties.add(reactie3);
        AdvertentieReactie reactie4 = new AdvertentieReactie("Ik wil hem ook",null,advertentie,koper2);
        reacties.add(reactie4);
        AdvertentieReactie reactie5 = new AdvertentieReactie("LET THE BATTLE BEGIN",null,advertentie,verkoper);
        reacties.add(reactie5);

        session.save(parent1);
        session.save(parent);
        session.save(parent2);
        session.save(subcategory);

        session.save(verkoper);
        session.save(koper1);
        session.save(koper2);

        session.save(bod1);
        session.save(bod2);
        session.save(bod3);
        session.save(bod4);
        session.save(bod5);

        session.save(reactie1);
        session.save(reactie2);
        session.save(reactie3);
        session.save(reactie4);
        session.save(reactie5);


    }



}
