package life.decafe.api.service;

import life.decafe.api.model.entity.Profile;
import life.decafe.api.model.rest.ProfileDto;

import java.util.List;
import java.util.Optional;

public interface ProfileService {

  /**
   * Create new profile
   * @param profile
   * @return newly created profile
   */
  ProfileDto createProfile(ProfileDto profile);

  /**
   * Find all profiles
   * @param
   * @return List of profiles
   */

  List<ProfileDto> findAllProfiles();

  /**
   * Find profile by its Id
   * @param profileId profile Id
   * @return profile if exists, empty optional otherwise
   */
  Optional<ProfileDto> findProfileById(Long profileId);

  /**
   * Delete profile by it's Id
   * @param ProfileId profile Id
   * @return
   */
  void deleteProfileById(Long ProfileId);

  /**
   * Update profile
   * @param profile
   * @return updated profile
   */

  ProfileDto updateProfile(ProfileDto profile);
}
