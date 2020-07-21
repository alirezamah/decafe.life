package life.decafe.api.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Booking {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @EqualsAndHashCode.Include
  @Schema(description = "Unique Id of this booking", example = "123456", accessMode = Schema.AccessMode.READ_ONLY)
  private Long id;
  @Schema(description = "Unique ID of this user", example = "123456")
  private Long userId;
  @Schema(description = "Check in date", example = "2020-09-19")
  private LocalDate checkInDate;
  @Schema(description = "Check out date", example = "2020-10-19")
  private LocalDate checkOutDate;
  @Schema(description = "Unique Id for this hotel", example = "123456")
  private Long hotelId;
  @Schema(description = "Unique Id for this room", example = "123456")
  private Long roomId;
  @Schema(description = "Registered time and date of data", example = "2020-03-03 19:20:20.994", accessMode = Schema.AccessMode.READ_ONLY)
  private LocalDateTime Registered;
  @Schema(description = "Updated time and date of data", example = "2020-03-03 19:20:20.994", accessMode = Schema.AccessMode.READ_ONLY)
  private LocalDateTime Updated;
}
