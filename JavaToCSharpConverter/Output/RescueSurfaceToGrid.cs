using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueSurfaceToGrid : RescueObject
{


  protected RescueSurfaceToGrid(long ndxIn)
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

  public int[] IList(bool throwIfTooBig) //thro RuntimeException
  {
    int[] myReturn = IList2i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public int[] JList(bool throwIfTooBig) //thro RuntimeException
  {
    int[] myReturn = JList3i(nativeNdx, throwIfTooBig);
    return myReturn;
  }

  public long[] IList64()
  {
    long[] myReturn = IList2(nativeNdx);
    return myReturn;
  }

  public long[] JList64()
  {
    long[] myReturn = JList3(nativeNdx);
    return myReturn;
  }

  public int[] IList()
  {
    int[] myReturn = IList2i(nativeNdx, true);
    return myReturn;
  }

  public int[] JList()
  {
    int[] myReturn = JList3i(nativeNdx, true);
    return myReturn;
  }

  public long IListLength64()
  {
    long myReturn = IListLength4(nativeNdx);
    return myReturn;
  }

  public int IListLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(IListLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int IListLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(IListLength64(), throwIfTooBig);
  }

  public long JListLength64()
  {
    long myReturn = JListLength5(nativeNdx);
    return myReturn;
  }

  public int JListLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(JListLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int JListLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(JListLength64(), throwIfTooBig);
  }

  public long ListLength64()
  {
    long myReturn = ListLength6(nativeNdx);
    return myReturn;
  }

  public int ListLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(ListLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int ListLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(ListLength64(), throwIfTooBig);
  }

  public cSetRescueDataContainer DataContainers()
  {
    long returnNdx = DataContainers7(nativeNdx);
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
    long returnNdx = DemandDataContainers8(nativeNdx);
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
    bool myReturn = IsOfType7(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void dispose()
  {
    Delete_RescueSurfaceToGrid(nativeNdx);
  }

}

}