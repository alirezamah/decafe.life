package life.decafe.api.controller;

import life.decafe.api.model.entity.Room;
import life.decafe.api.model.entity.RoomType;
import life.decafe.api.repository.RoomTypeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roomtype")
public class RoomTypeController {
  private static final Logger LOGGER = LoggerFactory.getLogger(RoomTypeController.class);
  private final RoomTypeRepository roomTypeRepository;

  @Autowired
  public RoomTypeController(RoomTypeRepository roomTypeRepository) { this.roomTypeRepository = roomTypeRepository; }

  @GetMapping(value = "/countRoomTypes")
  public ResponseEntity<Long> countRoomTypes() {
    LOGGER.info("Counting number of roomTypes");
    Long countRoomTypes = roomTypeRepository.count();
    return ResponseEntity.ok(countRoomTypes);
  }
}
