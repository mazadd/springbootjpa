package com.mayahii.spring.boot.repository;

import com.mayahii.spring.boot.bean.Forum;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by root on 31/08/16.
 */
public interface ForumRepository extends CrudRepository<Forum,Long>{
    public Forum findForumById(long id);
}
