package com.fca.systems.scripts;


import java.io.FileNotFoundException;

public class javatest {

public static String getResourcePath(String resource) {
String path = getBaseResourcePath() + resource;
return path;

}

public static String getBaseResourcePath() {

String path = javatest.class.getClass().getResource("/").getPath();
System.out.println(path);
return path;


}

public static void main(String[] args) throws FileNotFoundException 

{

System.out.println(javatest.getResourcePath("resources/" + "58702574.csv"));

}
}
