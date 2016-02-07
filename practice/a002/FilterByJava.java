package a002;

import java.io.File;
import java.io.FilenameFilter;

/**
 *此方法可能过时了,1.8 不提示
 *
 */

public class FilterByJava implements FilenameFilter
{

	public boolean accept(File dir, String name)
	{
		return name.endsWith(".txt");
	}

}
