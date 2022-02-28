package emlakburada.repository;

import emlakburada.dto.EmailMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository  extends JpaRepository<EmailMessage,Integer> {
}
