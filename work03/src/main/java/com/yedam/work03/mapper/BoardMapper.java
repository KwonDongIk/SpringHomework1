package com.yedam.work03.mapper;

import java.util.List;
import java.util.Map;

import com.yedam.web.model.SearchVO;
import com.yedam.work03.BoardVO;

public interface BoardMapper {
	
	List<BoardVO> findAll(SearchVO search);
	List<Map<String,Object>> findAlltoMap();
	List<BoardVO> getCount();
	int insertboard(BoardVO board);
	int updateboard(BoardVO board);
	int deleteboard(Long bno);
}
