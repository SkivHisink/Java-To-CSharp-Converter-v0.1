package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cBagRescueTrimLoop.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cBagRescueTrimLoop extends RjniBaseClass
{


  protected cBagRescueTrimLoop(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescueTrimLoop()
  {
    nativeNdx = Create_cBagRescueTrimLoop0();
  }

  public void dispose()
  {
    Delete_cBagRescueTrimLoop(nativeNdx);
  }

  public void AddTo(RescueTrimLoop newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescueTrimLoop existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescueTrimLoop NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTrimLoop myReturn = new RescueTrimLoop(returnNdx);
      return myReturn;
    }
  }

  public RescueTrimLoop NthObject(int ordinal)
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

  private native long Create_cBagRescueTrimLoop0();
  private native void Delete_cBagRescueTrimLoop(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native long NthObject4(long refNdx
                                 ,long ordinal);
  private native long Count5(long refNdx);
}
