package com.revature.hydra.settingService.beans.data;

import com.revature.assignforcecommon.dao.BaseRepository;
import com.revature.beans.Setting;

import org.springframework.stereotype.Repository;

/**
 * Created by lazar on 2/8/2017.
 */
@Repository
public interface SettingRepository extends BaseRepository<Setting, Integer> {
    public Setting findByAlias(String alias);
}