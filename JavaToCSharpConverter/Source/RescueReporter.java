package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueReporter.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueReporter extends org.Rescue.rjni.RjniBaseClass
{


  protected RescueReporter(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueReporter()
  {
  }

  public void dispose()
  {
    Delete_RescueReporter(nativeNdx);
  }

  public java.lang.String ClassName()
  {
    java.lang.String myReturn = ClassName1(nativeNdx);
    return myReturn;
  }

  private native void Delete_RescueReporter(long ndx);
  private native java.lang.String ClassName1(long refNdx);
}
