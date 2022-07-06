package com.edu.miu.cs.cs425.mystudentmgmtapp;

import com.edu.miu.cs.cs425.mystudentmgmtapp.model.ClassRoom;
import com.edu.miu.cs.cs425.mystudentmgmtapp.model.Student;
import com.edu.miu.cs.cs425.mystudentmgmtapp.model.Transcript;
import com.edu.miu.cs.cs425.mystudentmgmtapp.repository.ClassRoomRepository;
import com.edu.miu.cs.cs425.mystudentmgmtapp.repository.StudentRepository;
import com.edu.miu.cs.cs425.mystudentmgmtapp.repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {
   @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private TranscriptRepository transcriptRepository;
    @Autowired
    private ClassRoomRepository classRoomRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtAppApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World Spring Boot !");
        Student anna = new Student(null, "000-61-0001", "Anna",
                "Lynn", "Smith",3.45, LocalDate.of(2019,5,24 ));
        studentRepository.save(anna);
        Student john = new Student(null, "000-61-0002", "John",
                "Charles", "Don",3.65, LocalDate.of(2020,8,21 ));
        studentRepository.save(john);
        Student abraham = new Student(null, "000-61-0003", "Abraham",
                "Dawit", "Solomon",3.86, LocalDate.of(2021,10,15 ));
        studentRepository.save(abraham);
        Student marta = new Student(null, "000-61-0004", "Marta",
                "Hailu", "Markos",3.75, LocalDate.of(2022,9,12 ));
        studentRepository.save(marta);

        Transcript transcript1 = new Transcript(null,"Bsc Computer Science");
        transcriptRepository.save(transcript1);
        Transcript transcript2 = new Transcript(null,"Msc SoftWare Development");
        transcriptRepository.save(transcript2);
        Transcript transcript3 = new Transcript(null,"Msc Computer Science");
        transcriptRepository.save(transcript3);

        ClassRoom classRoom1 = new ClassRoom(null,"McLaughlin building", "M105");
        classRoomRepository.save(classRoom1);
        ClassRoom classRoom2 = new ClassRoom(null,"Verill building", "V42");
        classRoomRepository.save(classRoom2);
        ClassRoom classRoom3 = new ClassRoom(null,"Verril building", "V17");
        classRoomRepository.save(classRoom3);
        System.out.println("End of execution");
    }
}
