package kz.webtodolist.v1.Repositories;

import kz.webtodolist.v1.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
