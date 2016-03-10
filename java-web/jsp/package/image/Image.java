package entity;

import java.io.File;

/**
 * 用于Test04 显示下一张、上一张图片
 * @author lyons(zhanglei)
 */
public class Image
{
	int imageNumber = 0,max;
	String pictureName[],playImage;
	String webDir = "";
	String tomcatDir = "";
	
	public Play()
	{
		File file = new File("co");
		Sting path = f.getAbsolutePath();
		int index = path.indexOf("bin");
		tomcatDir = path.substring(0,index);
		
	}
	
	public void setWebDir(String s)
	{
		webDir = s;
		if (pictureName==null)
		{
			File dirImage = new File(tomacat+"/webapps/"+webDir+"/image");
			pictureName = dirImage.list();
		}
		if (pictureName!=null)
		{
			max = pictureName.length;
		}
	}
	
	public void setImageNumber(int n)
	{
		if (n<0)
		{
			n = max-1;
		}
		if (n==max)
		{
			n=0;
		}
		imageNumber = n;
	}
	
	public int getImageNumber()
	{
		return imageNumber;
	}
	
	public String getPlayImage()
	{
		if (pictureName!=null)
		{
			playImage = pictureName[imageNumber];
		}
		return playImage;
	}
	
}
