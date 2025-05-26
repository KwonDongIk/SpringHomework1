package com.yedam.work03;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.web.model.Employees;
import com.yedam.work03.mapper.BoardMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/datasource-context.xml", "classpath:/spring/mybatis-context.xml"})
public class BoardMapperTest {
	
	@Autowired BoardMapper boardMapper;

	//@Test
	public void insertboard() {
		BoardVO board = BoardVO.builder()
				.bno((long) 3)
				.title("몽골 여행")
				.content("7월이 좋아요")
				.writer("user03")
				.regdate(new Date())
				.updateDate(new Date())
				.build();
		int result = boardMapper.insertboard(board);
		System.out.println(result);
	}
	
	//@Test
	public void updateboard() {
		BoardVO board = new BoardVO();
		board.setBno((long) 3);
		board.setContent("아무때나 좋아요.");
		int result = boardMapper.updateboard(board);
		System.out.println(result);
	}
	
	@Test
	public void delete() {
		int result = boardMapper.deleteboard((long) 1);
		System.out.println(result);
	}
}
