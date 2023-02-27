package com.arvind.fileprocessing.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.arvind.fileprocessing.model.User;
import com.arvind.fileprocessing.util.ExcelHelper;

class GenerateSheetTest {

	@Test
	void test() {
		List<User> obj = new ArrayList<>();
		obj.add(new User("1", "john", "abc", "john@123"));
		obj.add(new User("2", "kevinn", "cde", "kevinn@123"));
		obj.add(new User("3", "alex", "fgh", "alex@123"));
		obj.add(new User("4", "bob", "suv", "bob@123"));
		ExcelHelper.UsersToExcel(obj);
	}

}
