package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueProgressReporter.java

	The progress reporting mechanism for Java is different, primarily
	because the C++ side of the fence can't get a pointer to a Java
	object and keep it . . . Java objects move around a lot.

	Instead, RescueContext.RegisterProgressReporter() accepts a
	java.lang.Class object.  This class must have a static method
	named "ReportProgress" whose signature is "(Ljava/lang/String;)V".

	The class below will do fine if all you want to do is print the
	progress to the java console.

    Rod Hanks   July, 2007

******************************************************************/
public class RescueProgressReporter
{
  public static void ReportProgress(java.lang.String phaseDescription)
  {
    System.out.println(phaseDescription);
  }
}
