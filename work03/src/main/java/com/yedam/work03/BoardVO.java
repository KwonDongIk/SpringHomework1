	package com.yedam.work03;
	
	import java.util.Date;
	
	import com.yedam.web.model.Employees;
	
	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;
	
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public class BoardVO {
		
		private Long bno;
		private String title;
		private String content;
		private String writer;
		private Date regdate;
		private Date updateDate;
	
	}
