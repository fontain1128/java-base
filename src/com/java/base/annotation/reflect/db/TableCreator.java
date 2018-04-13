package com.java.base.annotation.reflect.db;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * ππ‘ÏDDL”Ôæ‰
 * @author baisq 
 *
 */
public class TableCreator {
	
	public static String buildCreateTableSql(String className) throws Exception{
		Class<?> clazz = Class.forName(className);
		DbTable dbTable = clazz.getAnnotation(DbTable.class);
		if(dbTable == null){
			throw new Exception("no add annotation DbTable for className:"+className);
		}
		String tableName = dbTable.name();
		if("".equals(tableName)){
			tableName = clazz.getName().toUpperCase();
		}
		List<String> columDefs = new ArrayList<String>();
		Field[] fields = clazz.getDeclaredFields();
		if(fields == null){
			throw new Exception("no field defined in className:"+className);
		}
		
		for(Field field : fields){
			
			Annotation[] annotations = field.getAnnotations();
			if(annotations == null){
				throw new Exception("no any annotation on field:"+field );
			}
			if(annotations[0] instanceof SQLInteger){
				StringBuffer columnSQL = new StringBuffer();
				SQLInteger sInt = (SQLInteger) annotations[0];
				String name = sInt.name();
				if("".equals(name)){
					name = field.getName().toUpperCase();
				}
				Constraints constraints = sInt.constraint();
				columnSQL.append(name+" int"+buildConstraints(constraints));
				columDefs.add(columnSQL.toString());
			}
			if(annotations[0] instanceof SQLString){
				StringBuffer columnSQL = new StringBuffer();
				SQLString sStr = (SQLString) annotations[0];
				String name = sStr.name();
				if("".equals(name)){
					name = field.getName().toUpperCase();
				}
				Constraints constraints = sStr.constraint();
				columnSQL.append(name+" varchar("+sStr.value()+")"+buildConstraints(constraints));
				columDefs.add(columnSQL.toString());
			}
			
		}
		StringBuffer createTable = new StringBuffer("CREATE TABLE "+tableName+"(");
		for(String columnDef : columDefs){
			createTable.append("\n    " + columnDef);
		}
		createTable.append(");");
		
		return createTable.toString();
	}
	
	public static String buildConstraints(Constraints constraints){
		StringBuffer sb = new StringBuffer();
		if(constraints.primaryKey()){
			sb.append(" primary key");
		}
		if(constraints.allowNull()){
			sb.append(" allow null");
		}
		if(constraints.unique()){
			sb.append(" unique");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) throws Exception {
		String s = buildCreateTableSql("com.java.base.annotation.reflect.db.Member");
		System.out.println(s);
	}
	
	
	
	

}
