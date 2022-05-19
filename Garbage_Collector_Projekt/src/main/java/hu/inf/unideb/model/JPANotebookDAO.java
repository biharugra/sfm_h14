package hu.inf.unideb.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JPANotebookDAO implements NotebookDAO {

    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("br.com.fredericci.pu");
    private final EntityManager entityManager = entityManagerFactory.createEntityManager();

    @Override
    public void saveNotebook(Notebook a) {
        entityManager.getTransaction().begin();
        entityManager.persist(a);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteNotebook(Notebook a) {
        entityManager.getTransaction().begin();
        entityManager.remove(a);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updateNotebook(Notebook a) {
        saveNotebook(a); //A persist frissít is.
    }

    @Override
    public List<Notebook> getNotebook() {
        TypedQuery<Notebook> query = entityManager.createQuery(
                "SELECT a FROM Notebook a", Notebook.class);
        List<Notebook> notebooks = query.getResultList();
        return notebooks;
    }

    @Override
    public void saveJoin(JoinTable join)
    {
        entityManager.getTransaction().begin();
        entityManager.persist(join);
        entityManager.getTransaction().commit();
    }

    @Override
    public void close() throws Exception {
        entityManager.close();
        entityManagerFactory.close();
    }
}
