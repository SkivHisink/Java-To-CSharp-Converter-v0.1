using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cBagRescueWellboreCell : RjniBaseClass
{


  protected cBagRescueWellboreCell(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescueWellboreCell()
  {
    nativeNdx = Create_cBagRescueWellboreCell0();
  }

  public void dispose()
  {
    Delete_cBagRescueWellboreCell(nativeNdx);
  }

  public void AddTo(RescueWellboreCell newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueWellboreCell existingObject)
  {
    bool myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescueWellboreCell NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellboreCell myReturn = new RescueWellboreCell(returnNdx);
      return myReturn;
    }
  }

  public RescueWellboreCell NthObject(int ordinal)
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