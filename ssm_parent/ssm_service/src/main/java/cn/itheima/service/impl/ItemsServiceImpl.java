package cn.itheima.service.impl;

import cn.itheima.damain.Items;
import cn.itheima.dao.ItemsDao;
import cn.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public Items findById(int id) {
        return itemsDao.find(id);
    }
}
