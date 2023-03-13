package entitys;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.*;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Introspected
@MappedEntity("user")
public record User(@Id @GeneratedValue @AutoPopulated Long id,
                   @NotBlank String name,
                   @DateCreated LocalDateTime createdDate,
                   @DateUpdated LocalDateTime updatedDate,
                   @Version Long version) {}




