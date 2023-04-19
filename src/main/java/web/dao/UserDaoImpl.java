package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getlistUsers() {
        TypedQuery<User> query = (TypedQuery<User>) entityManager.createQuery("from User ");
        return query.getResultList();
    }
    @Override
    public void add(User user) {
        entityManager.persist(user);
    }
    @Override
    public void update(User user) {
        entityManager.merge(user);
    }
    @Override
    public void delete(long id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
    @Override
    public void showId(long id) {
        entityManager.find(User.class, id);
    }


}
