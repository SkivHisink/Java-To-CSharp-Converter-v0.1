using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cBagRescueWellboreSurface : RjniBaseClass
{


  protected cBagRescueWellboreSurface(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescueWellboreSurface()
  {
    nativeNdx = Create_cBagRescueWellboreSurface0();
  }

  public void dispose()
  {
    Delete_cBagRescueWellboreSurface(nativeNdx);
  }

  public void AddTo(RescueWellboreSurface newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueWellboreSurface existingObject)
  {
    bool myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescueWellboreSurface NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellboreSurface myReturn = new RescueWellboreSurface(returnNdx);
      return myReturn;
    }
  }

  public RescueWellboreSurface NthObject(int ordinal)
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