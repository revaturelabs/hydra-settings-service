# hydra-settings-service

## Important note: There was a settingService, and  settingsService 
 The two services were very similar with the same commit date so I couldn't tell which one is the one we needed or if we needed both.
 This receives its code from settingService.
 The service request mapping to ("/api/v2/setting") and use MediaType.APPLICAION_JSON_VALUE
Implements CRUD operations for Settings.
Create a Settings
Retrieve Settings object by settingsId and Global Settings which retrieves all settings.
Update a setting
Delete a setting through the sessionId
