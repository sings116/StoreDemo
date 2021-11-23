package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] primaryProp= {"123","456","789","900"};
		Object[] guarProp= {"123","123","789","789"};
		ArrayList<String> primPropList = new ArrayList(Arrays.asList(primaryProp));
		ArrayList<String> guarPropList = new ArrayList(Arrays.asList(guarProp));
		primPropList.removeAll(guarPropList);
		if(primPropList.size()!=0)
		{
			//At this point you will be having list of properties 
			//whose guarantees are not defined 
			//You could iterate the proeprties component node here.
		    System.out.println(primPropList);
		}
		
		String x="123|456|789|456";
		ArrayList<String> primPropList2 = new ArrayList(Arrays.asList(x.split("//|")));
		System.out.println(primPropList2);

	}

}
