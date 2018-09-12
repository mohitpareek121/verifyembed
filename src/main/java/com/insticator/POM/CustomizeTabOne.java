package com.insticator.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.genericlib.CommonLibs;
import com.genericlib.Constants;
import com.genericlib.Driver;

public class CustomizeTabOne extends CommonLibs {

	@FindBy(xpath = "//div/input[@type='file']")
	private WebElement uploadImage;

	@FindBy(xpath = "//input[@name='partnerurl']")
	private WebElement linkImage;

	@FindBy(css = ".currentcolor .text")
	private WebElement brandcolor;

	@FindBy(xpath = "//div[@title='#D0021B']")
	private WebElement pickcolor;

	@FindBy(xpath = "//div[text()='ADD COLOR']")
	private WebElement btnaddcolor;

	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement btnSubmit;

	@FindBy(css = ".editable-true .question .editabletext")
	protected WebElement quesOne;

	@FindBy(css = ".editable-true .c0168:nth-of-type(1) .imageindicator")
	private WebElement imageOne;

	@FindBy(css = ".imageTypes")
	private WebElement imageTypes;

	@FindBy(xpath = "//span[text()='Giphy']")
	private WebElement giphyTab;

	@FindBy(css = "span:nth-of-type(1) .imagevisual")
	private WebElement GiphyImageOne;

	@FindBy(css="span:nth-of-type(2) .imagevisual")
	private WebElement GiphyImageTwo;
	
	@FindBy(css="span:nth-of-type(3) .imagevisual")
	private WebElement GiphyImageThree;

	
	@FindBy(xpath = "(((//div[@id='customize']//div[@class='group'])[2]//span[@class='photo']/span[2])[1])//div")
	protected WebElement ansOne;

	@FindBy(css = ".editable-true .c0168:nth-of-type(2) .imageindicator")
	private WebElement imageTwo;

	@FindBy(css = ".imageTypes span:nth-of-type(2)")
	private WebElement ImagesTab;

	@FindBy(xpath = "(//div[@class='imagevisual']//img)[2]")
	private WebElement selectImage;

	@FindBy (xpath="(//div[@class='imagevisual']//img)[3]")
	private WebElement SelectImage2;
	
	@FindBy (xpath="(//div[@class='imagevisual']//img)[4]")
	private WebElement SelectImage3;
	
	@FindBy(xpath = "(((//div[@id='customize']//div[@class='group'])[2]//span[@class='photo']/span[2])[2])//div")
	protected WebElement ansTwo;
	
	@FindBy (xpath="((//div[@id='customize']//div[@class='group'])[2]//div[@data-text='Type answer'])[1]")
	protected WebElement a1;
	
	@FindBy (xpath="((//div[@id='customize']//div[@class='group'])[2]//div[@data-text='Type answer'])[2]")
	protected WebElement a2;
	
	@FindBy (xpath="((//div[@id='customize']//div[@class='group'])[2]//div[@data-text='Type answer'])[3]")
	protected WebElement a3;
	
	@FindBy(xpath = "(//div[@class='icon'])[2]")
	protected WebElement correctAnswer;

	@FindBy(xpath = "(//div[@class='icon'])[4]")
	protected WebElement correctAnswer2;
	
	@FindBy(css = ".editable-true .c0168:nth-of-type(3) .imageindicator") 
	private WebElement imageThree;

	@FindBy(css = ".imageTypes span:nth-of-type(3)")
	private WebElement yourOwnTab;

	@FindBy(xpath = "//article[@id='body']/div[2]//div[@class='imagedisplay']/input[@type='file']")
	private WebElement uploadOwmImage;

	@FindBy(css = ".submit")
	private WebElement submitOwnImage;

	@FindBy(xpath = "(((//div[@id='customize']//div[@class='group'])[2]//span[@class='photo']/span[2])[3])//div")
	protected WebElement ansThree;

	@FindBy(xpath = "//*[text()='Add Question']")
	private WebElement addAnswer;

	@FindBy(xpath = "//div[contains(@class,'loading')]/img")
	private WebElement thinner;

	
	@FindBy(xpath = "//div[@class='formatcontainer']")
	private List<WebElement> FormatList;
	
	@FindBy(xpath = "//div[@class='formatcontainer']/div")
	protected List<WebElement> Format;
	
	@FindBy (xpath="(//div[@class='group']//div[@class='icon'])[1]")
	protected WebElement correctansone;
	
	@FindBy (xpath="//span[text()='poll']")
	private WebElement poll;
	
	@FindBy (xpath="(//span[@class='emoji'])[1]")
	private WebElement Firstemoji;
	
	@FindBy (xpath="(//span[@class='emoji'])[2]")
	private WebElement Secondemoji;
	
	@FindBy (xpath="(//span[@class='emoji'])[3]")
	private WebElement Thirdemoji;
	
