package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cSetRescueInterfaceSurfaceDesc.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cSetRescueInterfaceSurfaceDesc extends RjniBaseClass
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

  public boolean RemoveFrom(RescueInterfaceSurfaceDesc existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public boolean RemoveFrom(long ndx)
  {
    boolean myReturn = RemoveFrom4(nativeNdx
                                     ,ndx);
    return myReturn;
  }

  public boolean RemoveFrom(int ndx)
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

  public int Count(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  public void EmptySelf()
  {
    EmptySelf7(nativeNdx);
  }

  private native long Create_cSetRescueInterfaceSurfaceDesc0();
  private native void Delete_cSetRescueInterfaceSurfaceDesc(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native boolean RemoveFrom4(long refNdx
                                    ,long ndx);
  private native long NthObject5(long refNdx
                                 ,long ordinal);
  private native long Count6(long refNdx);
  private native void EmptySelf7(long refNdx);
}
