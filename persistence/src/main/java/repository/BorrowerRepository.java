package repository;

import model.Borrower;

import javax.persistence.EntityManager;

public class BorrowerRepository extends GenericRepository<Borrower,Long> {
    protected BorrowerRepository() {

    }
}
