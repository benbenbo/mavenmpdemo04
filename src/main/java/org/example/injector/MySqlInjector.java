package org.example.injector;

import com.baomidou.mybatisplus.entity.TableInfo;
import com.baomidou.mybatisplus.mapper.AutoSqlInjector;
import org.apache.ibatis.builder.MapperBuilderAssistant;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.mapper.EmployeeMapper;

public class MySqlInjector extends AutoSqlInjector {
    @Override
    public void inject(Configuration configuration, MapperBuilderAssistant builderAssistant, Class<?> mapperClass, Class<?> modelClass, TableInfo table) {
        //将EmployeeMapper的deleteAll处理成对应的MappedStatement对象
        //加入到configuration对象。

        //1.获取SQL语句
        String sql="delete from "+table.getTableName();
        //2.注入的方法名，一定要与Mapper接口中的方法名一致
        String methodName="deleteAll";
        //3.构造SqlSource对象
        SqlSource sqlSource=languageDriver.createSqlSource(configuration,sql, modelClass);
        //4.根据sql类型，调用addxxx方法加入mappedStatement
        this.addDeleteMappedStatement(mapperClass,methodName,sqlSource);
    }
}
