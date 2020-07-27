using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cSetRescuePoint : RjniBaseClass
{


  protected cSetRescuePoint(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescuePoint()
  {
    nativeNdx = Create_cSetRescuePoint0();
  }

  public void dispose()
  {
    Delete_cSetRescuePoint(nativeNdx);
  }

  public void AddTo(RescuePoint newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescuePoint existingObject)
  {
    bool myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public bool RemoveFrom(long ndx)
  {
    bool myReturn = RemoveFrom4(nativeNdx
                                     ,ndx);
    return myReturn;
  }

  public bool RemoveFrom(int ndx)
  {
    return RemoveFrom((long) ndx);
  }

  public RescuePoint NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePoint myReturn = new RescuePoint(returnNdx);
      return myReturn;
    }
  }

  public RescuePoint NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public long Count64()
  {
    long myReturn = Count6(nativeNdx);
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

  public void EmptySelf()
  {
    EmptySelf7(nativeNdx);
  }

  public long IndexOf(RescuePoint existingObject)
  {
    long myReturn = IndexOf10(nativeNdx
                           ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

}

}