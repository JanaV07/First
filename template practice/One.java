package simple;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;


public class One {

	public static void main(String[] args) throws IOException {
		 VelocityEngine ve = new VelocityEngine();
		 Properties p = new Properties();
		 p.setProperty("resource.loader", "class");
		 p.setProperty("class.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		 ve.init();
	        /*  next, get the Template  */
	        Template t = ve.getTemplate("./src/main/resources/templates/helloworld.vm");
	        /*  create a context and add data */
	        VelocityContext context = new VelocityContext();
	        context.put("name", "World");
	        /* now render the template into a StringWriter */
	        
	        LinkedHashMap hashmap=new LinkedHashMap();
	        for(int r=21;r<=22;r++){
	        LinkedHashMap hashmap1=new LinkedHashMap();
	        for(int k=16;k<=18;k++){
	        LinkedHashMap hashmap2=new LinkedHashMap();
	        for(int q=11;q<=14;q++){
	        LinkedHashMap hashmap3=new LinkedHashMap();
	        for(int j=6;j<=8;j++){
	        ArrayList list=new ArrayList();
	        for(int i=1;i<=2;i++)
	        list.add(j+"="+i);
	       hashmap3.put(j,list);
	        }
	        hashmap2.put(q, hashmap3);
	        }
	        hashmap1.put(k, hashmap2);
	        }
	        hashmap.put(r, hashmap1);
	        }
	        
	       System.out.println(hashmap.size());
	       
	       
	        BufferedWriter writer =
	        	      new BufferedWriter(new FileWriter("F:/eclipse kepler final/workspace/simple/src/main/java/simple/jana.java"));
	        context.put("map", hashmap);
	      //  StringWriter writer = new StringWriter();
	        t.merge( context, writer );
	        writer.flush();
	        
	        jana ja=new jana();
	        LinkedHashMap hash=ja.setValues();
	        System.out.println(hash.size());
	        LinkedHashMap hash1=(LinkedHashMap)hash.get("21");
	        System.out.println(hash1.size());
	        LinkedHashMap hash2=(LinkedHashMap)hash1.get("16");
	        System.out.println(hash2.size());
	        LinkedHashMap hash3=(LinkedHashMap)hash2.get("11");
	        System.out.println(hash3.size());
	        ArrayList lis=(ArrayList)hash3.get("6");
	        for(Object d:lis){
	        	System.out.println(d.toString());
	        }
	        	
	        
	        /* show the World */
	       // System.out.println( writer.toString() );   

	}

}
