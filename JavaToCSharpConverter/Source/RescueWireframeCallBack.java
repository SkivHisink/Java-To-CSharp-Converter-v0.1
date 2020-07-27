package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueWireframeCallBack.java

	The callback mechanism for Java is different, primarily
	because the C++ side of the fence can't get a pointer to a Java
	object and keep it . . . Java objects move around a lot.

	Instead, RescueModel.RegisterWireframeCallBack() accepts a
	java.lang.Class object.  This class must have static methods
	named "LoadingWireframe" and "UnloadingWireframe" whose signature is "(JJ)V".

	There seems to be a problem in the JNI with getting method ids of
	constructors.  Because of this, I can't pass RescueModel or RescueWireframe
	objects to these routines.  As a poor substitute, I pass their unique identifiers.
	You need to have a list of RescueModels that you can reach statically,
	find your RescueModel object by searching this list, and then use
	RescueModel.GetWireframeIdentifiedBy to get the wireframe that was
	loaded or unloaded.

    Rod Hanks   July, 2007

******************************************************************/
public class RescueWireframeCallBack
{
  public static void LoadingWireframe(long modelIdentifier, long wireframeIdentifier)
  {
    System.out.println("Wireframe being loaded "+modelIdentifier+","+wireframeIdentifier);
  }

  public static void UnloadingWireframe(long modelIdentifier, long wireframeIdentifier)
  {
    System.out.println("Wireframe being unloaded "+modelIdentifier+","+wireframeIdentifier);
  }
}
