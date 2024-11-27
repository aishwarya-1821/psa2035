package com.crm.repository;

import com.crm.entity.Comment;
import com.crm.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}