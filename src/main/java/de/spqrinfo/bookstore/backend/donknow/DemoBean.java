package de.spqrinfo.bookstore.backend.donknow;

import de.spqrinfo.bookstore.backend.entity.Category;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
@Named
public class DemoBean {

    @PersistenceContext
    private EntityManager em;

    public List<Category> getCategories() {
        if (null == this.em) {
            throw new RuntimeException("EntityManager is null!");
        }

        List<Category> tmp = this.em.createQuery("SELECT c FROM Category c", Category.class).getResultList();
        if (null == tmp || 0 == tmp.size()) {
            final Category cat1 = new Category();
            cat1.setName("Category 1");

            this.em.persist(cat1);

            final Category cat2 = new Category();
            cat2.setName("Category 2");

            this.em.persist(cat2);
        }

        return this.em.createQuery("SELECT c FROM Category c", Category.class).getResultList();
    }

    public String getName() {
        return "Marcus";
    }

    public int getAge() {
        return 39;
    }
}
