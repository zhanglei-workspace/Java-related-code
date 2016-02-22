package pipedStream;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Output implements Runnable
{
	private PipedOutputStream out;
	
	public Output(PipedOutputStream out)
	{
		this.out = out;
	}

	public void run()
	{
		try
		{
			Thread.sleep(1000);//等待一下，目的在于观察效果
			out.write("管道流来了".getBytes());
		} catch (Exception e)
		{
			// TODO: handle exception
		}finally
		{
			try
			{
				out.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}