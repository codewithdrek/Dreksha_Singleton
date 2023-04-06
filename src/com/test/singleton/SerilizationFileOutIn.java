package com.test.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//Singlton can be break by Serialization 
public class SerilizationFileOutIn {

	
	public static void main(String[] args) throws FileNotFoundException, IOException,NotSerializableException, ClassNotFoundException {
	
		
			fileDesSerilCall();
	
	}

	private static void fileDesSerilCall() throws FileNotFoundException, IOException, NotSerializableException,ClassNotFoundException {
		
		
		//PROBLUM IN SINGLETION IN BELOW CODE BOTH OBJCTE ARE DIFFERENT
		//getObj for testing From LazyInitilization class Approach
     LazyInitilization lazyInitilizationObj = LazyInitilization.getLazyInitilization();		
	 ObjectOutputStream seriliazedObjStream = new ObjectOutputStream(new FileOutputStream("object.obj"));
	 //store lazyInitilizationObj in .obj/.txt file
	 seriliazedObjStream.writeObject(lazyInitilizationObj);
	 seriliazedObjStream.close(); 
	 
	 //Now write code for deserilization of Lazy objct
	 ObjectInputStream deserializedObjectStream = new ObjectInputStream(new FileInputStream("object.obj"));
	 LazyInitilization deserializedObj = (LazyInitilization) deserializedObjectStream.readObject();
	 deserializedObjectStream.close();
	 
	 //Now compare both LazyInitilizer Obj : deserializedObj and lazyInitilizationObj
	 System.out.println("Object 1 "+deserializedObj.hashCode());
	 System.out.println("Object 2 "+lazyInitilizationObj.hashCode());
	 
	 
	 
	 
	 
	 
	 
	 
	 //SOLUTION below both Hashcode must come Same
	 //Above both Hash Code will come different How to solve is to Use ReadResolve() check 
	 DeserializtionReadResolve descInitilizationObj = DeserializtionReadResolve.getDeserializtionReadResolve();		
	 ObjectOutputStream seriliazedObjStream1 = new ObjectOutputStream(new FileOutputStream("object2.obj"));
	 //store lazyInitilizationObj in .obj/.txt file
	 seriliazedObjStream1.writeObject(descInitilizationObj);
	 seriliazedObjStream1.close(); 
	 
	 //Now write code for deserilization of Lazy objct
	 ObjectInputStream deserializedObjectStream1 = new ObjectInputStream(new FileInputStream("object2.obj"));
	 DeserializtionReadResolve deserializedRRObj1 = (DeserializtionReadResolve) deserializedObjectStream1.readObject();
	 deserializedObjectStream1.close();
	 
	 //Now compare both LazyInitilizer Obj : deserializedObj and lazyInitilizationObj
	 System.out.println("Object 1 "+descInitilizationObj.hashCode());
	 System.out.println("Object 2 "+deserializedRRObj1.hashCode());
	
	 
	 //Above code not working check with ASH
	}
}
