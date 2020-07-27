using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cSetRescueInterfaceSurfaceDesc : RjniBaseClass
{


  protected cSetRescueInterfaceSurfaceDesc(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueInterfaceSurfaceDesc()
  {
    nativeNdx = Create_cSetRescueInterfaceSurfaceDesc0();
  }

  public void dispose()
  {
    Delete_cSetRescueInterfaceSurfaceDesc(nativeNdx);
  }

  public void AddTo(RescueInterfaceSurfaceDesc newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueInterfaceSurfaceDesc existingObject)
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

  public RescueInterfaceSurfaceDesc NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueInterfaceSurfaceDesc myReturn = new RescueInterfaceSurfaceDesc(returnNdx);
      return myReturn;
    }
  }

  public RescueInterfaceSurfaceDesc NthObject(int ordinal)
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

}

}