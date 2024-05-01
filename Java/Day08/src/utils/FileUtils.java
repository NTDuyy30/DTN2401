package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

public class FileUtils {
	public static final String FILE_EXISTS = "Error! File is Exist.";
	public static final String FILE_NOT_EXISTS = "Error! File is not Exist.";
	public static final String FOLDER_EXISTS = "Error! Folder is Exist.";
	public static final String FOLDER_NOT_EXISTS = "Error! Folder is not Exist.";
	public static final String PATH_NOT_FOLDER = "Error! Path is not folder.";
	public static final String CREATE_FILE_SUCCESS = "Create file success!";
	public static final String CREATE_FILE_FAIL = "Create file fail!";
	public static final String DELETE_FILE_SUCCESS = "Delete file success!";
	public static final String DELETE_FILE_FAIL = "Delete file fail!";
	public static final String SOURCE_FILE_NOT_EXISTS = "Source File is not exits!";
	public static final String DESTINATION_FILE_EXISTS = "Destination File is exits!";
	public static final String NEW_FILE_EXISTS = "Error! New File Exist.";
	public static final String WRITE_FILE_SUCCESS = "Write file success!";
	public static final String READ_FILE_SUCCESS = "Read file success!";

//	check file is exists
	public static boolean isFileExists(String pathFile) {
		return new File(pathFile).exists();
	}

//	create new file
	public static void createNewFile(String pathFile) throws Exception {
		if (isFileExists(pathFile)) {
			throw new Exception(FILE_EXISTS);
		} else {
			System.out.println(new File(pathFile).createNewFile() ? CREATE_FILE_SUCCESS : CREATE_FILE_FAIL);
		}
	}

	public static void createNewFile(String path, String fileName) throws Exception {
		String fullPath = path + "\\" + fileName;
		if (isFileExists(fullPath)) {
			throw new Exception(FILE_EXISTS);
		} else {
			System.out.println(new File(fullPath).createNewFile() ? CREATE_FILE_SUCCESS : CREATE_FILE_FAIL);
		}
	}

//	delete file
	public static void deleteFile(String pathFile) throws Exception {
		if (!isFileExists(pathFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		} else {
			System.out.println(new File(pathFile).delete() ? DELETE_FILE_SUCCESS : DELETE_FILE_FAIL);
		}
	}

//	check is file
	public static boolean isFile(String path) throws Exception {
		if (!isFileExists(path)) {
			throw new Exception(FILE_NOT_EXISTS);
		} else {
			return new File(path).isFile();
		}
	}

//	check is folder
	public static boolean isFolder(String path) throws Exception {
		if (!isFileExists(path)) {
			throw new Exception(FOLDER_NOT_EXISTS);
		} else {
			return new File(path).isDirectory();
		}
	}

//	get all file name
	public static String[] getAllFileName(String path) throws Exception {
		if (!isFolder(path)) {
			System.out.println(PATH_NOT_FOLDER);
			return null;
		} else {
			return new File(path).list();
		}
	}

//	copy file
	public static void copyFile(String sourceFile, String newPath) throws Exception {
		if (!isFileExists(sourceFile)) {
			throw new Exception(SOURCE_FILE_NOT_EXISTS);
		}

		String[] s = sourceFile.split("\\\\");
		String nameFile = s[s.length - 1];
		String destinationFile = newPath + "\\" + nameFile;

		if (isFileExists(destinationFile)) {
			throw new Exception(DESTINATION_FILE_EXISTS);
		}

		File source = new File(sourceFile);
		File dest = new File(destinationFile);

		Files.copy(source.toPath(), dest.toPath());
	}

	public static void copyFile(String sourceFile, String destinationPath, String newName) throws Exception {
		if (!isFileExists(sourceFile)) {
			throw new Exception(SOURCE_FILE_NOT_EXISTS);
		}

		String destinationFile = destinationPath + "\\" + newName;

		if (isFileExists(destinationFile)) {
			throw new Exception(DESTINATION_FILE_EXISTS);
		}

		File source = new File(sourceFile);
		File dest = new File(destinationFile);

		Files.copy(source.toPath(), dest.toPath());
	}

//	moving file
	public static void moveFile(String sourceFile, String destinationPath) throws Exception {
		if (!isFileExists(sourceFile)) {
			throw new Exception(SOURCE_FILE_NOT_EXISTS);
		}

		String[] s = sourceFile.split("\\\\");
		String nameFile = s[s.length - 1];

		String destinationFile = destinationPath + "//" + nameFile;

		if (!isFolder(destinationPath)) {
			System.out.println(PATH_NOT_FOLDER);
		} else {
			File source = new File(sourceFile);
			File dest = new File(destinationFile);
			Files.move(source.toPath(), dest.toPath());
		}
	}

//	rename file
	public static void renameFile(String pathFile, String newName) throws Exception {

		if (!isFileExists(pathFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		}

		if (isFileExists(newName)) {
			throw new Exception(NEW_FILE_EXISTS);
		}
		File oldFile = new File(pathFile);
		File newFile = new File(newName);
		oldFile.renameTo(newFile);
	}

//	create new folder
	public static void createNewFolder(String newPathFolder) throws Exception {
		if (isFileExists(newPathFolder)) {
			throw new Exception(FOLDER_EXISTS);
		}
		new File(newPathFolder).mkdir();
	}

//	read file
	public static String readFile(String pathFile) throws Exception {
		if (!isFileExists(pathFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		byte[] b = new byte[1024];
		FileInputStream in = new FileInputStream(pathFile);
		int length = in.read(b);
		String output = "";
		while (length > -1) {
			String content = new String(b, 0, length);
//			System.out.println(content + "\n " + length);
			output += content;
			length = in.read(b);
		}
		in.close();
		return output;
	}

	public static void writeFile(String pathFile, boolean isContinuing, String content) throws Exception {
		if (!isFileExists(pathFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		FileOutputStream out = new FileOutputStream(pathFile, isContinuing);
		out.write(content.getBytes());
		out.close();
		System.out.println(WRITE_FILE_SUCCESS);
	}

	public static void writeObject(Object object, String path, String fileName) throws Exception {
		if (!isFileExists(path)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		System.out.print("File name:");
		fileName = ScannerUtils.inputString("Cannot be left blank");
		path = path + "\\" + fileName;
		FileOutputStream out = new FileOutputStream(path);
		ObjectOutputStream objectOut = new ObjectOutputStream(out);
		objectOut.writeObject(object);
		out.close();
		objectOut.close();
		System.out.println(WRITE_FILE_SUCCESS);
	}

	public static void writeObject(Object object, String path) throws Exception {
		if (!isFileExists(path)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		FileOutputStream out = new FileOutputStream(path);
		ObjectOutputStream objectOut = new ObjectOutputStream(out);
		objectOut.writeObject(object);
		out.close();
		objectOut.close();
		System.out.println(WRITE_FILE_SUCCESS);
	}

	public static Object readObject(String filePath) throws Exception {
		if (!isFileExists(filePath)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		FileInputStream in = null;
		ObjectInputStream objectIn = null;
		try {
			in = new FileInputStream(filePath);
			objectIn = new ObjectInputStream(in);
			System.out.println(READ_FILE_SUCCESS);
			return objectIn.readObject();
		} finally {
			in.close();
			objectIn.close();
		}

	}
}
