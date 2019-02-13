package com.condconv.streaming.sortinghat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
class SortingHat {

    private final StudentRepository studentRepository;
    private final Random random = new Random();

    Flux<Student> sortedStudents() {
        return studentRepository.streamAll()
                .filter(Student::isMagical)
                .map(this::sortStudent);
    }

    private Student sortStudent(Student student) {
        int randomHouseIndex = random.nextInt(House.values().length);
        return student.toBuilder()
                .house(House.values()[randomHouseIndex])
                .build();
    }
}
