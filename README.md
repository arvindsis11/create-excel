# create-excel using list of objects
### Model class- User
<img width="231" alt="image" src="https://user-images.githubusercontent.com/57572062/221576228-adbfb952-29a7-4f8f-985f-43743c489df8.png">

### output excel sheet
<img width="289" alt="image" src="https://user-images.githubusercontent.com/57572062/221575830-fe78570c-b1c9-4acb-93b9-e59ed1c78f41.png">

### null pointer exception handling:
```bash row.createCell(0).setCellValue(tutorial.getId()==null?"":user.getId()); ```

### add this dependancy:

```xml
<dependency>
	<groupId>org.apache.poi</groupId>
	<artifactId>poi-ooxml</artifactId>
	<version>4.1.2</version>
</dependency>
```


