using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueFlavourFactory : org.Rescue.rjni.RjniBaseClass
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

}

}