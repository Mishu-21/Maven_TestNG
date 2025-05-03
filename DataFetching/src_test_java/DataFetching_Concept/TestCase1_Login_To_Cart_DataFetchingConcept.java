package DataFetching_Concept;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;


public class TestCase1_Login_To_Cart_DataFetchingConcept extends LaunchQuit {

		@Test
		public void login_till_Cart() throws InterruptedException, EncryptedDocumentException, IOException
		{	
		
			
			//Step 6--> Part3
			DataFetching.dataFetching_PastingDataDrivenCode();
			
			
			SourceFile_LoginPAge_Using_ValuesFrom_DataFetchingClass l1=new SourceFile_LoginPAge_Using_ValuesFrom_DataFetchingClass(driver);
			
			l1.username();
	        l1.ContinueButton();
	        l1.Password();
	        l1.SignInButton();
			
	       
	        SourceFile_HomePAge_Using_DataFetchingConcept h1=new SourceFile_HomePAge_Using_DataFetchingConcept(driver);
	        h1.searchBox_Shoe();
	        
	        
	        SourceFile_SearchResult1PAge_Using_DataFetchingConcept s1=new SourceFile_SearchResult1PAge_Using_DataFetchingConcept(driver);
			s1.Click_SearchedProduct(driver);
			
			SourceFile_ProductPage1_Using_DataFetchingConcept p1=new SourceFile_ProductPage1_Using_DataFetchingConcept(driver);
			p1.add_To_WishList();
			p1.add_To_Cart();
		}
}
