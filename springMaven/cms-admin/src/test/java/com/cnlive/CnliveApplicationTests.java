package com.cnlive;

import com.alibaba.fastjson.JSON;
import com.cnlive.dao.CnliveHomeBean;
import com.cnlive.servers.CnliveHomeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CnliveApplicationTests {

	@Autowired
	private CnliveHomeService cnliveHomeService;

	@Test
	public void contextLoads() {

	}

	@Test
	public void testAction() {
		System.out.println("插入");
		CnliveHomeBean bean = new CnliveHomeBean();
		bean.setId(4);
		bean.setName("王五s");
		bean.setPwd("666666s");
		bean.setHome("上海s");
		bean.setInfo("上海土著s");
		bean.setSex("未知s");

		cnliveHomeService.insertHome(bean);
	}

	@Test
	public void testUpdateAction() {
		System.out.println("更新");
		cnliveHomeService.updataHome("王五",2);
	}

	@Test
	public void selectAllAction(){
	    System.out.println("查找全部");

        List<CnliveHomeBean> list = cnliveHomeService.selectHomeBean();
        String jsonString = JSON.toJSONString(list);
        System.out.println("获取的数据"+jsonString);
    }

    @Test
    public void selectById(){
	    System.out.println("通过 ID 查找用户");

	    CnliveHomeBean bean = cnliveHomeService.selectById(2);

	    System.out.println("id为2时的数据"+JSON.toJSONString(bean));
    }


    @Test
    public void delectByName(){
	    System.out.println("删除");
	    cnliveHomeService.delectByName("武松");
    }


}
