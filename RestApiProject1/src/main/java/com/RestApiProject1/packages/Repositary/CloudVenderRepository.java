package com.RestApiProject1.packages.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import com.RestApiProject1.packages.Model.CloudVender;

public interface CloudVenderRepository extends JpaRepository<CloudVender, Long> {

}
