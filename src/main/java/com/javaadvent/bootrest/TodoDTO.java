package com.javaadvent.bootrest;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;
@Data
public class TodoDTO {
    private String id;

    @Size(max = Todo.MAX_LENGTH_DESCRIPTION)
    private String description;

    @NotEmpty
    @Size(max = Todo.MAX_LENGTH_TITLE)
    private String title;


}
