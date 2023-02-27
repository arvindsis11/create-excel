import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.arvind.fileprocessing.model.User;

public class ExcelHelper {
	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	static String[] HEADERs = { "Id", "Name", "Surname", "Email" };
	static String SHEET = "Users";

	public static void UsersToExcel(List<User> users) {

		try (Workbook workbook = new XSSFWorkbook();
				FileOutputStream outputStream = new FileOutputStream("Users.xlsx")) {
			Sheet sheet = workbook.createSheet(SHEET);

			// Header
			Row headerRow = sheet.createRow(0);

			for (int col = 0; col < HEADERs.length; col++) {
				Cell cell = headerRow.createCell(col);
				cell.setCellValue(HEADERs[col]);
			}

			int rowIdx = 1;
			for (User user : users) {
				Row row = sheet.createRow(rowIdx++);

				row.createCell(0).setCellValue(user.getId());
				row.createCell(1).setCellValue(user.getName());
				row.createCell(2).setCellValue(user.getLastname());
				row.createCell(3).setCellValue(user.getEmail());
			}
			workbook.write(outputStream);
			System.out.println(outputStream);

		} catch (IOException e) {
			throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
		}
	}
}
