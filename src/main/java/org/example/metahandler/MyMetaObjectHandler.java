package org.example.metahandler;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

public class MyMetaObjectHandler extends MetaObjectHandler {
    /**
     * 插入操作自动填充
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        //获取到需要被填充的字段的值
        Object name = getFieldValByName("name", metaObject);
        if(name==null){
            System.out.println("==========插入操作满足填充条件");
            setFieldValByName("name","wufeng",metaObject);
        }
    }

    /**
     * 修改操作自动填充
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        //获取到需要被填充的字段的值
        Object name = getFieldValByName("name", metaObject);
        if(name==null){
            System.out.println("==========修改操作满足填充条件");
            setFieldValByName("name","wufengyi",metaObject);
        }
    }
}
