package postpracice.postprac.service;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import postpracice.postprac.domain.Posts;
import postpracice.postprac.repository.PostsRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PostsService {
    private final PostsRepository postsRepository;


    @Autowired
    public PostsService(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    @Transactional
    public Long save(Posts posts){
        return postsRepository.save(posts).getId();
    }
    @Transactional
    public List<Posts> findAll() {

        List<Posts> list = postsRepository.findAll();
        return list;
    }


}


