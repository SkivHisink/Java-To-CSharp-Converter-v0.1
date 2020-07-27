package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cBagRescueSurfaceCell.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cBagRescueSurfaceCell extends RjniBaseClass
{


  protected cBagRescueSurfaceCell(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescueSurfaceCell()
  {
    nativeNdx = Create_cBagRescueSurfaceCell0();
  }

  public void dispose()
  {
    Delete_cBagRescueSurfaceCell(nativeNdx);
  }

  public void AddTo(RescueSurfaceCell newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescueSurfaceCell existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescueSurfaceCell NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSurfaceCell myReturn = new RescueSurfaceCell(returnNdx);
      return myReturn;
    }
  }

  public RescueSurfaceCell NthObject(int ordinal)
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

  private native long Create_cBagRescueSurfaceCell0();
  private native void Delete_cBagRescueSurfaceCell(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native long NthObject4(long refNdx
                                 ,long ordinal);
  private native long Count5(long refNdx);
}
