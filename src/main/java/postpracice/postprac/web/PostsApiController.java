package postpracice.postprac.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import postpracice.postprac.domain.Posts;
import postpracice.postprac.service.PostsService;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postService;

    @PostMapping("/saveForm/post")
    public Long save(@RequestBody Posts posts){
        return postService.save(posts);
    }
}
