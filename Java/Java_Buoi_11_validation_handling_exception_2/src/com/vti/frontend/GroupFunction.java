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
			String name = ScannerUtils.inputName("Input group name: ");
			if (!groupCon.isGroupExists(name)) {
				Group group = new Group(name);
				if (groupCon.createGroup(group)) {
					System.out.println("Create new a group successful!");
				} else {
					System.out.println("Create new a group fail!");
				}
			} else {
				System.out.println("Group already exists!!!");
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void updateGroup() {
		try {
			GroupController groupCon = new GroupController();
			int id = ScannerUtils.inputId("Input id of group you want update: ");
			if (groupCon.isGroupIdExists(id)) {
				String name = ScannerUtils.inputName("Input new name you want update: ");
				Group group = new Group(name);
				if (groupCon.updateGroupById(group, id)) {
					System.out.println("Update new a group successful!");
				} else {
					System.out.println("Update new a group fail!");
				}
			} else {
				System.out.println("Group not exitst!!!");
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteGroup() {
		try {
			GroupController groupCon = new GroupController();
			int id = ScannerUtils.inputId("Input id of group you want delete: ");
			if (groupCon.isGroupIdExists(id)) {
				if (groupCon.deleteGroupById(id)) {
					System.out.println("Delete new a group successful!");
				} else {
					System.out.println("Delete new a group fail!");
				}
			} else {
				System.out.println("Group not exitst!!!");
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
	}
}
