package com.post.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.post.model.Post;
import com.post.service.PostService;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;

import static org.springframework.http.ResponseEntity.ok;

@Controller
public class MyController {

    @Autowired
    private PostService postService;

    @GetMapping(value="/posts")
    public ResponseEntity<Set<Post>> all() {
        return ok().body(postService.all());
    }

    @PostMapping(value = "/posts")
    public ResponseEntity<Post> createPost(HttpServletRequest request,
                                        UriComponentsBuilder uriComponentsBuilder) {

        var content = request.getParameter("content");

        var post = new Post();
        post.setContent(content);

        post = postService.save(post);

        UriComponents uriComponents =
                uriComponentsBuilder.path("/posts/{id}").buildAndExpand(post.getId());
        var location = uriComponents.toUri();

        return ResponseEntity.created(location).build();
    }
}