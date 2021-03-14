package sweater.repos;

import org.springframework.data.repository.CrudRepository;
import sweater.domain.Message;

public interface MessageRepo extends CrudRepository <Message, Integer> {
}
