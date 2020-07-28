package life.decafe.api.service.impl;

import life.decafe.api.model.entity.Hotel;
import life.decafe.api.model.mapper.BeanMapper;
import life.decafe.api.model.rest.HotelDto;
import life.decafe.api.repository.HotelRepository;
import life.decafe.api.service.HotelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultHotelService implements HotelService {
  private static final Logger LOGGER = LoggerFactory.getLogger(DefaultHotelService.class);
  private final HotelRepository hotelRepository;
  private final BeanMapper beanMapper;

  @Autowired
  public DefaultHotelService(HotelRepository hotelRepository, BeanMapper beanMapper){
    this.hotelRepository = hotelRepository;
    this.beanMapper = beanMapper;
  }

  @Override
  public HotelDto createHotel(HotelDto hotel) {
    LOGGER.debug("Create a hotel");
    Hotel hotelCreated = hotelRepository.save(beanMapper.map(hotel));
    return beanMapper.map(hotelCreated);
  }

  @Override
  public Optional<Hotel> findHotelById(Long hotelId) {
    LOGGER.debug("Find a hotel by Id={}", hotelId);
    return hotelRepository.findById(hotelId);
  }

  @Override
  public List<Hotel> findAllHotels() {
    LOGGER.debug("Find all hotels");
    return hotelRepository.findAll();
  }

  @Override
  public Long countHotels() {
    LOGGER.debug("Count all hotels");
    return hotelRepository.count();
  }

  @Override
  public Void deleteById(Long hotelId) {
    LOGGER.debug("Delete hotel by Id");
    hotelRepository.deleteById(hotelId);
    return null;
  }

  @Override
  public Hotel updateHotel(Hotel hotel) {
    LOGGER.debug("Update hotel");
    return hotelRepository.save(hotel);
  }
}
