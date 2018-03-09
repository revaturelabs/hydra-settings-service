package com.revature.hydra.settingService.beans.dao;

import com.revature.assignforcecommon.dao.BaseRepository;
import com.revature.hydra.settingService.beans.Setting;

import org.springframework.stereotype.Repository;

/**
 * Created by lazar on 2/8/2017.
 */
@Repository
public interface SettingRepository extends BaseRepository<Setting, Integer> {
    public Setting findByAlias(String alias);
}
