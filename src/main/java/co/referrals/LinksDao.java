package co.referrals;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class LinksDao {

	@PersistenceContext
	private EntityManager em;

	public List<Link> findAll() {
		return em.createQuery("FROM Link order by clicks", Link.class).getResultList();
	}

	public void create(Link link) {
		em.persist(link);
	}

	public void delete(Long id) {
		em.remove(em.getReference(Link.class, id));
	}

}
