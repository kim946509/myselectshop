package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Folder;
import com.sparta.myselectshop.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
    // select * from folder where user_id = 1 and name in ('1', '2', '3');

    List<Folder> findAllByUser(User user);
}