	@FindBy (xpath="//div[@class='emoji-mart-scroll']//div[3]/span[2]")	
	private WebElement emoji_one;
	
	@FindBy (xpath="(//div[@class='emoji-mart-scroll']//div[3]/span[3])[2]")
	private WebElement emoji_two;
	
	@FindBy (xpath="(//div[@class='emoji-mart-scroll']//div[3]/span[5])[3]")
	private WebElement emoji_three;
	
	@FindBy (xpath ="(//button[@class='arrow'])[2]")
	private WebElement rightarrow;
	
	@FindBy (xpath ="(//div[@class='toggle-container'])[1]//div[@class='text']")
	private WebElement addOn;
	
	@FindBy (xpath="(//div[@class='group'])[4]//div[@class='text']")
	private WebElement marketResearchSwitch;
	
	@FindBy (xpath="(//div[@class='group'])[7]//div[@class='text']")
	private WebElement rewardSwitch;
	
	@FindBy (xpath="//button[text()='Finish & Return to Library']")
	private WebElement Finish;
	
	@FindBy (xpath="//div[@class='cardcontainer']/div")
	protected List<WebElement> cardcontainer;
	
	@FindBy (xpath="//div[@class='cardcontainer']")
	List<WebElement> cardcontainerList;
	
	@FindBy (xpath="//div[@data-tip='"+Constants.embedname+"']")
	protected WebElement actual_embed_name;
	
