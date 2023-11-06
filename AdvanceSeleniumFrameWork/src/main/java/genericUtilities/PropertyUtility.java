package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author dmoha
 *
 */

public class PropertyUtility implements IAutoConstants{ 
	/**
	 * This method is developed to read the data from property file.
	 * The method accept key of which parameter you want to fetch
	 * @param Key
	 * @return value of the Key
	 */
	public String getDataFromPropertyFile(String Key)
	{
		FileInputStream fis=null;
		try {
			 fis=new FileInputStream(Property_file_path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties property=new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property.getProperty(Key);

	}

}
