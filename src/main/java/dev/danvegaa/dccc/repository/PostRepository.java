package dev.danvegaa.dccc.repository;

import dev.danvegaa.dccc.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Integer> {
}
