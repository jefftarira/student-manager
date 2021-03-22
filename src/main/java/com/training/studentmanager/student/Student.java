package com.training.studentmanager.student;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
  private Long id;
  private String name;
  private String email;
  private Gender gender;
}
