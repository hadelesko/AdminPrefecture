package data;

import models.GestionPrefecture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface GestionDao extends CrudRepository<GestionPrefecture, Integer> {
}
