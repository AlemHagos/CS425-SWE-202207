package com.edu.miu.cs.cs425.mystudentmgmtapp.repository;

import com.edu.miu.cs.cs425.mystudentmgmtapp.model.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRoomRepository extends JpaRepository<ClassRoom,Long> {
}
