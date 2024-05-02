package com.vti.frontend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.GroupController;
import com.vti.entiy.Group;
import com.vti.utils.ScannerUtils;

public class GroupFunction {

	public static void getListGroups() {
		try {
			GroupController groupCon = new GroupController();
			List<Group> listGroup = groupCon.getListGroups();
			System.out.println("===============================List Group=================================");
			for (Group g : listGroup) {
				System.out.println(g);
			}
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void createGroup() {
		try {
			GroupController groupCon = new GroupController();
			int id = ScannerUtils.inputId("Input group id: ");
			String name = ScannerUtils.inputName("Input group name: ");
			Group group = new Group(id, name);
			if (groupCon.createGroup(group)) {
				System.out.println("Create new a group successful!");
			} else {
				System.out.println("Create new a group fail!");
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
	}
}
