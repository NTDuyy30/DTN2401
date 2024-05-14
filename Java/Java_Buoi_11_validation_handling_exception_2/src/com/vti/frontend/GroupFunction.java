package com.vti.frontend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.GroupController;
import com.vti.entiy.Group;
import com.vti.utils.ScannerUtils;

public class GroupFunction {
//	Get list group
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

//	Create a new group
	public static void createGroup() {
		try {
			GroupController groupCon = new GroupController();
			String name = null;
			while (true) {
				name = ScannerUtils.inputName("Input group name: ");
				if (groupCon.isGroupExists(name)) {
					System.out.println("Please enter group name again because it already exists: ");
				} else {
					break;
				}
			}
			Group group = new Group(name);
			if (groupCon.createGroup(group)) {
				System.out.println("Create new a group successful!");
			} else {
				System.out.println("Create new a group fail!");
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
	}

//	Update group by id
	public static void updateGroup() {
		try {
			GroupController groupCon = new GroupController();
			int id = -1;
			while (true) {
				id = ScannerUtils.inputId("Input id of group you want update: ");
				if (!groupCon.isGroupIdExists(id)) {
					System.out.println("Please enter id again because it not exists: ");
				} else {
					break;
				}
			}
			String name = ScannerUtils.inputName("Input new name you want update: ");
			Group group = new Group(name);
			if (groupCon.updateGroupById(group, id)) {
				System.out.println("Update new a group successful!");
			} else {
				System.out.println("Update new a group fail!");
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
	}

//	Delete group by id
	public static void deleteGroup() {
		try {
			GroupController groupCon = new GroupController();
			int id = -1;
			while (true) {
				id = ScannerUtils.inputId("Input id of group you want delete: ");
				if (!groupCon.isGroupIdExists(id)) {
					System.out.println("Please enter id again because it not exists: ");
				} else {
					break;
				}
			}
			if (groupCon.deleteGroupById(id)) {
				System.out.println("Delete new a group successful!");
			} else {
				System.out.println("Delete new a group fail!");
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
	}

//	Update group by id with Procedure
	public static void updateGroupWithProcedure() {
		try {
			GroupController groupCon = new GroupController();
			int id = -1;
			while (true) {
				id = ScannerUtils.inputId("Input id of group you want update: ");
				if (!groupCon.isGroupIdExists(id)) {
					System.out.println("Please enter id again because it not exists: ");
				} else {
					break;
				}
			}
			String name = ScannerUtils.inputName("Input new name you want update: ");
			Group group = new Group(name);
			if (groupCon.updateGroupByIdWithProcedure(group, id)) {
				System.out.println("Update new a group successful!");
			} else {
				System.out.println("Update new a group fail!");
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
	}
}
