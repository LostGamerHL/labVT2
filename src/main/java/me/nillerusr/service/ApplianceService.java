package me.nillerusr.service;

import me.nillerusr.entity.Appliance;
import me.nillerusr.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {
    List<Appliance> find(Criteria criteria);
}
