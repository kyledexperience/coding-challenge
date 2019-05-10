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

	public Link findbyTitle(String title) {
		return (Link) em.createQuery("FROM Link WHERE title = :title1").setParameter("title1", title).getSingleResult();
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

	public void updateClick(Long id, Integer clicks) {
		findById(id).setClicks(clicks + 1);
		em.merge(findById(id));
	}

}
