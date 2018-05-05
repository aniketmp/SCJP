

import java.util.ListResourceBundle;

public class config_no_NO extends ListResourceBundle{
	
	@Override
	protected Object[][] getContents() {		
		return new Object[][]{
			//Note: Here we have hard coded both the string key-value. But in fact it can be taken from file, n/w or database as well.
	        { "message", "Welcome to Norway." }	       
	    };
	}

}
