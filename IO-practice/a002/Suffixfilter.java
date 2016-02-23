package a002;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 文件过滤器
 * 不明白运行顺序，查资料也不明白
 * @author My computer
 *
 */

public class Suffixfilter implements FilenameFilter
{
	private String suffix;
	public Suffixfilter(String suffix)
	{
		this.suffix = suffix;
	}
	
	public boolean accept(File dir, String name)
	{
		return name.endsWith(suffix);
	}

}
