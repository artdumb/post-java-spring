package postpracice.postprac.repository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import postpracice.postprac.domain.Posts;
import static org.assertj.core.api.Assertions.*;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;
    @After
    public  void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void 게시물등록_불러오기테스트(){
        //given
        String title = "테스트게시물";
        String content = "테스트본문";
        Posts posts = new Posts();
        posts.setAuthor("공태훈");
        posts.setTitle(title);
        posts.setContent(content);
        postsRepository.save(posts);

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts resultpost = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
    }

}
