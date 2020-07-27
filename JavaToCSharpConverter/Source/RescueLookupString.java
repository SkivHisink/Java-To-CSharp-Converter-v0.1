package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueLookupString.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueLookupString extends RescueLookupItem
{


  protected RescueLookupString(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueLookupString(nativeNdx);
  }

  public RescueLookupString(RescueContext context,
                            java.lang.String translationString)
  {
    nativeNdx = Create_RescueLookupString1((context == null) ? 0 : context.nativeNdx,
                                           translationString);
  }

  public java.lang.String Translation()
  {
    java.lang.String myReturn = Translation2(nativeNdx);
    return myReturn;
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType3(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescueLookupString(long ndx);
  private native long Create_RescueLookupString1(long context,
                                                java.lang.String translationString);
  private native java.lang.String Translation2(long refNdx);
  private native boolean IsOfType3(long refNdx
                                  ,int thisType);
}
