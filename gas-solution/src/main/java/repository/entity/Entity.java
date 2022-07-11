package repository.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Entity {

    private long id;
    private LocalDateTime insertTime;
    private LocalDateTime updateTime;
}
