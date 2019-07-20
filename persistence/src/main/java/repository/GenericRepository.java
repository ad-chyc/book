package repository;

import javax.persistence.*;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Queue;

public abstract class GenericRepository<T, K> {

    static EntityManager em;
    protected final EntityManagerFactory emf;
    protected final Class<T> entityClass;

    @SuppressWarnings("unchecked")
    protected GenericRepository() {
        this.emf = Persistence.createEntityManagerFactory("examplePersistenceUnit");
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];

        em = emf.createEntityManager();
    }

    public void create(T entity) {
        EntityTransaction transaction = null;
        try {
            transaction = em.getTransaction();
            transaction.begin();
            em.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    public T read(K id) {
        return em.find(entityClass, id);
    }

    public void update(T entity) {
        EntityTransaction transaction = null;
        try {
            transaction = em.getTransaction();
            transaction.begin();
            em.merge(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    public void delete(T entity) {
        EntityTransaction transaction = null;
        try {
            transaction = em.getTransaction();
            transaction.begin();
            em.remove(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    public List<T> getEntityList() {

        Query query = em.createQuery("from " + entityClass.getName());

        return query.getResultList();

    }

}
