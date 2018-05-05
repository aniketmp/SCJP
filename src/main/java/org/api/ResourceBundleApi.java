package org.api;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;


public class ResourceBundleApi {
	public static void main(String[] args) {
		Locale l=Locale.getDefault();
		//creating ResourceBundle with default locale i.e en_US
		ResourceBundle bundle=ResourceBundle.getBundle("config");
		System.out.println("Message from "+l.getDisplayCountry()+":"+bundle.getString("message"));
		
		l=new Locale("mr","IN");
		bundle=ResourceBundle.getBundle("config",l);
		System.out.println("Message from "+l.getDisplayCountry()+":"+bundle.getString("message"));
		
		l=new Locale("no","NO");
		bundle=ResourceBundle.getBundle("config",l);
		System.out.println("Message from "+l.getDisplayCountry()+":"+bundle.getString("message"));
		
		/*
		 * Note 1:When we gave new Locale("no","NO") to resource bundle, java will look for following files in the classpath
		 * 		  in this order	
		 * 
		 * 1)config_no_NO.java
		 * 2)config_no_NO.properties
		 * 3)config_no.java
		 * 4)config_no.properties
		 * 5)config_en_US.java
		 * 6)config_en_US.properties
		 * 7)config_en.java
		 * 8)config_en.properties
		 * 9)config.java
		 * 10)config.properties
		 * 
		 * If none of these file exist, java give up and throw MissingResourceException.
		 * 
		 * Note 2:You don't have to declare all the keys in all the property files. They can inherit from each 
		 *        other. Inheritance work here in reverse order for e.g
		 *        properties in config_no_NO inherits from properties in config_no file. Another important
		 * 		  point here is ListResourceBundles and PropertyResourceBundles do not share hierarchy.Similarly
		 * 		  default locale's resource bundles don not share a hierarchy with the requested locale's resource
		 * 		  bundle. Remember that "Searching  for property file uses a linear list as we mentioned in note 1. 
		 *   	  However once a matching resource bundle is found, keys can only come from that resource 
		 *   	  bundle's hierarchy".Which means java started out looking for a matching file and then switch 
		 *   	  to searching the hierarchy of that file.
		 *   
		 * Table shows examples of bundles that share a hierarchy.
		 * ------------------------------------------------------
		 *  config_no_NO.java:       
		 *  
		 *      	config.java
		 *      		|
		 *       config_no.java
		 *       		|
		 *     config_no_NO.java
		 * -------------------------------------------   
		 *  config_no_NO.properties:
		 *  
 		 *		  config.properties
 		 *				|
		 *      config_no.properties
		 *      		|
		 *    config_no_NO.properties
		 * -------------------------------------------   
		 *  config_en_US.java:
		 *  
 		 *		  config.java
 		 *				|
		 *      config_en.java
		 *      		|
		 *    config_en_US.java
		 * -------------------------------------------
		 *  config_en_US.properties:
		 *  
 		 *		  config.properties
 		 *				|
		 *      config_en.properties
		 *      		|
		 *    config_en_US.properties
		 * 
		 * Note 3:properties files can create key-value in any one of these format
		 * 
		 * key=value
		 * key:value
		 * key value
		 */
		
		
	}

	private static void display(Locale l) {
		System.out.println("-----------------------------------");
		System.out.println("Locale:"+l);
		System.out.println("-----------------------------------");
		System.out.println("Language:"+l.getLanguage());
		System.out.println("Country:"+l.getCountry());
		System.out.println("-----------------------------------");		
		System.out.println("Display Language:"+l.getDisplayLanguage());
		System.out.println("Display Country:"+l.getDisplayCountry());
	}
}

