package postpracice.postprac.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import postpracice.postprac.domain.Posts;
import postpracice.postprac.service.PostsService;

import java.util.List;

@RequestMapping("/api")
@RestController
public class PostsApiController {
    private final PostsService postService;
    @Autowired
    public PostsApiController(PostsService postService){
        this.postService = postService;

    }
    @PostMapping("/post")
    public Long save(@RequestBody Posts posts){
        return postService.save(posts);
    }
    @GetMapping("/post")
    public List<Posts> findAll(){
        return postService.findAll();
    }
}
