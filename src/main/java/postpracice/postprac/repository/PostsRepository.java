package postpracice.postprac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import postpracice.postprac.domain.Posts;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
