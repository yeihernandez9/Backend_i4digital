package co.com.digital4.r2dbc;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("citas")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column("id")

    private Integer id;
    @Column("name")
    private String name;
    @Column("description")
    private String description;
    @Column("duration_minutes")
    private Integer duration_minutes;
    @Column("color_hex_code")
    private String color_hex_code;
}
