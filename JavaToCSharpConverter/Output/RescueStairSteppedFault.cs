using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueStairSteppedFault : RescueObject
{


  protected RescueStairSteppedFault(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueGeometry Geometry()
  {
    long returnNdx = Geometry0(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometry myReturn = new RescueGeometry(returnNdx);
      return myReturn;
    }
  }

  public RescueIJSurface Surface()
  {
    long returnNdx = Surface1(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueIJSurface myReturn = new RescueIJSurface(returnNdx);
      return myReturn;
    }
  }

  public long CellPairCount64()
  {
    long myReturn = CellPairCount2(nativeNdx);
    return myReturn;
  }

  public int CellPairCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CellPairCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CellPairCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CellPairCount64(), throwIfTooBig);
  }

  public RescueIJKCellPair NthCellPair(long zeroBasedOrdinal)
  {
    RescueIJKCellPair myReturn = NthCellPair3(nativeNdx
                                             ,zeroBasedOrdinal);
    return myReturn;
  }

  public cSetRescueDataContainer DataContainers()
  {
    long returnNdx = DataContainers4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cSetRescueDataContainer myReturn = new cSetRescueDataContainer(returnNdx);
      return myReturn;
    }
  }

  public cSetRescueDataContainer DemandDataContainers()
  {
    long returnNdx = DemandDataContainers5(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      cSetRescueDataContainer myReturn = new cSetRescueDataContainer(returnNdx);
      return myReturn;
    }
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType4(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void dispose()
  {
    Delete_RescueStairSteppedFault(nativeNdx);
  }

}

}