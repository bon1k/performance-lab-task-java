package org.example.task1.animal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.task1.service.IRun;
import org.example.task1.service.ISwim;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Animal implements IRun, ISwim {
    private String name;
}
