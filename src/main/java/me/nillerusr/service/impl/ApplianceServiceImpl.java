package me.nillerusr.service.impl;

import me.nillerusr.dao.ApplianceDAO;
import me.nillerusr.dao.impl.ApplianceDAOImpl;
import me.nillerusr.entity.Appliance;
import me.nillerusr.entity.criteria.Criteria;
import me.nillerusr.service.ApplianceService;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {
    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();
    @Override
    public List<Appliance> find(Criteria criteria) {
        return applianceDAO.find(criteria);
    }
}
