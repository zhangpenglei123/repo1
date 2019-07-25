package cn.itheima.dao;

import cn.itheima.damain.Items;
import org.apache.ibatis.annotations.Select;

public interface ItemsDao {

    @Select("select * from items where id = #{id}")
    public Items find(int id);
}
