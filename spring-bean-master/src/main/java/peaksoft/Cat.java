package peaksoft;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Cat {
    @Value("Meow")
    private String name;
    @Value("black")
    private String color;


}
