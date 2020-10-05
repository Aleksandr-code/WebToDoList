package kz.webtodolist.v1.Repositories;

import kz.webtodolist.v1.User;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<User, Integer> {

}
