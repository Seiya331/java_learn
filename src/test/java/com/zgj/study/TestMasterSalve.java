/**
 * Copyright (C), 2015-2019, 瓜子二手车
 * FileName: TestMasterSalve
 * Author: zgj
 * Date: 2019/11/6 11:52
 * Description: 打造逐层
 */
package com.zgj.study;

import com.zgj.study.entity.MiMessage;
import com.zgj.study.entity.User;
import com.zgj.study.mapper.MiMessageMapper;
import com.zgj.study.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 〈打造主从〉
 *  @author zgj
 * @create 2019/11/6
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMasterSalve {
    @Autowired
    private  MiMessageMapper miMessageMapper;
    @Autowired
    private UserMapper userMapper;
    @Test
    public void useSalve(){
        MiMessage miMessage = miMessageMapper.selectById(1);
        System.out.println(miMessage);
    }
    @Test
    public void useMaster(){
        MiMessage miMessage = new MiMessage();
        miMessage.setMiDes("eeee");
        miMessage.setMiName("测试写入");
        miMessageMapper.insert(miMessage);

    }
    @Test
    public void useLearnSalve(){
        User user = userMapper.selectById(1);
        System.out.println(user);
    }
}
