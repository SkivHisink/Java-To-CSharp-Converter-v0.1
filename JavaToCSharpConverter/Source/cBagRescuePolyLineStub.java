package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cBagRescuePolyLineStub.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cBagRescuePolyLineStub extends RjniBaseClass
{


  protected cBagRescuePolyLineStub(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescuePolyLineStub()
  {
    nativeNdx = Create_cBagRescuePolyLineStub0();
  }

  public void dispose()
  {
    Delete_cBagRescuePolyLineStub(nativeNdx);
  }

  public void AddTo(RescuePolyLineStub newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescuePolyLineStub existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescuePolyLineStub NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLineStub myReturn = new RescuePolyLineStub(returnNdx);
      return myReturn;
    }
  }

  public RescuePolyLineStub NthObject(int ordinal)
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

  public int Count(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  private native long Create_cBagRescuePolyLineStub0();
  private native void Delete_cBagRescuePolyLineStub(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native long NthObject4(long refNdx
                                 ,long ordinal);
  private native long Count5(long refNdx);
}
