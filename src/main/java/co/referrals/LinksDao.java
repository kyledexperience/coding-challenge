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
		return em.createQuery("FROM Link order by clicks DESC", Link.class).getResultList();
	}

	public Link findById(Long id) {
		return em.find(Link.class, id);

	}

	public void create(Link link) {
		em.persist(link);
	}

	public void delete(Long id) {
		em.remove(em.getReference(Link.class, id));
	}

	public void update(Link link) {
		em.merge(link);
	}

}
