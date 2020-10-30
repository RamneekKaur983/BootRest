package com.javaadvent.bootrest;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.util.StringUtils;
import static com.javaadvent.bootrest.PreCondition.isTrue;
import static com.javaadvent.bootrest.PreCondition.notEmpty;
import static com.javaadvent.bootrest.PreCondition.notNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Todo {
    static final int MAX_LENGTH_DESCRIPTION = 500;
    static final int MAX_LENGTH_TITLE = 100;

    @Id
    private String id;

    private String description;

    private String title;

    public void update(String title, String description) {
        checkTitleAndDescription(title, description);

        this.title = title;
        this.description = description;
    }





    private void checkTitleAndDescription(String title, String description) {
        notNull(title, "Title cannot be null");
        notEmpty(title  ,"Titlte cannot be empty");

        isTrue(
                title.length() <= MAX_LENGTH_TITLE, "Title cannot be longer than %d characters" ,  MAX_LENGTH_TITLE
                );

        if (description != null) {
            isTrue(description.length() <= MAX_LENGTH_DESCRIPTION, "Description cannot be longer than %d characters" ,    MAX_LENGTH_DESCRIPTION
                        );
        }
    }



}
