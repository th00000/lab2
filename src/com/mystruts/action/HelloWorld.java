package com.mystruts.action;  
  
import java.sql.Date;

import com.opensymphony.xwork2.Action;

import pzh.Connecter;  
  
/**  
 * @author david  
 *  
 */  
public class HelloWorld implements Action {  
  
    private String message;  
    static String []name=new String[10];
      
    /**  
     * @return the message  
     */  
    public String getMessage() {  
        return message;  
    }  
  
    static String Getnew(int i)
    {
    	String is=new String();
    	String s=new String();
    	String tit=name[i%3]+i;
    	String nd;
    	String pub=name[(i+1)%3]+"_publish";
    	is="999"+(i*999);
    	nd="1111/11/11";
    	s=String.format("insert into book (isbn,title,authorid,publisher,publishdate,price) values ('%s','%s',%d,'%s','%s',%d)",is,tit,i%3+1,pub,nd,i*3);
    	return s;
    }
    /* (non-Javadoc)  
     * @see com.opensymphony.xwork2.Action#execute()  
     */  
    @Override  
    public String execute() throws Exception {  
//    	Connecter th000=new Connecter();
//    	String sql=new String();
//    	for (int i=1;i<=100;i++)
//    	{
//    		sql="delete from author where author="+i;
////    		th000.
//    	}
//    	name=new String[10];
//    	name[1]="hyf";
//    	name[2]="gx";
//    	name[0]="sjb";
//    	String sql;
//    	for (int i=1;i<=100;i++)
//    	{
//    		sql=Getnew(i);
//    		th000.executeUpdate(sql);
//    	}
//    	String sql="insert into Author (AuthorID,Name,Age,Country) values ";
//		sql=sql+"("+1+",'"+"hyf"+"',"+12+",'"+"china"+"')";

//    	th000.executeUpdate(sql);
        message = "PZH!";  
        return SUCCESS;  
    }  
  
}  