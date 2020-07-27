using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cBagRescueTriangleVertex : RjniBaseClass
{


  protected cBagRescueTriangleVertex(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescueTriangleVertex()
  {
    nativeNdx = Create_cBagRescueTriangleVertex0();
  }

  public void dispose()
  {
    Delete_cBagRescueTriangleVertex(nativeNdx);
  }

  public void AddTo(RescueTriangleVertex newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueTriangleVertex existingObject)
  {
    bool myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescueTriangleVertex NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTriangleVertex myReturn = new RescueTriangleVertex(returnNdx);
      return myReturn;
    }
  }

  public RescueTriangleVertex NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public long Count64()
  {
    long myReturn = Count5(nativeNdx);
    return myReturn;
  }

  public int Count()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Count64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int Count(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

}

}