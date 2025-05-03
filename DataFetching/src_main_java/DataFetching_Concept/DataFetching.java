package DataFetching_Concept;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DataFetching {


	//paste the code of data driven which is present in git in --> SeleniumPractoce/dataDriven pacakge
	
		//refers to datafetching excel sheet 
		
		//Step1--> Create a non static method and copy paste the data-driven code as shown below
		
		
		
		//step3---> make username and pswd as global variables\
	//Step 6--> Part2
		static String username;
		static String password;
		
		/*
		 Step 4---> 
		 Now username and password value can be fetched by some "source file"  
		 so we use  Part 1--> "SourceFile_LoginPAge_Using_ValuesFrom_DataFetchingClass" class to fetch username and pswd value 
		 and Part 2--->  also need to make the relation between these 2 classes 
		 */
		
		/*
		 Step 5----> Run testcase from src/test/java
		 TestCase1_Login_To_Cart_DataFetchingConcept
		 
		 First time when we run this we get 
		 FAILED: login_till_Cart
        java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
        (we are getting this exception )
		 */
		
		/*
		 Step 6---> So jo humne data driven wala code likha hai kya woh hum kahi bhi use karrahe hai  nhi 
		 so lets use it so that we can remove "java.lang.IllegalArgumentException" exceptions 
		 For that Part 1 and Part 2--> First make the method and the variable as static so that it can be called easily without making the instance of the class
		 Part 3--> use classname.methodname in testcase so that we can use this class in out testcase 
		 */
		
		
		//Step 6--> Part1
		static public void dataFetching_PastingDataDrivenCode() throws EncryptedDocumentException, IOException
		{
			
			FileInputStream f1= new FileInputStream("C:\\Users\\Brijesh Chauhan\\eclipse-workspace\\selenium\\DataSheet\\HimanshiSheet.xlsx");
			Workbook w1=WorkbookFactory.create(f1);
		
		
			//step 2----> agar aise define kiya toh scope username and pswd variables  ka within this method he hoga lekin humko global bnana hai as humko or methods and outosde this file bhi use karna padh sata hai 
		    //String username=NumberToTextConverter.toText(w1.getSheet("amazon_credentails").getRow(2).getCell(0).getNumericCellValue());
			//String password=w1.getSheet("amazon_credentails").getRow(2).getCell(1).getStringCellValue();
			
			
			
		    username=NumberToTextConverter.toText(w1.getSheet("amazon_credentails").getRow(6).getCell(0).getNumericCellValue()); //YHA ROW 6 PASS KI HAI LEKIn value 7th row mai hai isliyi bcz its indexing starting from 0 
			password=w1.getSheet("amazon_credentails").getRow(6).getCell(1).getStringCellValue();
		}
}
