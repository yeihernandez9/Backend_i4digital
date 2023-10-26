package co.com.digital4.model.cita;
import lombok.*;
//import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@NoArgsConstructor
@ToString
public class CitaM {
    private Integer id;
    private String name;
    private String description;
    private Integer duration_minutes;
    private String color_hex_code;
}
