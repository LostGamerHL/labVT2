package me.nillerusr.dao;

import me.nillerusr.entity.Appliance;
import me.nillerusr.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO
{
    List<Appliance> find(Criteria criteria);
}