	public void QuizQuestion() throws InterruptedException {
		try {
			
			uploadImage.sendKeys("C:\\Users\\user\\Desktop\\download.jpg");
			Thread.sleep(1000);
			btnSubmit.click();
			Thread.sleep(1000);
			linkImage.sendKeys("www.google.com");
			Thread.sleep(1000);
			brandcolor.click();
			Thread.sleep(1000);
			pickcolor.click();
			Thread.sleep(1000);
			btnaddcolor.click();
			Thread.sleep(2000);
		
			quesOne.sendKeys("What is your name?");
			Thread.sleep(1000);
			
			// Image One Selection
			imageOne.click();
			Thread.sleep(2000);
			GiphyImageOne.click();
			Thread.sleep(2000);
			ansOne.sendKeys("Cat");
			Thread.sleep(2000);
			imageTwo.click();
			Thread.sleep(6000);
			GiphyImageTwo.click();
			Thread.sleep(2000);
			ansTwo.sendKeys("Dog");
			Thread.sleep(2000);
			imageThree.click();
			Thread.sleep(4000);
			
			GiphyImageThree.click();
			ansThree.sendKeys("Bird");
			Thread.sleep(2000);
			correctAnswer2.click();	
			Thread.sleep(3000);
			addAnswer.click();
			Thread.sleep(3000);
			
			// FOMRAT TWO CODE
//			Format.get(1).click();
//			Thread.sleep(2000);
//			quesOne.clear();
//			Thread.sleep(2000);
//			quesOne.sendKeys("Choose any one Image?");
//			Thread.sleep(2000);
//			imageOne.click();
//			Thread.sleep(2000);
//			ImagesTab.click();
//			//Thread.sleep(6000);
//			WebDriverWait wait = new WebDriverWait(Driver.driver, 60);
//			wait.until(ExpectedConditions.visibilityOf(thinner));
//			Thread.sleep(12000);
//			
//			Actions action = new Actions(Driver.driver);
//			action.moveToElement(selectImage).build().perform();
//			Thread.sleep(1000);
//			action.click(selectImage).build().perform();	
//			Thread.sleep(1000);
//			action.release(selectImage).build().perform();
//			Thread.sleep(2000);
//			imageTwo.click();
//			Thread.sleep(4000);
//			SelectImage2.click();
//			Thread.sleep(4000);
//			imageThree.click();
//			Thread.sleep(3000);
//			SelectImage3.click();
//			Thread.sleep(3000);
//			correctAnswer2.click();
//			Thread.sleep(2000);
//			addAnswer.click();
//			Thread.sleep(2000);
//			
			
			// FORMAT THREE CODE
			
			Format.get(2).click();
			Thread.sleep(2000);
			quesOne.clear();
			Thread.sleep(1000);
			quesOne.sendKeys("Choose any Text answer?");
			Thread.sleep(1000);
			a1.sendKeys("Hello I am John");
			Thread.sleep(1000);
			a2.sendKeys("Hello I am Mark");
			Thread.sleep(1000);
			a3.sendKeys("Hello I am Jack");
			Thread.sleep(1000);
			correctansone.click();
			Thread.sleep(2000);
			addAnswer.click();
			Thread.sleep(2000);
			
			// FORMAT FOUR CODE
			
						Format.get(3).click();
						Thread.sleep(2000);
						quesOne.clear();
						Thread.sleep(2000);
						quesOne.sendKeys("Choose any White background?");
						a1.clear();
						a1.sendKeys("ABC");
						Thread.sleep(2000);
						a2.clear();
						a2.sendKeys("XYZ");
						Thread.sleep(2000);
						a3.clear();
						a3.sendKeys("LMP");
						Thread.sleep(2000);
						correctansone.click();
						Thread.sleep(1000);
						addAnswer.click();
						Thread.sleep(1000);
						
			// SELECT "POLL" Question
						
						poll.click();
						Thread.sleep(2000);
						
						quesOne.clear();
						Thread.sleep(2000);
						quesOne.sendKeys("Animal name?");
						Thread.sleep(2000);
						
						imageOne.click();
						Thread.sleep(2000);
						GiphyImageOne.click();
						Thread.sleep(1000);
						ansOne.sendKeys("AAA");
						Thread.sleep(1000);
						
						imageTwo.click();
						Thread.sleep(2000);
						GiphyImageTwo.click();
						Thread.sleep(2000);
						ansTwo.sendKeys("BBB");
						Thread.sleep(2000);
						imageThree.click();
						Thread.sleep(2000);
						GiphyImageThree.click();
						Thread.sleep(2000);
						ansThree.sendKeys("CCC");
						Thread.sleep(1000);
						addAnswer.click();
						
						
						//FOMRAT CODE 2
//						poll.click();
//						Thread.sleep(2000);
//						poll.click();
//						Thread.sleep(2000);
//						Format.get(1).click();
//						Thread.sleep(1000);
//						quesOne.clear();
//						Thread.sleep(1000);
//						quesOne.sendKeys("Large images?");
//						Thread.sleep(2000);
//						imageOne.click();
//						Thread.sleep(2000);
//						SelectImage2.click();
//						GiphyImageOne.click();
//						ImagesTab.click();
//						Thread.sleep(2000);
//						ImagesTab.click();
//						Thread.sleep(2000);
//						imageTwo.click();
//						Thread.sleep(3000);
//						SelectImage2.click();
//						Thread.sleep(3000);
//						imageThree.click();
//						Thread.sleep(3000);
//						
//						SelectImage3.click();
//						Thread.sleep(4000);
//						addAnswer.click();
//						Thread.sleep(1000);
//						
						// FORMAT THREE CODE
						poll.click();
						Thread.sleep(2000);
						poll.click();
						Thread.sleep(2000);
						Format.get(2).click();
						Thread.sleep(1000);
						quesOne.clear();
						Thread.sleep(1000);
						quesOne.sendKeys("Poll questions?");
						Thread.sleep(1000);
						a1.sendKeys("Poll one");
						Thread.sleep(1000);
						a2.sendKeys("Poll two");
						Thread.sleep(1000);
						a3.sendKeys("Poll three");
						Thread.sleep(1000);
						addAnswer.click();
						
						// Click on Poll Tab Fourth format >> Emoji Question
									poll.click();
									Thread.sleep(2000);
									poll.click();
									Thread.sleep(2000);
					
									Format.get(4).click();
									Thread.sleep(2000);
									quesOne.clear();
									Thread.sleep(1000);
									quesOne.sendKeys("Poll emojis?");
									Thread.sleep(1000);
									Firstemoji.click();
									Thread.sleep(2000);
									emoji_one.click();
									Thread.sleep(4000);
									Secondemoji.click();
									Thread.sleep(3000);
									emoji_two.click();
									Thread.sleep(2000);
									Thirdemoji.click();
									Thread.sleep(5000);
									emoji_three.click();
									Thread.sleep(1000);
									addAnswer.click();
									Thread.sleep(2000);
			// capture last element from container and remove it
									int count = cardcontainer.size();
									Driver.driver.findElement(By.xpath("(//div[@class='contentnumber'])["+count+"]/..//div[@data-tip='Remove this content']")).click();
									Thread.sleep(2000);
								
			// click on right side arrow to move on add section
									rightarrow.click();
									Thread.sleep(1000);
			// click add on toggle button
									addOn.click();
									Thread.sleep(1000);
			// click on right side arrow to move on add section
									rightarrow.click();
									Thread.sleep(1000);
			// click on market research and Reward toggle button
									marketResearchSwitch.click();
									Thread.sleep(1000);
									rewardSwitch.click();
									Thread.sleep(1000);
	       // click on right side arrow to move on add section
									rightarrow.click();		
									Thread.sleep(1000);
	       // click on Finish & Return to Library button
									Finish.click();
									Thread.sleep(1000);
									Driver.driver.navigate().refresh();
									Thread.sleep(3000);
									actual_embed_name.click();
					} 
					
					catch (Exception e) 
					{
						e.printStackTrace();
					}

	}
}
