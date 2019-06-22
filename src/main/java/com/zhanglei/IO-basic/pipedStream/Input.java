package pipedStream;

import java.io.IOException;
import java.io.PipedInputStream;

public class Input implements Runnable
{
	private PipedInputStream in;
	
	public Input(PipedInputStream in)
	{
		this.in = in;
	}

	public void run()
	{
		try
		{
			byte[] buf = new byte[1024];
			int len = in.read(buf);
			
			String s = new String(buf,0,len);
			
			System.out.println("s"+s);
			
		} catch (Exception e)
		{
			// TODO: handle exception
		}finally
		{
			try
			{
				in.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
