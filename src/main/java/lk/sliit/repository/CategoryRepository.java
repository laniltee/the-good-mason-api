package lk.sliit.repository;

import lk.sliit.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Lanil Marasinghe on 15-Oct-17.
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
