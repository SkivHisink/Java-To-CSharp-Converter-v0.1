package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueFlavourFactory.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueFlavourFactory extends org.Rescue.rjni.RjniBaseClass
{


  protected RescueFlavourFactory(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueFlavourFactory()
  {
  }

  public RescueFlavour create()
  {
    long returnNdx = create0(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueFlavour myReturn = new RescueFlavour(returnNdx);
      return myReturn;
    }
  }

  private native long create0(long refNdx);
}
