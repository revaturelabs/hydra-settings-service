# hydra-settings-service

## Important note: There was a settingService, and  settingsService 
## Not even sure if this service was working previously, it was left out of dev branch by the last batch who worked on it
 The two services were very similar with the same commit date so I couldn't tell which one is the one we needed or if we needed both.
 This receives its code from settingService.
 The service request mapping to ("/api/v2/setting") and use MediaType.APPLICAION_JSON_VALUE
1. Implements CRUD operations for Settings.
 1.Create a Settings
 2.Retrieve Settings object by settingsId and Global Settings which retrieves all settings.
 3.Update a setting
 4.Delete a setting through the sessionId
