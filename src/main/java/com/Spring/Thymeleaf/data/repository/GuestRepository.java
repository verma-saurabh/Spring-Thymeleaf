package com.Spring.Thymeleaf.data.repository;

import com.Spring.Thymeleaf.data.entity.Guest;
import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends PagingAndSortingRepository<Guest, Long> {

}