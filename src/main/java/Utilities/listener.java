package Utilities;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import Page.Excel;

public class listener implements IAnnotationTransformer{
	
	
	@Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        List<String> activatedTest= new ArrayList<>();//list to store test cases with yes in excel file
        String[] group;
        Excel data = new Excel();

        int r_count = data.RowCount();

        for(int i=1;i<r_count;i++) {

            String value= data.getCellData(i,1).toLowerCase();

            if(value.equals("Yes")) {
                String method= data.getCellData(i,0);

                activatedTest.add(method);

            }
        }

        
        String name= testMethod.getName();    
        //Condition to set test case execution using enabled annotation

        if (activatedTest.contains(name)) {
              annotation.setEnabled(true);

            } else {
              annotation.setEnabled(false);
            }

    }

}
