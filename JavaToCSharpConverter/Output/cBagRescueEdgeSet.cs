using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cBagRescueEdgeSet : RjniBaseClass
{


  protected cBagRescueEdgeSet(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescueEdgeSet()
  {
    nativeNdx = Create_cBagRescueEdgeSet0();
  }

  public void dispose()
  {
    Delete_cBagRescueEdgeSet(nativeNdx);
  }

  public void AddTo(RescueEdgeSet newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueEdgeSet existingObject)
  {
    bool myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescueEdgeSet NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSet myReturn = new RescueEdgeSet(returnNdx);
      return myReturn;
    }
  }

  public RescueEdgeSet NthObject(int ordinal)
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

  public int Count(bool throwIfTooBig) //thro Exception
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

}

}