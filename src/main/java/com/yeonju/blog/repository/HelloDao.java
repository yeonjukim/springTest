package com.yeonju.blog.repository;

import com.yeonju.blog.model.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by yeonju on 2016-06-30.
 */
public interface HelloDao extends JpaRepository<Hello, Integer> {

}