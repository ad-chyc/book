package repository;

import javax.persistence.EntityManager;

public class BorrowerDetailsRepository extends GenericRepository<BorrowerDetailsRepository,Long> {
    protected BorrowerDetailsRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
