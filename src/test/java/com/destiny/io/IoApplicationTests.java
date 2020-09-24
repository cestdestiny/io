package com.destiny.io;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
public class IoApplicationTests {

	@Test
	public void contextLoads() {

	}

	public static void main(String[] args) {
		Date date = new Date();
		Integer dateInt = Integer.valueOf(String.valueOf(date.getTime()).substring(0, 10));

		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(date));
		System.out.println(dateInt);
		System.out.println(date.getTime());
		StringBuffer sb = new StringBuffer(dateInt.toString()).append("000");
		System.out.println(sb.toString());

		Date date1 = new Date(Long.valueOf(sb.toString()));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(date1));
		System.out.println(Integer.valueOf("10000000000"));
//		Date date = new Date(15368974851L);
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss").format(date));
	}

}
