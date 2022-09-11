package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        //EMF를 만드는 순간 persistence.xml에 설정한 persistenceUnitName에 해당하는 DB와 연결한다.
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("hello");

        //ctrl shift r  = ctrl f6
        EntityManager em = emf.createEntityManager();

        em.close();
        emf.close();
    }
}
