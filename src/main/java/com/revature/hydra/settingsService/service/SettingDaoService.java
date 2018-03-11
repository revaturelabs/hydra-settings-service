package com.revature.hydra.settingsService.service;

import com.revature.beans.Setting;
import com.revature.hydra.settingsService.beans.data.SettingRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lazar on 2/8/2017.
 */
@Transactional
@Service
public class SettingDaoService extends DaoService<Setting, Integer>{

    public Setting getGlobalSettings(){
        SettingRepository dao = (SettingRepository) repo;
        return dao.findByAlias("global");
    }
}
