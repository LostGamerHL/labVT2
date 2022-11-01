package me.nillerusr.main;

import me.nillerusr.dao.ApplianceDAO;
import me.nillerusr.dao.impl.ApplianceDAOImpl;
import me.nillerusr.entity.Appliance;
import me.nillerusr.entity.criteria.Criteria;
import me.nillerusr.service.ApplianceService;
import me.nillerusr.service.impl.ApplianceServiceImpl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (var item: getAllAppileanceByName("Kettle")){
            System.out.println(item);
        }
        System.out.println(getAppilianceWithLowestCost());
    }

    public static List<Appliance> getAllAppileanceByName(String name){
        ApplianceService applianceService = new ApplianceServiceImpl();
        Criteria criteria = new Criteria("Kettle");
        return applianceService.find(criteria);
    }

    public static Appliance getAppilianceWithLowestCost(){
        ApplianceService applianceService = new ApplianceServiceImpl();
        Criteria criteria = new Criteria("");
        List<Appliance> allAppiliances = applianceService.find(criteria);
        allAppiliances.sort(Comparator.comparing(Appliance::getPrice));
        return allAppiliances.get(0);
    }
}