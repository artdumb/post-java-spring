package postpracice.postprac.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import postpracice.postprac.domain.Posts;
import postpracice.postprac.repository.PostsRepository;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(Posts posts){
        return postsRepository.save(posts).getId();
    }
}
