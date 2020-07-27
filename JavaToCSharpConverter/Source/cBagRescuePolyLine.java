package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cBagRescuePolyLine.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cBagRescuePolyLine extends RjniBaseClass
{


  protected cBagRescuePolyLine(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescuePolyLine()
  {
    nativeNdx = Create_cBagRescuePolyLine0();
  }

  public void dispose()
  {
    Delete_cBagRescuePolyLine(nativeNdx);
  }

  public void AddTo(RescuePolyLine newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescuePolyLine existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescuePolyLine NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePolyLine myReturn = new RescuePolyLine(returnNdx);
      return myReturn;
    }
  }

  public RescuePolyLine NthObject(int ordinal)
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

  public int Count(boolean throwIfTooBig) throws Exception
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  private native long Create_cBagRescuePolyLine0();
  private native void Delete_cBagRescuePolyLine(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native long NthObject4(long refNdx
                                 ,long ordinal);
  private native long Count5(long refNdx);
}
