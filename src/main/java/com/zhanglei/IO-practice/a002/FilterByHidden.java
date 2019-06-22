package a002;

import java.io.File;
import java.io.FileFilter;

public class FilterByHidden implements FileFilter
{

	public boolean accept(File pathname)
	{
		return pathname.isHidden();
	}

}
